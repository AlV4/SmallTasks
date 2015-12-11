import java.util.ArrayList;
import java.util.Collections;

public class Launcher {

    public static void main(String[] args) {

        ArrayList names = new ArrayList();
        names.add("Alexander");
        names.add("Vasiliy");
        names.add("Konstantin");
        names.add("Olga");
        names.add("Viktoria");
        names.add("Tatiana");
        names.add("Igor");
        names.add("Andrey");
        names.add("Valentun");
        names.add("Zorg");

        for(Object name : names) {
            String n = (String) name;
            System.out.println(n);
        }
        Collections.sort(names,new Comparator());
        System.out.println("-------------=======<<<sort>>>======-------------");
        for(Object name : names) {
            String n = (String) name;
            System.out.println(n);
        }
    }

}
