package client;

import classes.Badges;
import classes.Controller;
import classes.User;
import css.CssfoodBadge;

import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import javafx.stage.Stage;

/**
 * Achievemnts food class.
 */
public class AchievementsFood {

    /**
     * Initializes boolean variable unlocked.
     */
    private static boolean unlocked = false;

    /**
     * Declare Hbox.
     */
    private static HBox foodBox;

    /**
     * Show food badges.
     *
     * @param user   user parameter.
     * @param window window parameter.
     */
    public static void showFoodBadges(final User user, final Stage window) {

        /**
         * Calls method to unlock food badges, sets unlock value for css.
         */
        int unlockNumber = Badges.foodUnlock(user);

        /**
         * Initialize Hbox for food.
         */
        foodBox = new HBox();

        /**
         * Initialize buttons for food badges.
         */
        Button foodBadge1 = new Button();
        Button foodBadge2 = new Button();
        Button foodBadge3 = new Button();
        Button foodBadge4 = new Button();
        Button foodBadge5 = new Button();
        Button foodBadge6 = new Button();
        Button foodBadge7 = new Button();
        Button foodBadge8 = new Button();
        Button foodBadge9 = new Button();
        Button foodBadge10 = new Button();

        /**
         * Calls setPolar methods from css class to show locked .
         * unlocked food badges.
         */
        CssfoodBadge.setFood1(foodBadge1, unlockNumber);
        CssfoodBadge.setFood2(foodBadge2, unlockNumber);
        CssfoodBadge.setFood3(foodBadge3, unlockNumber);
        CssfoodBadge.setFood4(foodBadge4, unlockNumber);
        CssfoodBadge.setFood5(foodBadge5, unlockNumber);
        CssfoodBadge.setFood6(foodBadge6, unlockNumber);
        CssfoodBadge.setFood7(foodBadge7, unlockNumber);
        CssfoodBadge.setFood8(foodBadge8, unlockNumber);
        CssfoodBadge.setFood9(foodBadge9, unlockNumber);
        CssfoodBadge.setFood10(foodBadge10, unlockNumber);

        /**
         * Selecting unlocked or locked food score badges on button click.
         * Shows alert messages for each specific badge .
         * if they're not yet unlocked.
         */
        foodBadge1.setOnAction(e -> {
            new Controller().sendBadge(user, 11);
            classes.UserBadge.iconChoice(user);
            Home.showHome(window, user);
        });
        foodBadge2.setOnAction(e -> {
            if (unlockNumber >= 2) {
                new Controller().sendBadge(user, 12);
                classes.UserBadge.iconChoice(user);
                Home.showHome(window, user);
            } else {
                BoxAlert.display("Hold up!", "You still have to unlock food badge 2!");
            }
        });
        foodBadge3.setOnAction(e -> {
            if (unlockNumber >= 3) {
                new Controller().sendBadge(user, 13);
                classes.UserBadge.iconChoice(user);
                Home.showHome(window, user);
            } else {
                BoxAlert.display("Hold up!", "You still have to unlock food badge 3!");
            }
        });
        foodBadge4.setOnAction(e -> {
            if (unlockNumber >= 4) {
                new Controller().sendBadge(user, 14);
                classes.UserBadge.iconChoice(user);
                Home.showHome(window, user);
            } else {
                BoxAlert.display("Hold up!", "You still have to unlock food badge 4!");
            }
        });
        foodBadge5.setOnAction(e -> {
            if (unlockNumber >= 5) {
                new Controller().sendBadge(user, 15);
                classes.UserBadge.iconChoice(user);
                Home.showHome(window, user);
            } else {
                BoxAlert.display("Hold up!", "You still have to unlock food badge 5!");
            }
        });
        foodBadge6.setOnAction(e -> {
            if (unlockNumber >= 6) {
                new Controller().sendBadge(user, 16);
                classes.UserBadge.iconChoice(user);
                Home.showHome(window, user);
            } else {
                BoxAlert.display("Hold up!", "You still have to unlock food badge 6!");
            }
        });
        foodBadge7.setOnAction(e -> {
            if (unlockNumber >= 7) {
                new Controller().sendBadge(user, 17);
                classes.UserBadge.iconChoice(user);
                Home.showHome(window, user);
            } else {
                BoxAlert.display("Hold up!", "You still have to unlock food badge 7!");
            }
        });
        foodBadge8.setOnAction(e -> {
            if (unlockNumber >= 8) {
                new Controller().sendBadge(user, 18);
                classes.UserBadge.iconChoice(user);
                Home.showHome(window, user);
            } else {
                BoxAlert.display("Hold up!", "You still have to unlock food badge 8!");
            }
        });
        foodBadge9.setOnAction(e -> {
            if (unlockNumber >= 9) {
                new Controller().sendBadge(user, 19);
                classes.UserBadge.iconChoice(user);
                Home.showHome(window, user);
            } else {
                BoxAlert.display("Hold up!", "You still have to unlock food badge 9!");
            }
        });
        foodBadge10.setOnAction(e -> {
            if (unlockNumber >= 10) {
                new Controller().sendBadge(user, 20);
                classes.UserBadge.iconChoice(user);
                Home.showHome(window, user);
            } else {
                BoxAlert.display("Hold up!", "You still have to unlock food badge 10!");
            }
        });
        /**
         * Adds all badges for food to Hbox.
         */
        foodBox.getChildren().addAll(foodBadge1, foodBadge2, foodBadge3, foodBadge4, foodBadge5,
                foodBadge6, foodBadge7, foodBadge8, foodBadge9, foodBadge10);

    }

    /**
     * Getter for foodBox.
     */
    public static HBox getFoodBox() {
        return foodBox;
    }
}
