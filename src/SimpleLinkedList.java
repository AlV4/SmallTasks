public class SimpleLinkedList {

    private Node firstNode;
    private int size;

    @Override
    public String toString() {
        if(firstNode != null) {
            return firstNode.toString();
        }
        return "This list is empty!";
    }

    class Node {
         public Object o;
         Node nextNode;

        @Override
        public String toString() {
            return "[ " + o + " ]" + "--> " + nextNode;
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

    public void addAfter(Object afterWho, Object target){
        if (firstNode == null){
            System.out.println("This list is empty!");
            return;
        }
        Node n = new Node();
        n.o = target;
        Node currentNode = firstNode;
        if(currentNode.o.equals(afterWho)){
            n.nextNode = currentNode.nextNode;
            currentNode.nextNode = n;
            size++;
            return;
        }
        while (!currentNode.o.equals(afterWho)){
            currentNode = currentNode.nextNode;
            if(!currentNode.o.equals(afterWho) && currentNode.nextNode == null){
                throw new IllegalStateException("There is no such elements!");
            }
        }

            n.nextNode = currentNode.nextNode;
            currentNode.nextNode = n;

        size++;
        System.out.println("Element successfully added!");
    }

    public int getSize(){
        return size;
    }
}
