package client;
import CSS.CSStransportBadge;
import classes.Badges;
import classes.Controller;
import classes.User;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

import javafx.scene.control.Button;


public class AchievementsTransport {

    /**
     * Declare Hbox.
     */
    static HBox transportBox;

    public static void showTransportBadges(User user, Stage window) {

        /**
         * Creates HBox.
         */
        transportBox = new HBox();

        /**
         * Calls method to unlock transport badges, sets unlock value for CSS.
         */
        int unlockNumber = Badges.transportUnlock(user);

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
        CSStransportBadge.setTransport1(transportBadge_1, unlockNumber);
        CSStransportBadge.setTransport2(transportBadge_2, unlockNumber);
        CSStransportBadge.setTransport3(transportBadge_3, unlockNumber);
        CSStransportBadge.setTransport4(transportBadge_4, unlockNumber);
        CSStransportBadge.setTransport5(transportBadge_5, unlockNumber);
        CSStransportBadge.setTransport6(transportBadge_6, unlockNumber);
        CSStransportBadge.setTransport7(transportBadge_7, unlockNumber);
        CSStransportBadge.setTransport8(transportBadge_8, unlockNumber);
        CSStransportBadge.setTransport9(transportBadge_9, unlockNumber);
        CSStransportBadge.setTransport10(transportBadge_10, unlockNumber);

        /**
         * Selecting unlocked or locked polar score badges on button click.
         * Shows alert messages for each specific badge if they're not yet unlocked
         */
        transportBadge_1.setOnAction(e -> {
            new Controller().sendBadge(user, 21);
            classes.UserBadge.iconChoice(user);
            Home.showHome(window, user);
        });
        transportBadge_2.setOnAction(e -> {
            if(unlockNumber>2) {
                new Controller().sendBadge(user, 22);
                classes.UserBadge.iconChoice(user);
                Home.showHome(window, user);
            }
            else {
                BoxAlert.display("Hold up!", "You still have to unlock transport badge 2!");
            }
        });
        transportBadge_3.setOnAction(e -> {
            if(unlockNumber>3) {
                new Controller().sendBadge(user, 23);
                classes.UserBadge.iconChoice(user);
                Home.showHome(window, user);
            }
            else {
                BoxAlert.display("Hold up!", "You still have to unlock transport badge 3!");
            }
        });
        transportBadge_4.setOnAction(e -> {
            if(unlockNumber>4) {
                new Controller().sendBadge(user, 24);
                classes.UserBadge.iconChoice(user);
                Home.showHome(window, user);
            }
            else {
                BoxAlert.display("Hold up!", "You still have to unlock transport badge 4!");
            }
        });
        transportBadge_5.setOnAction(e -> {
            if(unlockNumber>5) {
                new Controller().sendBadge(user, 25);
                classes.UserBadge.iconChoice(user);
                Home.showHome(window, user);
            }
            else {
                BoxAlert.display("Hold up!", "You still have to unlock transport badge 5!");
            }
        });
        transportBadge_6.setOnAction(e -> {
            if(unlockNumber>6) {
                new Controller().sendBadge(user, 26);
                classes.UserBadge.iconChoice(user);
                Home.showHome(window, user);
            }
            else {
                BoxAlert.display("Hold up!", "You still have to unlock transport badge 6!");
            }
        });
        transportBadge_7.setOnAction(e -> {
            if(unlockNumber>7) {
                new Controller().sendBadge(user, 27);
                classes.UserBadge.iconChoice(user);
                Home.showHome(window, user);
            }
            else {
                BoxAlert.display("Hold up!", "You still have to unlock transport badge 7!");
            }
        });
        transportBadge_8.setOnAction(e -> {
            if(unlockNumber>8) {
                new Controller().sendBadge(user, 28);
                classes.UserBadge.iconChoice(user);
                Home.showHome(window, user);
            }
            else {
                BoxAlert.display("Hold up!", "You still have to unlock transport badge 8!");
            }
        });
        transportBadge_9.setOnAction(e -> {
            if(unlockNumber>9) {
                new Controller().sendBadge(user, 29);
                classes.UserBadge.iconChoice(user);
                Home.showHome(window, user);
            }
            else {
                BoxAlert.display("Hold up!", "You still have to unlock transport badge 9!");
            }
        });
        transportBadge_10.setOnAction(e -> {
            if (unlockNumber>10) {
                new Controller().sendBadge(user, 30);
                classes.UserBadge.iconChoice(user);
                Home.showHome(window, user);
            } else {
                BoxAlert.display("Hold up!", "You still have to unlock transport badge 10!");
            }
        });
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
