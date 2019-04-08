package client;

import classes.Activity;
import classes.Controller;
import classes.User;
import com.jfoenix.controls.JFXComboBox;
import com.jfoenix.controls.JFXTextField;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Modality;
import javafx.stage.Stage;
import java.util.List;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class BoxFood {

    /**
     * Initializes string for food added as empty.
     */
    static String foodAdded = "";

    public static void addMeal(String title, String message, User user) {

        /**
         * Sets window.
         */
        Stage window = new Stage();
        window.initModality(Modality.APPLICATION_MODAL);
        window.setTitle(title);
        window.setMinWidth(475);
        window.setMaxWidth(475);
        window.setMinHeight(285);
        window.setMaxHeight(285);
        Label label = new Label(message);

        JFXComboBox<String> dropdown = new JFXComboBox<>();
        dropdown.getItems().setAll("Vegan meal", "Vegetarian meal", "Meal with meat","Imported Groceries", "Local Groceries");
        dropdown.getSelectionModel().select(0);

        VBox layout = new VBox(10);

        JFXTextField meatgrams = new JFXTextField();
        meatgrams.setPromptText("Amount of meat(g)");
        meatgrams.setLabelFloat(true);
        Label errorlabel = new Label();
        errorlabel.setText("You can only type numbers");

        Button submitButton = new Button("Submit meal!");

        submitButton.setOnAction(e -> {
            foodAdded = dropdown.getValue();

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
                    layout.getChildren().removeAll(submitButton);
                    layout.getChildren().addAll(errorlabel, submitButton);
                }
            }
            if (foodAdded == "Imported Groceries") {
                LocalDateTime myDateObj = LocalDateTime.now();
                DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("dd-MM-yyyy");
                String date = myDateObj.format(myFormatObj);
                new Controller().sendMeal(user, -150);
                // add a meal in the database
                List<Activity> list = new Controller().sendFood(new Activity(user.getUsername(), 1, "Imported produce",
                        -150, date));
                window.close();
            }
            if (foodAdded == "Local Groceries") {
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


        dropdown.getSelectionModel().selectedItemProperty().addListener((v, oldValue, newValue) -> {
            if (newValue.equals("Meal with meat")) {
                layout.getChildren().removeAll(submitButton);
                layout.getChildren().addAll(meatgrams, submitButton);
                meatgrams.clear();
            }
            if (!newValue.equals("Meal with meat")) {
                layout.getChildren().removeAll(errorlabel, meatgrams,submitButton);
                layout.getChildren().addAll(submitButton);
            }
        });

        label.setStyle("-fx-font-size: 12pt; -fx-padding: 10;");
        meatgrams.setStyle("-fx-padding: 10;");
        errorlabel.setStyle("-fx-padding: 7;-fx-text-fill: red;");
        dropdown.setStyle("-fx-padding: 7;");
        submitButton.setStyle("-fx-padding: 7;-fx-background-color: rgba(255,255,255,0);-fx-border-color: darkblue;-fx-border-radius: 2");
        layout.setStyle(" -fx-padding: 10px;-fx-alignment: top-center");
        //Add buttons
        layout.getChildren().setAll(label, dropdown, submitButton);
        Scene scene = new Scene(layout);

        window.setScene(scene);
        window.showAndWait();
    }

}
