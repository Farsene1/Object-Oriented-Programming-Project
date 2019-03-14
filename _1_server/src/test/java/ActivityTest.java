import hello.Activity;
import hello.User;
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
        assertEquals(user1, activity1.getUserId());
    assertEquals((Integer) 1, activity1.getCategory());
    assertEquals("vegetarian", activity1.getDescription());
    assertEquals((Integer) 50, activity1.getCarbonFootprint());
    assertEquals("13-03-2019", activity1.getDate());
    activity1.setUserId(user1.getUsername());
    activity1.setCategory(0);
    activity1.setDescription("meal type");
    activity1.setCarbonFootprint(0);
    activity1.setDate("");
    }

    @Test
    public void toStringTest(){
        assertTrue(activity1.toString().contains(user1.toString()));
        assertTrue(activity1.toString().contains(Integer.toString(activity1.getCategory())));
        assertTrue(activity1.toString().contains(activity1.getDescription()));
        assertTrue(activity1.toString().contains(Integer.toString(activity1.getCarbonFootprint())));
        //assertTrue(activity1.toString().contains(activity1.getDate()));
    }
}
