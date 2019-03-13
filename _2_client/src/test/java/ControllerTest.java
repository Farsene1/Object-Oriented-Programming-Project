import org.junit.Test;

import static classes.Controller.checkEmail;
import static junit.framework.TestCase.assertTrue;
import static org.junit.jupiter.api.Assertions.assertEquals;


public class ControllerTest {

    @Test
    public void checkEmailTest(){
        String email1 = "sfss";
        String email2= "sayfgmaul@gmail.com";
        assertEquals(checkEmail(email1), false);
        assertEquals(checkEmail(email2), true);
        assertTrue(checkEmail("email@email.com"));
    }
}
