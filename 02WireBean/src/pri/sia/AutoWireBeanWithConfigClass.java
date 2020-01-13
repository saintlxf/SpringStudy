package pri.sia;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import pri.sia.config.AppConfig;


public class AutoWireBeanWithConfigClass {


    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();
        ctx.register(AppConfig.class);
        ctx.refresh();
        //Person person = (Person) ctx.getBean("person");
        //System.out.println(person);
    }
}
