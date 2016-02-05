public class Launcher {

    public static void main(String[] args) {

        MyOwnBox box = new MyOwnBox<>();

        box.add(new Eagle());
        box.add(new Duck());
        box.add(new Eagle());
        Duck duck = new Duck();
        box.add(duck);
        box.print();
        box.remove(duck);
        box.print();




    }
}
