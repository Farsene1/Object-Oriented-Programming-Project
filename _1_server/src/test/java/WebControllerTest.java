import hello.User;
import hello.WebController;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.web.client.RestTemplate;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class WebControllerTest {

    private RestTemplate restTemplate;
    private WebController webController;

    @BeforeEach
    public void setUp(){
        restTemplate = new RestTemplate();
        webController = new WebController();
    }

    @Test
    public void webTest(){
        User u = webController.greeting("Florentin","hash");
        assertEquals("Florentin",u.getUsername());
        assertEquals("hash",u.getHash());
    }

    @Test
    public void posttTest(){
        String s = webController.postMethod(new User("Floren","hash"));
        assertEquals(s,"/POST successful");
    }

    @Test
    public void defTest(){
        String s = webController.getRootPath();
        assertEquals(s,"this is the default page");
    }

}