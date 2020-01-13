package pri.sia.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import pri.sia.beans.Person;

@Configuration
public class AppConfig {
    @Bean
    public Person person(){
        return new Person();
    }
}
