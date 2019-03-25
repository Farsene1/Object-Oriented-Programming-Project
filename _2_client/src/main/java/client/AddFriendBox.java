package client;

import classes.Friend;
import classes.FriendRequest;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Modality;
import javafx.stage.Stage;



public class AddFriendBox {
        static boolean answer;
    public static boolean display(String title, FriendRequest friendRequest){
        Stage window = new Stage();

        //Block events to other windows
        window.initModality(Modality.APPLICATION_MODAL);
        window.setTitle(title);
        window.setMinWidth(250);
        Label label = new Label(friendRequest.getSender()+"wants to add you");
        Button yesButton = new Button("Accept");
        Button noButton = new Button("Decline");

        yesButton.setOnAction(e->{
            answer = true;
            window.close();
        });
        noButton.setOnAction(e->{
            answer = false;
            window.close();
        });

        VBox layout = new VBox(10);
        layout.getChildren().addAll(label,yesButton,noButton);
        Scene scene = new Scene(layout);
        window.setScene(scene);
        window.showAndWait();
        return answer;
    }

}
