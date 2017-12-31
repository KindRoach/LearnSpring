package data.config;

import data.datareader.DataReader;
import data.datareader.DevDataBaseReader;
import data.datareader.ProdDataBaseReader;
import org.springframework.context.annotation.*;

@Configuration
@PropertySource("/data.properties")
public class DataConfig {
    @Bean
    @Conditional(DevCondition.class)
    public DataReader devDataBaseReader() {
        return new DevDataBaseReader();
    }

    @Bean
    @Conditional(ProdCondition.class)
    public DataReader prodDataBaseReader() {
        return new ProdDataBaseReader();
    }
}
