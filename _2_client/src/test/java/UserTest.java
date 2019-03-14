package classes;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class UserTest {

    @Test
    public void getUsername() {
        User user1 = new User("username", "hash");
        assertEquals("username", user1.getUsername());
    }

    @Test
    public void setUsername() {
        User user1 = new User("notusername", "hash");
        user1.setUsername("username");
        assertEquals("username", user1.getUsername());
    }

    @Test
    public void getHash() {
        User user1 = new User("username", "hash");
        assertEquals("hash", user1.getHash());
    }

    @Test
    public void setHash() {
        User user1 = new User("username", "nothash");
        user1.setHash("hash");
        assertEquals("hash", user1.getHash());
    }

    @Test
    public void getFoodFootprintTest() {
        User user1 = new User("username", "hash");
        assertEquals(0, user1.getFoodFootprint()+0);
    }

    @Test
    public void setFoodFootprint() {
        User user1 = new User("username", "hash");
        user1.setFoodFootprint(1);
        assertEquals(1, user1.getFoodFootprint()+0);
    }

    @Test
    public void getWaterFootprint() {
        User user1 = new User("username", "hash");
        assertEquals(0, user1.getWaterFootprint()+0);
    }

    @Test
    public void setWaterFootprint() {
        User user1 = new User("username", "hash");
        user1.setWaterFootprint(1);
        assertEquals(1, user1.getWaterFootprint()+0);
    }

    @Test
    public void getTransportFootprint() {
        User user1 = new User("username", "hash");
        assertEquals(0, user1.getTransportFootprint()+0);
    }

    @Test
    public void setTransportFootprint() {
        User user1 = new User("username", "hash");
        user1.setTransportFootprint(1);
        assertEquals(1, user1.getTransportFootprint()+0);
    }

    @Test
    public void getPolarScore() {
        User user1 = new User("username", "hash");
        assertEquals(0, user1.getPolarScore()+0);
    }

    @Test
    public void setPolarScore() {
        User user1 = new User("username", "hash");
        user1.setPolarScore(1);
        assertEquals(1, user1.getPolarScore()+0);
    }

//    @Test
//    public void getDate() {
//        User user1 = new User("username", "hash");
//        assertFalse(user1.getDate() != null);
//    }
//
//    @Test
//    public void setDate() {
//        User user1 = new User("username", "hash");
//        user1.setDate(new Date(1,1,1));
//        assertEquals(new Date(1,1,1), user1.getDate());
//    }

    @Test
    public void toStringTest() {
        User user1 = new User("username", "hash");
        assertEquals("User{username='username', hash='hash'}", user1.toString());
    }
}