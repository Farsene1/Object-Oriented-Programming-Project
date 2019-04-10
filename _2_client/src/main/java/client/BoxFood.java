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

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;


/**
 * Box food class.
 */
public class BoxFood extends Calculator {

    /**
     * Initializes string for food added as empty.
     */
    static String foodAdded = "";

    /**
     * Add meal method.
     *
     * @param title   parameter title
     * @param message message parameter.
     * @param user    user parameter.
     */
    public static void addMeal(final String title, final String message, final User user) {

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
        final Label label = new Label(message);

        JFXComboBox<String> dropdown = new JFXComboBox<>();
        dropdown.getItems().setAll(
                "Vegan meal",
                "Vegetarian meal",
                "Meal with meat",
                "Imported Groceries",
                "Local Groceries");
        dropdown.getSelectionModel().select(0);

        final VBox layout = new VBox(10);

        JFXTextField meatgrams = new JFXTextField();
        meatgrams.setPromptText("Amount of meat(g)");
        meatgrams.setLabelFloat(true);
        Label errorlabel = new Label();
        errorlabel.setText("You can only type numbers");

        Button submitButton = new Button("Submit meal!");

        meatgrams.setOnAction(e -> {
            submit(dropdown, user, window, meatgrams, layout, submitButton, errorlabel);
        });

        submitButton.setOnAction(e -> {
            submit(dropdown, user, window, meatgrams, layout, submitButton, errorlabel);
        });

        dropdown.getSelectionModel().selectedItemProperty().addListener((v, oldValue, newValue) -> {
            if (newValue.equals("Meal with meat")) {
                /*layout.getChildren().removeAll(submitButton);
                layout.getChildren().addAll(meatgrams, submitButton);*/
                meatgrams.setVisible(true);
            } else {
                /*layout.getChildren().removeAll(meatgrams, submitButton);
                layout.getChildren().addAll(submitButton);*/
                meatgrams.setVisible(false);
            }
        });

        label.setStyle("-fx-font-size: 12pt; -fx-padding: 10;");
        meatgrams.setStyle("-fx-padding: 10;");
        errorlabel.setStyle("-fx-padding: 7;-fx-text-fill: red;");
        dropdown.setStyle("-fx-padding: 7;");
        submitButton.setStyle("-fx-padding: 7;"
                + "-fx-background-color: rgba(255,255,255,0);"
                + "-fx-border-color: darkblue;"
                + "-fx-border-radius: 2");
        layout.setStyle(" -fx-padding: 10px;-fx-alignment: top-center");
        //Add buttons
        layout.getChildren().setAll(label, dropdown, meatgrams, submitButton);
        meatgrams.setVisible(false);
        Scene scene = new Scene(layout);

        window.setScene(scene);
        window.showAndWait();
    }

    private static void submit(JFXComboBox<String> dropdown, User user, Stage window, JFXTextField meatgrams, VBox layout, Button submitButton, Label errorlabel) {

        foodAdded = dropdown.getValue();

        if (foodAdded.equals("Vegan meal") ) {
            foodAdded = "vegan";
            LocalDateTime myDateObj = LocalDateTime.now();
            DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("dd-MM-yyyy");
            String date = myDateObj.format(myFormatObj);
            // hardcoded - add 500 points for vegan
            // value for amount is negative footprint of average meat meal with a 4x bonus
            new Controller().sendMeal(user, meatScoreCalc(120) * -4);
            // add a meal in the database
            List<Activity> list = new Controller().sendFood(
                    new Activity(user.getUsername(), 1, "Vegan meal",
                            meatScoreCalc(120) * -4, date));
            System.out.println("\n The items are" + list.toString());
            window.close();
        }
        if (foodAdded.equals("Vegetarian meal")) {
            foodAdded = "vegetarian";
            LocalDateTime myDateObj = LocalDateTime.now();
            DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("dd-MM-yyyy");
            String date = myDateObj.format(myFormatObj);
            // value for amount is negative footprint of average meat meal with a 2x bonus
            new Controller().sendMeal(user, meatScoreCalc(120) * -2);
            // add a meal in the database
            List<Activity> list = new Controller().sendFood(
                    new Activity(user.getUsername(), 1, "Vegetarian meal",
                            meatScoreCalc(120) * -2, date));
            window.close();
        }
        if (foodAdded.equals("Meal with meat")) {
            LocalDateTime myDateObj = LocalDateTime.now();
            DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("dd-MM-yyyy");
            String date = myDateObj.format(myFormatObj);
            try {
                int grams = Integer.parseInt(meatgrams.getText());
                int meatScore = meatScoreCalc(grams);
                new Controller().sendMeal(user, meatScore);
                // add a meal in the database
                List<Activity> list = new Controller().sendFood(new Activity(
                        user.getUsername(), 1, "Meat (" + grams + " grams)",
                        meatScore, date));
                window.close();
            } catch (NumberFormatException nfe) {
                layout.getChildren().removeAll(submitButton);
                layout.getChildren().addAll(errorlabel, submitButton);
            }
        }
        if (foodAdded.equals("Imported Groceries")) {
            LocalDateTime myDateObj = LocalDateTime.now();
            DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("dd-MM-yyyy");
            String date = myDateObj.format(myFormatObj);
            new Controller().sendMeal(user, -150);
            // add a meal in the database
            List<Activity> list = new Controller().sendFood(
                    new Activity(user.getUsername(), 1, "Imported produce",
                            -150, date));
            window.close();
        }
        if (foodAdded.equals("Local Groceries")) {
            LocalDateTime myDateObj = LocalDateTime.now();
            DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("dd-MM-yyyy");
            String date = myDateObj.format(myFormatObj);
            new Controller().sendMeal(user, 300);
            // add a meal in the database
            List<Activity> list = new Controller().sendFood(new Activity(user.getUsername(), 1,
                    "Local produce", 300, date));

            window.close();
        }
    }

}
