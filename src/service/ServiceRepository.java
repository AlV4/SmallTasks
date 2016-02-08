package service;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class ServiceRepository<T extends Service> {
    private ArrayList<T> storage;

    public ServiceRepository() {
        storage = new ArrayList<>();
    }

    public void add(T service){
        storage.add(service);
    }

    public void remove(T service){
        storage.remove(service);
    }

    public void sort(){
        Collections.sort(storage, new Comparator<T>() {
            @Override
            public int compare(Service o1, Service o2) {
                if (o1.getAmount() > o2.getAmount()) {
                    return 1;
                } else if (o1.getAmount() < o2.getAmount()) {
                    return -1;
                }
                return 0;
            }
        });
    }

    public T get(int idx){
        return storage.get(idx);
    }

    public ArrayList<T> getStorage() {
        return storage;
    }

    public void setStorage(ArrayList<T> storage) {
        this.storage = storage;
    }

    public void print(){
        System.out.println(Arrays.asList(storage));
    }
}
