package client;

import classes.Badges;
import classes.User;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;

public class AchievementsFood {

    /**
     * Initializes boolean variable unlocked
     */
    static private boolean unlocked = false;
    static HBox foodBox;

    public static void showFoodBadges(User user) {

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
    }

    /**
     * Getter for foodBox
     */
    static public HBox getFoodBox() {
        return foodBox;
    }
}
