package classes;

/**
 * User badge class.
 */
public class UserBadge {

    /**
     * Default logo image for badge 1 / new registered user.
     */
    static String icon = "https://i.ibb.co/THM6prg/polar1.png";

    /**
     * icon choice method.
     *
     * @param user user param.
     * @return returns a string.
     */
    public static String iconChoice(final User user) {

        /**
         * Calls method getBadge and assigns value to int number.
         */
        int number = user.getBadge();

        /**
         * If statements to change badge dependent
         * on users choice from available badges.
         */
        switch (number) {
            case 1:
                icon = "https://i.ibb.co/THM6prg/polar1.png";
                break;
            case 2:
                icon = "https://i.ibb.co/KjLc4HL/polar2.png";
                break;
            case 3:
                icon = "https://i.ibb.co/2K8g0Mg/polar3.png";
                break;
            case 4:
                icon = "https://i.ibb.co/8YxhNJy/polar4.png";
                break;
            case 5:
                icon = "https://i.ibb.co/sPXB0BS/polar5.png";
                break;
            case 6:
                icon = "https://i.ibb.co/BBCjx1T/polar6.png";
                break;
            case 7:
                icon = "https://i.ibb.co/4t0wztb/polar7.png";
                break;
            case 8:
                icon = "https://i.ibb.co/GCdqgpT/polar8.png";
                break;
            case 9:
                icon = "https://i.ibb.co/0s5PX56/polar9.png";
                break;
            case 10:
                icon = "https://i.ibb.co/48GCprf/polar10.png";
                break;
            case 11:
                icon = "https://i.ibb.co/PTtCXg1/food1-400.png";
                break;
            case 12:
                icon = "https://i.ibb.co/JnXmDsZ/food2-400.png";
                break;
            case 13:
                icon = "https://i.ibb.co/5RT1G9S/food3-400.png";
                break;
            case 14:
                icon = "https://i.ibb.co/1myHV54/food4-400.png";
                break;
            case 15:
                icon = "https://i.ibb.co/jH8Jhk4/food5-400-copy.png";
                break;
            case 16:
                icon = "https://i.ibb.co/Qp3RfGW/food6-400.png";
                break;
            case 17:
                icon = "https://i.ibb.co/MV6NLdZ/food7-400.png";
                break;
            case 18:
                icon = "https://i.ibb.co/5W3DyB8/food8-400.png";
                break;
            case 19:
                icon = "https://i.ibb.co/RHrTjW2/food9-400.png";
                break;
            case 20:
                icon = "https://i.ibb.co/GWFPd6x/food10-400.png";
                break;
            case 21:
                icon = "https://i.ibb.co/pXHj9FL/transport1-400.png";
                break;
            case 22:
                icon = "https://i.ibb.co/c1p4GHm/transport2-400.png";
                break;
            case 23:
                icon = "https://i.ibb.co/MVYxNbH/transport3.png";
                break;
            case 24:
                icon = "https://i.ibb.co/SwPcPbB/transport4png.png";
                break;
            case 25:
                icon = "https://i.ibb.co/dcjBtwD/transport5.png";
                break;
            case 26:
                icon = "https://i.ibb.co/8XbdTPd/transport6.png";
                break;
            case 27:
                icon = "https://i.ibb.co/JvFmzS6/transport7.png";
                break;
            case 28:
                icon = "https://i.ibb.co/LYqnnZ7/transport8.png";
                break;
            case 29:
                icon = "https://i.ibb.co/grvqsk9/transport9.png";
                break;
            case 30:
                icon = "https://i.ibb.co/znYJcqB/transport10.png";
                break;
            case 31:
                icon = "https://i.ibb.co/xq2rwtw/electricity1.png";
                break;
            case 32:
                icon = "https://i.ibb.co/QfXVd9k/electricity2.png";
                break;
            case 33:
                icon = "https://i.ibb.co/WfW4PvB/electricity3.png";
                break;
            case 34:
                icon = "https://i.ibb.co/swQY9hc/electricity4.png";
                break;
            case 35:
                icon = "https://i.ibb.co/0j3ZrsY/electricity5.png";
                break;
            case 36:
                icon = "https://i.ibb.co/xJ1kr1C/electricity6.png";
                break;
            case 37:
                icon = "https://i.ibb.co/drmchRC/electricity7.png";
                break;
            case 38:
                icon = "https://i.ibb.co/gmttZfZ/electricity8.png";
                break;
            case 39:
                icon = "https://i.ibb.co/Q9NDBjt/electricity9.png";
                break;
            case 40:
                icon = "https://i.ibb.co/zfFPw6N/electricity10.png";
                break;
            default:
                break;
        }

        return icon;
    }

