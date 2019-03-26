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
        myAchievements.setFont(Font.font("Amble CN", FontWeight.BOLD, 30));
        VBox achievements = new VBox(myAchievements);
        achievements.setStyle("-fx-padding: 15;");
        achievements.setSpacing(20);
        achievements.setAlignment(Pos.CENTER);

        HBox polarHbox = new HBox();
        polarHbox.setSpacing(5);
        polarHbox.setStyle("-fx-padding: 2;" + "-fx-border-style: solid inside;"
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

        CSSbadge.setPolar1(polarBadge_1, polarUnlock);
        CSSbadge.setPolar2(polarBadge_2, polarUnlock);
        CSSbadge.setPolar3(polarBadge_3, polarUnlock);
        CSSbadge.setPolar4(polarBadge_4, polarUnlock);
        CSSbadge.setPolar5(polarBadge_5, polarUnlock);
        CSSbadge.setPolar6(polarBadge_6, polarUnlock);
        CSSbadge.setPolar7(polarBadge_7, polarUnlock);
        CSSbadge.setPolar8(polarBadge_8, polarUnlock);
        CSSbadge.setPolar9(polarBadge_9, polarUnlock);
        CSSbadge.setPolar10(polarBadge_10, polarUnlock);

        VBox polarColumn_1 = new VBox(polarBadge_1, polarBadge_6);
        VBox polarColumn_2 = new VBox(polarBadge_2, polarBadge_7);
        VBox polarColumn_3 = new VBox(polarBadge_3, polarBadge_8);
        VBox polarColumn_4 = new VBox(polarBadge_4, polarBadge_9);
        VBox polarColumn_5 = new VBox(polarBadge_5, polarBadge_10);

        polarHbox.getChildren().addAll(polarColumn_1, polarColumn_2, polarColumn_3, polarColumn_4, polarColumn_5);
        GridPane.setConstraints(polarHbox, 1, 2);





        HBox foodHbox = new HBox();
        foodHbox.setSpacing(5);
        foodHbox.setStyle("-fx-padding: 2;" + "-fx-border-style: solid inside;"
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

        CSSbadge.setPolar1(foodBadge_1, polarUnlock);
        CSSbadge.setPolar2(foodBadge_2, polarUnlock);
        CSSbadge.setPolar3(foodBadge_3, polarUnlock);
        CSSbadge.setPolar4(foodBadge_4, polarUnlock);
        CSSbadge.setPolar5(foodBadge_5, polarUnlock);
        CSSbadge.setPolar6(foodBadge_6, polarUnlock);
        CSSbadge.setPolar7(foodBadge_7, polarUnlock);
        CSSbadge.setPolar8(foodBadge_8, polarUnlock);
        CSSbadge.setPolar9(foodBadge_9, polarUnlock);
        CSSbadge.setPolar10(foodBadge_10, polarUnlock);

        VBox foodColumn_1 = new VBox(foodBadge_1, foodBadge_6);
        VBox foodColumn_2 = new VBox(foodBadge_2, foodBadge_7);
        VBox foodColumn_3 = new VBox(foodBadge_3, foodBadge_8);
        VBox foodColumn_4 = new VBox(foodBadge_4, foodBadge_9);
        VBox foodColumn_5 = new VBox(foodBadge_5, foodBadge_10);
        foodHbox.getChildren().addAll(foodColumn_1, foodColumn_2, foodColumn_3, foodColumn_4, foodColumn_5);
        GridPane.setConstraints(foodHbox, 1, 3);


        grid.getChildren().addAll(achievements, polarHbox, foodHbox);

        grid.setMinWidth(1500);
        grid.setStyle("-fx-font-size: 18pt; -fx-padding: 10px;");

    }
}


