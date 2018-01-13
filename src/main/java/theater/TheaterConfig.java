package theater;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

@Configuration
@EnableAspectJAutoProxy
public class TheaterConfig {

    @Bean
    public Audience audience() {
        return new Audience();
    }

    @Bean
    public Performance goodActor() {
        return new GoodActor();
    }

    @Bean
    public Performance badActor() {
        return new BadActor();
    }
}
