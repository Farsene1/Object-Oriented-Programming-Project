package client;

import classes.Activity;
import classes.Controller;
import classes.User;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.scene.control.ChoiceBox;

import java.util.List;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class FoodBox {

    /**
     * Initializes string for food added as empty.
     */
    static String foodAdded = "";

    public static classes.Meal addMeal(String title, String message, User user) {

        /**
         * Sets window.
         */
        Stage window = new Stage();
        window.initModality(Modality.APPLICATION_MODAL);
        window.setTitle(title);
        window.setMinWidth(500);
        Label label = new Label();
        label.setText(message);

        /**
         * Declares choice box for dropdown menu of meals.
         */
        ChoiceBox<String> dropdownMeal= new ChoiceBox<>();
        /**
         * Adds meal items to drop down menu.
         */
        dropdownMeal.getItems().addAll("Vegan meal", "Vegetarian meal", "Meal with meat");
        dropdownMeal.getSelectionModel().select(0);
        /**
         * Declares choice box for dropdown menu of groceries.
         */
        ChoiceBox<String> dropdownGroceries= new ChoiceBox<>();
        /**
         * Adds grocery items to drop down menu.
         */
        dropdownGroceries.getItems().addAll("Imported", "Local");
        dropdownGroceries.getSelectionModel().select(0);

        /**
         * Button for adding meal connected to drop down menu / depending on selection it adds meal type scores.
         */
        Button mealButton= new Button("Submit meal!");
        mealButton.setOnAction(e -> {
            foodAdded = dropdownMeal.getValue();
            if(foodAdded == "Vegan meal"){
                foodAdded = "vegan";
                LocalDateTime myDateObj = LocalDateTime.now();
                DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("dd-MM-yyyy");
                String date = myDateObj.format(myFormatObj);
                // hardcoded - add 200 points for vegan
                new Controller().sendMeal(user, 25);
                // add a meal in the database
                Activity activity = new Activity(user.getUsername(),1,"Vegan meal",
                        25, date);
                List<Activity> list = new Controller().sendFood(activity);
                System.out.println("\n The items are"+list.toString());
                window.close();
            }
            if(foodAdded == "Vegetarian meal") {
                foodAdded = "vegetarian";
                LocalDateTime myDateObj = LocalDateTime.now();
                DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("dd-MM-yyyy");
                String date = myDateObj.format(myFormatObj);
                new Controller().sendMeal(user, 50);
                // add a meal in the database
                Activity activity = new Activity(user.getUsername(), 1, "Vegetarian meal",
                        50, date);
                List<Activity> list = new Controller().sendFood(activity);
                window.close();
            }
            /**
             * When meal addes contains meat, method in new alert box for meat specific meals ins called on.
             */
            if(foodAdded == "Meal with meat") {
                MeatMealBox.meatMealCalculator("Meat meal calculator", "Please select the estimated amount of meat had in grams:", user);
                window.close();
            }
        });

        /**
         * Button for adding groceries connected to drop down menu / depending on selection it adds grocery type scores.
         */
        Button groceriesButton= new Button("Sumbit groceries");
        groceriesButton.setOnAction(e -> {

            foodAdded = dropdownGroceries.getValue();

            if (foodAdded == "Imported") {
                LocalDateTime myDateObj = LocalDateTime.now();
                DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("dd-MM-yyyy");
                String date = myDateObj.format(myFormatObj);
                new Controller().sendMeal(user, 250);
                // add a meal in the database
                Activity activity = new Activity(user.getUsername(), 1, "Imported produce",
                        250, date);
                List<Activity> list = new Controller().sendFood(activity);
                window.close();
            }
            if (foodAdded == "Local") {
                LocalDateTime myDateObj = LocalDateTime.now();
                DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("dd-MM-yyyy");
                String date = myDateObj.format(myFormatObj);
                new Controller().sendMeal(user, 50);
                // add a meal in the database
                Activity activity = new Activity(user.getUsername(), 1, "Local produce",
                        50, date);
                List<Activity> list = new Controller().sendFood(activity);
                window.close();
            }
        });

        /**
         * Adding labels / Styling / adding items to Vbox.
         */
        VBox layout = new VBox(10);

        label.setStyle("-fx-font-size: 12pt; -fx-padding: 10;");
        dropdownMeal.setStyle("-fx-padding: 7;");
        mealButton.setStyle("-fx-padding: 10;");
        dropdownGroceries.setStyle("-fx-padding: 7;");
        groceriesButton.setStyle("-fx-padding: 10;");

        //Add buttons
        layout.getChildren().addAll(label, dropdownMeal,  mealButton, dropdownGroceries, groceriesButton);
        layout.setStyle(" -fx-padding: 10px;");
        Scene scene = new Scene(layout);

        window.setScene(scene);
        window.showAndWait();

        /**
         * Returns food type to be added to database.
         */
        //Make sure to return answer
        return new classes.Meal("Food", foodAdded);
    }

}
