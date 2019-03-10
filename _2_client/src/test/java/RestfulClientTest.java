import classes.RestfulClient;
import classes.User;
import hello.GreetingController;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RestfulClientTest {

    @Autowired
    private GreetingController controller = Mockito.mock(GreetingController.class);

    private RestfulClient client;

    @BeforeEach
    public void setUp(){
        client = new RestfulClient();
    }

    @Test
    public void getTest(){ // WHY DOESN"T THIS WORK ?????????? problem with mocking the class
        Mockito.when(controller.greeting("Florentin","abcdef")).thenReturn(new hello.User("admin","root"));
        ResponseEntity<User> rs = client.getEntity();
        System.out.println(rs.getBody().toString());
        assertEquals("Florentin",rs.getBody().getUsername());
        assertEquals("abcdef",rs.getBody().getHash());
    }

    @Test
    public void postTest(){
        Mockito.when(controller.postMethod(new hello.User("Florentin","123abc"))).thenReturn("/POST failed");
        ResponseEntity<String> rs = client.postEntity(new User("Florentin","123abc"));
        assertEquals(rs.getStatusCode().value(), 200);
        assertEquals("/POST failed", rs.getBody());
    }

    @Test
    public void loginTest(){
        Mockito.when(controller.login(new hello.User("admin","root"))).thenReturn("YES");
        String res = client.login(new User("admin","root"));
        assertEquals("NEGATIVE",res);
    }
}
