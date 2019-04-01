package client;
import classes.Badges;
import classes.User;
import javafx.scene.layout.HBox;

import javafx.scene.control.Button;


public class TransportAchievements {

    /**
     * Initializes boolean variable unlocked
     */
    static private boolean unlocked = false;

    static HBox transportBox;

    public static void showTransportBadges(User user) {
        /**
         * Creats HBox
         */
        transportBox = new HBox();

        /**
         * Calls method to unlock transport badges, sets unlock value for CSS.
         */
        int transportUnlock = Badges.transportUnlock(user);

        /**
        transportBox = new HBox();

        /**
         * Initialize buttons for transport badges.
         */
        Button transportBadge_1 = new Button();
        Button transportBadge_2 = new Button();
        Button transportBadge_3 = new Button();
        Button transportBadge_4 = new Button();
        Button transportBadge_5 = new Button();
        Button transportBadge_6 = new Button();
        Button transportBadge_7 = new Button();
        Button transportBadge_8 = new Button();
        Button transportBadge_9 = new Button();
        Button transportBadge_10 = new Button();

        /**
         * Calls setPolar methods from CSS class to show locked / unlocked transport badges.
         */
        CSStransportBadge.setTransport1(transportBadge_1, transportUnlock);
        CSStransportBadge.setTransport2(transportBadge_2, transportUnlock);
        CSStransportBadge.setTransport3(transportBadge_3, transportUnlock);
        CSStransportBadge.setTransport4(transportBadge_4, transportUnlock);
        CSStransportBadge.setTransport5(transportBadge_5, transportUnlock);
        CSStransportBadge.setTransport6(transportBadge_6, transportUnlock);
        CSStransportBadge.setTransport7(transportBadge_7, transportUnlock);
        CSStransportBadge.setTransport8(transportBadge_8, transportUnlock);
        CSStransportBadge.setTransport9(transportBadge_9, transportUnlock);
        CSStransportBadge.setTransport10(transportBadge_10, transportUnlock);


        /**
         * Adds all badges for transport to Hbox.
         */
        transportBox.getChildren().addAll(transportBadge_1, transportBadge_2, transportBadge_3, transportBadge_4, transportBadge_5,
                transportBadge_6, transportBadge_7, transportBadge_8, transportBadge_9, transportBadge_10);

    }

    /**
     * Getter for HBox of transport badges.
     */
        static public HBox getTransportBox() {
            return transportBox;
        }
}
