import hello.FriendRequest;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class FriendRequestTest {
    FriendRequest friendRequest;

    @Before
    public void setUp(){
        friendRequest = new FriendRequest("Julian","Hashim");
        friendRequest.setAccepted(true);
        friendRequest.setId(1);
    }

    @Test
    public void constrTest(){assertEquals(true, friendRequest != null);}

    @Test
    public void getSetTest(){
        assertEquals("Julian", friendRequest.getSender());
        assertEquals("Hashim", friendRequest.getReceiver());
        friendRequest.setSender(friendRequest.getSender());
        friendRequest.setReceiver(friendRequest.getReceiver());
        assertEquals(true, friendRequest.isAccepted());
        assertEquals(1, friendRequest.getId()+0);
    }
}
