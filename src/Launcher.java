import service.Chicken;
import service.InstanceThroughSettersCreator;

import java.util.HashMap;
import java.util.Map;

public class Launcher {

    public static void main(String[] args) throws Exception{

        Map<String, Object> map = new HashMap<>();
        map.put("name", "Kurka");
        map.put("amount", 10);
        map.put("weight", 200);
        map.put("price", 40);
        Chicken chicken = new InstanceThroughSettersCreator<Chicken>().initClass(new Chicken().getClass(), map);
        System.out.println(chicken);

    }
}
