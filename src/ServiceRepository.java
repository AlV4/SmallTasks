import java.util.ArrayList;
import java.util.Arrays;

public class ServiceRepository<Service> {
    private ArrayList<Service> storage;

    public ServiceRepository() {
        storage = new ArrayList<>();
    }

    public void add(Service service){
        storage.add(service);
    }

    public void remove(Service service){
        storage.remove(service);
    }

    public Service get(int idx){
        return storage.get(idx);
    }

    public ArrayList<Service> getStorage() {
        return storage;
    }

    public void setStorage(ArrayList<Service> storage) {
        this.storage = storage;
    }

    public void print(){
        System.out.println(Arrays.asList(storage));
    }
}
