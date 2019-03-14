package client;

import classes.RestfulClient;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.image.ImageView;
import javafx.scene.layout.*;
import javafx.scene.control.Label;
import javafx.stage.Stage;


public class FootPrint {

    public static void showOptions(GridPane grid, Scene scene) {

       // window.setTitle("My Footprint");
        Label FoodLabel = new Label("Food Footprint ");
        Label WaterLabel= new Label ("Water Footprint");
        Label TransportLabel = new Label("Transport Footprint");
        VBox FoodOptions= new VBox();
        VBox TransportOptions= new VBox();
        VBox WaterOptions= new VBox();
        FoodOptions.setStyle("-fx-padding: 15;");
        TransportOptions.setStyle("-fx-padding: 15;");
        WaterOptions.setStyle("-fx-padding: 15;");
        GridPane.setConstraints(FoodOptions,2,2);
        GridPane.setConstraints(TransportOptions,4,2);
        GridPane.setConstraints(WaterOptions,6,2);
        //My Food footprint
        Button Food = new Button("+");
      //  GridPane.setConstraints(Food, 4, 1);
        Food.setOnAction(e -> {
            classes.Meal food = addItemBox.addMeal("Food Footprint", "Select the meal type you wish to add.");

        });

        //My Transport footprint
        Button Transport = new Button("+");
      // GridPane.setConstraints(Transport, 5, 1);
        Transport.setOnAction(e -> {
            AlertBox.display("This is an error message", "To Be Implemented");
        });

        //My Water footprint
        Button Water = new Button("+");
   //     GridPane.setConstraints(Water, 6, 1);
        Water.setOnAction(e -> {
            AlertBox.display("This is an error message", "To Be Implemented");
        });

        Label Welcome = new Label("Welcome to your Footprint page!");

        ImageView img= new ImageView("https://drive.google.com/uc?id=12Bowa9WczV-WVRlgH-zsZcdcSQyMa2nn");
        img.setStyle("-fx-pref-width: 350; -fx-pref-height: 350; -fx-padding: 25");

        //Add everything to grid
        FoodOptions.getChildren().addAll(  FoodLabel,Food);
        TransportOptions.getChildren().addAll(TransportLabel,Transport);
        WaterOptions.getChildren().addAll(WaterLabel,Water);


        grid.getChildren().addAll(FoodOptions,TransportOptions,WaterOptions);

      //  Scene scene = new Scene(bp, 1920, 1080);

        Food.setStyle("-fx-background-radius: 100;-fx-font-size: 42");
        Transport.setStyle("-fx-background-radius: 100; -fx-font-size: 42");
       // quitButton.setStyle("-fx-pref-width: 400;-fx-pref-height: 70;-fx-font-size: 42");
        Water.setStyle("-fx-background-radius: 100;-fx-font-size: 42");
        grid.setMinWidth(600);
        grid.setStyle("-fx-font-size: 18pt; -fx-padding: 10px;");
        Welcome.setStyle("-fx-padding: 20,0,0,0; -fx-alignment: center; -fx-font-size: 30");
       FoodOptions.setMinWidth(476);
       WaterOptions.setMinWidth(476);
        TransportOptions.setMinWidth(476);
        // window.setScene(scene);
       // window.setMaximized(true);
       // window.show();

    }
}







