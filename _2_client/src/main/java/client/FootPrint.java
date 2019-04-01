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
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;

import java.io.File;
import java.util.List;


public class FootPrint {

    /**
     * Initialise table.
     */
    static TableView table = new TableView();


    public static void showOptions(GridPane grid, User user, Label polarscore, Stage window) {

        /**
         * Gets user specific badge.
         */
        String icon = UserBadge.getIcon();

        /**
         * Labels / Vbox added and styling.
         */
        Label myFootprint = new Label("My Activities!");
        myFootprint.setFont(Font.font("Amble CN", FontWeight.BOLD, 30));
        VBox Footprint = new VBox(myFootprint, table);
        Footprint.setStyle("-fx-padding: 15;");
        Footprint.setSpacing(20);
        Footprint.setAlignment(Pos.CENTER);

        /**
         * Adds columns to footprint table // simple styling.
         */
        TableColumn Col1 = new TableColumn("Category");
        Col1.setCellValueFactory(new PropertyValueFactory<>("cat"));
        TableColumn Col2 = new TableColumn("Description");
        Col2.setCellValueFactory(new PropertyValueFactory<>("description"));
        TableColumn Col3 = new TableColumn("Footprint");
        Col3.setCellValueFactory(new PropertyValueFactory<>("footprint"));
        TableColumn Col4 = new TableColumn("Date");
        Col4.setCellValueFactory(new PropertyValueFactory<>("date"));
        Col1.setMinWidth(300);
        Col2.setMinWidth(500);
        Col3.setMinWidth(300);
        Col4.setMinWidth(300);

        /**
         * Add items to table
         */
        table.setItems(addItems(user));
        table.getColumns().setAll(Col1, Col2, Col3, Col4);

        /**
         * Footprint type labels.
         */
        Label FoodLabel = new Label("Food Footprint ");
        Label ElectricityLabel = new Label("Electricity Footprint");
        Label TransportLabel = new Label("Transport Footprint");

        /**
         * Initialixe Vboxes for footprint types.
         */
        VBox FoodOptions = new VBox();
        VBox TransportOptions = new VBox();
        VBox ElectricityOptions = new VBox();

        FoodOptions.setStyle("-fx-padding: 15;");
        TransportOptions.setStyle("-fx-padding: 15;");
        ElectricityOptions.setStyle("-fx-padding: 15;");
        //Footprint.setStyle("-fx-padding: 15;");
        GridPane.setConstraints(Footprint, 0, 1);

        /**
         * Button to add food footprints.
         */
        Button Food = new Button("+");
        Food.setOnAction(e -> {
            try{
            FoodBox.addMeal("Food Footprint", "Add to your food footprint from the choices below!", user);
            table.setItems(addItems(user));
            polarscore.setText(user.getPolarScore().toString());
            }
            catch (NullPointerException NPE){

            }
        });

        /**
         * Button to add transport footprints.
         */
        Button Transport = new Button("+");
        // GridPane.setConstraints(Transport, 5, 1);
        Transport.setOnAction(e -> {
            try{
           TransportBox.addVehicle("Transport Footprint", "Select the transport option of your choice", user);
            table.setItems(addItems(user));
            polarscore.setText(user.getPolarScore().toString());
            }
            catch (NullPointerException NPE){

            }
        });

        /**
         * Button to add electricity footprints.
         */
        Button Electricity = new Button("+");
        //     GridPane.setConstraints(Electricity, 6, 1);
        Electricity.setOnAction(e -> {
            try {
               ElectricityBox.addUsage("Electricity Footprint", "Select your electricity usage", user);
                table.setItems(addItems(user));
                polarscore.setText(user.getPolarScore().toString());
            }
            catch (NullPointerException NPE){

            }
        });

        /**
         * Back button to return to home.
         */
        Button backButton = new Button("Back");
        backButton.setOnAction(e->{
            System.out.println("Icon url: "+icon);
            Home.showHome(window, user);
        });

        GridPane.setConstraints(backButton,1,10);

        /**
         * Adding everything to the grid.
         */
        FoodOptions.getChildren().addAll(FoodLabel, Food);
        TransportOptions.getChildren().addAll(TransportLabel, Transport);
        ElectricityOptions.getChildren().addAll(ElectricityLabel, Electricity);
        HBox Hbox = new HBox();
        Hbox.getChildren().addAll(FoodOptions, TransportOptions, ElectricityOptions);
        GridPane.setConstraints(Hbox, 0, 0);
        grid.getChildren().setAll(Hbox, Footprint,backButton);

        /**
         * Simple styling.
         */
        Food.setStyle("-fx-background-radius: 100;-fx-font-size: 42");
        Transport.setStyle("-fx-background-radius: 100; -fx-font-size: 42");
        // quitButton.setStyle("-fx-pref-width: 400;-fx-pref-height: 70;-fx-font-size: 42");
        Electricity.setStyle("-fx-background-radius: 100;-fx-font-size: 42");
        grid.setMinWidth(1500);
        table.setMaxHeight(770);
        table.setMinHeight(770);
        grid.setStyle("-fx-font-size: 18pt; -fx-padding: 10px;");
        FoodOptions.setMinWidth(476);
        ElectricityOptions.setMinWidth(476);
        TransportOptions.setMinWidth(476);


        CSSTable.styleTable(table);
    }
    /**
     * Adds items to observable list "activities" to be added to database.
     */
    public static ObservableList<Activity> addItems(User user) {
        ObservableList<Activity> activities = FXCollections.observableArrayList();
        List<Activity> act = new Controller().getAllActivities(user);
        for (Activity a : act) {
            activities.add(a);
        }
        return activities;
    }
}







