package client;

import classes.Activity;
import classes.Controller;
import classes.User;
import classes.UserBadge;
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
import javafx.stage.Stage;

import java.util.List;


public class Leaderboard {

    static TableView table = new TableView();


    public static void showOptions(GridPane grid, User user, Label polarscore, Stage window) {

        String icon = UserBadge.getIcon();

        Label myLeaderboard = new Label("Leaderboard");
        myLeaderboard.setFont(Font.font("Amble CN", FontWeight.BOLD, 30));
        VBox Leaderboard = new VBox(myLeaderboard, table);
        Leaderboard.setStyle("-fx-padding: 15;");
        Leaderboard.setSpacing(20);
        Leaderboard.setAlignment(Pos.CENTER);

        TableColumn Col1 = new TableColumn("User");
        Col1.setCellValueFactory(new PropertyValueFactory<>("user"));
        TableColumn Col2 = new TableColumn("PolarScore");
        Col2.setCellValueFactory(new PropertyValueFactory<>("polarscore"));
        Col1.setMinWidth(750);
        Col2.setMinWidth(750);


        table.setItems(addItems());
        table.getColumns().setAll(Col1, Col2);

        VBox UserOptions = new VBox();
        VBox ScoreOptions = new VBox();

        UserOptions.setStyle("-fx-padding: 15;");
        ScoreOptions.setStyle("-fx-padding: 15;");
        GridPane.setConstraints(Leaderboard, 0, 1);

        //Add everything to grid
        HBox Hbox = new HBox();
        Hbox.getChildren().addAll(UserOptions, ScoreOptions);
        GridPane.setConstraints(Hbox, 0, 0);
        grid.getChildren().setAll(Hbox, Leaderboard);
        grid.setMinWidth(1500);
        grid.setStyle("-fx-font-size: 18pt; -fx-padding: 10px;");
        UserOptions.setMinWidth(750);
        ScoreOptions.setMinWidth(750);
    }

  public static ObservableList<User> addItems() {
        ObservableList<User> users = FXCollections.observableArrayList();
        List<User> userList = new Controller().get10Users();
        for (User a : userList) {
            users.add(a);
        }
        return users;
    }
}







