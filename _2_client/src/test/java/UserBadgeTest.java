import classes.UserBadge;
import classes.User;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class UserBadgeTest {

    /**
     * Test method for class Badges; method foodUnlock - all badges.
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
     * Test method for class UserBadges; method iconChoice - all badge choices.
     */
    @Test
    public void tesIconChoice(){
        user1.setBadge(1);
        assertEquals("https://i.ibb.co/THM6prg/polar1.png",UserBadge.iconChoice(user1));
        user2.setBadge(2);
        assertEquals("https://i.ibb.co/KjLc4HL/polar2.png",UserBadge.iconChoice(user2));
        user3.setBadge(3);
        assertEquals("https://i.ibb.co/2K8g0Mg/polar3.png",UserBadge.iconChoice(user3));
        user4.setBadge(4);
        assertEquals("https://i.ibb.co/8YxhNJy/polar4.png",UserBadge.iconChoice(user4));
        user5.setBadge(5);
        assertEquals("https://i.ibb.co/sPXB0BS/polar5.png",UserBadge.iconChoice(user5));
        user6.setBadge(6);
        assertEquals("https://i.ibb.co/BBCjx1T/polar6.png",UserBadge.iconChoice(user6));
        user7.setBadge(7);
        assertEquals("https://i.ibb.co/4t0wztb/polar7.png",UserBadge.iconChoice(user7));
        user8.setBadge(8);
        assertEquals("https://i.ibb.co/GCdqgpT/polar8.png",UserBadge.iconChoice(user8));
        user9.setBadge(9);
        assertEquals("https://i.ibb.co/0s5PX56/polar9.png",UserBadge.iconChoice(user9));
        user10.setBadge(10);
        assertEquals("https://i.ibb.co/48GCprf/polar10.png",UserBadge.iconChoice(user10));
    }

    /**
     * Test method for class Badges; method getIcon.
     */
    @Test
    public void testGetIcon(){
        String badge = "https://i.ibb.co/THM6prg/polar1.png";
        assertEquals(badge ,UserBadge.geticon(1));
    }

}