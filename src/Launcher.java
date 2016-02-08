import service.Duck;
import service.Eagle;
import service.Service;
import service.ServiceRepository;

public class Launcher {

    public static void main(String[] args) {

        ServiceRepository<Service> box = new ServiceRepository();

        Duck duck = new Duck("Aaaa", 1);
        Eagle eagle = new Eagle("Bbbb",2);

        box.add(duck);
        box.add(eagle);

        for (Service s : box.getStorage()){
            System.out.println(s);
        }

    }
}
