package service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class MyOwnBox <T extends AbstractBird>{
    private ArrayList<T> listOfThings;

    public MyOwnBox() {
        listOfThings = new ArrayList<>();
    }

    public void sort(){
       Collections.sort(listOfThings, new Comparator<T>() {
           @Override
           public int compare(T o1, T o2) {
               if(o1.getAmount() > o2.getAmount()){
                   return 1;
               }else if(o1.getAmount() < o2.getAmount()){
                   return -1;
               }
               return 0;
           }
       });
    }

    String invade(short ships){
        return "Few";
    }

    String invade(short... ships){
        return "Many";
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
