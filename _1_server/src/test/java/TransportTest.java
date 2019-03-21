import hello.Transport;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;
import static junit.framework.TestCase.assertTrue;

public class TransportTest {
    Transport t1;

    @Before
    public void setUp(){t1 = new Transport("Hashim", "car", 5, 50, "18-03-2019");}

    @Test
    public void constrTest(){assertEquals(true, t1 != null);}

    @Test
    public void getSetTest(){
        assertEquals("Hashim", t1.getUsername());
        assertEquals("car", t1.getType());
        assertEquals((Integer) 5, t1.getDistance());
        assertEquals("18-03-2019", t1.getDate());
        assertEquals((Integer) 50, t1.getScore());
        t1.setUsername(t1.getUsername());
        t1.setType("bus");
        t1.setDistance(7);
        t1.setDate("20-03-2019");
        t1.setScore(150);
    }

    @Test
    public void toStringTest(){
        Transport t = new Transport();
        t.setId(1);
        assertEquals(t.getId()+0,1);

        assertTrue(t1.toString().contains("car"));
    }
}
