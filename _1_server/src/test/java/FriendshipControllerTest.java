import hello.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.mock.mockito.MockBean;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FriendshipControllerTest {
    @Autowired
    private FriendshipController friendshipController = new FriendshipController();

    @MockBean
    private FriendshipRepository friendshipRepository = Mockito.mock(FriendshipRepository.class);

    @MockBean
    private FriendRequestRepository friendRequestRepository = Mockito.mock(FriendRequestRepository.class);

    @MockBean
    private UserRepository userRepository = Mockito.mock(UserRepository.class);

    @BeforeEach
    public void setUp() {
        friendshipController.setFriendRequestRepository(friendRequestRepository);
        friendshipController.setFriendshipRepository(friendshipRepository);
        friendshipController.setUserRepository(userRepository);
    }

    @Test
    public void getAllFriendsTest() {
        Mockito.when(friendshipRepository.getAllFriends("admin")).thenReturn(Arrays.asList("friend1", "friend2"));
        Mockito.when(userRepository.findUserByUsername("friend1")).thenReturn(Arrays.asList(new User("friend1", "hash1")));
        Mockito.when(userRepository.findUserByUsername("friend2")).thenReturn(Arrays.asList(new User("friend2", "hash2")));
        List<User> list = friendshipController.getAllFriends(new User("admin", "hash"));
        assertEquals(2, list.size());
    }

    @Test
    public void getAllRequestsTest() {
        Mockito.when(friendRequestRepository.findAllRequestsFor("admin")).thenReturn(Arrays.asList(new FriendRequest(), new FriendRequest()));
        List<FriendRequest> list = friendshipController.getAllRequest(new User("admin", "root"));
        assertEquals(2, list.size());
    }

    @Test
    public void makeRequestTestPass() {
        FriendRequest f = new FriendRequest("a", "b");
        assertEquals("SENT", friendshipController.makeRequest(f));
    }

    @Test
    public void makeRequestTestFail() {
        FriendRequest f = new FriendRequest("a", "a");
        assertEquals("SENT2", friendshipController.makeRequest(f));
    }

    @Test
    public void makeRequestTestFail2(){
        FriendRequest f1 = new FriendRequest("admin1","admin2");
        Mockito.when(friendshipRepository.getAllFriends("admin1"))
                .thenReturn(Arrays.asList("admin2"));
        assertEquals("SENT2",friendshipController.makeRequest(f1));
    }

    @Test
    public void makeRequestTest2LoopTest(){
        FriendRequest f1 = new FriendRequest("admin1","admin2");
        Mockito.when(friendRequestRepository.findAllRequestsFor("admin2"))
                .thenReturn(Arrays.asList(new FriendRequest("admin1","admin2")));
        assertEquals("SENT2", friendshipController.makeRequest(f1));
    }

    @Test
    public void MakeRequestTest1LoopTest(){
        FriendRequest f1 = new FriendRequest("admin1","admin2");
        Mockito.when(friendRequestRepository.findAllRequestsFor("admin1"))
                .thenReturn(Arrays.asList(new FriendRequest("admin2","admin1")));
        assertEquals("SENT2", friendshipController.makeRequest(f1));
    }

    @Test
    public void respondTest() {
        assertEquals("OK", friendshipController.respond(new FriendRequest()));
    }

    @Test
    public void fakeRespondTest() {
        assertEquals("OK", friendshipController.fakeRespond(new FriendRequest()));
    }

}
