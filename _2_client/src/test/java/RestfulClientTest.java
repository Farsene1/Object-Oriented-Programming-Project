import classes.RestfulClient;
import classes.User;
import hello.GreetingController;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.ResponseEntity;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RestfulClientTest {

    @MockBean
    private GreetingController controller;

    private RestfulClient client;

    @BeforeEach
    public void setUp(){
        client = new RestfulClient();
    }

    @Test
    public void getTest(){
        ResponseEntity<User> rs = client.getEntity();
        System.out.println(rs.getBody().toString());
        assertEquals(rs.getBody().getUsername(), "Florentin");
        assertEquals(rs.getBody().getHash(),"abcdef");
    }

    @Test
    public void postTest(){
        ResponseEntity<String> rs = client.postEntity(new User("Florentin","123abc"));
        assertEquals(rs.getStatusCode().value(), 200);
        assertEquals(rs.getBody(), "/POST successful");
    }
}
