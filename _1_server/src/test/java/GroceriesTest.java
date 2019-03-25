import hallo.Groceries;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;
import static junit.framework.TestCase.assertTrue;

public class GroceriesTest {
    Groceries g1;

    @Before
    public void setUp(){g1 = new Groceries("Sayf", "import", "18-03-2019", 5000);}

    @Test
    public void constrTest(){assertEquals(true, g1 != null);}

    @Test
    public void getSetTest(){
        assertEquals("Sayf", g1.getUsername());
        assertEquals("import", g1.getType());
        assertEquals("18-03-2019", g1.getDate());
        assertEquals((Integer) 5000, g1.getScore());
        g1.setUsername(g1.getUsername());
        g1.setType("local");
        g1.setDate("20-03-2019");
        g1.setScore(7000);
    }

    @Test
    public void toStringTest(){
        Groceries g = new Groceries();
        g.setId(1);
        assertEquals(g.getId()+0,1);

        assertTrue(g1.toString().contains("import"));
    }
}
