package in.vishnu;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScans;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("in.vishnu")
public class AppConfig {
    @Bean
    public User createuser(){
        return new User("vishnu",22);
    }

}
