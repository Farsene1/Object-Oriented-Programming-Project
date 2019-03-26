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

        Label myAchievements = new Label("My Achievements!");
        myAchievements.setFont(Font.font("Amble CN", FontWeight.BOLD, 30));
        VBox achievements = new VBox(myAchievements);
        achievements.setStyle("-fx-padding: 15;");
        achievements.setSpacing(20);
        achievements.setAlignment(Pos.CENTER);

        HBox Hbox = new HBox();
        Hbox.setSpacing(10);
        Hbox.setStyle("-fx-padding: 10;" + "-fx-border-style: solid inside;"
                + "-fx-border-width: 7;" + "-fx-border-insets: 5;"
                + "-fx-border-radius: 5;" + "-fx-border-color: blue;");
        
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

        CSSbadge.setPolar1(polarBadge_1, false);
        CSSbadge.setPolar2(polarBadge_2, false);
        CSSbadge.setPolar3(polarBadge_3, false);
        CSSbadge.setPolar4(polarBadge_4, false);
        CSSbadge.setPolar5(polarBadge_5, false);
        CSSbadge.setPolar6(polarBadge_6, false);
        CSSbadge.setPolar7(polarBadge_7, false);
        CSSbadge.setPolar8(polarBadge_8, false);
        CSSbadge.setPolar9(polarBadge_9, false);
        CSSbadge.setPolar9(polarBadge_10, false);

        VBox column_1 = new VBox(polarBadge_1, polarBadge_6);
        VBox column_2 = new VBox(polarBadge_2, polarBadge_7);
        VBox column_3 = new VBox(polarBadge_3, polarBadge_8);
        VBox column_4 = new VBox(polarBadge_4, polarBadge_9);
        VBox column_5 = new VBox(polarBadge_5, polarBadge_10);

        Hbox.getChildren().addAll(column_1, column_2, column_3, column_4, column_5);

        GridPane.setConstraints(Hbox, 2, 3);
        grid.getChildren().addAll(Hbox, achievements);

        grid.setMinWidth(1500);
        grid.setStyle("-fx-font-size: 18pt; -fx-padding: 10px;");

    }
}


