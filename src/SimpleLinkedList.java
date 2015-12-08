public class SimpleLinkedList {

    public Node firstNode;
    private int size;

    class Node {
         public Object o;
         Node nextNode;

        @Override
        public String toString() {
            return "[ " + o + " ]" + "--> "+nextNode;
        }
    }

    public SimpleLinkedList() {
        size = 0;
    }

    public void addFirst(Object o){
        Node node = new Node();
        node.o = o;
        if(firstNode != null){
            node.nextNode = firstNode;
        }
        firstNode = node;
        size++;
    }

    public void addLast(Object o){

    }

    public void addAfter(Object target, Object afterWho){

    }

    public int getSize(){
        return size;
    }
}
