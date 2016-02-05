public class Launcher {

    public static void main(String[] args) {

        ServiceRepository<Service> srv = new ServiceRepository<>();
        for(int i = 0; i <= 10; i++) {
            srv.add(new Duck("duck", i));
        }

        srv.print();

    }
}
