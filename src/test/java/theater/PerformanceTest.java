package theater;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import static org.junit.Assert.assertEquals;

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

    @Test
    public void singTest() {
        actor.sing("A");
        actor.sing("A");
        actor.sing("B");
        actor.sing("B");
        actor.sing("C");
        assertEquals(audience.getSongTimes("A"), 2);
        assertEquals(audience.getSongTimes("B"), 2);
        assertEquals(audience.getSongTimes("C"), 1);
    }
}
