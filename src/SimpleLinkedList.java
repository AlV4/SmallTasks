import java.util.Iterator;

public class SimpleLinkedList implements Iterable<Object> {

    private Node firstNode;
    private int size;

    @Override
    public String toString() {
        if (firstNode != null) {
            Node n = firstNode;
            String list = "";
            while (n != null) {
                list += n.toString();
                n = n.nextNode;
            }
            return list;
        }
        return "This list is empty!";
    }

    @Override
    public Iterator iterator() {
        return new SLLIterator();
    }

    class Node {
        public Object o;
        Node nextNode;

        @Override
        public String toString() {
            return "[ " + o + " ]" + "--> ";
        }
    }

    class SLLIterator implements Iterator {

        Node n = firstNode;
        Node firstElement;

        public Node next() {
            if (hasNext() && firstElement != null) {
                n = n.nextNode;
                return n;
            }
            firstElement = firstNode;
            if (firstElement.nextNode == null) {
                n = null;
            }
            return firstElement;
        }

        @Override
        public void remove() {

        }

        public boolean hasNext() {
            if (n == null || (n.nextNode == null && n != firstNode)) {
                return false;
            }
            return true;
        }

    }

    public SimpleLinkedList() {
        size = 0;
    }

    public void addFirst(Object o) {
        Node node = new Node();
        node.o = o;
        if (firstNode != null) {
            node.nextNode = firstNode;
        }
        firstNode = node;
        size++;
    }

    public void addLast(Object o) {
        Node lastNode;
        Node node = new Node();
        node.o = o;
        if (firstNode == null) {
            firstNode = node;

        } else {
            lastNode = firstNode;
            while (lastNode.nextNode != null) {
                lastNode = lastNode.nextNode;
            }
            lastNode.nextNode = node;
        }
        size++;
    }

    public void addAfter(Object afterWho, Object target) {
        if (firstNode == null) {
            System.out.println("This list is empty!");
            return;
        }
        Node n = new Node();
        n.o = target;
        Node currentNode = firstNode;
        if (currentNode.o.equals(afterWho)) {
            n.nextNode = currentNode.nextNode;
            currentNode.nextNode = n;
            size++;
            return;
        }
        while (!currentNode.o.equals(afterWho)) {
            currentNode = currentNode.nextNode;
            if (!currentNode.o.equals(afterWho) && currentNode.nextNode == null) {
                throw new IllegalStateException("There is no such elements!");
            }
        }
        n.nextNode = currentNode.nextNode;
        currentNode.nextNode = n;
        size++;
    }

    public void remove(Object o) {
        if (size == 0) {
            System.out.println("List is empty! No elements to remove!");
            return;
        }
        Node previous = firstNode;
        Node current = firstNode.nextNode;
        if (previous.o.equals(o)) {
            firstNode = firstNode.nextNode;
            size--;
            return;
        }
        while (current != null) {
            if (current.o.equals(o)) {
                previous.nextNode = current.nextNode;
                size--;
                return;
            }
            previous = current;
            current = current.nextNode;
        }
        throw new IllegalStateException("There is no such elements!");
    }

    public int getSize() {
        return size;
    }

}
