public class Launcher {

    public static void main(String[] args) {

        SimpleLinkedList list = new SimpleLinkedList();
        list.addFirst(10);
        list.addFirst(101);
        list.addLast(1);
        System.out.println(list.toString());
        list.remove(10);

        for (Object o: list){
            System.out.print(o);
        }
        System.out.println();

        SimpleLinkedList list1 = new SimpleLinkedList();

        list1.addFirst("22");
        list1.addFirst("add first");
        list1.addFirst(" one");
        list1.addFirst("two");
        list1.addFirst(1);

        list1.addLast("23");
        list1.addAfter(1, 2323233);
        System.out.println(list1.toString());
        list1.remove("23");
        list1.remove("22");
        list1.addLast("23");
        for(Object s:list1){
            System.out.print(s);
        }


    }

}
