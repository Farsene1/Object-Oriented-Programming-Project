package client;

import classes.Activity;
import classes.Controller;
import classes.Electricity;
import com.jfoenix.controls.JFXTextField;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
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
    static int lightscore;
    static int htScore;
    static String date;
    static int score;

    public static void addUsage(String title, String message, classes.User user) {
        Stage window = new Stage();
        window.initModality(Modality.APPLICATION_MODAL);
        window.setTitle(title);
        window.setMinWidth(475);
        window.setMaxWidth(475);
        window.setMinHeight(325);
        window.setMaxHeight(325);
        Label label = new Label();
        label.setText(message);
        Label errorlabel = new Label("You can only type numbers");
        errorlabel.setVisible(false);
        errorlabel.setStyle("-fx-text-fill: red;");

        CheckBox solarbox = new CheckBox("Solar energy");
        JFXTextField lightfield = new JFXTextField();
        lightfield.setLabelFloat(true);
        lightfield.setPromptText("Add your hours of light usage");
        lightfield.setMaxWidth(300);
        JFXTextField heatfield = new JFXTextField();
        heatfield.setLabelFloat(true);
        heatfield.setPromptText("Add your hours of heating usage");
        heatfield.setMaxWidth(300);
        Button submitButton = new Button("Submit");
        submitButton.setOnAction(e -> {
            try{
                LocalDateTime mydateObj = LocalDateTime.now();
                DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("dd-MM-yyyy");
                date = mydateObj.format(myFormatObj);
                solar = solarbox.isSelected();
                light_hrs = Integer.parseInt(lightfield.getText());
                heat_hrs = Integer.parseInt(heatfield.getText());
                Electricity electricity = new Electricity(heat_hrs, light_hrs, solar);
                if (solar) {
                    score= 50 * light_hrs+ -300*heat_hrs;
                    lightscore=50 * light_hrs ;
                    htScore=-300*heat_hrs;
                } else {
                    score= -50 * light_hrs+ -300*heat_hrs;
                    lightscore=-50 * light_hrs ;
                    htScore=-300*heat_hrs;
                }
                electricity.setScore(score);
                new Controller().sendElectricity(user, score);
                // add electricity in the database
                List<Activity> list = new Controller().sendFood(new Activity(user.getUsername(), 3, "Lights usage: " + light_hrs + " Hours",
                        lightscore, date));
                System.out.println("\n The items are" + list.toString());
                list = new Controller().sendFood(new Activity(user.getUsername(), 3, "Heat usage: " + heat_hrs + " Hours",
                        htScore, date));
                System.out.println("\n The items are" + list.toString());
                window.close();
            }
            catch (NumberFormatException nfe){
                lightfield.clear();
                heatfield.clear();
                errorlabel.setVisible(true);
            }
        });

        VBox layout = new VBox(10);
        label.setStyle("-fx-font-size: 12pt; -fx-padding: 10;");
        heatfield.setStyle("-fx-padding: 10;");
        lightfield.setStyle("-fx-padding: 10;");
        errorlabel.setStyle("-fx-padding: 7;-fx-text-fill: red;");
        solarbox.setStyle("-fx-padding: 7;");
        submitButton.setStyle("-fx-padding: 7;-fx-background-color: rgba(255,255,255,0);-fx-border-color: darkblue;-fx-border-radius: 2");
        layout.setStyle(" -fx-padding: 10px;-fx-alignment: top-center");
                layout.getChildren().addAll(label, lightfield, heatfield, errorlabel, solarbox, submitButton);
        Scene scene = new Scene(layout);
        window.setScene(scene);
        window.showAndWait();
    }


}