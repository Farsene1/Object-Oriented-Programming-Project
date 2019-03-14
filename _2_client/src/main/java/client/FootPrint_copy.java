package client;

import classes.RestfulClient;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;


public class FootPrint_copy {

    public static void showOptions(Stage window) {
        RestfulClient restfulClient = new RestfulClient();
        restfulClient.getEntity();
        window.setTitle("My Footprint");

        BorderPane bp= new BorderPane();
        VBox optionsMenu = new VBox();

        //Quit
        Button quitButton = new Button("Home");
        GridPane.setConstraints(quitButton, 0, 4);
        quitButton.setOnAction(e -> {
            boolean result = ConfirmBox.display("Confirm", "Return back to home page?");
            if (result) {
                Home.showHome(window);
            }

        });
        //My Food footprint
        Button Food = new Button("Add a meal!");
        GridPane.setConstraints(Food, 1, 0);
        Food.setOnAction(e -> {
            String food = addItemBox.addMeal("Food Footprint", "Select the meal type you wish to add.");
        });

        //My Transport footprint
        Button Transport = new Button("Add a journey!");
        GridPane.setConstraints(Transport, 2, 0);
        Transport.setOnAction(e -> {
            AlertBox.display("This is an error message", "To Be Implemented");
        });

        //My Food footprint
        Button Water = new Button("Add water use!");
        GridPane.setConstraints(Water, 3, 0);
        Water.setOnAction(e -> {
            AlertBox.display("This is an error message", "To Be Implemented");
        });

        Label Welcome = new Label("Welcome to your Footprint page!");

        ImageView img= new ImageView("https://drive.google.com/uc?id=12Bowa9WczV-WVRlgH-zsZcdcSQyMa2nn");
        img.setStyle("-fx-pref-width: 350; -fx-pref-height: 350; -fx-padding: 25");

        //Add everything to grid
        optionsMenu.getChildren().addAll(Welcome, img, Food, Transport, Water, quitButton);
        bp.setCenter(optionsMenu);
        bp.setStyle("-fx-background-image: url('https://drive.google.com/uc?id=1lK9HHEu9G4_wDKNQuy0B7nrianqprK4r');");
        Scene scene = new Scene(bp, 1920, 1080);

        Food.setStyle("-fx-pref-width: 400;-fx-pref-height: 70;-fx-font-size: 42");
        Transport.setStyle("-fx-pref-width: 400;-fx-pref-height: 70;-fx-font-size: 42");
        quitButton.setStyle("-fx-pref-width: 400;-fx-pref-height: 70;-fx-font-size: 42");
        Water.setStyle("-fx-pref-width: 400;-fx-pref-height: 70;-fx-font-size: 42");
        optionsMenu.setMinWidth(400);
        optionsMenu.setStyle("-fx-font-size: 18pt; -fx-padding: 10px;");
        Welcome.setStyle("-fx-padding: 20,0,0,0; -fx-alignment: center; -fx-font-size: 30");
        window.setScene(scene);
        window.setMaximized(true);
        window.show();

    }
}







