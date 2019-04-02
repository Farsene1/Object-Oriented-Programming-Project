package client;

import CSS.CSSfoodBadge;
import classes.Badges;
import classes.Controller;
import classes.User;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

public class AchievementsFood {

    /**
     * Initializes boolean variable unlocked
     */
    static private boolean unlocked = false;

    /**
     * Declare Hbox.
     */
    static HBox foodBox;

    public static void showFoodBadges(User user, Stage window) {

        /**
         * Calls method to unlock food badges, sets unlock value for CSS.
         */
        int unlockNumber = Badges.foodUnlock(user);

        /**
         * Initialize Hbox for food.
         */
        foodBox = new HBox();

        /**
         * Initialize buttons for food badges.
         */
        Button foodBadge_1 = new Button();
        Button foodBadge_2 = new Button();
        Button foodBadge_3 = new Button();
        Button foodBadge_4 = new Button();
        Button foodBadge_5 = new Button();
        Button foodBadge_6 = new Button();
        Button foodBadge_7 = new Button();
        Button foodBadge_8 = new Button();
        Button foodBadge_9 = new Button();
        Button foodBadge_10 = new Button();

        /**
         * Calls setPolar methods from CSS class to show locked / unlocked food badges.
         */
        CSSfoodBadge.setFood1(foodBadge_1, unlockNumber);
        CSSfoodBadge.setFood2(foodBadge_2, unlockNumber);
        CSSfoodBadge.setFood3(foodBadge_3, unlockNumber);
        CSSfoodBadge.setFood4(foodBadge_4, unlockNumber);
        CSSfoodBadge.setFood5(foodBadge_5, unlockNumber);
        CSSfoodBadge.setFood6(foodBadge_6, unlockNumber);
        CSSfoodBadge.setFood7(foodBadge_7, unlockNumber);
        CSSfoodBadge.setFood8(foodBadge_8, unlockNumber);
        CSSfoodBadge.setFood9(foodBadge_9, unlockNumber);
        CSSfoodBadge.setFood10(foodBadge_10, unlockNumber);

        /**
         * Adds all badges for food to Hbox
         */
        foodBox.getChildren().addAll(foodBadge_1, foodBadge_2, foodBadge_3, foodBadge_4, foodBadge_5,
                foodBadge_6, foodBadge_7, foodBadge_8, foodBadge_9, foodBadge_10);

        /**
         * Selecting unlocked or locked polar score badges on button click.
         * Shows alert messages for each specific badge if they're not yet unlocked
         */
        foodBadge_1.setOnAction(e -> {
            if(unlockNumber>1) {
                new Controller().sendBadge(user, 11);
                String icon = classes.UserBadge.iconChoice(user);
                Home.showHome(window, user);
            }
        });
        foodBadge_2.setOnAction(e -> {
            if(unlockNumber>2) {
                new Controller().sendBadge(user, 12);
                String icon = classes.UserBadge.iconChoice(user);
                Home.showHome(window, user);
            }
            else {
                BoxAlert.display("Hold up!", "You still have to unlock food badge 2!");
            }
        });
        foodBadge_3.setOnAction(e -> {
            if(unlockNumber>3) {
                new Controller().sendBadge(user, 13);
                String icon = classes.UserBadge.iconChoice(user);
                Home.showHome(window, user);
            }
            else {
                BoxAlert.display("Hold up!", "You still have to unlock food badge 3!");
            }
        });
        foodBadge_4.setOnAction(e -> {
            if(unlockNumber>4) {
                new Controller().sendBadge(user, 14);
                String icon = classes.UserBadge.iconChoice(user);
                Home.showHome(window, user);
            }
            else {
                BoxAlert.display("Hold up!", "You still have to unlock food badge 4!");
            }
        });
        foodBadge_5.setOnAction(e -> {
            if(unlockNumber>5) {
                new Controller().sendBadge(user, 15);
                String icon = classes.UserBadge.iconChoice(user);
                Home.showHome(window, user);
            }
            else {
                BoxAlert.display("Hold up!", "You still have to unlock food badge 5!");
            }
        });
        foodBadge_6.setOnAction(e -> {
            if(unlockNumber>6) {
                new Controller().sendBadge(user, 16);
                String icon = classes.UserBadge.iconChoice(user);
                Home.showHome(window, user);
            }
            else {
                BoxAlert.display("Hold up!", "You still have to unlock food badge 6!");
            }
        });
        foodBadge_7.setOnAction(e -> {
            if(unlockNumber>7) {
                new Controller().sendBadge(user, 17);
                String icon = classes.UserBadge.iconChoice(user);
                Home.showHome(window, user);
            }
            else {
                BoxAlert.display("Hold up!", "You still have to unlock food badge 7!");
            }
        });
        foodBadge_8.setOnAction(e -> {
            if(unlockNumber>8) {
                new Controller().sendBadge(user, 18);
                String icon = classes.UserBadge.iconChoice(user);
                Home.showHome(window, user);
            }
            else {
                BoxAlert.display("Hold up!", "You still have to unlock food badge 8!");
            }
        });
        foodBadge_9.setOnAction(e -> {
            if(unlockNumber>9) {
                new Controller().sendBadge(user, 19);
                String icon = classes.UserBadge.iconChoice(user);
                Home.showHome(window, user);
            }
            else {
                BoxAlert.display("Hold up!", "You still have to unlock food badge 9!");
            }
        });
        foodBadge_10.setOnAction(e -> {
            if(unlockNumber>10) {
                new Controller().sendBadge(user, 20);
                String icon = classes.UserBadge.iconChoice(user);
                Home.showHome(window, user);
            }
            else {
                BoxAlert.display("Hold up!", "You still have to unlock food badge 10!");
            }
        });
    }

    /**
     * Getter for foodBox
     */
    static public HBox getFoodBox() {
        return foodBox;
    }
}
