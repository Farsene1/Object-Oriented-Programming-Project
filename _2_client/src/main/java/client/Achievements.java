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

        VBox badge_1 = new VBox();
        VBox badge_2 = new VBox();
        VBox badge_3 = new VBox();
        VBox badge_4 = new VBox();
        VBox badge_5 = new VBox();
        VBox badge_6 = new VBox();
        VBox badge_7 = new VBox();
        VBox badge_8 = new VBox();
        VBox badge_9 = new VBox();
        VBox badge_10 = new VBox();

        //Add everything to grid
        HBox Hbox = new HBox();
        GridPane.setConstraints(Hbox, 0, 0);
        grid.getChildren().addAll(achievements,
                badge_1, badge_2,
                badge_3, badge_4,
                badge_5, badge_6,
                badge_7, badge_8,
                badge_9, badge_10);

        grid.setMinWidth(1500);
        grid.setStyle("-fx-font-size: 18pt; -fx-padding: 10px;");

    }
}


