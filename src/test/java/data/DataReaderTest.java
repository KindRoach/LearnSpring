package data;

import data.config.DataConfig;
import data.datareader.DataReader;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = DataConfig.class)
public class DataReaderTest {
    @Autowired
    DataReader reader;

    @Test
    public void ReadDataTest() {
        reader.readData();
    }
}
