package pri.sis.myspring;

import pri.sis.annotations.Bean;

import java.lang.annotation.Annotation;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.HashMap;
import java.util.Map;

public class AnnotationClassConfigContext {
    public Map<String,Object> springContainer;

    public AnnotationClassConfigContext(){
        springContainer = new HashMap<>();
    }
    public void registe(Class c) throws IllegalAccessException, InstantiationException, InvocationTargetException {
        Object a = c.newInstance();
        for (Method method :
                c.getMethods()) {
            //System.out.println(method.getDeclaredAnnotations()[0].annotationType());
            for (Annotation annotation:
            method.getDeclaredAnnotations()) {
                System.out.println(annotation.annotationType().getName());
            }
            System.out.println("-----------------------");
            if(method.isAnnotationPresent(Bean.class)){
                System.out.println(method.getName());
                Object obj = method.invoke(a);
                springContainer.put(method.getName(),obj);
            }
        }
    }
    public Object getBean(String name){
        return springContainer.get(name);
    }
}
