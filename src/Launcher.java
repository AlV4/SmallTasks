import service.Chicken;
import service.InstanceCreator;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Launcher {

    public static void main(String[] args) throws Exception{
        InstanceCreator<Chicken>creator = new InstanceCreator<>();

        Map<String, Object> map = new HashMap<>();
        map.put("name", "Kurka");
        map.put("amount", 10);
        map.put("weight", 200);
        map.put("price", 40);
        Chicken chicken = creator.initClass(Chicken.class, map);
        System.out.println(chicken);

        ArrayList<Object>list = new ArrayList<>();
        list.add("Another Kurka");
        list.add(20);
        list.add(50.0d);
        list.add(111.0d);
        list.removeAll(list);
        Chicken chicken1 = creator.initClass(Chicken.class,list);
           System.out.println(chicken1);
    }
}
