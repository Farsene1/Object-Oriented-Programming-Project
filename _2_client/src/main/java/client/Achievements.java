package client;

import classes.Badges;
import classes.Controller;
import classes.User;
import classes.UserBadge;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;

public class Achievements {

   static private boolean unlocked = false;

    public static void showBadges(GridPane grid, User user, Stage window) {

        /**
         * Calls method to unlock polar badges, sets unlock value for CSS.
         */
        int polarUnlock = Badges.polarUnlock(user);

        /**
         * Calls method to unlock food badges, sets unlock value for CSS.
         */
        int foodUnlock = Badges.foodUnlock(user);

        /**
         * Calls method to unlock transport badges, sets unlock value for CSS.
         */
        int transportUnlock = Badges.transportUnlock(user);

        /**
         * Calls method to unlock electricity badges, sets unlock value for CSS.
         */
        int electricityUnlock = Badges.electricityUnlock(user);

        Label myAchievements = new Label("My Achievements!");
        myAchievements.setFont(Font.font("Amble CN", FontWeight.BOLD, 35));
        VBox achievements = new VBox();
        achievements.setStyle("-fx-padding: 5;");
        achievements.setSpacing(10);
        achievements.setAlignment(Pos.CENTER);
        GridPane.setConstraints(achievements, 0, 0);

        /**
         * Polar score badges
         */
        HBox polarHbox = new HBox();
        polarHbox.setSpacing(1);
        achievements.setStyle("-fx-padding: 1;" + "-fx-border-style: solid inside;"
                + "-fx-border-width: 5;" + "-fx-border-insets: 5;"
                + "-fx-border-radius: 5;" + "-fx-border-color: #6dfff3;" +
                "-fx-background-color: rgba(255,255,255,0.4)");


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

        CSSpolarBadge.setPolar1(polarBadge_1, polarUnlock);
        CSSpolarBadge.setPolar2(polarBadge_2, polarUnlock);
        CSSpolarBadge.setPolar3(polarBadge_3, polarUnlock);
        CSSpolarBadge.setPolar4(polarBadge_4, polarUnlock);
        CSSpolarBadge.setPolar5(polarBadge_5, polarUnlock);
        CSSpolarBadge.setPolar6(polarBadge_6, polarUnlock);
        CSSpolarBadge.setPolar7(polarBadge_7, polarUnlock);
        CSSpolarBadge.setPolar8(polarBadge_8, polarUnlock);
        CSSpolarBadge.setPolar9(polarBadge_9, polarUnlock);
        CSSpolarBadge.setPolar10(polarBadge_10, polarUnlock);

        /**
         * Selecting unlocked or locked polar score badges
         */
        polarBadge_1.setOnAction(e -> {
            unlocked = CSSpolarBadge.setPolar1(polarBadge_1, polarUnlock);
            if (unlocked == true) {
                new Controller().sendBadge(user, 1);
                String icon = classes.UserBadge.iconChoice(user);
                Home.showHome(window, user);
            }
        });
        polarBadge_2.setOnAction(e -> {
            unlocked = CSSpolarBadge.setPolar2(polarBadge_2, polarUnlock);
            if (unlocked == true) {
                new Controller().sendBadge(user, 2);
                String icon = classes.UserBadge.iconChoice(user);
                Home.showHome(window, user);
            }
            if (unlocked == false) {
                AlertBox.display("This is an error message", "You still have to unlock badge 2!");
            }
        });
        polarBadge_3.setOnAction(e -> {
            unlocked = CSSpolarBadge.setPolar3(polarBadge_3, polarUnlock);
            if (unlocked == true) {
                new Controller().sendBadge(user, 3);
                String icon = classes.UserBadge.iconChoice(user);
                Home.showHome(window, user);
            }
            if (unlocked == false) {
                AlertBox.display("This is an error message", "You still have to unlock badge 3!");
            }
        });
        polarBadge_4.setOnAction(e -> {
            unlocked = CSSpolarBadge.setPolar4(polarBadge_4, polarUnlock);
            if (unlocked == true) {
                new Controller().sendBadge(user, 4);
                String icon = classes.UserBadge.iconChoice(user);
                Home.showHome(window, user);
            }
            if (unlocked == false) {
                AlertBox.display("Hold up!", "You still have to unlock badge 4!");
            }
        });
        polarBadge_5.setOnAction(e -> {
            unlocked = CSSpolarBadge.setPolar5(polarBadge_5, polarUnlock);
            if (unlocked == true) {
                new Controller().sendBadge(user, 5);
                String icon = classes.UserBadge.iconChoice(user);
                Home.showHome(window, user);
            }
            if (unlocked == false) {
                AlertBox.display("Hold up!", "You still have to unlock badge 5!");
            }
        });
        polarBadge_6.setOnAction(e -> {
            unlocked = CSSpolarBadge.setPolar6(polarBadge_6, polarUnlock);
            if (unlocked == true) {
                new Controller().sendBadge(user, 6);
                String icon = classes.UserBadge.iconChoice(user);
                Home.showHome(window, user);
            }
            if (unlocked == false) {
                AlertBox.display("Hold up!", "You still have to unlock badge 6!");
            }
        });
        polarBadge_7.setOnAction(e -> {
            unlocked = CSSpolarBadge.setPolar7(polarBadge_7, polarUnlock);
            if (unlocked == true) {
                new Controller().sendBadge(user, 7);
                String icon = classes.UserBadge.iconChoice(user);
                Home.showHome(window, user);
            }
            if (unlocked == false) {
                AlertBox.display("Hold up!", "You still have to unlock badge 7!");
            }
        });
        polarBadge_8.setOnAction(e -> {
            unlocked = CSSpolarBadge.setPolar8(polarBadge_8, polarUnlock);
            if (unlocked == true) {
                new Controller().sendBadge(user, 8);
                String icon = classes.UserBadge.iconChoice(user);
                Home.showHome(window, user);
            }
            if (unlocked == false) {
                AlertBox.display("Hold up!", "You still have to unlock badge 8!");
            }
        });
        polarBadge_9.setOnAction(e -> {
            unlocked = CSSpolarBadge.setPolar9(polarBadge_9, polarUnlock);
            if (unlocked == true) {
                new Controller().sendBadge(user, 9);
                String icon = classes.UserBadge.iconChoice(user);
                Home.showHome(window, user);
            }
            if (unlocked == false) {
                AlertBox.display("Hold up!", "You still have to unlock badge 9!");
            }
        });
        polarBadge_10.setOnAction(e -> {
            unlocked = CSSpolarBadge.setPolar10(polarBadge_10, polarUnlock);
            if (unlocked == true) {
                new Controller().sendBadge(user, 10);
                String icon = classes.UserBadge.iconChoice(user);
                Home.showHome(window, user);
            }
            if (unlocked == false) {
                AlertBox.display("Hold up!", "You still have to unlock badge 10!");
            }
        });


        Label polarLabel = new Label("POLAR");
        polarLabel.setFont(Font.font("Amble CN", FontWeight.BOLD, 20));
        polarHbox.getChildren().addAll(polarBadge_1, polarBadge_2, polarBadge_3, polarBadge_4, polarBadge_5,
                polarBadge_6, polarBadge_7, polarBadge_8, polarBadge_9, polarBadge_10);

        /**
         * Food score badges
         */
        HBox foodHbox = new HBox();

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

        Label foodLabel = new Label("FOOD");
        foodLabel.setFont(Font.font("Amble CN", FontWeight.BOLD, 20));

        foodHbox.getChildren().addAll(foodBadge_1, foodBadge_2, foodBadge_3, foodBadge_4, foodBadge_5,
                foodBadge_6, foodBadge_7, foodBadge_8, foodBadge_9, foodBadge_10);

        /**
         * transport score badges
         */
        HBox transportHbox = new HBox();
        transportHbox.setSpacing(1);

        Button transportBadge_1 = new Button();
        Button transportBadge_2 = new Button();
        Button transportBadge_3 = new Button();
        Button transportBadge_4 = new Button();
        Button transportBadge_5 = new Button();
        Button transportBadge_6 = new Button();
        Button transportBadge_7 = new Button();
        Button transportBadge_8 = new Button();
        Button transportBadge_9 = new Button();
        Button transportBadge_10 = new Button();

        CSStransportBadge.setTransport1(transportBadge_1, transportUnlock);
        CSStransportBadge.setTransport2(transportBadge_2, transportUnlock);
        CSStransportBadge.setTransport3(transportBadge_3, transportUnlock);
        CSStransportBadge.setTransport4(transportBadge_4, transportUnlock);
        CSStransportBadge.setTransport5(transportBadge_5, transportUnlock);
        CSStransportBadge.setTransport6(transportBadge_6, transportUnlock);
        CSStransportBadge.setTransport7(transportBadge_7, transportUnlock);
        CSStransportBadge.setTransport8(transportBadge_8, transportUnlock);
        CSStransportBadge.setTransport9(transportBadge_9, transportUnlock);
        CSStransportBadge.setTransport10(transportBadge_10, transportUnlock);

        Label transportLabel = new Label("TRANSPORT");
        transportLabel.setFont(Font.font("Amble CN", FontWeight.BOLD, 20));

        transportHbox.getChildren().addAll(transportBadge_1, transportBadge_2, transportBadge_3, transportBadge_4, transportBadge_5,
                transportBadge_6, transportBadge_7, transportBadge_8, transportBadge_9, transportBadge_10);



/**
 * electricity score badges
 */
        HBox electricityHbox = new HBox();
        electricityHbox.setSpacing(1);

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

        CSSelectricityBadge.setElectricity1(electricityBadge_1, electricityUnlock);
        CSSelectricityBadge.setElectricity2(electricityBadge_2, electricityUnlock);
        CSSelectricityBadge.setElectricity3(electricityBadge_3, electricityUnlock);
        CSSelectricityBadge.setElectricity4(electricityBadge_4, electricityUnlock);
        CSSelectricityBadge.setElectricity5(electricityBadge_5, electricityUnlock);
        CSSelectricityBadge.setElectricity6(electricityBadge_6, electricityUnlock);
        CSSelectricityBadge.setElectricity7(electricityBadge_7, electricityUnlock);
        CSSelectricityBadge.setElectricity8(electricityBadge_8, electricityUnlock);
        CSSelectricityBadge.setElectricity9(electricityBadge_9, electricityUnlock);
        CSSelectricityBadge.setElectricity10(electricityBadge_10, electricityUnlock);

        Label electricityLabel = new Label("ELECTRICITY");
        electricityLabel.setFont(Font.font("Amble CN", FontWeight.BOLD, 20));

        electricityHbox.getChildren().addAll(electricityBadge_1, electricityBadge_2, electricityBadge_3, electricityBadge_4, electricityBadge_5,
                electricityBadge_6, electricityBadge_7, electricityBadge_8, electricityBadge_9, electricityBadge_10);

        achievements.getChildren().addAll(myAchievements,polarLabel, polarHbox,foodLabel, foodHbox,transportLabel, transportHbox,electricityLabel, electricityHbox);

        grid.getChildren().setAll(achievements);
        achievements.setAlignment(Pos.CENTER);

        grid.setMinWidth(1500);
        grid.setStyle("-fx-font-size: 18pt; -fx-padding: 10px;");

    }
}


