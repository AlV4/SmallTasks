public class Launcher {

    public static void main(String[] args) {

        SimpleLinkedList list = new SimpleLinkedList();

        list.addLast("10");
        list.addAfter("10", "Target object");

        System.out.println(list.toString());
        for (Object o: list){
            System.out.print(o);
        }
        System.out.println();

        SimpleLinkedList list1 = new SimpleLinkedList();

        list1.addFirst("22");
        list1.addFirst("add first");
        list1.addFirst(" one");
        list1.addFirst("two");
        list1.addFirst("1");
        list1.addLast("22");
        list1.addAfter("22", null);
        System.out.println(list1.toString());
        System.out.println("Size of list: "+list1.getSize());

        for(Object s:list1){
            System.out.print(s);
        }

    }

}
