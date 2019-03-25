import hallo.Electricity;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;
import static junit.framework.TestCase.assertTrue;

public class ElectricityTest {
    Electricity e1;

    @Before
    public void setUp(){e1 = new Electricity("Ollie", 17, 5, false, "18-03-2019", 4000);}

    @Test
    public void constrTest(){assertEquals(true, e1 != null);}

    @Test
    public void getSetTest(){
        assertEquals("Ollie", e1.getUsername());
        assertEquals((Integer) 17, e1.getHeatingHrs());
        assertEquals((Integer) 5, e1.getLightHrs());
        assertEquals((Boolean) false, e1.getSolarPanels());
        assertEquals("18-03-2019", e1.getDate());
        assertEquals((Integer) 4000, e1.getScore());
        e1.setUsername(e1.getUsername());
        e1.setHeatingHrs(20);
        e1.setLightHrs(10);
        e1.setSolarPanels(true);
        e1.setDate("20-03-2019");
        e1.setScore(2000);
    }

    @Test
    public void toStringTest(){
        Electricity e = new Electricity();
        e.setId(1);
        assertEquals(e.getId()+0,1);

        assertTrue(e1.toString().contains("18-03-2019"));
    }
}
