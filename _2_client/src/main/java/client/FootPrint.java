package client;

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
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;

import java.util.List;


public class FootPrint {

    static TableView table = new TableView();

    public static void showOptions(GridPane grid, Scene scene, User user) {
        Label myFootprint = new Label("My Activities!");
        myFootprint.setFont(Font.font("Amble CN", FontWeight.BOLD, 30));
        VBox Footprint = new VBox(myFootprint, table);
        Footprint.setStyle("-fx-padding: 15;");
        Footprint.setSpacing(20);
        Footprint.setAlignment(Pos.CENTER);

        TableColumn Col1 = new TableColumn("Category");
        Col1.setCellValueFactory(new PropertyValueFactory<>("category"));
        TableColumn Col2 = new TableColumn("Description");
        Col2.setCellValueFactory(new PropertyValueFactory<>("description"));
        TableColumn Col3 = new TableColumn("Footprint");
        Col3.setCellValueFactory(new PropertyValueFactory<>("footprint"));
        TableColumn Col4 = new TableColumn("Date");
        Col4.setCellValueFactory(new PropertyValueFactory<>("date"));
        Col1.setMinWidth(200);
        Col2.setMinWidth(200);
        Col3.setMinWidth(200);
        Col4.setMinWidth(200);

        table.setItems(addItems(user));
        table.getColumns().setAll(Col1, Col2, Col3, Col4);

        // window.setTitle("My Footprint");
        Label FoodLabel = new Label("Food Footprint ");
        Label WaterLabel = new Label("Water Footprint");
        Label TransportLabel = new Label("Transport Footprint");

        VBox FoodOptions = new VBox();
        VBox TransportOptions = new VBox();
        VBox WaterOptions = new VBox();

        FoodOptions.setStyle("-fx-padding: 15;");
        TransportOptions.setStyle("-fx-padding: 15;");
        WaterOptions.setStyle("-fx-padding: 15;");
        //Footprint.setStyle("-fx-padding: 15;");
        GridPane.setConstraints(FoodOptions, 2, 2);
        GridPane.setConstraints(TransportOptions, 4, 2);
        GridPane.setConstraints(WaterOptions, 6, 2);
        GridPane.setConstraints(Footprint, 2, 10);

        //My Food footprint
        Button Food = new Button("+");
        Food.setOnAction(e -> {
            classes.Meal food = FoodBox.addMeal("Food Footprint", "Add to your food footprint from the choices below!", user);
            table.setItems(addItems(user));
        });

        //My Transport footprint
        Button Transport = new Button("+");
        // GridPane.setConstraints(Transport, 5, 1);
        Transport.setOnAction(e -> {
            classes.Transport transport = TransportBox.addVehicle("Transport Footprint","Select the transport option of your choice",user);
        });

        //My Water footprint
        Button Water = new Button("+");
        //     GridPane.setConstraints(Water, 6, 1);
        Water.setOnAction(e -> {
            AlertBox.display("This is an error message", "To Be Implemented");
        });
        Label Welcome = new Label("Welcome to your Footprint page!");

        ImageView img = new ImageView("https://drive.google.com/uc?id=12Bowa9WczV-WVRlgH-zsZcdcSQyMa2nn");
        img.setStyle("-fx-pref-width: 350; -fx-pref-height: 350; -fx-padding: 25");

        //Add everything to grid
        FoodOptions.getChildren().addAll(FoodLabel, Food);
        TransportOptions.getChildren().addAll(TransportLabel, Transport);
        WaterOptions.getChildren().addAll(WaterLabel, Water);

        grid.getChildren().addAll(FoodOptions, TransportOptions, WaterOptions, Footprint);

        Food.setStyle("-fx-background-radius: 100;-fx-font-size: 42");
        Transport.setStyle("-fx-background-radius: 100; -fx-font-size: 42");
        // quitButton.setStyle("-fx-pref-width: 400;-fx-pref-height: 70;-fx-font-size: 42");
        Water.setStyle("-fx-background-radius: 100;-fx-font-size: 42");
        grid.setMinWidth(800);
        grid.setStyle("-fx-font-size: 18pt; -fx-padding: 10px;");
        Welcome.setStyle("-fx-padding: 20,0,0,0; -fx-alignment: center; -fx-font-size: 30");
        FoodOptions.setMinWidth(476);
        WaterOptions.setMinWidth(476);
        TransportOptions.setMinWidth(476);
        Footprint.setMinWidth(832);
    }

    public  static ObservableList<Activity> addItems(User user)
    {
        ObservableList<Activity> activities = FXCollections.observableArrayList();
        List<Activity> act= new Controller().getAllActivities(user);
        for (Activity a : act)
        {
            activities.add(a);
        }
        return activities;
    }
}







