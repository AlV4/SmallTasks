import java.util.ArrayList;
import java.util.Arrays;

public class MyOwnBox <T extends AbstractBird>{
    private ArrayList<T> listOfThings;

    public MyOwnBox() {
        listOfThings = new ArrayList<>();
    }

    public void print(){
        System.out.println(Arrays.asList(listOfThings));
    }

    public void add(T t){
        listOfThings.add(t);
    }

    public T get(int idx){
        return listOfThings.get(idx);
    }

    public void remove(T t){
        listOfThings.remove(t);
    }

    public ArrayList<T> getListOfThings() {
        return listOfThings;
    }
}
