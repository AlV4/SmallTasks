import service.Service;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;

public class ApplicationManager <T>{

   public void printAnnotatedMethod(Class<T> clazz){
       for(Method m : clazz.getMethods()){
           for(Annotation annotation : m.getAnnotations()){
               if(annotation instanceof Service){
                   System.out.println("Class " + clazz.getSimpleName() +": contains method [" + m.getName()
                           + "] with an annotation " + annotation.toString());
               }
           }
       }
   }
}
