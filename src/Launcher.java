

public class Launcher {

    public static void main(String[] args) {

        Stack stack = new Stack();
        int i = 1;
        while (i <= 10) {
            stack.push("Number " + i);
            i++;
        }
        System.out.println(stack.getSize());
        System.out.println("==" + stack.pop() + "==");
        System.out.println(stack.getSize());

        for (Object o:stack){
            System.out.println(o);
        }
        System.out.println("---->[" + stack.pop() + "]==-->>>");
        for (Object o:stack){
            System.out.println(o);
        }
        System.out.println(stack.getSize());
    }

}
