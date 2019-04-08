package client;

import classes.Badges;
import classes.Controller;
import classes.User;
import css.CsselectricityBadge;

import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

/**
 * Achievemnts electricity.
 */
public class AchievementsElectricity {

    /**
     * Declare Hbox.
     */
    static HBox electricityBox;

    /**
     * Show electricity badges.
     *
     * @param user   user paramter.
     * @param window window parameter.
     */
    public static void showElectricityBadges(final User user, final Stage window) {

        /**
         * Calls method to unlock food badges, sets unlock value for css.
         */
        int unlockNumber = Badges.electricityUnlock(user);

        /**
         * Initialize electricity Hbox.
         */
        electricityBox = new HBox();

        /**
         * Initialize buttons for electricity badges.
         */
        Button electricityBadge1 = new Button();
        Button electricityBadge2 = new Button();
        Button electricityBadge3 = new Button();
        Button electricityBadge4 = new Button();
        Button electricityBadge5 = new Button();
        Button electricityBadge6 = new Button();
        Button electricityBadge7 = new Button();
        Button electricityBadge8 = new Button();
        Button electricityBadge9 = new Button();
        Button electricityBadge10 = new Button();

        /**
         * Calls setPolar methods from css class to show locked
         * unlocked electricity badges.
         */
        CsselectricityBadge.setElectricity1(electricityBadge1, unlockNumber);
        CsselectricityBadge.setElectricity2(electricityBadge2, unlockNumber);
        CsselectricityBadge.setElectricity3(electricityBadge3, unlockNumber);
        CsselectricityBadge.setElectricity4(electricityBadge4, unlockNumber);
        CsselectricityBadge.setElectricity5(electricityBadge5, unlockNumber);
        CsselectricityBadge.setElectricity6(electricityBadge6, unlockNumber);
        CsselectricityBadge.setElectricity7(electricityBadge7, unlockNumber);
        CsselectricityBadge.setElectricity8(electricityBadge8, unlockNumber);
        CsselectricityBadge.setElectricity9(electricityBadge9, unlockNumber);
        CsselectricityBadge.setElectricity10(electricityBadge10, unlockNumber);
        /**
         * Selecting unlocked or locked electricity score
         * badges on button click.
         * Shows alert messages for each specific
         * badge if they're not yet unlocked.
         */
        electricityBadge1.setOnAction(e -> {
            new Controller().sendBadge(user, 31);
            classes.UserBadge.iconChoice(user);
            Home.showHome(window, user);
        });
        electricityBadge2.setOnAction(e -> {
            if (unlockNumber >= 2) {
                new Controller().sendBadge(user, 32);
                classes.UserBadge.iconChoice(user);
                Home.showHome(window, user);
            } else {
                BoxAlert.display("Hold up!", "You still have to unlock electricity badge 2!");
            }
        });
        electricityBadge3.setOnAction(e -> {
            if (unlockNumber >= 3) {
                new Controller().sendBadge(user, 33);
                classes.UserBadge.iconChoice(user);
                Home.showHome(window, user);
            } else {
                BoxAlert.display("Hold up!", "You still have to unlock electricity badge 3!");
            }
        });
        electricityBadge4.setOnAction(e -> {
            if (unlockNumber >= 4) {
                new Controller().sendBadge(user, 34);
                classes.UserBadge.iconChoice(user);
                Home.showHome(window, user);
            } else {
                BoxAlert.display("Hold up!", "You still have to unlock electricity badge 4!");
            }
        });
        electricityBadge5.setOnAction(e -> {
            if (unlockNumber >= 5) {
                new Controller().sendBadge(user, 35);
                classes.UserBadge.iconChoice(user);
                Home.showHome(window, user);
            } else {
                BoxAlert.display("Hold up!", "You still have to unlock electricity badge 5!");
            }
        });
        electricityBadge6.setOnAction(e -> {
            if (unlockNumber >= 6) {
                new Controller().sendBadge(user, 36);
                classes.UserBadge.iconChoice(user);
                Home.showHome(window, user);
            } else {
                BoxAlert.display("Hold up!", "You still have to unlock electricity badge 6!");
            }
        });
        electricityBadge7.setOnAction(e -> {
            if (unlockNumber >= 7) {
                new Controller().sendBadge(user, 37);
                classes.UserBadge.iconChoice(user);
                Home.showHome(window, user);
            } else {
                BoxAlert.display("Hold up!", "You still have to unlock electricity badge 7!");
            }
        });
        electricityBadge8.setOnAction(e -> {
            if (unlockNumber >= 8) {
                new Controller().sendBadge(user, 38);
                classes.UserBadge.iconChoice(user);
                Home.showHome(window, user);
            } else {
                BoxAlert.display("Hold up!", "You still have to unlock electricity badge 8!");
            }
        });
        electricityBadge9.setOnAction(e -> {
            if (unlockNumber >= 9) {
                new Controller().sendBadge(user, 39);
                classes.UserBadge.iconChoice(user);
                Home.showHome(window, user);
            } else {
                BoxAlert.display("Hold up!", "You still have to unlock electricity badge 9!");
            }
        });
        electricityBadge10.setOnAction(e -> {
            if (unlockNumber >= 10) {
                new Controller().sendBadge(user, 40);
                classes.UserBadge.iconChoice(user);
                Home.showHome(window, user);
            } else {
                BoxAlert.display("Hold up!", "You still have to unlock electricity badge 10!");
            }
        });
        /**
         * Adds all badges for electricity to Hbox.
         */
        electricityBox.getChildren().addAll(electricityBadge1,
                electricityBadge2, electricityBadge3,
                electricityBadge4, electricityBadge5,
                electricityBadge6, electricityBadge7,
                electricityBadge8, electricityBadge9,
                electricityBadge10);
    }

    /**
     * getter for for electricityHbox.
     */
    public static HBox getElectricityBox() {
        return electricityBox;
    }
}
