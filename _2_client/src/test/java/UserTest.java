import org.junit.Before;
import org.junit.Test;
import classes.User;
import static junit.framework.TestCase.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class UserTest {
    User user1, user2;

    @Before
    public void setUp(){
        user1 = new User("Flo","abc");
        user2 = new User();
    }
    @Test
    public void constrTest(){
        assertEquals(true,user1 != null);
    }

    @Test
    public void getSetTest(){
        assertEquals("Flo",user1.getUsername());
        assertEquals("abc",user1.getHash());
        user1.setUsername("username");
        user1.setHash("hash");
        assertEquals("username",user1.getUsername());
        assertEquals("hash",user1.getHash());
    }

    @Test
    public void toStringTest(){
        assertTrue(user1.toString().contains(user1.getUsername()));
        assertTrue(user1.toString().contains(user1.getHash()));
    }

    @Test
    public void getFoodTest() {
        assertEquals((int)user1.getFoodScore(), 0);
    }

    @Test
    public void setFoodTest() {
        user1.setFoodScore(1);
        assertEquals(user1.getFoodScore()+0,1);
    }

    @Test
    public void getElectricityTest() {
        assertEquals((int)user1.getElectricityScore(), 0);
    }

    @Test
    public void setElectricityTest() {
        user1.setElectricityScore(1);
        assertEquals((int)user1.getElectricityScore(), 1);
    }

    @Test
    public void getTransportTest() {
        assertEquals((int)user1.getTransportScore(), 0);
    }

    @Test
    public void setTransportTest() {
        user1.setTransportScore(1);
        assertEquals((int)user1.getTransportScore(), 1);
    }

    @Test
    public void getScoreTest() {
        assertEquals(user1.getPolarScore()+0, 0);
    }

    @Test
    public void setScoreTest() {
        user1.setPolarScore(1);
        assertEquals(user1.getPolarScore()+0, 1);
    }

    @Test
    public void setBadgeTest(){
        user1.setBadge(10);
        assertEquals(10,(int) user1.getBadge());
    }

}