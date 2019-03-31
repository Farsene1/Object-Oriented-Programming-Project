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

    @Test
    public void getSetTest(){
        assertEquals("Julian", statistics.getUsername());
        assertEquals((Integer) 5000, statistics.getScore());
        assertEquals("22-02-1999", statistics.getDate());
        statistics.setUsername(statistics.getUsername());
        statistics.setScore(6000);
        statistics.setDate("22-02-1999");
    }

    @Test
    public void toStringTest(){
        Statistics s = new Statistics();
        s.setId(1);
        assertEquals(s.getId()+0,1);

        assertTrue(statistics.toString().contains("Julian"));
    }
}
