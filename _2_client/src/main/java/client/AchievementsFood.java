package client;

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
        int foodUnlock = Badges.foodUnlock(user);

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
        CSSfoodBadge.setFood1(foodBadge_1, foodUnlock);
        CSSfoodBadge.setFood2(foodBadge_2, foodUnlock);
        CSSfoodBadge.setFood3(foodBadge_3, foodUnlock);
        CSSfoodBadge.setFood4(foodBadge_4, foodUnlock);
        CSSfoodBadge.setFood5(foodBadge_5, foodUnlock);
        CSSfoodBadge.setFood6(foodBadge_6, foodUnlock);
        CSSfoodBadge.setFood7(foodBadge_7, foodUnlock);
        CSSfoodBadge.setFood8(foodBadge_8, foodUnlock);
        CSSfoodBadge.setFood9(foodBadge_9, foodUnlock);
        CSSfoodBadge.setFood10(foodBadge_10, foodUnlock);

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
            unlocked = CSSfoodBadge.setFood1(foodBadge_1, foodUnlock);
            if (unlocked == true) {
                new Controller().sendBadge(user, 11);
                String icon = classes.UserBadge.iconChoice(user);
                Home.showHome(window, user);
            }
        });
//        polarBadge_2.setOnAction(e -> {
//            unlocked = CSSfoodBadge.setFood2(foodBadge_2, foodUnlock);
//            if (unlocked == true) {
//                new Controller().sendBadge(user, 12);
//                String icon = classes.UserBadge.iconChoice(user);
//                Home.showHome(window, user);
//            }
//            if (unlocked == false) {
//                BoxAlert.display("Hold up!", "You still have to unlock food badge 2!");
//            }
//        });
//        polarBadge_3.setOnAction(e -> {
//            unlocked = CSSfoodBadge.setFood3(foodBadge_3, foodUnlock);
//            if (unlocked == true) {
//                new Controller().sendBadge(user, 13);
//                String icon = classes.UserBadge.iconChoice(user);
//                Home.showHome(window, user);
//            }
//            if (unlocked == false) {
//                BoxAlert.display("Hold up!", "You still have to unlock food badge 3!");
//            }
//        });
//        polarBadge_4.setOnAction(e -> {
//            unlocked = CSSfoodBadge.setFood4(foodBadge_4, foodUnlock);
//            if (unlocked == true) {
//                new Controller().sendBadge(user, 14);
//                String icon = classes.UserBadge.iconChoice(user);
//                Home.showHome(window, user);
//            }
//            if (unlocked == false) {
//                BoxAlert.display("Hold up!", "You still have to unlock food badge 4!");
//            }
//        });
//        polarBadge_5.setOnAction(e -> {
//            unlocked = CSSfoodBadge.setFood5(foodBadge_5, foodUnlock);
//            if (unlocked == true) {
//                new Controller().sendBadge(user, 15);
//                String icon = classes.UserBadge.iconChoice(user);
//                Home.showHome(window, user);
//            }
//            if (unlocked == false) {
//                BoxAlert.display("Hold up!", "You still have to unlock food badge 5!");
//            }
//        });
//        polarBadge_6.setOnAction(e -> {
//            unlocked = CSSfoodBadge.setFood6(foodBadge_6, foodUnlock);
//            if (unlocked == true) {
//                new Controller().sendBadge(user, 16);
//                String icon = classes.UserBadge.iconChoice(user);
//                Home.showHome(window, user);
//            }
//            if (unlocked == false) {
//                BoxAlert.display("Hold up!", "You still have to unlock food badge 6!");
//            }
//        });
//        polarBadge_7.setOnAction(e -> {
//            unlocked = CSSfoodBadge.setFood7(foodBadge_7, foodUnlock);
//            if (unlocked == true) {
//                new Controller().sendBadge(user, 17);
//                String icon = classes.UserBadge.iconChoice(user);
//                Home.showHome(window, user);
//            }
//            if (unlocked == false) {
//                BoxAlert.display("Hold up!", "You still have to unlock food badge 7!");
//            }
//        });
//        polarBadge_8.setOnAction(e -> {
//            unlocked = CSSfoodBadge.setFood8(foodBadge_8, foodUnlock);
//            if (unlocked == true) {
//                new Controller().sendBadge(user, 18);
//                String icon = classes.UserBadge.iconChoice(user);
//                Home.showHome(window, user);
//            }
//            if (unlocked == false) {
//                BoxAlert.display("Hold up!", "You still have to unlock food badge 8!");
//            }
//        });
//        polarBadge_9.setOnAction(e -> {
//            unlocked = CSSfoodBadge.setFood9(foodBadge_9, foodUnlock);
//            if (unlocked == true) {
//                new Controller().sendBadge(user, 19);
//                String icon = classes.UserBadge.iconChoice(user);
//                Home.showHome(window, user);
//            }
//            if (unlocked == false) {
//                BoxAlert.display("Hold up!", "You still have to unlock food badge 9!");
//            }
//        });
//        polarBadge_10.setOnAction(e -> {
//            unlocked = CSSfoodBadge.setFood10(foodBadge_10, foodUnlock);
//            if (unlocked == true) {
//                new Controller().sendBadge(user, 20);
//                String icon = classes.UserBadge.iconChoice(user);
//                Home.showHome(window, user);
//            }
//            if (unlocked == false) {
//                BoxAlert.display("Hold up!", "You still have to unlock food badge 10!");
//            }
//        });
    }

    /**
     * Getter for foodBox
     */
    static public HBox getFoodBox() {
        return foodBox;
    }
}
