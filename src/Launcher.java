import service.AbstractBird;
import service.Chicken;
import service.Hummingbird;

import java.lang.reflect.Field;

public class Launcher {

    public static void main(String[] args){

        ApplicationManager am = new ApplicationManager();
        Hummingbird hum = new Hummingbird();
        am.printAnnotatedMethod(hum.getClass());
        AbstractBird chicken = new Chicken();
        am.printAnnotatedMethod(chicken.getClass());

    }

    public static void fieldPrinter(Object o) throws NoSuchFieldException, IllegalAccessException {
        Class<?> clazz = o.getClass();
        System.out.println("========" + clazz.getSimpleName() + " private fields ===========");
        Field[]fields = clazz.getDeclaredFields();
        for (Field f:fields){
            if(!f.isAccessible()){
                f.setAccessible(true);
                System.out.println("Field: " + f.getName() +  ", type: " + f.getType() + ", value: " + f.get(o));
            }
        }
    }
}
