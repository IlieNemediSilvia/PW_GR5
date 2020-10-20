package demo9;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ApplicationConfiguration {

    @Bean
   public FibonacciFactoryBean createFactory(){
        return new FibonacciFactoryBean();
    }

}
