package client;

import classes.*;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseButton;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;

import java.util.List;


public class Leaderboard {
    static TableView Table = new TableView();


    public static void showOptions(GridPane grid, Scene scene, User user, Stage window) {

        //CLEARING THE GRID FROM PREVIOUS ADDITIONS
        grid.getChildren().clear();

        //Creating Labels for addition
        Label Header = new Label("Leaderboard");
        Header.setFont(Font.font("Amble CN", FontWeight.BOLD, 30));
        Button backButton = new Button("Back");


        //Making of Vboxes and Hboxes in order to show the tables on screen
        VBox Vbox1 = new VBox(Header, Table);
        Vbox1.setStyle("-fx-padding:15;");
        Vbox1.setSpacing(20);
        Vbox1.setAlignment(Pos.CENTER);
        //ADDING THE COLLUMNS TO THE TABLES
        TableColumn Col1 = new TableColumn("Username");
        Col1.setCellValueFactory(new PropertyValueFactory<>("Username"));
        TableColumn Col2 = new TableColumn("Score");
        Col2.setCellValueFactory(new PropertyValueFactory<>("PolarScore"));


        Table.getColumns().setAll(Col1, Col2);
        Col1.setMinWidth(734);
        Col2.setMinWidth(734);
        //backButton
        backButton.setOnAction(e -> {
            Home.showHome(window, user);
        });


        //Lastly creating 2 different
        //Hboxes so we can add everything to the grid

        HBox toplayer = new HBox();
        HBox middleLayer = new HBox();
        toplayer.getChildren().addAll(Vbox1);
        middleLayer.getChildren().addAll(backButton);
        GridPane.setConstraints(toplayer, 5, 0);
        GridPane.setConstraints(middleLayer, 5, 30);
        toplayer.setAlignment(Pos.CENTER);
        middleLayer.setAlignment(Pos.CENTER);
        grid.getChildren().addAll(toplayer, middleLayer);

        grid.setMinWidth(1500);
        grid.setStyle("-fx-font-size: 18pt; -fx-padding: 10px;");

        Table.setItems(addFriend());


    }

    public static ObservableList<User> addFriend() {
        ObservableList<User> name = FXCollections.observableArrayList();
        List<User> nameList = new Controller().get10Users();

        for (User a : nameList) {
            name.add(a);
        }
        return name;
    }


}







