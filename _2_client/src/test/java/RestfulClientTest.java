import classes.Activity;
import classes.RestfulClient;
import classes.User;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RestfulClientTest {

    @Autowired
    private RestfulClient restfulClient;

    @MockBean
    private RestTemplate restTemplate = Mockito.mock(RestTemplate.class);

    @BeforeEach
    public void setUp() {
        restfulClient = new RestfulClient();
        restfulClient.setRestTemplate(restTemplate);
    }

    @Test
    public void getEntityTest() {
        String getUrl = "http://localhost:8080/get?username=Florentin&hash=abcdef";
        Mockito.when(restTemplate.getForObject(getUrl, User.class))
                .thenReturn(new User("admin", "root"));
        assertEquals("admin", restfulClient.getEntity().getUsername());
    }

    @Test
    public void getUpdatesTest() {
        User u = new User("admin", "hash");
        String postUrl = "http://localhost:8080/requestforupdate";
        Mockito.when(restTemplate.postForEntity(postUrl, u, User.class))
                .thenReturn(ResponseEntity.ok(u));
        assertEquals(u.getUsername(), restfulClient.getUpdates(u).getUsername());

    }

    @Test
    public void addActivityTest() {
        Activity a = new Activity("farsene", 1, "vegetarian", 50, "");
        String url = "http://localhost:8080/test";
        Mockito.when(restTemplate.postForObject(url, a, List.class))
                .thenReturn(new ArrayList<Activity>());
        assertEquals(0, restfulClient.addActivity(a).size());
    }

    @Test
    public void postEntityTest() {
        String url = "http://localhost:8080/post";
        User u = new User("admin", "hash");
        Mockito.when(restTemplate.postForEntity(url, u, String.class))
                .thenReturn(ResponseEntity.ok("OK"));
        assertEquals("OK", restfulClient.postEntity(u));
    }

    @Test
    public void activityTest() {
        User user = new User("admin", "hash");
        String postUrl = "http://localhost:8080/activity";
        Mockito.when(restTemplate.postForEntity(postUrl, user, String.class))
                .thenReturn(ResponseEntity.ok("OK"));
        assertEquals("OK", restfulClient.activity(user));
    }

    @Test
    public void loginTest() {
        String postUrl = "http://localhost:8080/login";
        User user = new User();
        Mockito.when(restTemplate.postForEntity(postUrl, user, String.class))
                .thenReturn(ResponseEntity.ok("OK"));
        assertEquals("OK", restfulClient.login(user));
    }

    @Test
    public void getAllActivitiesTest() {
        User u = new User();
        String url = "http://localhost:8080/firstactivities";
        Mockito.when(restTemplate.postForObject(url, u, List.class))
                .thenReturn(new ArrayList<Activity>());
        List l = restfulClient.getAllActivities(u);
        assertEquals(0, l.size());
    }

    @Test
    public void get10UsersTest() {
        String url = "http://localhost:8080/leaderboard";
        Mockito.when(restTemplate.getForObject(url, List.class))
                .thenReturn(Arrays.asList(new User(), new User()));
        assertEquals(2, restfulClient.get10Users().size());
    }

    @Test
    public void badgeTest() {
        User u = new User("admin", "hash");
        String postUrl = "http://localhost:8080/updateBadge";
        Mockito.when(restTemplate.postForEntity(postUrl, u, String.class))
                .thenReturn(ResponseEntity.ok("200OK"));
        assertEquals("200OK", restfulClient.badge(u));
    }

    @Test
    public void getAllFriendsTest() {
        User u = new User("admin", "root");
        String url = "http://localhost:8080/friendship/friends";
    }
}
