import hello.Friendship;
import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class FriendshipTest {
    private Friendship friendship;

    @Before
    public void setUp(){
        friendship = new Friendship("Julian", "Flo");
    }

    @Test
    public void constrTest(){assertEquals(true, friendship != null);}

    @Test
    public void getSetTest(){
        assertEquals("Julian", friendship.getUsername1());
        assertEquals("Flo", friendship.getUsername2());
        friendship.setUsername1(friendship.getUsername1());
        friendship.setUsername2(friendship.getUsername1());
    }

    @Test
    public void toStringTest(){
        Friendship f = new Friendship("","");
        f.setId(1);
        assertEquals(f.getId()+0,1);

        assertTrue(friendship.toString().contains("Julian"));
    }
}
