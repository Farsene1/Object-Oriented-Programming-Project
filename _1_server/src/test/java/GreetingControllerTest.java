import hello.GreetingController;
import hello.User;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GreetingControllerTest {
    private GreetingController greetingController;

    @BeforeEach
    public void setUp(){
        greetingController = new GreetingController();
    }

    @Test
    public void webTest(){
        User user = greetingController.greeting("Florentin","hash");
        assertEquals("Florentin",user.getUsername());
        assertEquals("hash",user.getHash());
    }

    @Test
    public void posttTest(){
        String s = greetingController.postMethod(new User("Floren","hash"));
        assertEquals(s,"/POST successfull");
    }

    @Test
    public void defTest(){
        String s = greetingController.getRootPath();
        assertEquals(s,"this is the default page");
    }
}
