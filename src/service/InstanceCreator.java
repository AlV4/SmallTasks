package service;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class InstanceCreator <T> {

    public T initClass(Class<T> c, Map<String, Object> map) throws Exception{
        Set<String> names = map.keySet();
        T instance = c.newInstance();
        Method methods[] = c.getMethods();
        for (Method m : methods){
            String methodName = m.getName();
            if(methodName.contains("set")){
                for(String str: names){
                    if(methodName.toLowerCase().contains(str)){
                            m.invoke(instance,map.get(str));

                    }
                }

            }
        }

        return instance;
    }
    public T initClass(Class<? extends T> c, ArrayList<Object> list) throws Exception{

        Constructor[] constructors = c.getConstructors();
        if(constructors.length > 0){
            for(Constructor constr : constructors) {
                if(compareTypes(constr, list)){
                   return (T) constr.newInstance(list.toArray());
                }
            }
        }
        throw new IllegalArgumentException("Sorry, no constructor with such parameters!");
    }

    private boolean compareTypes(Constructor constructor, List types){
        Class [] classes = constructor.getParameterTypes();
        if(classes.length != types.size()){
            return false;
        }
        for (int i = 0; i < classes.length; i++){
            if(!types.get(i).getClass().getSimpleName().toLowerCase().contains(classes[i].getSimpleName().toLowerCase())){
                return false;
            }
        }
        return true;
    }

    public void setPrivates(Object o, Map<String, Object> map) throws Exception{
        Set<String> names = map.keySet();
        Field[]fields = o.getClass().getDeclaredFields();
        for (Field field : fields){
            String fieldName = field.getName();
            if(!field.isAccessible()){
                field.setAccessible(true);
                for(String str: names){
                    if(fieldName.trim().toLowerCase().contains(str.trim().toLowerCase())){
                        field.set(o, map.get(str));
                    }
                }
            }
        }
    }
}
