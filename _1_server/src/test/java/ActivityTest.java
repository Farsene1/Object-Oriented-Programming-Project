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
        activity1 = new Activity(user1,1, "vegan", 50, "12-03-2019");
    }

    @Test
    public void constrTest(){assertEquals(true, user1 != null);}



}
