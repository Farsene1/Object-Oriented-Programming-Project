import hello.Activity;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class ActivityTest {
    Activity activity1;

    @Before
    public void setUp() {
        activity1 = new Activity("Flo", 1, "vegan", 500, "18-03-2019");
    }

    @Test
    public void constrTest() {
        assertEquals(true, activity1 != null);
    }

    @Test
    public void getSetTest() {
        assertEquals("Flo", activity1.getUsername());
        assertEquals((Integer) 1, activity1.getCategory());
        assertEquals("Food", activity1.getCat());
        assertEquals("vegan", activity1.getDescription());
        assertEquals((Integer) 500, activity1.getFootprint());
        assertEquals("18-03-2019", activity1.getDate());
        activity1.setUsername(activity1.getUsername());
        activity1.setCategory(2);
        activity1.setCat(activity1.getCat());
        activity1.setDescription("description");
        activity1.setFootprint(500);
        activity1.setDate("19-03-2019");
    }

    @Test
    public void toStringTest() {
        Activity a = new Activity();
        a.setId(1);
        assertEquals(a.getId() + 0, 1);

        assertTrue(activity1.toString().contains("vegan"));
    }

    @Test
    public void caseTest() {
        Activity a = new Activity("Flo", 2, "bike", 500, "18-03-2019");
        assertEquals("Transport", a.getCat());
        a = new Activity("Flo", 3, "Heat", 500, "18-03-2019");
        assertEquals("Electricity", a.getCat());
        activity1.setCategory(1);
        activity1.setCategory(3);
    }
}
