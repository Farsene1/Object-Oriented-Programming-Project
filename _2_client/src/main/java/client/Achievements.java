package client;

import classes.Activity;
import classes.Controller;
import classes.User;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.control.TableView;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import classes.Activity;
import classes.Controller;
import classes.User;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;

import java.util.List;

public class Achievements {

    public static void showBadges(GridPane grid, Scene scene, User user) {

        int polarUnlock = 7;

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

        CSSbadge2.setPolar1(polarBadge_1, polarUnlock);
        CSSbadge2.setPolar2(polarBadge_2, polarUnlock);
        CSSbadge2.setPolar3(polarBadge_3, polarUnlock);
        CSSbadge2.setPolar4(polarBadge_4, polarUnlock);
        CSSbadge2.setPolar5(polarBadge_5, polarUnlock);
        CSSbadge2.setPolar6(polarBadge_6, polarUnlock);
        CSSbadge2.setPolar7(polarBadge_7, polarUnlock);
        CSSbadge2.setPolar8(polarBadge_8, polarUnlock);
        CSSbadge2.setPolar9(polarBadge_9, polarUnlock);
        CSSbadge2.setPolar10(polarBadge_10, polarUnlock);

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

        CSSbadge2.setPolar1(foodBadge_1, polarUnlock);
        CSSbadge2.setPolar2(foodBadge_2, polarUnlock);
        CSSbadge2.setPolar3(foodBadge_3, polarUnlock);
        CSSbadge2.setPolar4(foodBadge_4, polarUnlock);
        CSSbadge2.setPolar5(foodBadge_5, polarUnlock);
        CSSbadge2.setPolar6(foodBadge_6, polarUnlock);
        CSSbadge2.setPolar7(foodBadge_7, polarUnlock);
        CSSbadge2.setPolar8(foodBadge_8, polarUnlock);
        CSSbadge2.setPolar9(foodBadge_9, polarUnlock);
        CSSbadge2.setPolar10(foodBadge_10, polarUnlock);

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

        CSSbadge2.setPolar1(transportBadge_1, polarUnlock);
        CSSbadge2.setPolar2(transportBadge_2, polarUnlock);
        CSSbadge2.setPolar3(transportBadge_3, polarUnlock);
        CSSbadge2.setPolar4(transportBadge_4, polarUnlock);
        CSSbadge2.setPolar5(transportBadge_5, polarUnlock);
        CSSbadge2.setPolar6(transportBadge_6, polarUnlock);
        CSSbadge2.setPolar7(transportBadge_7, polarUnlock);
        CSSbadge2.setPolar8(transportBadge_8, polarUnlock);
        CSSbadge2.setPolar9(transportBadge_9, polarUnlock);
        CSSbadge2.setPolar10(transportBadge_10, polarUnlock);

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

        CSSbadge2.setPolar1(electricityBadge_1, polarUnlock);
        CSSbadge2.setPolar2(electricityBadge_2, polarUnlock);
        CSSbadge2.setPolar3(electricityBadge_3, polarUnlock);
        CSSbadge2.setPolar4(electricityBadge_4, polarUnlock);
        CSSbadge2.setPolar5(electricityBadge_5, polarUnlock);
        CSSbadge2.setPolar6(electricityBadge_6, polarUnlock);
        CSSbadge2.setPolar7(electricityBadge_7, polarUnlock);
        CSSbadge2.setPolar8(electricityBadge_8, polarUnlock);
        CSSbadge2.setPolar9(electricityBadge_9, polarUnlock);
        CSSbadge2.setPolar10(electricityBadge_10, polarUnlock);

        Label electricityLabel = new Label("ELECTRICITY");
        electricityLabel.setFont(Font.font("Amble CN", FontWeight.BOLD, 20));

        electricityHbox.getChildren().addAll(electricityBadge_1, electricityBadge_2, electricityBadge_3, electricityBadge_4, electricityBadge_5,
                electricityBadge_6, electricityBadge_7, electricityBadge_8, electricityBadge_9, electricityBadge_10);

        achievements.getChildren().addAll(myAchievements,polarLabel, polarHbox,foodLabel, foodHbox,transportLabel, transportHbox,electricityLabel, electricityHbox);

        grid.getChildren().addAll(achievements);
        achievements.setAlignment(Pos.CENTER);

        grid.setMinWidth(1500);
        grid.setStyle("-fx-font-size: 18pt; -fx-padding: 10px;");

    }
}


