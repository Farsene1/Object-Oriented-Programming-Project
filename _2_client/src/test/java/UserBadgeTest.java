
import classes.UserBadge;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class UserBadgeTest {

private UserBadge badge;

    @Test
    public void testGetIcon(){
        String badge = "https://i.ibb.co/THM6prg/polar1.png";
        assertEquals("https://i.ibb.co/THM6prg/polar1.png",UserBadge.getIcon());
    }

}