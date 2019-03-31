import hello.FriendRequest;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class FriendRequestTest {
    FriendRequest friendRequest;

    @Before
    public void setUp(){
        friendRequest = new FriendRequest("Julian","Hashim");
    }

    @Test
    public void constrTest(){assertEquals(true, friendRequest != null);}
}
