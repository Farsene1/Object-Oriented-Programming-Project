package client;


import classes.Activity;
import classes.Controller;
import classes.Transport;
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

public class TransportBox {
    static String vehicle;
    static double distance;
    static String date;
    static int score;

    public static Transport addVehicle(String title, String message, classes.User user) {
        TextField distanceT;
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
        choiceBox.getItems().addAll("Train", "Car", "Airplane", "Bicycle", "Walking");
        choiceBox.setValue("Train");
        distanceT = new TextField();
        distanceT.setMaxWidth(300);
        Label Dlabel = new Label("Add the Distance you traveled");
        Button send = new Button("Send");
        send.setOnAction(e -> {
            try{
            LocalDateTime mydateObj = LocalDateTime.now();
            DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("dd-MM-yyyy");
            date = mydateObj.format(myFormatObj);
            vehicle = choiceBox.getValue();
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

    layout.getChildren().

    addAll(label, choiceBox, Dlabel, distanceT, errorlabel, send);
    layout.setAlignment(Pos.CENTER);
    Scene scene = new Scene(layout);
    window.setScene(scene);
    window.showAndWait();



    return new

    Transport(user.getUsername(),vehicle,distance,score,date );
}




}