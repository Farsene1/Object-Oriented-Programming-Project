package client;

import classes.Badges;
import classes.User;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;
import javafx.scene.layout.HBox;

public class FoodAchievements {

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
         * Label for food badges.
         */
        Label foodLabel = new Label("FOOD");
        foodLabel.setFont(Font.font("Amble CN", FontWeight.BOLD, 20));

        /**
         * Adds all badges for food to Hbox
         */
        foodBox.getChildren().addAll(foodBadge_1, foodBadge_2, foodBadge_3, foodBadge_4, foodBadge_5,
                foodBadge_6, foodBadge_7, foodBadge_8, foodBadge_9, foodBadge_10);


    }

    static public HBox getFoodBox() {
        return foodBox;
    }
    }
