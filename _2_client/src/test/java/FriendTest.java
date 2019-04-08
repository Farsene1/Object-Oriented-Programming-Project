import classes.Friend;
import classes.User;
import javafx.application.Application;
import javafx.scene.image.ImageView;
import javafx.stage.Stage;
import org.junit.jupiter.api.Test;

import java.io.FileNotFoundException;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FriendTest {

        User u = new User("admin","hash");
        private Friend friend = new Friend(u);

    @Test
    public void getTest(){
        friend.setUsername("admin2");
        assertEquals("admin2", friend.getUsername());
        friend.setPolarscore(1);
        assertEquals(1,friend.getPolarscore());
    }

    @Test
    public void setTest(){
        friend.setBadge(new ImageView("https://i.ibb.co/Sn20yTR/polar1.png"));
        assertEquals(new ImageView("https://i.ibb.co/Sn20yTR/polar1.png"), friend.getBadge());
    }
}
