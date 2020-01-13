package pri.sia;

import org.springframework.context.support.ClassPathXmlApplicationContext;
import pri.sia.beans.Person;

public class LoadClasspathXmlConfig {
    public static void main(String[] args) {
        ClassPathXmlApplicationContext ctx = new ClassPathXmlApplicationContext("app-context.xml");
        Person person = (Person) ctx.getBean("person");
        System.out.println(person);
    }
}