    /**
     * Returns a string with the icon choice.
     *
     * @param user use rparameter.
     * @return returns a string.
     */
    public static String miniiconChoice(final User user) {

        /**
         * Calls method getBadge and assigns value to int number.
         */
        int number = user.getBadge();

        /**
         * If statements to change badge dependent
         * on users choice from available badges.
         */
        switch (number) {
            case 1:
                icon = "https://i.ibb.co/Sn20yTR/polar1.png";
                break;
            case 2:
                icon = "https://i.ibb.co/F47F81C/polar2.png";
                break;
            case 3:
                icon = "https://i.ibb.co/TL2vJkx/polar3.png";
                break;
            case 4:
                icon = "https://i.ibb.co/q7sgXRy/polar4.png";
                break;
            case 5:
                icon = "https://i.ibb.co/Q9J03vw/polar5.png";
                break;
            case 6:
                icon = "https://i.ibb.co/Yd68SkW/polar6.png";
                break;
            case 7:
                icon = "https://i.ibb.co/MpyQ16G/polar7.png";
                break;
            case 8:
                icon = "https://i.ibb.co/x6t0QTD/polar8.png";
                break;
            case 9:
                icon = "https://i.ibb.co/2tGhFdC/polar9.png";
                break;
            case 10:
                icon = "https://i.ibb.co/Wz50t26/polar10.png";
                break;
            case 11:
                icon = "https://i.ibb.co/pZgvZGg/food1-400.png";
                break;
            case 12:
                icon = "https://i.ibb.co/0BXBY6B/food2-400.png";
                break;
            case 13:
                icon = "https://i.ibb.co/2Mm890v/food3-400.png";
                break;
            case 14:
                icon = "https://i.ibb.co/9YDZvHh/food4-400.png";
                break;
            case 15:
                icon = "https://i.ibb.co/2yk5mkN/food5-400-copy.png";
                break;
            case 16:
                icon = "https://i.ibb.co/1b6WZqn/food6-400.png";
                break;
            case 17:
                icon = "https://i.ibb.co/8MX4TDm/food7-400.png";
                break;
            case 18:
                icon = "https://i.ibb.co/WHtnppf/food8-400.png";
                break;
            case 19:
                icon = "https://i.ibb.co/z2grRsH/food9-400.png";
                break;
            case 20:
                icon = "https://i.ibb.co/zrQ9FjB/food10-400.png";
                break;
            case 21:
                icon = "https://i.ibb.co/k33fc0g/transport1.png";
                break;
            case 22:
                icon = "https://i.ibb.co/kGYYJN5/transport2.png";
                break;
            case 23:
                icon = "https://i.ibb.co/xJpZCND/transport3.png";
                break;
            case 24:
                icon = "https://i.ibb.co/GkD8Lr2/transport4png.png";
                break;
            case 25:
                icon = "https://i.ibb.co/1fZgN6N/transport5.png";
                break;
            case 26:
                icon = "https://i.ibb.co/hRh8ptr/transport6.png";
                break;
            case 27:
                icon = "https://i.ibb.co/qy2z5Qs/transport7.png";
                break;
            case 28:
                icon = "https://i.ibb.co/BT1STNF/transport8.png";
                break;
            case 29:
                icon = "https://i.ibb.co/n05kNyG/transport9.png";
                break;
            case 30:
                icon = "https://i.ibb.co/J7xjPy2/transport10.png";
                break;
            case 31:
                icon = "https://i.ibb.co/4fYS0q9/electricity1.png";
                break;
            case 32:
                icon = "https://i.ibb.co/ZmDnjQY/electricity2.png";
                break;
            case 33:
                icon = "https://i.ibb.co/WfZgJpV/electricity3.png";
                break;
            case 34:
                icon = "https://i.ibb.co/nsFK9qz/electricity4.png";
                break;
            case 35:
                icon = "https://i.ibb.co/WHCcbY2/electricity5.png";
                break;
            case 36:
                icon = "https://i.ibb.co/8BcFLRg/electricity6.png";
                break;
            case 37:
                icon = "https://i.ibb.co/8jz0k5p/electricity7.png";
                break;
            case 38:
                icon = "https://i.ibb.co/r02HtdS/electricity8.png";
                break;
            case 39:
                icon = "https://i.ibb.co/znNq6Gk/electricity9.png";
                break;
            case 40:
                icon = "https://i.ibb.co/xq6pt06/electricity10.png";
                break;
            default:
                break;
        }


        return icon;
    }
}