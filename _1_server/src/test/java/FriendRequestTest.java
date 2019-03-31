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

    @Test
    public void getSetTest(){
        assertEquals("Julian", friendRequest.getSender());
        assertEquals("Flo", friendRequest.getReceiver());
        friendRequest.setSender(friendRequest.getSender());
        friendRequest.setReceiver(friendRequest.getReceiver());
    }
}
