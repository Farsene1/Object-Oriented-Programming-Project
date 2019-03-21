package client;


import classes.Vehicle;
import javafx.geometry.Pos;
import javafx.scene.control.Label;
import javafx.scene.layout.GridPane;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javafx.scene.control.Button;
import classes.Controller;
import classes.RestfulClient;
import classes.User;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import java.awt.*;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class TransportBox {
    static  String vehicle;
     static int distance;
     static String date;
    static int score;
    public static classes.Vehicle addVehicle(String title, String message,classes.User user ){
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
        choiceBox.getItems().addAll("Train","Car","Bicycle","Airplane");
        choiceBox.setValue("Train");
         distanceT = new TextField();

         Label Dlabel = new Label("Add the Distance you traveled in KM");
        Button send = new Button("Send");
        send.setOnAction(e ->{
            int c=0;
            for(int i=0; i<distanceT.getText().length(); i++){
                if(Character.isDigit(distanceT.getText().charAt(i))){
                    c++;
                }
            }
           if(c==distanceT.getText().length()){
               LocalDateTime mydateObj = LocalDateTime.now();
               DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("dd-MM-yyyy");
               date= mydateObj.format(myFormatObj);
               vehicle = choiceBox.getValue();

               distance = Integer.parseInt(distanceT.getText());
               Vehicle transport = new Vehicle(user.getUsername(), vehicle,distance,0,date);
               score=transport.calculator(vehicle,distance);
               transport.setScore(score);
               //   System.out.println(transport.getDate());
               //  System.out.println(transport.getDistance());
               //  System.out.println(transport.getScore());
               // System.out.println(transport.getType());
               window.close();
           }
           else{
               distanceT.clear();
                errorlabel.setVisible(true);
           }
        });


    VBox layout= new VBox(10);
  layout.getChildren().addAll(label,choiceBox,Dlabel,distanceT,errorlabel,send);
    layout.setAlignment(Pos.CENTER);
    Scene scene= new Scene(layout);
    window.setScene(scene);
    window.showAndWait();



    return new classes.Vehicle(user.getUsername(), vehicle,distance,0,date );
    }




}