import hello.Activity;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class ActivityTest {
    Activity activity1;

    @Before
    public void setUp(){
        activity1 = new Activity("Flo","food", "vegan", 500, "18-03-2019");
    }

    @Test
    public void constrTest(){assertEquals(true, activity1 != null);}

    @Test
    public void getSetTest(){
    assertEquals("Flo", activity1.getUsername());
    assertEquals("food", activity1.getCategory());
    assertEquals((Integer) 500, activity1.getScore());
    assertEquals("18-03-2019", activity1.getDate());
    activity1.setUsername(activity1.getUsername());
    activity1.setCategory("category type");
    activity1.setDescription("description");
    activity1.setScore(500);
    activity1.setDate("19-03-2019");
    }

    @Test
    public void toStringTest(){
        Activity a = new Activity();
        a.setId(1);
        assertEquals(a.getId()+0,1);

        assertTrue(activity1.toString().contains("vegan"));
    }
}
