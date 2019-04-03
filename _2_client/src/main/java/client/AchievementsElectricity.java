package client;

import CSS.CSSelectricityBadge;
import classes.Badges;
import classes.Controller;
import classes.User;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;
public class AchievementsElectricity {

    /**
     * Declare Hbox.
     */
    static HBox electricityBox;

    public static void showElectricityBadges(User user, Stage window) {

        /**
         * Calls method to unlock food badges, sets unlock value for CSS.
         */
        int unlockNumber = Badges.electricityUnlock(user);

        /**
         * Initialize electricity Hbox.
         */
        electricityBox = new HBox();

        /**
         * Initialize buttons for electricity badges.
         */
        Button electricityBadge_1 = new Button();
        Button electricityBadge_2 = new Button();
        Button electricityBadge_3 = new Button();
        Button electricityBadge_4 = new Button();
        Button electricityBadge_5 = new Button();
        Button electricityBadge_6 = new Button();
        Button electricityBadge_7 = new Button();
        Button electricityBadge_8 = new Button();
        Button electricityBadge_9 = new Button();
        Button electricityBadge_10 = new Button();

        /**
         * Calls setPolar methods from CSS class to show locked / unlocked electricity badges.
         */
        CSSelectricityBadge.setElectricity1(electricityBadge_1, unlockNumber);
        CSSelectricityBadge.setElectricity2(electricityBadge_2, unlockNumber);
        CSSelectricityBadge.setElectricity3(electricityBadge_3, unlockNumber);
        CSSelectricityBadge.setElectricity4(electricityBadge_4, unlockNumber);
        CSSelectricityBadge.setElectricity5(electricityBadge_5, unlockNumber);
        CSSelectricityBadge.setElectricity6(electricityBadge_6, unlockNumber);
        CSSelectricityBadge.setElectricity7(electricityBadge_7, unlockNumber);
        CSSelectricityBadge.setElectricity8(electricityBadge_8, unlockNumber);
        CSSelectricityBadge.setElectricity9(electricityBadge_9, unlockNumber);
        CSSelectricityBadge.setElectricity10(electricityBadge_10, unlockNumber);
        /**
         * Selecting unlocked or locked electricity score badges on button click.
         * Shows alert messages for each specific badge if they're not yet unlocked
         */
        electricityBadge_1.setOnAction(e -> {
            new Controller().sendBadge(user, 31);
            classes.UserBadge.iconChoice(user);
            Home.showHome(window, user);
        });
        electricityBadge_2.setOnAction(e -> {
            if(unlockNumber>=2) {
                new Controller().sendBadge(user, 32);
                classes.UserBadge.iconChoice(user);
                Home.showHome(window, user);
            }
            else {
                BoxAlert.display("Hold up!", "You still have to unlock electricity badge 2!");
            }
        });
        electricityBadge_3.setOnAction(e -> {
            if(unlockNumber>=3) {
                new Controller().sendBadge(user, 33);
                classes.UserBadge.iconChoice(user);
                Home.showHome(window, user);
            }
            else {
                BoxAlert.display("Hold up!", "You still have to unlock electricity badge 3!");
            }
        });
        electricityBadge_4.setOnAction(e -> {
            if(unlockNumber>=4) {
                new Controller().sendBadge(user, 34);
                classes.UserBadge.iconChoice(user);
                Home.showHome(window, user);
            }
            else {
                BoxAlert.display("Hold up!", "You still have to unlock electricity badge 4!");
            }
        });
        electricityBadge_5.setOnAction(e -> {
            if(unlockNumber>=5) {
                new Controller().sendBadge(user, 35);
                classes.UserBadge.iconChoice(user);
                Home.showHome(window, user);
            }
            else {
                BoxAlert.display("Hold up!", "You still have to unlock electricity badge 5!");
            }
        });
        electricityBadge_6.setOnAction(e -> {
            if(unlockNumber>=6) {
                new Controller().sendBadge(user, 36);
                classes.UserBadge.iconChoice(user);
                Home.showHome(window, user);
            }
            else {
                BoxAlert.display("Hold up!", "You still have to unlock electricity badge 6!");
            }
        });
        electricityBadge_7.setOnAction(e -> {
            if(unlockNumber>=7) {
                new Controller().sendBadge(user, 37);
                classes.UserBadge.iconChoice(user);
                Home.showHome(window, user);
            }
            else {
                BoxAlert.display("Hold up!", "You still have to unlock electricity badge 7!");
            }
        });
        electricityBadge_8.setOnAction(e -> {
            if(unlockNumber>=8) {
                new Controller().sendBadge(user, 38);
                classes.UserBadge.iconChoice(user);
                Home.showHome(window, user);
            }
            else {
                BoxAlert.display("Hold up!", "You still have to unlock electricity badge 8!");
            }
        });
        electricityBadge_9.setOnAction(e -> {
            if(unlockNumber>=9) {
                new Controller().sendBadge(user, 39);
                classes.UserBadge.iconChoice(user);
                Home.showHome(window, user);
            }
            else {
                BoxAlert.display("Hold up!", "You still have to unlock electricity badge 9!");
            }
        });
        electricityBadge_10.setOnAction(e -> {
            if (unlockNumber>=10) {
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
        electricityBox.getChildren().addAll(electricityBadge_1, electricityBadge_2, electricityBadge_3, electricityBadge_4, electricityBadge_5,
                electricityBadge_6, electricityBadge_7, electricityBadge_8, electricityBadge_9, electricityBadge_10);
    }

    /**
     * getter for for electricityHbox.
     */
    static public HBox getElectricityBox() {
        return electricityBox;
    }
}
