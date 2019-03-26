package client;

import classes.Activity;
import classes.Controller;
import classes.Electricity;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;
import javafx.stage.Modality;
import javafx.stage.Stage;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;

public class ElectricityBox {
    static Boolean solar;
    static int light_hrs;
    static int heat_hrs;
    static int total_hrs;
    static String date;
    static int score;

    public static Electricity addUsage(String title, String message, classes.User user) {
        Stage window = new Stage();
        window.initModality(Modality.APPLICATION_MODAL);
        window.setTitle(title);
        window.setMinWidth(500);
        Label label = new Label();
        label.setText(message);
        Label errorlabel = new Label();
        errorlabel.setText("You can only type numbers");
        errorlabel.setVisible(false);
        ChoiceBox<String> choiceBox = new ChoiceBox<>();
        choiceBox.getItems().addAll("I have used solar energy", "I have NOT used solar energy");
        choiceBox.setValue("I have NOT used solar energy");
        TextField lightfield;
        TextField heatfield;
        lightfield = new TextField();
        lightfield.setMaxWidth(300);
        heatfield = new TextField();
        heatfield.setMaxWidth(300);
        Label lightlabel = new Label("Add your hours of light usage");
        Label heatlabel = new Label("Add your hours of heating usage");
        Button send = new Button("Submit");
        send.setOnAction(e -> {
            int c = 0;
            for (int i = 0; i < lightfield.getText().length(); i++) {
                if ((Character.isDigit(lightfield.getText().charAt(i)))) {
                    c++;
                }
            }
            int v = 0;
            for (int i = 0; i < heatfield.getText().length(); i++) {
                if ((Character.isDigit(heatfield.getText().charAt(i)))) {
                    v++;
                }
            }

            if (c == lightfield.getText().length() && v == heatfield.getText().length()) {
                LocalDateTime mydateObj = LocalDateTime.now();
                DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("dd-MM-yyyy");
                date = mydateObj.format(myFormatObj);
                solar = false;
                if (choiceBox.getValue().equals("I have used solar energy")) {
                    solar = true;
                }
                light_hrs = Integer.parseInt(lightfield.getText());
                heat_hrs = Integer.parseInt(heatfield.getText());
                total_hrs = light_hrs + heat_hrs;
                Electricity electricity = new Electricity(heat_hrs, light_hrs, solar);
                if (solar) {
                    score = 25 * total_hrs;
                } else {
                    score = 100 * total_hrs;
                }
                electricity.setScore(score);
                new Controller().sendElectricity(user, score);
                // add electricity in the database
                Activity activity = new Activity(user.getUsername(), 3, "Electricity usage: " + total_hrs + " Hours",
                        electricity.getScore(), date);
                List<Activity> list = new Controller().addActivity(activity);
                System.out.println("\n The items are" + list.toString());
                window.close();
            } else {
                lightfield.clear();
                heatfield.clear();
                errorlabel.setVisible(true);
            }
        });


        VBox layout = new VBox(10);

        layout.getChildren().addAll(label, choiceBox, lightlabel, lightfield, heatlabel, heatfield, errorlabel, send);
        layout.setAlignment(Pos.CENTER);
        Scene scene = new Scene(layout);
        window.setScene(scene);
        window.showAndWait();


        return new Electricity(heat_hrs, light_hrs, solar);
    }


}