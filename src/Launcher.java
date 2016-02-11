import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class Launcher {

    public static void main(String[] args) {

        Class clazz = new ArrayIndexOutOfBoundsException().getClass();
        printClassInfo(clazz);
        clazz = new IllegalArgumentException().getClass();
        System.out.println();
        printClassInfo(clazz);
        printClassMethod(clazz);
        printClassMethod(new String().getClass());
        printClassFields(clazz);
    }

    public static void printClassInfo(Class c){

        System.out.println("Class: =========== " + c.getSimpleName() + " CLASS INFO ===========");
        System.out.println("Class full name: " + c.getName());
        if(c.getSuperclass() != null){
            c = c.getSuperclass();
            System.out.println("Parent class name: " + c.getName());
            System.out.println("Up ierarchy class info: ");
            printClassInfo(c);
        }
    }

    public static void printClassMethod(Class c){

        System.out.println("Class: =========== " + c.getSimpleName() + " METHODS ===========");
        System.out.println(c.getSimpleName() + " methods:");
        Method[] methods = c.getDeclaredMethods();
        for(Method method : methods){
            System.out.println(method.toString());
        }
        if(c.getSuperclass() != null){
            c = c.getSuperclass();
            printClassMethod(c);
        }
    }
    public static void printClassFields(Class c){

        System.out.println("Class: =========== " + c.getSimpleName() + " FIELDS ===========");
        System.out.println(c.getSimpleName() + " fields:");
        Field[] fields = c.getDeclaredFields();
        for(Field field : fields){
            System.out.println(field.toString());
        }
        if(c.getSuperclass() != null){
            c = c.getSuperclass();
            printClassFields(c);
        }
    }
}
