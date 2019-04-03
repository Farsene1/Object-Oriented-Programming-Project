package classes;

public class UserBadge {

    /**
     * Default logo image for badge 1 / new registered user.
     */
    static String icon = "https://i.ibb.co/THM6prg/polar1.png";

    /**
     * Method for user selection of unlocked badge
     */
    static public String iconChoice(User user) {

        /**
         * Calls method getBadge and assigns value to int number.
         */
        int number = user.getBadge();

        /**
         * If statements to change badge dependent on users choice from available badges.
         */
        if (number == 1) {
            icon = "https://i.ibb.co/THM6prg/polar1.png";
        }
        if (number == 2) {
            icon = "https://i.ibb.co/KjLc4HL/polar2.png";
        }
        if (number == 3) {
            icon = "https://i.ibb.co/2K8g0Mg/polar3.png";
        }
        if (number == 4) {
            icon = "https://i.ibb.co/8YxhNJy/polar4.png";
        }
        if (number == 5) {
            icon = "https://i.ibb.co/sPXB0BS/polar5.png";
        }
        if (number == 6) {
            icon = "https://i.ibb.co/BBCjx1T/polar6.png";
        }
        if (number == 7) {
            icon = "https://i.ibb.co/4t0wztb/polar7.png";
        }
        if (number == 8) {
            icon = "https://i.ibb.co/GCdqgpT/polar8.png";
        }
        if (number == 9) {
            icon = "https://i.ibb.co/0s5PX56/polar9.png";
        }
        if (number == 10) {
            icon = "https://i.ibb.co/48GCprf/polar10.png";
        }
        if (number == 11) {
            icon = "https://i.ibb.co/PTtCXg1/food1-400.png";
        }
        if (number == 12) {
            icon = "https://i.ibb.co/JnXmDsZ/food2-400.png";
        }
        if (number == 13) {
            icon = "https://i.ibb.co/5RT1G9S/food3-400.png";
        }
        if (number == 14) {
            icon = "https://i.ibb.co/1myHV54/food4-400.png";
        }
        if (number == 15) {
            icon = "https://i.ibb.co/W6ffCWD/food5-400.png";
        }
        if (number == 16) {
            icon = "https://i.ibb.co/Qp3RfGW/food6-400.png";
        }
        if (number == 17) {
            icon = "https://i.ibb.co/MV6NLdZ/food7-400.png";
        }
        if (number == 18) {
            icon = "https://i.ibb.co/5W3DyB8/food8-400.png";
        }
        if (number == 19) {
            icon = "https://i.ibb.co/RHrTjW2/food9-400.png";
        }
        if (number == 20) {
            icon = "https://i.ibb.co/GWFPd6x/food10-400.png";
        }
        if (number == 21) {
            icon = "https://i.ibb.co/pXHj9FL/transport1-400.png";
        }
        if (number == 22) {
            icon = "https://i.ibb.co/c1p4GHm/transport2-400.png";
        }
        if (number == 23) {
            icon = "https://i.ibb.co/MVYxNbH/transport3.png";
        }
        if (number == 24) {
            icon = "https://i.ibb.co/SwPcPbB/transport4png.png";
        }
        if (number == 25) {
            icon = "https://i.ibb.co/dcjBtwD/transport5.png";
        }
        if (number == 26) {
            icon = "https://i.ibb.co/8XbdTPd/transport6.png";
        }
        if (number == 27) {
            icon = "https://i.ibb.co/JvFmzS6/transport7.png";
        }
        if (number == 28) {
            icon = "https://i.ibb.co/LYqnnZ7/transport8.png";
        }
        if (number == 29) {
            icon = "https://i.ibb.co/grvqsk9/transport9.png";
        }
        if (number == 30) {
            icon = "https://i.ibb.co/znYJcqB/transport10.png";
        }
        if (number == 31) {
            icon = "https://i.ibb.co/xq2rwtw/electricity1.png";
        }
        if (number == 32) {
            icon = "https://i.ibb.co/QfXVd9k/electricity2.png";
        }
        if (number == 33) {
            icon = "https://i.ibb.co/WfW4PvB/electricity3.png";
        }
        if (number == 34) {
            icon = "https://i.ibb.co/swQY9hc/electricity4.png";
        }
        if (number == 35) {
            icon = "https://i.ibb.co/0j3ZrsY/electricity5.png";
        }
        if (number == 36) {
            icon = "https://i.ibb.co/xJ1kr1C/electricity6.png";
        }
        if (number == 37) {
            icon = "https://i.ibb.co/drmchRC/electricity7.png";
        }
        if (number == 38) {
            icon = "https://i.ibb.co/gmttZfZ/electricity8.png";
        }
        if (number == 39) {
            icon = "https://i.ibb.co/Q9NDBjt/electricity9.png";
        }
        if (number == 40) {
            icon = "https://i.ibb.co/zfFPw6N/electricity10.png";
        }
            return icon;
        }

    /**
     * Get method for icon choice.
     */
    static public String getIcon() {
        return icon;
    }

}