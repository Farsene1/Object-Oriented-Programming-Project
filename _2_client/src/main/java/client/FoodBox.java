package client;

import classes.Activity;
import classes.Controller;
import classes.User;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.scene.control.ChoiceBox;

import java.util.List;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class FoodBox {

    static String foodAdded = "";

    public static classes.Meal addMeal(String title, String message, User user) {

        Stage window = new Stage();
        window.initModality(Modality.APPLICATION_MODAL);
        window.setTitle(title);
        window.setMinWidth(500);
        Label label = new Label();
        label.setText(message);

        ChoiceBox<String> dropdownMeal = new ChoiceBox<>();
        dropdownMeal.getItems().addAll("Vegan meal", "Vegetarian meal", "Meal with meat");
        dropdownMeal.getSelectionModel().select(0);

        ChoiceBox<String> dropdownGroceries = new ChoiceBox<>();
        dropdownGroceries.getItems().addAll("Imported", "Local");
        dropdownGroceries.getSelectionModel().select(0);

        VBox layout = new VBox(10);

        TextField meatgrams = new TextField();
        meatgrams.setPromptText("Amount of meat(g)");
        Label errorlabel = new Label();
        errorlabel.setText("You can only type numbers");
        errorlabel.setStyle("-fx-text-fill: red;");

        Button mealButton = new Button("Submit meal!");
 Button groceriesButton = new Button("Submit groceries");

        mealButton.setOnAction(e -> {
            foodAdded = dropdownMeal.getValue();

            if (foodAdded == "Vegan meal") {
                foodAdded = "vegan";
                LocalDateTime myDateObj = LocalDateTime.now();
                DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("dd-MM-yyyy");
                String date = myDateObj.format(myFormatObj);
                // hardcoded - add 200 points for vegan
                new Controller().sendMeal(user, 500);
                // add a meal in the database
                List<Activity> list = new Controller().sendFood(new Activity(user.getUsername(), 1, "Vegan meal",
                        500, date));
                System.out.println("\n The items are" + list.toString());
                window.close();
            }
            if (foodAdded == "Vegetarian meal") {
                foodAdded = "vegetarian";
                LocalDateTime myDateObj = LocalDateTime.now();
                DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("dd-MM-yyyy");
                String date = myDateObj.format(myFormatObj);
                new Controller().sendMeal(user, 400);
                // add a meal in the database
                List<Activity> list = new Controller().sendFood(new Activity(user.getUsername(), 1, "Vegetarian meal",
                        400, date));
                window.close();
            }
            if (foodAdded == "Meal with meat") {
                LocalDateTime myDateObj = LocalDateTime.now();
                DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("dd-MM-yyyy");
                String date = myDateObj.format(myFormatObj);
                try {
                    int grams = Integer.parseInt(meatgrams.getText());
                    new Controller().sendMeal(user, grams * -1);
                    // add a meal in the database
                    List<Activity> list = new Controller().sendFood(new Activity(user.getUsername(), 1, "Meat (" + grams + " grams)",
                            grams * -1, date));
                    window.close();
                } catch (NumberFormatException nfe) {
                    layout.getChildren().setAll(label, dropdownMeal, meatgrams, errorlabel, mealButton, dropdownGroceries, groceriesButton);
                }
            }
        });

        groceriesButton.setOnAction(e -> {

            foodAdded = dropdownGroceries.getValue();

            if (foodAdded == "Imported") {
                LocalDateTime myDateObj = LocalDateTime.now();
                DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("dd-MM-yyyy");
                String date = myDateObj.format(myFormatObj);
                new Controller().sendMeal(user, -150);
                // add a meal in the database
                List<Activity> list = new Controller().sendFood(new Activity(user.getUsername(), 1, "Imported produce",
                        -150, date));
                window.close();
            }
            if (foodAdded == "Local") {
                LocalDateTime myDateObj = LocalDateTime.now();
                DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("dd-MM-yyyy");
                String date = myDateObj.format(myFormatObj);
                new Controller().sendMeal(user, 300);
                // add a meal in the database
                List<Activity> list = new Controller().sendFood(new Activity(user.getUsername(), 1,
                        "Local produce",300, date));
                window.close();
            }
        });


        dropdownMeal.getSelectionModel().selectedItemProperty().addListener((v, oldValue, newValue) -> {
            if (newValue.equals("Meal with meat")) {
                layout.getChildren().setAll(label, dropdownMeal, meatgrams, mealButton, dropdownGroceries, groceriesButton);
            }
            if (!newValue.equals("Meal with meat")) {
                layout.getChildren().setAll(label, dropdownMeal, mealButton, dropdownGroceries, groceriesButton);
            }
        });

        label.setStyle("-fx-font-size: 12pt; -fx-padding: 10;");
        dropdownMeal.setStyle("-fx-padding: 7;");
        mealButton.setStyle("-fx-padding: 10;");
        dropdownGroceries.setStyle("-fx-padding: 7;");
        groceriesButton.setStyle("-fx-padding: 10;");

        //Add buttons
        layout.getChildren().setAll(label, dropdownMeal, mealButton, dropdownGroceries, groceriesButton);
        layout.setStyle(" -fx-padding: 10px;");
        Scene scene = new Scene(layout);

        window.setScene(scene);
        window.showAndWait();

        //Make sure to return answer
        return new classes.Meal("Food", foodAdded);
    }

}
