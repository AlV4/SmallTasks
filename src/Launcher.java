public class Launcher {

    public static void main(String[] args) {

//        SimpleLinkedList list = new SimpleLinkedList();
//
//        list.addFirst("10");
//        list.addFirst("9");
//        list.addFirst("8");
//        list.addFirst("7");
//        list.addFirst("6");
//        list.addFirst("5");
//        list.addFirst("4");
//        list.addFirst("3");
//        list.addFirst("2");
//        list.addFirst("1");
//        list.addLast("Last one");
//        System.out.println(list.getSize());
//
//        System.out.println(list.toString());
        SimpleLinkedList list1 = new SimpleLinkedList();

        list1.addFirst("2");
        list1.addFirst("add first");
        list1.addFirst("another one");
        list1.addFirst("another one");
        list1.addFirst("1");
        list1.addAfter("2", "Target object");
        System.out.println(list1.toString());
        System.out.println(list1.getSize());

    }

}
