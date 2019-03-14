import org.junit.Before;
import org.junit.Test;

import java.util.Date;

import static junit.framework.TestCase.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
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
        assertEquals((int)user1.getFoodFootprint(), 0);
    }

    @Test
    public void setFoodTest() {
        user1.setFoodFootprint(1);
        assertEquals(user1.getFoodFootprint()+0,1);
    }

    @Test
    public void getWaterTest() {
        assertEquals((int)user1.getWaterFootprint(), 0);
    }

    @Test
    public void setWaterTest() {
        user1.setWaterFootprint(1);
        assertEquals((int)user1.getWaterFootprint(), 1);
    }

    @Test
    public void getTransportTest() {
        assertEquals((int)user1.getTransportFootprint(), 0);
    }

    @Test
    public void setTransportTest() {
        user1.setTransportFootprint(1);
        assertEquals((int)user1.getTransportFootprint(), 1);
    }

    @Test
    public void getDateTest() {
        assertFalse(user1.getDate() == null);
    }

    @Test
    public void setDateTest() {
        user1.setDate(new Date(20,8,2019));
        assertEquals(user1.getDate(),new Date(20,8,2019));
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

}