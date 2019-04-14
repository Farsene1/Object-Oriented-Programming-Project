import classes.*;
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
        String getUrl = "https://poolar.herokuapp.com/get?username=Florentin&hash=abcdef";
        Mockito.when(restTemplate.getForObject(getUrl, User.class))
                .thenReturn(new User("admin", "root"));
        assertEquals("admin", restfulClient.getEntity().getUsername());
    }

    @Test
    public void getUpdatesTest() {
        User u = new User("admin", "hash");
        String postUrl = "https://poolar.herokuapp.com/requestforupdate";
        Mockito.when(restTemplate.postForEntity(postUrl, u, User.class))
                .thenReturn(ResponseEntity.ok(u));
        assertEquals(u.getUsername(), restfulClient.getUpdates(u).getUsername());

    }

    @Test
    public void addActivityTest() {
        Activity a = new Activity("farsene", 1, "vegetarian", 50, "");
        String url = "https://poolar.herokuapp.com/test";
        Mockito.when(restTemplate.postForObject(url, a, List.class))
                .thenReturn(new ArrayList<Activity>());
        assertEquals(0, restfulClient.addActivity(a).size());
    }

    @Test
    public void postEntityTest() {
        String url = "https://poolar.herokuapp.com/post";
        User u = new User("admin", "hash");
        Mockito.when(restTemplate.postForEntity(url, u, String.class))
                .thenReturn(ResponseEntity.ok("OK"));
        assertEquals("OK", restfulClient.postEntity(u));
    }

    @Test
    public void activityTest() {
        User user = new User("admin", "hash");
        String postUrl = "https://poolar.herokuapp.com/activity";
        Mockito.when(restTemplate.postForEntity(postUrl, user, String.class))
                .thenReturn(ResponseEntity.ok("OK"));
        assertEquals("OK", restfulClient.activity(user));
    }

    @Test
    public void loginTest() {
        String postUrl = "https://poolar.herokuapp.com/login";
        User user = new User();
        Mockito.when(restTemplate.postForEntity(postUrl, user, String.class))
                .thenReturn(ResponseEntity.ok("OK"));
        assertEquals("OK", restfulClient.login(user));
    }

    @Test
    public void getAllActivitiesTest() {
        User u = new User();
        String url = "https://poolar.herokuapp.com/firstactivities";
        Mockito.when(restTemplate.postForObject(url, u, List.class))
                .thenReturn(new ArrayList<Activity>());
        List l = restfulClient.getAllActivities(u);
        assertEquals(0, l.size());
    }

    @Test
    public void get10UsersTest() {
        String url = "https://poolar.herokuapp.com/leaderboard";
        Mockito.when(restTemplate.getForObject(url, List.class))
                .thenReturn(Arrays.asList(new User(), new User()));
        assertEquals(2, restfulClient.get10Users().size());
    }

    @Test
    public void badgeTest() {
        User u = new User("admin", "hash");
        String postUrl = "https://poolar.herokuapp.com/updateBadge";
        Mockito.when(restTemplate.postForEntity(postUrl, u, String.class))
                .thenReturn(ResponseEntity.ok("200OK"));
        assertEquals("200OK", restfulClient.badge(u));
    }

    @Test
    public void getAllFriendsTest() {
        User u = new User("admin", "root");
        String url = "https://poolar.herokuapp.com/friendship/friends";
        Mockito.when(restTemplate.postForObject(url, u, List.class))
                .thenReturn(Arrays.asList(u));
        assertEquals(1, restfulClient.getAllFriends(u).size());
    }

    @Test
    public void getAllFriendRequestsTest() {
        User u = new User("admin", "root");
        String url = "https://poolar.herokuapp.com/friendship/getallrequests";
        Mockito.when(restTemplate.postForObject(url, u, List.class))
                .thenReturn(Arrays.asList(new FriendRequest()));
        assertEquals(1, restfulClient.getAllFriendRequests(u).size());
    }

    @Test
    public void sendFriendRequestTest() {
        String postUrl = "https://poolar.herokuapp.com/friendship/request";
        FriendRequest f = new FriendRequest();
        Mockito.when(restTemplate.postForEntity(postUrl, f, String.class))
                .thenReturn(ResponseEntity.ok("OK"));
        assertEquals("OK", restfulClient.sendFriendRequest(f));
    }

    @Test
    public void respondTest(){
        String postUrl = "https://poolar.herokuapp.com/friendship/respond";
        FriendRequest f = new FriendRequest();
        Mockito.when(restTemplate.postForEntity(postUrl, f, String.class))
                .thenReturn(ResponseEntity.ok("ERROR"));
        assertEquals("ERROR", restfulClient.respond(f));
    }

    @Test
    public void fakeRespondTest(){
        String postUrl = "https://poolar.herokuapp.com/friendship/fakeresponse";
        FriendRequest f = new FriendRequest();
        Mockito.when(restTemplate.postForEntity(postUrl, f, String.class))
                .thenReturn(ResponseEntity.ok("ERROR"));
        assertEquals("ERROR", restfulClient.fakeRespond(f));
    }

    @Test
    public void getAllStatsTest(){
        String url = "https://poolar.herokuapp.com/statistics";
        String username = "admin";
        Mockito.when(restTemplate.postForObject(url, "admin", List.class))
                .thenReturn(Arrays.asList(new Statistics("",12,"21")));
        assertEquals(1, restfulClient.getAllStatistics(username).size());
    }

    @Test
    public void setSolarTest(){
        String postUrl = "https://poolar.herokuapp.com/addsolar";
        User u = new User("admin","hash");
        Mockito.when(restTemplate.postForEntity(postUrl, u, String.class)).thenReturn(ResponseEntity.ok("OK"));
        assertEquals("OK", restfulClient.setSolar(u));
    }

    @Test
    public void getStatsByTypeTest(){
        String url = "https://poolar.herokuapp.com/stats?username=admin";
        Mockito.when(restTemplate.postForObject(url, "ALL", List.class))
                .thenReturn(Arrays.asList(new Statistics(), new Statistics()));
        assertEquals(2, restfulClient.getStatsByType("admin","ALL").size());
    }

    @Test
    public void findUsersByRegexTest(){
        String url = "https://poolar.herokuapp.com/regex";
        Mockito.when(restTemplate.postForObject(url, "ad", List.class)).thenReturn(Arrays.asList("ad1","ad2"));
        assertEquals(2, restfulClient.findUsersByRegex("ad").size());
    }
}
