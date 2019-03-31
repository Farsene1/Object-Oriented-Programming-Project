import hello.Statistics;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class StatisticsTest {
    Statistics statistics;

    @Before
    public void setUp(){
        statistics = new Statistics("Julian", 5000, "22-02-1999");
    }

    @Test
    public void constrTest(){assertEquals(true, statistics != null);}

    
}
