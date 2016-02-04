public class Launcher {

    public static void main(String[] args) {

       Integer integer = 10;
        MyOwnBox<Integer> box = new MyOwnBox<>();

        box.add(integer);
        box.add(2);
        box.add(6);
        box.print();
        box.remove(integer);
        box.print();

        MyOwnBox<String> strBox = new MyOwnBox<>();
        strBox.add("One");
        strBox.add("Two");
        strBox.add("Good IDEA!");
        strBox.print();
        strBox.remove("Two");
        strBox.print();
    }
}
