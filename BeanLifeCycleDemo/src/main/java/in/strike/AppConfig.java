package in.strike;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
@ComponentScan
public class AppConfig {

//    @Bean(initMethod = "start", destroyMethod = "stop")
//    public CartService getCartBean(){
//        return new CartService();
//    }
}
