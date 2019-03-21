package client;


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

public class TransportBox {
    static  String vehicle;
     static int distance;
     static String date;
    static int score;
    public static Transport addVehicle(String title, String message, classes.User user ){
         TextField distanceT;
        Stage window = new Stage();
        window.initModality(Modality.APPLICATION_MODAL);
        window.setTitle(title);
        window.setMinWidth(500);
        Label label = new Label();
        label.setText(message);


        ChoiceBox<String> choiceBox = new ChoiceBox<>();
        choiceBox.getItems().addAll("Train","Car","Bicycle","Airplane");
        choiceBox.setValue("Train");
         distanceT = new TextField();

         Label Dlabel = new Label("Add the Distance you traveled in KM");
        Button send = new Button("Send");
        send.setOnAction(e ->{

            LocalDateTime mydateObj = LocalDateTime.now();
            DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("dd-MM-yyyy");
             date= mydateObj.format(myFormatObj);
            vehicle = choiceBox.getValue();
            distance = Integer.parseInt(distanceT.getText());
            Transport transport = new Transport(user.getUsername(), vehicle,distance,0,date);
            score=transport.calculator(vehicle,distance);
            transport.setScore(score);
         //   System.out.println(transport.getDate());
         //  System.out.println(transport.getDistance());
          //  System.out.println(transport.getScore());
           // System.out.println(transport.getType());
            window.close();
        });


    VBox layout= new VBox(10);
  layout.getChildren().addAll(label,choiceBox,Dlabel,distanceT,send);
    layout.setAlignment(Pos.CENTER);
    Scene scene= new Scene(layout);
    window.setScene(scene);
    window.showAndWait();



    return new Transport(user.getUsername(), vehicle,distance,0,date );
    }




}