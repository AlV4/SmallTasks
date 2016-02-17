package service;

import java.lang.reflect.Method;
import java.util.Map;
import java.util.Set;

public class InstanceThroughSettersCreator <T> {

    public T initClass(Class c, Map<String, Object> map) throws Exception{
        Set<String> names = map.keySet();
        T instance =  (T) c.newInstance();
        Method methods[] = c.getMethods();
        for (Method m : methods){
            String methodName = m.getName();
            if(methodName.contains("set")){
                System.out.println(m.getName());
                for(String str: names){
                    if(methodName.toLowerCase().contains(str)){
                            m.invoke(instance,map.get(str));

                    }
                }

            }
        }

        return instance;
    }
}
