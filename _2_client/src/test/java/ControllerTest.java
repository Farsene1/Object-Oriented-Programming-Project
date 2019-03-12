import classes.Controller;
import org.junit.Test;

import static junit.framework.TestCase.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;


public class ControllerTest {

    @Test
    public void checkEmailTest(){
        String email1 = "sfss";
        String email2= "sayfgmaul@gmail.com";
        assertEquals(Controller.checkEmail(email1), false);
        assertEquals(Controller.checkEmail(email2), true);
        assertTrue(Controller.checkEmail("email@email.com"));
    }
}
