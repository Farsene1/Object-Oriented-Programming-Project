import hello.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.mock.mockito.MockBean;

import java.util.ArrayList;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

public class ControllerTest {

    @Autowired
    private UserController controller = new UserController();

    @MockBean
    private UserRepository repository = Mockito.mock(UserRepository.class);

    @MockBean
    private FriendshipRepository friendshipRepository = Mockito.mock(FriendshipRepository.class);

    @MockBean
    private FriendRequestRepository friendRequestRepository = Mockito.mock(FriendRequestRepository.class);

    private User user1 = new User("admin", "root");
    private User user2 = new User("postgres", "root");

    @BeforeEach
    public void setUp() {
        controller.setUserRepository(repository);
        controller.setFriendshipRepository(friendshipRepository);
        controller.setFriendRequestRepository(friendRequestRepository);
    }

    @Test
    public void defaultTest() {
        String result = controller.getRootPath();
        assertEquals("this is the default page", result);
    }

    @Test
    public void postTest() {
        Mockito.when(repository.findUserByUsername(user1.getUsername())).thenReturn(new ArrayList<>());
        String res = controller.postMethod(user1);
        assertEquals("/POST successful", res);
    }

    @Test
    public void postTestFail() {
        Mockito.when(repository.findUserByUsername(user1.getUsername())).thenReturn(
                Arrays.asList(user1));
        assertEquals("/POST failed", controller.postMethod(user1));
    }

    @Test
    public void loginTest() {
        when(repository.findUserByUsername(user2.getUsername())).thenReturn(
                Arrays.asList(user2)
        );
        String res = controller.login(user2);
        assertEquals("POSITIVE", res);
    }

    @Test
    public void loginTestFail() {
        when(repository.findUserByUsername(user2.getUsername())).thenReturn(new ArrayList<>());
        String res = controller.login(user2);
        assertEquals("NEGATIVE", res);
    }

    @Test
    public void getAllUsersTest() {
        when(repository.findAllUsers()).thenReturn((Arrays.asList(new User("farsene", "hash"),
                new User("admin", "root"))));
        assertEquals(2, repository.findAllUsers().size());
        //Mockito.when(controller.getAll()).thenReturn(new ArrayList<>());
        assertEquals(2, controller.getAll().size());
    }

    @Test
    public void basicGetTest() {
        User u = controller.greeting("Florentin", "Arsene");
        assertEquals("Florentin", u.getUsername());
        assertEquals("Arsene", u.getHash());
    }

    @Test
    public void addActivityTest() {
        user1.setFoodScore(10);
        String res = controller.addActivity(user1);
        assertEquals("OK", res);
    }

    @Test
    public void getUpdatesTest() {
        when(repository.findUserByUsername("admin")).thenReturn(Arrays.asList(user1));
        assertEquals("admin", controller.getUpdates(user1).getUsername());
    }

    @Test
    public void leaderboardTest() {
        Mockito.when(repository.getTopTen()).thenReturn(
                Arrays.asList(new User(), new User(), new User()));
        assertEquals(3, controller.leaderboard().size());
    }

    @Test
    public void updateBadgeTest() {
        assertEquals("OK", controller.updateBadge(new User()));
    }

    @Test
    public void updateSolarTest() {
        assertEquals("added solar panels", controller.addSolarPanel(new User()));
    }

    @Test
    public void getUsernamesLikeTest() {
        when(this.repository.findByRegex("ad")).thenReturn(Arrays.asList("admin", "ad"));
        assertEquals(2, controller.getUsernamesLike("ad").size());
    }

    @Test
    public void getUsernamesLikeTest2() {
        when(this.repository.findByRegex("ad")).thenReturn(Arrays.asList("admin1", "admin2"));
        when(this.friendshipRepository.getAllFriends("florentin")).thenReturn(Arrays.asList("admin1"));
        when(this.friendRequestRepository.findAllRequestsFor("florentin")).thenReturn(new ArrayList<>());
        when(this.friendRequestRepository.findAllRequestsSentBy("florentin")).thenReturn(new ArrayList<>());
        assertEquals("admin2", this.controller.getUsernamesLike2("ad", "florentin").get(0));
        assertEquals(1, this.controller.getUsernamesLike2("ad", "florentin").size());
    }

    @Test
    public void getUsernamesLikeTest2v1() {
        when(this.repository.findByRegex("ad")).thenReturn(Arrays.asList("admin1", "admin2"));
        when(this.friendshipRepository.getAllFriends("florentin")).thenReturn(Arrays.asList("admin1", "admin2"));
        when(this.friendRequestRepository.findAllRequestsFor("florentin")).thenReturn(new ArrayList<>());
        when(this.friendRequestRepository.findAllRequestsSentBy("florentin")).thenReturn(new ArrayList<>());
        assertEquals(0, this.controller.getUsernamesLike2("ad", "florentin").size());
    }

    @Test
    public void getUsernamesLikeTestNOFRIENDS() {
        when(this.repository.findByRegex("ad")).thenReturn(Arrays.asList("admin1", "admin2"));
        when(this.friendshipRepository.getAllFriends("florentin")).thenReturn(Arrays.asList());
        when(this.friendRequestRepository.findAllRequestsFor("florentin")).thenReturn(new ArrayList<>());
        when(this.friendRequestRepository.findAllRequestsSentBy("florentin")).thenReturn(new ArrayList<>());

        assertEquals(2, this.controller.getUsernamesLike2("ad", "florentin").size());
    }

    @Test
    public void getUsernamesLikeTestRequestsFor() {
        when(this.repository.findByRegex("ad")).thenReturn(Arrays.asList("admin1", "admin2"));
        when(this.friendshipRepository.getAllFriends("florentin")).thenReturn(Arrays.asList());
        when(this.friendRequestRepository.findAllRequestsFor("florentin"))
                .thenReturn(Arrays.asList(new FriendRequest("admin1", "florentin")));
        when(this.friendRequestRepository.findAllRequestsSentBy("florentin")).thenReturn(new ArrayList<>());

        assertEquals(1, this.controller.getUsernamesLike2("ad", "florentin").size());

    }

    @Test
    public void getUsernamesLikeTestRequestsBy() {
        when(this.repository.findByRegex("ad")).thenReturn(Arrays.asList("admin1", "admin2"));
        when(this.friendshipRepository.getAllFriends("florentin")).thenReturn(Arrays.asList());
        when(this.friendRequestRepository.findAllRequestsFor("florentin"))
                .thenReturn(Arrays.asList());
        when(this.friendRequestRepository.findAllRequestsSentBy("florentin"))
                .thenReturn(Arrays.asList(new FriendRequest("florentin", "admin1")));

        assertEquals(1, this.controller.getUsernamesLike2("ad", "florentin").size());

    }
}
