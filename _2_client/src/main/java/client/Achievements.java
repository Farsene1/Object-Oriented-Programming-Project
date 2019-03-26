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

        int polarUnlock = 10;

        Label myAchievements = new Label("My Achievements!");
        myAchievements.setFont(Font.font("Amble CN", FontWeight.BOLD, 30));
        VBox achievements = new VBox(myAchievements);
        achievements.setStyle("-fx-padding: 5;");
        achievements.setSpacing(10);
        achievements.setAlignment(Pos.CENTER);

        /**
         * Polar score badges
         */
        HBox polarHbox = new HBox();
        polarHbox.setSpacing(1);
        polarHbox.setStyle("-fx-padding: 1;" + "-fx-border-style: solid inside;"
                + "-fx-border-width: 5;" + "-fx-border-insets: 5;"
                + "-fx-border-radius: 5;" + "-fx-border-color: #6dfff3;");

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

        VBox polar_1 = new VBox(polarBadge_1);
        VBox polar_2 = new VBox(polarBadge_2);
        VBox polar_3 = new VBox(polarBadge_3);
        VBox polar_4 = new VBox(polarBadge_4);
        VBox polar_5 = new VBox(polarBadge_5);
        VBox polar_6 = new VBox(polarBadge_6);
        VBox polar_7 = new VBox(polarBadge_7);
        VBox polar_8 = new VBox(polarBadge_8);
        VBox polar_9 = new VBox(polarBadge_9);
        VBox polar_10 = new VBox(polarBadge_10);
        polarHbox.getChildren().addAll(polar_1, polar_2, polar_3, polar_4, polar_5, polar_6, polar_7, polar_8, polar_9, polar_10);
        GridPane.setConstraints(polarHbox, 1, 2);


        /**
         * Food score badges
         */
        HBox foodHbox = new HBox();
        foodHbox.setSpacing(1);
        foodHbox.setStyle("-fx-padding: 1;" + "-fx-border-style: solid inside;"
                + "-fx-border-width: 5;" + "-fx-border-insets: 5;"
                + "-fx-border-radius: 5;" + "-fx-border-color: #44ff8e;");

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

        VBox food_1 = new VBox(foodBadge_1);
        VBox food_2 = new VBox(foodBadge_2);
        VBox food_3 = new VBox(foodBadge_3);
        VBox food_4 = new VBox(foodBadge_4);
        VBox food_5 = new VBox(foodBadge_5);
        VBox food_6 = new VBox(foodBadge_6);
        VBox food_7 = new VBox(foodBadge_7);
        VBox food_8 = new VBox(foodBadge_8);
        VBox food_9 = new VBox(foodBadge_9);
        VBox food_10 = new VBox(foodBadge_10);
        foodHbox.getChildren().addAll(food_1, food_2, food_3, food_4, food_5, food_6, food_7, food_8, food_9, food_10);
        GridPane.setConstraints(foodHbox, 1, 3);



        grid.getChildren().addAll(achievements, polarHbox, foodHbox);

        grid.setMinWidth(1500);
        grid.setStyle("-fx-font-size: 18pt; -fx-padding: 10px;");

    }
}


