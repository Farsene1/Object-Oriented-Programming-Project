package client;

import javafx.stage.*;
import javafx.scene.*;
import javafx.scene.layout.*;
import javafx.scene.control.*;
import javafx.geometry.*;

public class addItemBox {

    static String foodAdded = "";

    public static classes.Meal addMeal(String title, String message) {


        Stage window = new Stage();
        window.initModality(Modality.APPLICATION_MODAL);
        window.setTitle(title);
        window.setMinWidth(500);
        Label label = new Label();
        label.setText(message);

        //Create three buttons
        Button veganButton = new Button("Vegan meal");
        Button vegetarianButton = new Button("Vegetarian meal");
        Button meatButton = new Button("Meal with meat");

        //Clicking will set answer and close window
        veganButton.setOnAction(e -> {
            foodAdded = "vegan";
            window.close();
        });
        vegetarianButton.setOnAction(e -> {
            foodAdded = "vegetarian";
            window.close();
        });
        meatButton.setOnAction(e -> {
            foodAdded = "meat";
            window.close();
        });

        VBox layout = new VBox(10);

        //Add buttons
        layout.getChildren().addAll(label, veganButton, vegetarianButton, meatButton);
        layout.setAlignment(Pos.CENTER);
        Scene scene = new Scene(layout);
        window.setScene(scene);
        window.showAndWait();

        //Make sure to return answer
        return new classes.Meal(foodAdded,"Food");
    }

}
