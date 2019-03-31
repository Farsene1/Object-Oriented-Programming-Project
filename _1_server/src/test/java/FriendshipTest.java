import hello.Friendship;
import hello.Statistics;
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
}
