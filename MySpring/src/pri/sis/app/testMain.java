package pri.sis.app;

import pri.sis.config.AppConfig;
import pri.sis.myspring.AnnotationClassConfigContext;

import java.lang.reflect.InvocationTargetException;

public class testMain {
    public static void main(String[] args) {
        AnnotationClassConfigContext ctx = new AnnotationClassConfigContext();
        try {
            ctx.registe(AppConfig.class);
            System.out.println(ctx.getBean("person"));
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }
    }
}
