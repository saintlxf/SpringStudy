package pri.sia;

import org.springframework.context.support.FileSystemXmlApplicationContext;
import pri.sia.beans.Person;

public class LoadFileXmlConfig {
    public static void main(String[] args) {
        FileSystemXmlApplicationContext ctx = new FileSystemXmlApplicationContext("d:\\app-context.xml");
        Person person = (Person) ctx.getBean("person");
        System.out.println(person);
    }
}
