package client;

import CSS.CSSpolarBadge;
import classes.Badges;
import classes.Controller;
import classes.User;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;
import javafx.scene.control.Label;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;

public class AchievementsPolar {

    /**
     * Initializes boolean variable unlocked
     */

    /**
     * Declare Hbox.
     */
    static HBox polarBox;

    public static void showPolarBadges(User user, Stage window) {

        /**
         * Calls method to unlock polar badges, sets unlock value for CSS.
         */
        int unlockNumber = Badges.polarUnlock(user);

        /**
         * Initialize Hbox for food.
         */
        polarBox = new HBox();

        /**
         * Initialize buttons for polar badges.
         */
        Button polarBadge_1 = new Button();
        Button polarBadge_2 = new Button();
        Button polarBadge_3 = new Button();
        Button polarBadge_4 = new Button();
        Button polarBadge_5 = new Button();
        Button polarBadge_6 = new Button();
        Button polarBadge_7 = new Button();
        Button polarBadge_8 = new Button();
        Button polarBadge_9 = new Button();
        Button polarBadge_10 = new Button();

        /**
         * Calls setPolar methods from CSS class to show locked / unlocked polar badges.
         */
        CSSpolarBadge.setPolar1(polarBadge_1, unlockNumber);
        CSSpolarBadge.setPolar2(polarBadge_2, unlockNumber);
        CSSpolarBadge.setPolar3(polarBadge_3, unlockNumber);
        CSSpolarBadge.setPolar4(polarBadge_4, unlockNumber);
        CSSpolarBadge.setPolar5(polarBadge_5, unlockNumber);
        CSSpolarBadge.setPolar6(polarBadge_6, unlockNumber);
        CSSpolarBadge.setPolar7(polarBadge_7, unlockNumber);
        CSSpolarBadge.setPolar8(polarBadge_8, unlockNumber);
        CSSpolarBadge.setPolar9(polarBadge_9, unlockNumber);
        CSSpolarBadge.setPolar10(polarBadge_10, unlockNumber);

        /**
         * Selecting unlocked or locked polar score badges on button click.
         * Shows alert messages for each specific badge if they're not yet unlocked
         */
        polarBadge_1.setOnAction(e -> {
                new Controller().sendBadge(user, 1);
                classes.UserBadge.iconChoice(user);
                Home.showHome(window, user);
        });
        polarBadge_2.setOnAction(e -> {
            if(unlockNumber>2) {
                new Controller().sendBadge(user, 2);
                classes.UserBadge.iconChoice(user);
                Home.showHome(window, user);
            }
            else {
                BoxAlert.display("This is an error message", "You still have to unlock polar badge 2!");
            }
        });
        polarBadge_3.setOnAction(e -> {
            if(unlockNumber>3) {
                new Controller().sendBadge(user, 3);
                classes.UserBadge.iconChoice(user);
                Home.showHome(window, user);
            }
            else {
                BoxAlert.display("This is an error message", "You still have to unlock polar badge 3!");
            }
        });
        polarBadge_4.setOnAction(e -> {
            if(unlockNumber>4) {
                new Controller().sendBadge(user, 4);
                classes.UserBadge.iconChoice(user);
                Home.showHome(window, user);
            }
            else {
                BoxAlert.display("Hold up!", "You still have to unlock polar badge 4!");
            }
        });
        polarBadge_5.setOnAction(e -> {
            if(unlockNumber>5) {
                new Controller().sendBadge(user, 5);
                classes.UserBadge.iconChoice(user);
                Home.showHome(window, user);
            }
            else {
                BoxAlert.display("Hold up!", "You still have to unlock polar badge 5!");
            }
        });
        polarBadge_6.setOnAction(e -> {
            if(unlockNumber>6) {
                new Controller().sendBadge(user, 6);
                classes.UserBadge.iconChoice(user);
                Home.showHome(window, user);
            }
            else {
                BoxAlert.display("Hold up!", "You still have to unlock polar badge 6!");
            }
        });
        polarBadge_7.setOnAction(e -> {
            if(unlockNumber>7) {
                new Controller().sendBadge(user, 7);
                classes.UserBadge.iconChoice(user);
                Home.showHome(window, user);
            }
            else {
                BoxAlert.display("Hold up!", "You still have to unlock polar badge 7!");
            }
        });
        polarBadge_8.setOnAction(e -> {
            if(unlockNumber>8) {
                new Controller().sendBadge(user, 8);
                classes.UserBadge.iconChoice(user);
                Home.showHome(window, user);
            }
            else {
                BoxAlert.display("Hold up!", "You still have to unlock polar badge 8!");
            }
        });
        polarBadge_9.setOnAction(e -> {
            if(unlockNumber>9) {
                new Controller().sendBadge(user, 9);
                classes.UserBadge.iconChoice(user);
                Home.showHome(window, user);
            }
            else {
                BoxAlert.display("Hold up!", "You still have to unlock polar badge 9!");
            }
        });
        polarBadge_10.setOnAction(e -> {
            if(unlockNumber>10) {
                new Controller().sendBadge(user, 10);
                classes.UserBadge.iconChoice(user);
                Home.showHome(window, user);
            }
            else {
                BoxAlert.display("Hold up!", "You still have to unlock polar badge 10!");
            }

        });

        /**
         * Label for polar badges
         */
        Label polarLabel = new Label("POLAR");
        polarLabel.setFont(Font.font("Amble CN", FontWeight.BOLD, 20));
        polarBox.getChildren().addAll(polarBadge_1, polarBadge_2, polarBadge_3, polarBadge_4, polarBadge_5,
                polarBadge_6, polarBadge_7, polarBadge_8, polarBadge_9, polarBadge_10);
    }

    /**
     * Getter for polarBox
     */
    static public HBox getPolarBox() {
        return polarBox;
    }

}
