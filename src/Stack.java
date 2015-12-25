import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class Stack implements Iterable<Object> {

    private List<Object> list;
    private int size;

    public Stack(){
        list = new LinkedList();
        size = 0;
    }

    public void push(Object o){
        list.add(o);
        size++;
    }

    public Object pop(){
        Object o = list.get(list.size()-1);
        list.remove(list.size()-1);
        size--;
        return o;
    }

    public Object peak(){
        return list.get(list.size()-1);
    }

    public int getSize() {
        return size;
    }

    public List<Object> getList() {
        return list;
    }

    class StackIterator implements Iterator {
        int idx = 0;
        public boolean hasNext() {

            if(!list.isEmpty()&&list.size() > idx){
                return true;
            }
            return false;
        }

        @Override
        public Object next() {
            while (hasNext()){
                return list.get(idx++);
            }
            return null;
        }

        @Override
        public void remove() {
        }
    }

    @Override
    public Iterator iterator() {
        return new StackIterator();
    }

}
