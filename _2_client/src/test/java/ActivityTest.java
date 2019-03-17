import classes.Activity;
import classes.User;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class ActivityTest {
    User user1;
    Activity activity1;

    @Before
    public void setUp(){
        user1 = new User("Flo","abc");
        activity1 = new Activity(user1.getUsername(),1, "vegetarian", 50, "");
    }

    @Test
    public void constrTest(){assertEquals(true, activity1 != null);}

    @Test
    public void getSetTest(){
        assertEquals(user1.getUsername(), activity1.getUsername());
        assertEquals((Integer) 1, activity1.getCategory());
        assertEquals("vegetarian", activity1.getDescription());
        assertEquals((Integer) 50, activity1.getFootprint());
        assertEquals("", activity1.getDate());
        activity1.setUsername(user1.getUsername());
        activity1.setCategory(0);
        activity1.setDescription("meal type");
        activity1.setFootprint(0);
        activity1.setDate("");
    }

    @Test
    public void toStringTest(){
        Activity a = new Activity();
        a.setId(1);
        assertEquals(a.getId()+0,1);

        assertTrue(activity1.toString().contains("vegetarian"));
    }
}
