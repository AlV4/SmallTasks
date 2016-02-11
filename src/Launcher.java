import service.Duck;

public class Launcher {

    public static void main(String[] args) {

        printClassInfo(new Duck("AAA", 5).getClass());
        System.out.println();
        Class clazz = new ArrayIndexOutOfBoundsException().getClass();
        printClassInfo(clazz);
        clazz = new IllegalArgumentException().getClass();
        System.out.println();
        printClassInfo(clazz);

    }

    public static void printClassInfo(Class c){

        System.out.println("Class: =========== " + c.getSimpleName() + "===========");
        System.out.println("Class full name: " + c.getName());
        if(c.getSuperclass() != null){
            c = c.getSuperclass();
            System.out.println("Parent class name: " + c.getName());
            System.out.println("Up ierarchy class info: ");
            printClassInfo(c);
        }
    }
}
