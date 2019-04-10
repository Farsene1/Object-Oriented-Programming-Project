package client;

import classes.Badges;

import classes.Controller;
import classes.User;
import css.CsstransportBadge;

import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;



/**
 * Achievements for transport.
 */
public class AchievementsTransport {

    /**
     * Declare Hbox.
     */
    static HBox transportBox;

    /**
     * Show transport badge.
     *
     * @param user   user parameter.
     * @param window window parameter.
     */
    public static void showTransportBadges(final User user, final Stage window) {

        /**
         * Creates HBox.
         */
        transportBox = new HBox();

        /**
         * Calls method to unlock transport badges, sets unlock value for css.
         */
        int unlockNumber = Badges.transportUnlock(user);

        /**
         transportBox = new HBox();

         /**
         * Initialize buttons for transport badges.
         */
        Button transportBadge1 = new Button();
        Button transportBadge2 = new Button();
        Button transportBadge3 = new Button();
        Button transportBadge4 = new Button();
        Button transportBadge5 = new Button();
        Button transportBadge6 = new Button();
        Button transportBadge7 = new Button();
        Button transportBadge8 = new Button();
        Button transportBadge9 = new Button();
        Button transportBadge10 = new Button();

        /**
         * Calls setPolar methods from css class to show locked.
         * unlocked transport badges.
         */
        CsstransportBadge.setTransport1(transportBadge1, unlockNumber);
        CsstransportBadge.setTransport2(transportBadge2, unlockNumber);
        CsstransportBadge.setTransport3(transportBadge3, unlockNumber);
        CsstransportBadge.setTransport4(transportBadge4, unlockNumber);
        CsstransportBadge.setTransport5(transportBadge5, unlockNumber);
        CsstransportBadge.setTransport6(transportBadge6, unlockNumber);
        CsstransportBadge.setTransport7(transportBadge7, unlockNumber);
        CsstransportBadge.setTransport8(transportBadge8, unlockNumber);
        CsstransportBadge.setTransport9(transportBadge9, unlockNumber);
        CsstransportBadge.setTransport10(transportBadge10, unlockNumber);

        /**
         * Selecting unlocked or locked transport score badges on button click.
         * Shows alert messages for each specific badge
         * if they're not yet unlocked.
         */
        transportBadge1.setOnAction(e -> {
            new Controller().sendBadge(user, 21);
            classes.UserBadge.iconChoice(user);
            Home.showHome(window, user);
        });
        transportBadge2.setOnAction(e -> {
            if (unlockNumber >= 2) {
                new Controller().sendBadge(user, 22);
                classes.UserBadge.iconChoice(user);
                Home.showHome(window, user);
            } else {
                BoxAlert.display("Hold up!", "You still have to unlock transport badge 2!");
            }
        });
        transportBadge3.setOnAction(e -> {
            if (unlockNumber >= 3) {
                new Controller().sendBadge(user, 23);
                classes.UserBadge.iconChoice(user);
                Home.showHome(window, user);
            } else {
                BoxAlert.display("Hold up!", "You still have to unlock transport badge 3!");
            }
        });
        transportBadge4.setOnAction(e -> {
            if (unlockNumber >= 4) {
                new Controller().sendBadge(user, 24);
                classes.UserBadge.iconChoice(user);
                Home.showHome(window, user);
            } else {
                BoxAlert.display("Hold up!", "You still have to unlock transport badge 4!");
            }
        });
        transportBadge5.setOnAction(e -> {
            if (unlockNumber >= 5) {
                new Controller().sendBadge(user, 25);
                classes.UserBadge.iconChoice(user);
                Home.showHome(window, user);
            } else {
                BoxAlert.display("Hold up!", "You still have to unlock transport badge 5!");
            }
        });
        transportBadge6.setOnAction(e -> {
            if (unlockNumber >= 6) {
                new Controller().sendBadge(user, 26);
                classes.UserBadge.iconChoice(user);
                Home.showHome(window, user);
            } else {
                BoxAlert.display("Hold up!", "You still have to unlock transport badge 6!");
            }
        });
        transportBadge7.setOnAction(e -> {
            if (unlockNumber >= 7) {
                new Controller().sendBadge(user, 27);
                classes.UserBadge.iconChoice(user);
                Home.showHome(window, user);
            } else {
                BoxAlert.display("Hold up!", "You still have to unlock transport badge 7!");
            }
        });
        transportBadge8.setOnAction(e -> {
            if (unlockNumber >= 8) {
                new Controller().sendBadge(user, 28);
                classes.UserBadge.iconChoice(user);
                Home.showHome(window, user);
            } else {
                BoxAlert.display("Hold up!", "You still have to unlock transport badge 8!");
            }
        });
        transportBadge9.setOnAction(e -> {
            if (unlockNumber >= 9) {
                new Controller().sendBadge(user, 29);
                classes.UserBadge.iconChoice(user);
                Home.showHome(window, user);
            } else {
                BoxAlert.display("Hold up!", "You still have to unlock transport badge 9!");
            }
        });
        transportBadge10.setOnAction(e -> {
            if (unlockNumber >= 10) {
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
        transportBox.getChildren().addAll(transportBadge1, transportBadge2, transportBadge3,
                transportBadge4, transportBadge5, transportBadge6,
                transportBadge7, transportBadge8, transportBadge9,
                transportBadge10);
    }

    /**
     * Get box.
     *
     * @return transport box.
     */
    public static HBox getTransportBox() {
        return transportBox;
    }
}
