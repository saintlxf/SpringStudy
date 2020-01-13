package pri.sia;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import pri.sia.beas.Person;
import pri.sia.pri.sia.config.AppConfig;

public class LoadJavaConfig {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext();
        ctx.register(AppConfig.class);
        ctx.refresh();

        Person person = (Person)ctx.getBean("person");
        System.out.println(person);
    }
}
