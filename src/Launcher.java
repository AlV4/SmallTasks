import service.Chicken;
import service.Hummingbird;
import service.InstanceCreator;

import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Map;

public class Launcher {

    public static void main(String[] args) throws Exception{
        InstanceCreator<Chicken>creator = new InstanceCreator<>();

        Map<String, Object> mapOfPrivates = new HashMap<>();
        mapOfPrivates.put("anotherName", "Kurka Hummingbird");
        mapOfPrivates.put("secretAmount", 1012);
        mapOfPrivates.put("anotherPrice", 2300);
        mapOfPrivates.put("additionalWeight", 4000);
        Hummingbird hummingbird = new Hummingbird();
        creator.setPrivates(hummingbird, mapOfPrivates);

        fieldPrinter(hummingbird);
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
