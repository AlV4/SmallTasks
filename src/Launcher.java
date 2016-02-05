public class Launcher {

    public static void main(String[] args) {

        MyOwnBox box = new MyOwnBox<>();

        box.add(new Eagle("One Eagle", 4));
        box.add(new Duck("One Duck", 3));
        box.add(new Eagle("Another Eagle", 2));
        Duck duck = new Duck("Duck with a reference", 1);
        box.add(duck);
        box.print();
        box.sort();
        box.print();




    }
}
