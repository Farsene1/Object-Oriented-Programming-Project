package client;


import classes.Activity;
import classes.Controller;
import classes.Transport;
import com.jfoenix.controls.JFXComboBox;
import com.jfoenix.controls.JFXTextField;
import javafx.geometry.Pos;
import javafx.scene.control.Label;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.layout.VBox;
import javafx.scene.control.TextField;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;

public class BoxTransport {
    static String vehicle;
    static double distance;
    static String date;
    static int score;

    public static void addVehicle(String title, String message, classes.User user) {
        Stage window = new Stage();
        window.initModality(Modality.APPLICATION_MODAL);
        window.setTitle(title);
        window.setMinWidth(475);
        window.setMaxWidth(475);
        window.setMinHeight(285);
        window.setMaxHeight(285);

        Label label = new Label();
        label.setText(message);
        Label errorlabel = new Label();
        errorlabel.setText("You can only type numbers");
        errorlabel.setStyle("-fx-text-fill: red");
        errorlabel.setVisible(false);
        JFXComboBox<String> dropdown = new JFXComboBox<>();
        dropdown.getItems().addAll("Train", "Car", "Airplane", "Bicycle", "Walking");
        dropdown.getSelectionModel().select(0);
        JFXTextField distanceT = new JFXTextField();
        distanceT.setMaxWidth(300);
        distanceT.setPromptText("Add the Distance you traveled (KM)");
        distanceT.setLabelFloat(true);
        Button submitButton = new Button("Send");
        submitButton.setOnAction(e -> {
            try{
            LocalDateTime mydateObj = LocalDateTime.now();
            DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("dd-MM-yyyy");
            date = mydateObj.format(myFormatObj);
            vehicle = dropdown.getValue();
            distance = Double.parseDouble(distanceT.getText());
            Transport transport = new Transport(user.getUsername(), vehicle, distance, 0, date);
            score = transport.calculator(vehicle, distance);
            transport.setScore(score);
            new Controller().sendTransport(user, score);
            // add a meal in the database
            Activity activity = new Activity(user.getUsername(), 2, transport.getType() + ":" + transport.getDistance() + " KM",
                    transport.getScore(), date);
            List<Activity> list = new Controller().sendFood(activity);
            System.out.println("\n The items are" + list.toString());
            window.close();
        }
           catch (NumberFormatException N){
            distanceT.clear();
            errorlabel.setVisible(true);
        }
    });


    VBox layout = new VBox(10);
    layout.getChildren().setAll(label, dropdown, distanceT, errorlabel, submitButton);
        label.setStyle("-fx-font-size: 12pt; -fx-padding: 10;");
        distanceT.setStyle("-fx-padding: 10;");
        errorlabel.setStyle("-fx-padding: 7;-fx-text-fill: red;");
        dropdown.setStyle("-fx-padding: 7;");
        submitButton.setStyle("-fx-padding: 7;-fx-background-color: rgba(255,255,255,0);-fx-border-color: darkblue;-fx-border-radius: 2");
        layout.setStyle(" -fx-padding: 10px;-fx-alignment: top-center");

    Scene scene = new Scene(layout);
    window.setScene(scene);
    window.showAndWait();

    }
}