package classes;
import org.junit.Test;

import static org.junit.Assert.*;

public class FriendRequestTest {


    @Test
    public void getSender(){
    FriendRequest friendRequest= new FriendRequest("pablo","john");
    assertEquals("pablo",friendRequest.getSender());
}

    @Test
    public void getReceiver(){
        FriendRequest friendRequest= new FriendRequest("pablo","john");
        assertEquals("john",friendRequest.getReceiver());
    }

    @Test
    public void isAccept(){
        FriendRequest friendRequest= new FriendRequest("pablo","john");
        assertFalse(friendRequest.isAccepted());
    }


    @Test
    public void setSender(){
        FriendRequest friendRequest= new FriendRequest("pablo","john");
        friendRequest.setSender("george");
        assertEquals("george",friendRequest.getSender());
    }
    @Test
    public void setReceiver(){
        FriendRequest friendRequest= new FriendRequest("pablo","john");
        friendRequest.setReceiver("george");
        assertEquals("george",friendRequest.getReceiver());
    }

    @Test
    public void setAccept(){
        FriendRequest friendRequest= new FriendRequest("pablo","john");
        friendRequest.setAccepted(true);
        assertTrue(friendRequest.isAccepted());
    }

    @Test
    public void getId(){
        FriendRequest friendRequest= new FriendRequest("pablo","john");

        assertEquals(null,friendRequest.getId());
    }
    @Test
    public void setId(){
        FriendRequest friendRequest= new FriendRequest("pablo","john");
        friendRequest.setId(3);
        assertTrue(3==friendRequest.getId());

    }
}
