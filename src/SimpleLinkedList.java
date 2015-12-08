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
        Node lastNode;
        Node node = new Node();
        node.o = o;
        if(firstNode == null){
           firstNode = node;

        }else {
            lastNode = firstNode;
            while (lastNode.nextNode != null){
                lastNode = lastNode.nextNode;
            }
            lastNode.nextNode = node;
        }
        size++;
    }

    public void addAfter(Object target, Object afterWho){

    }

    public int getSize(){
        return size;
    }
}
