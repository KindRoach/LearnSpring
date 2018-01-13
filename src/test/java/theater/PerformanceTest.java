package theater;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = TheaterConfig.class)
public class PerformanceTest {
    @Qualifier("goodActor")
    @Autowired
    Performance actor;

    @Autowired
    Audience audience;

    @Test
    public void performTest() throws Exception {
        actor.perform();
    }
}
