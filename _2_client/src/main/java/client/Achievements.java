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
                + "-fx-border-width: 2;" + "-fx-border-insets: 5;"
                + "-fx-border-radius: 5;" + "-fx-border-color: blue;");

        Button badge_1 = new Button("1");
        Button badge_2 = new Button("2");
        Button badge_3 = new Button("3");
        Button badge_4 = new Button("4");
        Button badge_5 = new Button("5");
        Button badge_6 = new Button("6");
        Button badge_7 = new Button("7");
        Button badge_8 = new Button("8");
        Button badge_9 = new Button("9");
        Button badge_10 = new Button("10");

        Hbox.getChildren().addAll(badge_1, badge_2,
                badge_3, badge_4,
                badge_5, badge_6,
                badge_7, badge_8,
                badge_9, badge_10);


        GridPane.setConstraints(Hbox, 3, 2);
        grid.getChildren().addAll(Hbox, achievements);

        grid.setMinWidth(1500);
        grid.setStyle("-fx-font-size: 18pt; -fx-padding: 10px;");

    }
}


