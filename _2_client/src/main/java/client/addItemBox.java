package client;

import classes.Activity;
import classes.Controller;
import classes.User;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Modality;
import javafx.stage.Stage;

public class addItemBox {

    static String foodAdded = "";

    public static classes.Meal addMeal(String title, String message, User user) {


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
            // hardcoded - add 200 points for vegan
            new Controller().sendMeal(user, 200);
            // add a meal in the database
            Activity activity = new Activity(user.getUsername(),1,"vegan",
                    200, "");
            new Controller().sendFood(activity);
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
        return new classes.Meal("Food", foodAdded);
    }

}
