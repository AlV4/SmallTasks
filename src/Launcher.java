public class Launcher {

    public static void main(String[] args) {

        SimpleLinkedList list = new SimpleLinkedList();

        list.addFirst("10");
        list.addFirst("9");
        list.addFirst("8");
        list.addFirst("7");
        list.addFirst("6");
        list.addFirst("5");
        list.addFirst("4");
        list.addFirst("3");
        list.addFirst("2");
        list.addFirst("1");
        System.out.println(list.getSize());

        SimpleLinkedList.Node n = list.firstNode;

        System.out.print(n.toString());

    }

}
