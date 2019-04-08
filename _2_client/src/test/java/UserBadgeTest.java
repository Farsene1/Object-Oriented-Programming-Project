import classes.UserBadge;
import classes.User;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class UserBadgeTest {

    /**
     * Test method for class Badges; method foodUnlock - all badges.
     */
    User user = new User("ollie", "test");

    @Test
    public void testIconChoice() {
        for (int number = 0; number < 41; number++) {
            user.setBadge(number);
            if (number == 1) {
                assertEquals("https://i.ibb.co/THM6prg/polar1.png",UserBadge.iconChoice(user));
            }
            if (number == 2) {
                assertEquals("https://i.ibb.co/KjLc4HL/polar2.png",UserBadge.iconChoice(user));
            }
            if (number == 3) {
                assertEquals("https://i.ibb.co/2K8g0Mg/polar3.png",UserBadge.iconChoice(user));
            }
            if (number == 4) {
                assertEquals("https://i.ibb.co/8YxhNJy/polar4.png",UserBadge.iconChoice(user));
            }
            if (number == 5) {
                assertEquals("https://i.ibb.co/sPXB0BS/polar5.png",UserBadge.iconChoice(user));
            }
            if (number == 6) {
                assertEquals("https://i.ibb.co/BBCjx1T/polar6.png",UserBadge.iconChoice(user));
            }
            if (number == 7) {
                assertEquals("https://i.ibb.co/4t0wztb/polar7.png",UserBadge.iconChoice(user));
            }
            if (number == 8) {
                assertEquals("https://i.ibb.co/GCdqgpT/polar8.png",UserBadge.iconChoice(user));
            }
            if (number == 9) {
                assertEquals("https://i.ibb.co/0s5PX56/polar9.png",UserBadge.iconChoice(user));
            }
            if (number == 10) {
                assertEquals("https://i.ibb.co/48GCprf/polar10.png",UserBadge.iconChoice(user));
            }
            if (number == 11) {
                assertEquals("https://i.ibb.co/PTtCXg1/food1-400.png",UserBadge.iconChoice(user));
            }
            if (number == 12) {
                assertEquals("https://i.ibb.co/JnXmDsZ/food2-400.png",UserBadge.iconChoice(user));
            }
            if (number == 13) {
                assertEquals("https://i.ibb.co/5RT1G9S/food3-400.png",UserBadge.iconChoice(user));
            }
            if (number == 14) {
                assertEquals("https://i.ibb.co/1myHV54/food4-400.png",UserBadge.iconChoice(user));
            }
            if (number == 15) {
                assertEquals("https://i.ibb.co/jH8Jhk4/food5-400-copy.png",UserBadge.iconChoice(user));
            }
            if (number == 16) {
                assertEquals("https://i.ibb.co/Qp3RfGW/food6-400.png",UserBadge.iconChoice(user));
            }
            if (number == 17) {
                assertEquals("https://i.ibb.co/MV6NLdZ/food7-400.png",UserBadge.iconChoice(user));
            }
            if (number == 18) {
                assertEquals("https://i.ibb.co/5W3DyB8/food8-400.png",UserBadge.iconChoice(user));
            }
            if (number == 19) {
                assertEquals("https://i.ibb.co/RHrTjW2/food9-400.png",UserBadge.iconChoice(user));
            }
            if (number == 20) {
                assertEquals("https://i.ibb.co/GWFPd6x/food10-400.png",UserBadge.iconChoice(user));
            }
            if (number == 21) {
                assertEquals("https://i.ibb.co/pXHj9FL/transport1-400.png",UserBadge.iconChoice(user));
            }
            if (number == 22) {
                assertEquals("https://i.ibb.co/c1p4GHm/transport2-400.png",UserBadge.iconChoice(user));
            }
            if (number == 23) {
                assertEquals("https://i.ibb.co/MVYxNbH/transport3.png",UserBadge.iconChoice(user));
            }
            if (number == 24) {
                assertEquals("https://i.ibb.co/SwPcPbB/transport4png.png",UserBadge.iconChoice(user));
            }
            if (number == 25) {
                assertEquals("https://i.ibb.co/dcjBtwD/transport5.png",UserBadge.iconChoice(user));
            }
            if (number == 26) {
                assertEquals("https://i.ibb.co/8XbdTPd/transport6.png",UserBadge.iconChoice(user));
            }
            if (number == 27) {
                assertEquals("https://i.ibb.co/JvFmzS6/transport7.png",UserBadge.iconChoice(user));
            }
            if (number == 28) {
                assertEquals("https://i.ibb.co/LYqnnZ7/transport8.png",UserBadge.iconChoice(user));
            }
            if (number == 29) {
                assertEquals("https://i.ibb.co/grvqsk9/transport9.png",UserBadge.iconChoice(user));
            }
            if (number == 30) {
                assertEquals("https://i.ibb.co/znYJcqB/transport10.png",UserBadge.iconChoice(user));
            }
            if (number == 31) {
                assertEquals("https://i.ibb.co/xq2rwtw/electricity1.png",UserBadge.iconChoice(user));
            }
            if (number == 32) {
                assertEquals("https://i.ibb.co/QfXVd9k/electricity2.png",UserBadge.iconChoice(user));
            }
            if (number == 33) {
                assertEquals("https://i.ibb.co/WfW4PvB/electricity3.png",UserBadge.iconChoice(user));
            }
            if (number == 34) {
                assertEquals("https://i.ibb.co/swQY9hc/electricity4.png",UserBadge.iconChoice(user));
            }
            if (number == 35) {
                assertEquals("https://i.ibb.co/0j3ZrsY/electricity5.png",UserBadge.iconChoice(user));
            }
            if (number == 36) {
                assertEquals("https://i.ibb.co/xJ1kr1C/electricity6.png",UserBadge.iconChoice(user));
            }
            if (number == 37) {
                assertEquals("https://i.ibb.co/drmchRC/electricity7.png",UserBadge.iconChoice(user));
            }
            if (number == 38) {
                assertEquals("https://i.ibb.co/gmttZfZ/electricity8.png",UserBadge.iconChoice(user));
            }
            if (number == 39) {
                assertEquals("https://i.ibb.co/Q9NDBjt/electricity9.png",UserBadge.iconChoice(user));
            }
            if (number == 40) {
                assertEquals("https://i.ibb.co/zfFPw6N/electricity10.png",UserBadge.iconChoice(user));
            }
        }
    }
    
    @Test
    public void testMiniIconChoice() {
        for (int number = 0; number < 41; number++) {
            user.setBadge(number);
            if (number == 1) {
                assertEquals("https://i.ibb.co/Sn20yTR/polar1.png",UserBadge.miniiconChoice(user));
            }
            if (number == 2) {
                assertEquals("https://i.ibb.co/F47F81C/polar2.png",UserBadge.miniiconChoice(user));
            }
            if (number == 3) {
                assertEquals("https://i.ibb.co/TL2vJkx/polar3.png",UserBadge.miniiconChoice(user));
            }
            if (number == 4) {
                assertEquals("https://i.ibb.co/q7sgXRy/polar4.png",UserBadge.miniiconChoice(user));
            }
            if (number == 5) {
                assertEquals("https://i.ibb.co/Q9J03vw/polar5.png",UserBadge.miniiconChoice(user));
            }
            if (number == 6) {
                assertEquals("https://i.ibb.co/Yd68SkW/polar6.png",UserBadge.miniiconChoice(user));
            }
            if (number == 7) {
                assertEquals("https://i.ibb.co/MpyQ16G/polar7.png",UserBadge.miniiconChoice(user));
            }
            if (number == 8) {
                assertEquals("https://i.ibb.co/x6t0QTD/polar8.png",UserBadge.miniiconChoice(user));
            }
            if (number == 9) {
                assertEquals("https://i.ibb.co/2tGhFdC/polar9.png",UserBadge.miniiconChoice(user));
            }
            if (number == 10) {
                assertEquals("https://i.ibb.co/Wz50t26/polar10.png",UserBadge.miniiconChoice(user));
            }
            if (number == 11) {
                assertEquals("https://i.ibb.co/pZgvZGg/food1-400.png",UserBadge.miniiconChoice(user));
            }
            if (number == 12) {
                assertEquals("https://i.ibb.co/0BXBY6B/food2-400.png",UserBadge.miniiconChoice(user));
            }
            if (number == 13) {
                assertEquals("https://i.ibb.co/2Mm890v/food3-400.png",UserBadge.miniiconChoice(user));
            }
            if (number == 14) {
                assertEquals("https://i.ibb.co/9YDZvHh/food4-400.png",UserBadge.miniiconChoice(user));
            }
            if (number == 15) {
                assertEquals("https://i.ibb.co/2yk5mkN/food5-400-copy.png",UserBadge.miniiconChoice(user));
            }
            if (number == 16) {
                assertEquals("https://i.ibb.co/1b6WZqn/food6-400.png",UserBadge.miniiconChoice(user));
            }
            if (number == 17) {
                assertEquals("https://i.ibb.co/8MX4TDm/food7-400.png",UserBadge.miniiconChoice(user));
            }
            if (number == 18) {
                assertEquals("https://i.ibb.co/WHtnppf/food8-400.png",UserBadge.miniiconChoice(user));
            }
            if (number == 19) {
                assertEquals("https://i.ibb.co/z2grRsH/food9-400.png",UserBadge.miniiconChoice(user));
            }
            if (number == 20) {
                assertEquals("https://i.ibb.co/zrQ9FjB/food10-400.png",UserBadge.miniiconChoice(user));
            }
            if (number == 21) {
                assertEquals("https://i.ibb.co/k33fc0g/transport1.png",UserBadge.miniiconChoice(user));
            }
            if (number == 22) {
                assertEquals("https://i.ibb.co/kGYYJN5/transport2.png",UserBadge.miniiconChoice(user));
            }
            if (number == 23) {
                assertEquals("https://i.ibb.co/xJpZCND/transport3.png",UserBadge.miniiconChoice(user));
            }
            if (number == 24) {
                assertEquals("https://i.ibb.co/GkD8Lr2/transport4png.png",UserBadge.miniiconChoice(user));
            }
            if (number == 25) {
                assertEquals("https://i.ibb.co/1fZgN6N/transport5.png",UserBadge.miniiconChoice(user));
            }
            if (number == 26) {
                assertEquals("https://i.ibb.co/hRh8ptr/transport6.png",UserBadge.miniiconChoice(user));
            }
            if (number == 27) {
                assertEquals("https://i.ibb.co/qy2z5Qs/transport7.png",UserBadge.miniiconChoice(user));
            }
            if (number == 28) {
                assertEquals("https://i.ibb.co/BT1STNF/transport8.png",UserBadge.miniiconChoice(user));
            }
            if (number == 29) {
                assertEquals("https://i.ibb.co/n05kNyG/transport9.png",UserBadge.miniiconChoice(user));
            }
            if (number == 30) {
                assertEquals("https://i.ibb.co/J7xjPy2/transport10.png",UserBadge.miniiconChoice(user));
            }
            if (number == 31) {
                assertEquals("https://i.ibb.co/4fYS0q9/electricity1.png",UserBadge.miniiconChoice(user));
            }
            if (number == 32) {
                assertEquals("https://i.ibb.co/ZmDnjQY/electricity2.png",UserBadge.miniiconChoice(user));
            }
            if (number == 33) {
                assertEquals("https://i.ibb.co/WfZgJpV/electricity3.png",UserBadge.miniiconChoice(user));
            }
            if (number == 34) {
                assertEquals("https://i.ibb.co/nsFK9qz/electricity4.png",UserBadge.miniiconChoice(user));
            }
            if (number == 35) {
                assertEquals("https://i.ibb.co/WHCcbY2/electricity5.png",UserBadge.miniiconChoice(user));
            }
            if (number == 36) {
                assertEquals("https://i.ibb.co/8BcFLRg/electricity6.png",UserBadge.miniiconChoice(user));
            }
            if (number == 37) {
                assertEquals("https://i.ibb.co/8jz0k5p/electricity7.png",UserBadge.miniiconChoice(user));
            }
            if (number == 38) {
                assertEquals("https://i.ibb.co/r02HtdS/electricity8.png",UserBadge.miniiconChoice(user));
            }
            if (number == 39) {
                assertEquals("https://i.ibb.co/znNq6Gk/electricity9.png",UserBadge.miniiconChoice(user));
            }
            if (number == 40) {
                assertEquals("https://i.ibb.co/xq6pt06/electricity10.png",UserBadge.miniiconChoice(user));
            }
        }
    }
}