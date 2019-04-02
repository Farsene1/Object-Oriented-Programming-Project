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
            icon = "https://i.ibb.co/JnXmDsZ/food2-400.png";
        }
        if (number == 12) {
            icon = "https://i.ibb.co/5RT1G9S/food3-400.png";
        }
        if (number == 13) {
            icon = "https://i.ibb.co/1myHV54/food4-400.png";
        }
        if (number == 14) {
            icon = "https://i.ibb.co/W6ffCWD/food5-400.png";
        }
        if (number == 15) {
            icon = "https://i.ibb.co/Qp3RfGW/food6-400.png";
        }
        if (number == 16) {
            icon = "https://i.ibb.co/MV6NLdZ/food7-400.png";
        }
        if (number == 17) {
            icon = "https://i.ibb.co/5W3DyB8/food8-400.png";
        }
        if (number == 18) {
            icon = "https://i.ibb.co/RHrTjW2/food9-400.png";
        }
        if (number == 19) {
            icon = "https://i.ibb.co/GWFPd6x/food10-400.png";
        }
        if (number == 20) {
            icon = "https://i.ibb.co/PTtCXg1/food1-400.png";
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