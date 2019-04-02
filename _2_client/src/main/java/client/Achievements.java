package client;

import classes.*;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.geometry.Pos;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;

public class Achievements {

    public static void showBadges(GridPane grid, User user, Stage window) {

        /**
         * Calls method in class to show PolarBadges.
         */
        AchievementsPolar.showPolarBadges(user, window);
        /**
         * Calls method in class to show FoodBadges.
         */
        AchievementsFood.showFoodBadges(user, window);
        /**
         * Calls method in class to show TransportBadges.
         */
        AchievementsTransport.showTransportBadges(user);
        /**
         * Calls method in class to show ElectricitytBadges.
         */
        AchievementsElectricity.showElectricityBadges(user);

        /**
         * Set label for achievements, initialize VBox for badges.
         */
        Label myAchievements = new Label("My Achievements!");
        myAchievements.setFont(Font.font("Amble CN", FontWeight.BOLD, 35));
        VBox achievements = new VBox();
        achievements.setStyle("-fx-padding: 5;");
        achievements.setSpacing(10);
        achievements.setAlignment(Pos.CENTER);
        achievements.setStyle("-fx-padding: 1;" + "-fx-border-style: solid inside;"
                + "-fx-border-width: 5;" + "-fx-border-insets: 5;"
                + "-fx-border-radius: 5;" + "-fx-border-color: #6dfff3;" +
                "-fx-background-color: rgba(255,255,255,0.4)");
        GridPane.setConstraints(achievements, 0, 0);

        /**
         * Label for polar badges
         */
        Label polarLabel = new Label("POLAR");
        polarLabel.setFont(Font.font("Amble CN", FontWeight.BOLD, 20));
        /**
         * Polar score badges.
         */
        HBox polarHbox = AchievementsPolar.getPolarBox();
        polarHbox.setSpacing(1);
        /**
         * Label for food badges.
         */
        Label foodLabel = new Label("FOOD");
        foodLabel.setFont(Font.font("Amble CN", FontWeight.BOLD, 20));
        /**
         * Food score badges.
         */
        HBox foodHbox = AchievementsFood.getFoodBox();

        /**
         * transport score badges
         */
        HBox transportHbox = AchievementsTransport.getTransportBox();
        transportHbox.setSpacing(1);

        /**
         * transport score badges
         */
        HBox electricityHbox = AchievementsElectricity.getElectricityBox();
        electricityHbox.setSpacing(1);

        /**
         * Label for transport badges
         */
        Label transportLabel = new Label("TRANSPORT");
        transportLabel.setFont(Font.font("Amble CN", FontWeight.BOLD, 20));

        /**
         * Label for electricity badges.
         */
        Label electricityLabel = new Label("ELECTRICITY");
        electricityLabel.setFont(Font.font("Amble CN", FontWeight.BOLD, 20));

        /**
         * Adds all badges in specific Hboxes to Vbox // styling.
         */
        achievements.getChildren().addAll(myAchievements,polarLabel, polarHbox,foodLabel, foodHbox,transportLabel, transportHbox,electricityLabel, electricityHbox);
        grid.getChildren().setAll(achievements);
        achievements.setAlignment(Pos.CENTER);
        grid.setMinWidth(1500);
        grid.setStyle("-fx-font-size: 18pt; -fx-padding: 10px;");

    }
}


