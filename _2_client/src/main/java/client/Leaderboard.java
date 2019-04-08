package client;

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

import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;
import jfxtras.styles.jmetro8.JMetro;

import java.util.List;

/**
 * LeaderBoard class.
 */
public class Leaderboard {
    /**
     * Variable table view.
     */
    static TableView tableL = new TableView();

    /**
     * Show options method for leaderboards.
     *
     * @param grid   paramter grid.
     * @param scene  parameter scene
     * @param user   user parameter.
     * @param window window parameter.
     */
    public static void showOptions(
            final GridPane grid, final Scene scene, final User user, final Stage window) {
        new JMetro(JMetro.Style.LIGHT).applyTheme(tableL);
        //CLEARING THE GRID FROM PREVIOUS ADDITIONS
        grid.getChildren().clear();

        //Creating Labels for addition
        Label header = new Label("Leaderboard");
        header.setFont(Font.font("Amble CN", FontWeight.BOLD, 40));
        header.setTextFill(Color.web("#0076a3"));


        //Making of Vboxes and Hboxes in order to show the tables on screen
        VBox vbox1 = new VBox(header, tableL);
        vbox1.setStyle("-fx-padding:15;");
        vbox1.setSpacing(20);
        vbox1.setAlignment(Pos.CENTER);
        //ADDING THE COLLUMNS TO THE TABLES
        TableColumn col1 = new TableColumn("Username");
        col1.setCellValueFactory(new PropertyValueFactory<>("Username"));
        TableColumn col2 = new TableColumn("Score");
        col2.setCellValueFactory(new PropertyValueFactory<>("PolarScore"));


        tableL.getColumns().setAll(col1, col2);
        col1.setMinWidth(734);
        col2.setMinWidth(734);


        grid.getChildren().addAll(vbox1);
        grid.setMinWidth(1500);
        grid.setStyle("-fx-font-size: 18pt; -fx-padding: 10px;");

        tableL.setItems(addFriend());
    }

    /**
     * Adds users to the leaderboard table.
     *
     * @return returns a list.
     */
    public static ObservableList<User> addFriend() {
        ObservableList<User> name = FXCollections.observableArrayList();
        List<User> nameList = new Controller().get10Users();

        for (User a : nameList) {
            name.add(a);
        }
        return name;
    }


}







