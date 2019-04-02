import classes.Badges;
import classes.User;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BadgesTest {

    /**
     * Create 10 users for testing 10 badges
     */
    User user1 = new User("ollie", "test1");
    User user2 = new User("ollie", "test2");
    User user3 = new User("ollie", "test3");
    User user4 = new User("ollie", "test4");
    User user5 = new User("ollie", "test5");
    User user6 = new User("ollie", "test6");
    User user7 = new User("ollie", "test7");
    User user8 = new User("ollie", "test8");
    User user9 = new User("ollie", "test9");
    User user10 = new User("ollie", "test10");

    /**
     * Test method for class Badges; method polarUnlock - all badges.
     */
    @Test
    public void testPolarUnlock(){
        user1.setPolarScore(100000);
        assertEquals(1, Badges.polarUnlock(user1));
        user2.setPolarScore(200000);
        assertEquals(2, Badges.polarUnlock(user2));
        user3.setPolarScore(300000);
        assertEquals(3, Badges.polarUnlock(user3));
        user4.setPolarScore(400000);
        assertEquals(4, Badges.polarUnlock(user4));
        user5.setPolarScore(500000);
        assertEquals(5, Badges.polarUnlock(user5));
        user6.setPolarScore(600000);
        assertEquals(6, Badges.polarUnlock(user6));
        user7.setPolarScore(700000);
        assertEquals(7, Badges.polarUnlock(user7));
        user8.setPolarScore(800000);
        assertEquals(8, Badges.polarUnlock(user8));
        user9.setPolarScore(900000);
        assertEquals(9, Badges.polarUnlock(user9));
        user10.setPolarScore(1000000);
        assertEquals(10, Badges.polarUnlock(user10));
    }

    /**
     * Test method for class Badges; method foodUnlock - all badges.
     */
    @Test
    public void testFoodUnlock() {
        user1.setFoodScore(10000);
        assertEquals(1, Badges.foodUnlock(user1));
        user2.setFoodScore(20000);
        assertEquals(2, Badges.foodUnlock(user2));
        user3.setFoodScore(30000);
        assertEquals(3, Badges.foodUnlock(user3));
        user4.setFoodScore(40000);
        assertEquals(4, Badges.foodUnlock(user4));
        user5.setFoodScore(50000);
        assertEquals(5, Badges.foodUnlock(user5));
        user6.setFoodScore(60000);
        assertEquals(6, Badges.foodUnlock(user6));
        user7.setFoodScore(70000);
        assertEquals(7, Badges.foodUnlock(user7));
        user8.setFoodScore(80000);
        assertEquals(8, Badges.foodUnlock(user8));
        user9.setFoodScore(90000);
        assertEquals(9, Badges.foodUnlock(user9));
        user10.setFoodScore(100000);
        assertEquals(10, Badges.foodUnlock(user10));
    }

    /**
     * Test method for class Badges; method transportUnlock - all badges.
     */
    @Test
    public void testTransportUnlock() {
        user1.setTransportScore(10000);
        assertEquals(1, Badges.transportUnlock(user1));
        user2.setTransportScore(20000);
        assertEquals(2, Badges.transportUnlock(user2));
        user3.setTransportScore(30000);
        assertEquals(3, Badges.transportUnlock(user3));
        user4.setTransportScore(40000);
        assertEquals(4, Badges.transportUnlock(user4));
        user5.setTransportScore(50000);
        assertEquals(5, Badges.transportUnlock(user5));
        user6.setTransportScore(60000);
        assertEquals(6, Badges.transportUnlock(user6));
        user7.setTransportScore(70000);
        assertEquals(7, Badges.transportUnlock(user7));
        user8.setTransportScore(80000);
        assertEquals(8, Badges.transportUnlock(user8));
        user9.setTransportScore(90000);
        assertEquals(9, Badges.transportUnlock(user9));
        user10.setTransportScore(100000);
        assertEquals(10, Badges.transportUnlock(user10));
    }

    /**
     * Test method for class Badges; method electricityUnlock - all badges.
     */
    @Test
    public void testElectricityUnlock() {
        user1.setElectricityScore(10000);
        assertEquals(1, Badges.electricityUnlock(user1));
        user2.setElectricityScore(20000);
        assertEquals(2, Badges.electricityUnlock(user2));
        user3.setElectricityScore(30000);
        assertEquals(3, Badges.electricityUnlock(user3));
        user4.setElectricityScore(40000);
        assertEquals(4, Badges.electricityUnlock(user4));
        user5.setElectricityScore(50000);
        assertEquals(5, Badges.electricityUnlock(user5));
        user6.setElectricityScore(60000);
        assertEquals(6, Badges.electricityUnlock(user6));
        user7.setElectricityScore(70000);
        assertEquals(7, Badges.electricityUnlock(user7));
        user8.setElectricityScore(80000);
        assertEquals(8, Badges.electricityUnlock(user8));
        user9.setElectricityScore(90000);
        assertEquals(9, Badges.electricityUnlock(user9));
        user10.setElectricityScore(100000);
        assertEquals(10, Badges.electricityUnlock(user10));
    }
}

