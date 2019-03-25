package classes;
import org.junit.Test;

import static org.junit.Assert.*;

public class FriendRequestTest {


    @Test
    public void getSender(){
    FriendRequest friendRequest= new FriendRequest("pablo","john",true);
    assertEquals("pablo",friendRequest.getSender());
}

    @Test
    public void getReceiver(){
        FriendRequest friendRequest= new FriendRequest("pablo","john",true);
        assertEquals("john",friendRequest.getReceiver());
    }

    @Test
    public void isAccept(){
        FriendRequest friendRequest= new FriendRequest("pablo","john",true);
        assertTrue(friendRequest.isAccept());
    }


    @Test
    public void setSender(){
        FriendRequest friendRequest= new FriendRequest("pablo","john",true);
        friendRequest.setSender("george");
        assertEquals("george",friendRequest.getSender());
    }
    @Test
    public void setReceiver(){
        FriendRequest friendRequest= new FriendRequest("pablo","john",true);
        friendRequest.setReceiver("george");
        assertEquals("george",friendRequest.getReceiver());
    }

    @Test
    public void setAccept(){
        FriendRequest friendRequest= new FriendRequest("pablo","john",true);
        friendRequest.setAccept(false);
        assertFalse(friendRequest.isAccept());
    }
}
