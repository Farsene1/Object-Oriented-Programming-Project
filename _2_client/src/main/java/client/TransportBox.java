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
        TextField  distanceM;
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
        choiceBox.getItems().addAll("Train","Car","Airplane","Bicycle","Walking");
        choiceBox.setValue("Train");
         distanceT = new TextField();
         distanceT.setMaxWidth(300);
         distanceM = new TextField();
         distanceM.setMaxWidth(300);
         Label Dlabel = new Label("Add the Distance you traveled (The KM part)");
         Label Mlabel = new Label("Add the Distance you traveled (The Meter Part)");
         Button send = new Button("Send");
        send.setOnAction(e ->{
            int c=0;
            for(int i=0; i<distanceT.getText().length(); i++){
                if((Character.isDigit(distanceT.getText().charAt(i)))){
                    c++;
                }
            }
            int v=0;
            for(int i=0; i<distanceM.getText().length(); i++){
                if((Character.isDigit(distanceM.getText().charAt(i)))){
                    v++;
                }
            }


           if(c==distanceT.getText().length()&&v==distanceM.getText().length()){
               LocalDateTime mydateObj = LocalDateTime.now();
               DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("dd-MM-yyyy");
               date= mydateObj.format(myFormatObj);
               vehicle = choiceBox.getValue();
                 int distanceMETERS = Integer.parseInt(distanceM.getText());
                 int distanceKM= Integer.parseInt(distanceT.getText());
               distance = distanceKM+distanceMETERS;
               Transport transport = new Transport(user.getUsername(), vehicle,distance,0,date);
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
               distanceM.clear();
                errorlabel.setVisible(true);
           }
        });


    VBox layout= new VBox(10);

    layout.getChildren().addAll(label,choiceBox,Dlabel,distanceT,Mlabel,distanceM,errorlabel,send);
    layout.setAlignment(Pos.CENTER);
    Scene scene= new Scene(layout);
    window.setScene(scene);
    window.showAndWait();



    return new Transport(user.getUsername(), vehicle,distance,score,date );
    }




}