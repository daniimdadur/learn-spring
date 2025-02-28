package bootcampjavapamarican.spring.core;

import bootcampjavapamarican.spring.core.data.Server;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class LifeCycleConfiguration {

    @Bean
    public Connection connection(){
        return new Connection();
    }

    //@Bean(initMethod = "start",destroyMethod = "stop")
    @Bean
    public Server server(){
        return new Server();
    }
}
