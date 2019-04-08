package client;


import classes.Badges;

import classes.Controller;
import classes.User;
import css.CsspolarBadge;

import javafx.scene.control.Button;
import javafx.scene.control.Label;

import javafx.scene.layout.HBox;

import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;


/**
 * achievements polar.
 */
public class AchievementsPolar {

    /**
     * Initializes boolean variable unlocked.
     */

    /**
     * Declare Hbox.
     */
    static HBox polarBox;

    /**
     * Show polar badges.
     *
     * @param user   parameter user.
     * @param window window parameter.
     */
    public static void showPolarBadges(final User user, final Stage window) {

        /**
         * Calls method to unlock polar badges, sets unlock value for css.
         */
        int unlockNumber = Badges.polarUnlock(user);

        /**
         * Initialize Hbox for food.
         */
        polarBox = new HBox();

        /**
         * Initialize buttons for polar badges.
         */
        Button polarBadge1 = new Button();
        Button polarBadge2 = new Button();
        Button polarBadge3 = new Button();
        Button polarBadge4 = new Button();
        Button polarBadge5 = new Button();
        Button polarBadge6 = new Button();
        Button polarBadge7 = new Button();
        Button polarBadge8 = new Button();
        Button polarBadge9 = new Button();
        Button polarBadge10 = new Button();

        /**
         * Calls setPolar methods from css class to show locked.
         * unlocked polar badges.
         */
        CsspolarBadge.setPolar1(polarBadge1, unlockNumber);
        CsspolarBadge.setPolar2(polarBadge2, unlockNumber);
        CsspolarBadge.setPolar3(polarBadge3, unlockNumber);
        CsspolarBadge.setPolar4(polarBadge4, unlockNumber);
        CsspolarBadge.setPolar5(polarBadge5, unlockNumber);
        CsspolarBadge.setPolar6(polarBadge6, unlockNumber);
        CsspolarBadge.setPolar7(polarBadge7, unlockNumber);
        CsspolarBadge.setPolar8(polarBadge8, unlockNumber);
        CsspolarBadge.setPolar9(polarBadge9, unlockNumber);
        CsspolarBadge.setPolar10(polarBadge10, unlockNumber);

        /**
         * Selecting unlocked or locked polar score badges on button click.
         * Shows alert messages for each specific badge
         * if they're not yet unlocked.
         */
        polarBadge1.setOnAction(e -> {
            new Controller().sendBadge(user, 1);
            classes.UserBadge.iconChoice(user);
            Home.showHome(window, user);
        });
        polarBadge2.setOnAction(e -> {
            if (unlockNumber >= 2) {
                new Controller().sendBadge(user, 2);
                classes.UserBadge.iconChoice(user);
                Home.showHome(window, user);
            } else {
                BoxAlert.display("This is an error message",
                        "You still have to unlock polar badge 2!");
            }
        });
        polarBadge3.setOnAction(e -> {
            if (unlockNumber >= 3) {
                new Controller().sendBadge(user, 3);
                classes.UserBadge.iconChoice(user);
                Home.showHome(window, user);
            } else {
                BoxAlert.display("This is an error message",
                        "You still have to unlock polar badge 3!");
            }
        });
        polarBadge4.setOnAction(e -> {
            if (unlockNumber >= 4) {
                new Controller().sendBadge(user, 4);
                classes.UserBadge.iconChoice(user);
                Home.showHome(window, user);
            } else {
                BoxAlert.display("Hold up!", "You still have to unlock polar badge 4!");
            }
        });
        polarBadge5.setOnAction(e -> {
            if (unlockNumber >= 5) {
                new Controller().sendBadge(user, 5);
                classes.UserBadge.iconChoice(user);
                Home.showHome(window, user);
            } else {
                BoxAlert.display("Hold up!", "You still have to unlock polar badge 5!");
            }
        });
        polarBadge6.setOnAction(e -> {
            if (unlockNumber >= 6) {
                new Controller().sendBadge(user, 6);
                classes.UserBadge.iconChoice(user);
                Home.showHome(window, user);
            } else {
                BoxAlert.display("Hold up!", "You still have to unlock polar badge 6!");
            }
        });
        polarBadge7.setOnAction(e -> {
            if (unlockNumber >= 7) {
                new Controller().sendBadge(user, 7);
                classes.UserBadge.iconChoice(user);
                Home.showHome(window, user);
            } else {
                BoxAlert.display("Hold up!", "You still have to unlock polar badge 7!");
            }
        });
        polarBadge8.setOnAction(e -> {
            if (unlockNumber >= 8) {
                new Controller().sendBadge(user, 8);
                classes.UserBadge.iconChoice(user);
                Home.showHome(window, user);
            } else {
                BoxAlert.display("Hold up!", "You still have to unlock polar badge 8!");
            }
        });
        polarBadge9.setOnAction(e -> {
            if (unlockNumber >= 9) {
                new Controller().sendBadge(user, 9);
                classes.UserBadge.iconChoice(user);
                Home.showHome(window, user);
            } else {
                BoxAlert.display("Hold up!", "You still have to unlock polar badge 9!");
            }
        });
        polarBadge10.setOnAction(e -> {
            if (unlockNumber >= 10) {
                new Controller().sendBadge(user, 10);
                classes.UserBadge.iconChoice(user);
                Home.showHome(window, user);
            } else {
                BoxAlert.display("Hold up!", "You still have to unlock polar badge 10!");
            }

        });

        /**
         * Label for polar badges.
         */
        Label polarLabel = new Label("POLAR");
        polarLabel.setFont(Font.font("Amble CN", FontWeight.BOLD, 20));
        polarBox.getChildren().addAll(polarBadge1, polarBadge2, polarBadge3,
                polarBadge4, polarBadge5,
                polarBadge6, polarBadge7, polarBadge8, polarBadge9, polarBadge10);
    }


    /**
     * Get polar box.
     *
     * @return poalrbox.
     */
    public static HBox getPolarBox() {
        return polarBox;
    }

}
