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
import javafx.scene.control.ChoiceBox;
import java.util.LinkedList;
import java.util.List;
import javafx.beans.value.ObservableValue;
import javafx.beans.value.ChangeListener;
import javafx.collections.FXCollections;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;


public class addItemBox {

    static String foodAdded = "";

    public static classes.Meal addMeal(String title, String message, User user) {

        Stage window = new Stage();
        window.initModality(Modality.APPLICATION_MODAL);
        window.setTitle(title);
        window.setMinWidth(500);
        Label label = new Label();
        label.setText(message);

      // Label label1 = new Label();

        ChoiceBox<String> dropdown= new ChoiceBox<>();

        dropdown.getItems().addAll("Vegan meal", "Vegetarian meal", "Meal with meat");
        dropdown.getSelectionModel().select(0);

        Button button= new Button("Submit meal");
        button.setOnAction(e -> {
            foodAdded = dropdown.getValue();

            if(foodAdded == "Vegan meal"){
                foodAdded = "vegan";
                LocalDateTime myDateObj = LocalDateTime.now();
                DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("dd-MM-yyyy");
                String date = myDateObj.format(myFormatObj);
                // hardcoded - add 200 points for vegan
                new Controller().sendMeal(user, 500);
                // add a meal in the database
                Activity activity = new Activity(user.getUsername(),1,"vegan",
                        500, date);
                List<Activity> list = new Controller().sendFood(activity);
                System.out.println("\n The items are"+list.toString());
                window.close();
            }
            if(foodAdded == "Vegetarian meal") {
                foodAdded = "vegetarian";
                LocalDateTime myDateObj = LocalDateTime.now();
                DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("dd-MM-yyyy");
                String date = myDateObj.format(myFormatObj);
                new Controller().sendMeal(user, 300);
                // add a meal in the database
                Activity activity = new Activity(user.getUsername(), 1, "vegetarian",
                        300, date);
                List<Activity> list = new Controller().sendFood(activity);
                window.close();
            }
            if(foodAdded == "Meal with meat") {
                foodAdded = "meat";
                LocalDateTime myDateObj = LocalDateTime.now();
                DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("dd-MM-yyyy");
                String date = myDateObj.format(myFormatObj);
                new Controller().sendMeal(user, 100);
                // add a meal in the database
                Activity activity = new Activity(user.getUsername(), 1, "Meat",
                        100, date);
                List<Activity> list = new Controller().sendFood(activity);
                window.close();
            }
        });

        VBox layout = new VBox(10);

        //Add buttons
        layout.getChildren().addAll(label, dropdown, button);
        layout.setAlignment(Pos.CENTER);
        Scene scene = new Scene(layout);
        window.setScene(scene);
        window.showAndWait();


        //Make sure to return answer
        return new classes.Meal("Food", foodAdded);
    }

}
