package pri.sis.config;

import pri.sis.annotations.Bean;
import pri.sis.beans.Person;

public class AppConfig {
    @Bean
    public Person person(){
        return new Person();
    }
}
