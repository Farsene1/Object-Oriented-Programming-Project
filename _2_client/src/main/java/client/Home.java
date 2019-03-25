package client;

import classes.RestfulClient;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Home {

public static void showHome(Stage window, classes.User user){
    RestfulClient restfulClient = new RestfulClient();
    restfulClient.getEntity();
    window.setTitle("Home");

    BorderPane bp= new BorderPane();
    VBox leftmenu = new VBox();
    Scene scene = new Scene(bp, 1920, 1080);
    GridPane centerMenu= new GridPane();
    centerMenu.setPadding(new Insets(10, 10, 10, 10));
   // centerMenu.setVgap(8);
  //  centerMenu.setHgap(10);

    ImageView img= new ImageView("https://drive.google.com/uc?id=12Bowa9WczV-WVRlgH-zsZcdcSQyMa2nn");
    Label usernamelabel = new Label(user.getUsername().toUpperCase());
    //My Carbon footprint
    Button mycarbonButton = new Button("Footprint");
        GridPane.setConstraints(mycarbonButton, 0, 1);
        mycarbonButton.setOnAction(e -> {


                FootPrint.showOptions( centerMenu,scene, user);
        });

    //Statistics Button
    Button statisticsButton = new Button("Statistics");
        GridPane.setConstraints(statisticsButton, 0, 2);
        statisticsButton.setOnAction(e -> {
        AlertBox.display("This is an error message", "To Be Implemented");
    });
    //LeaderBoard button
    Button leaderboardButton = new Button("LeaderBoard");
        leaderboardButton.setOnAction(e -> {
        AlertBox.display("This is an error message", "To Be Implemented");
    });
    Button friendsbutton = new Button("Friends");
    leaderboardButton.setOnAction(e -> {
        AlertBox.display("This is an error message", "To Be Implemented");
    });
    //Quit
    Button quitButton = new Button("Quit");
    quitButton.setOnAction(e -> {
        boolean result = ConfirmBox.display("Confirm", "Are you sure you want to quit?");
        if (result) {
            Login.showLogin(window);
        }

    });


    //Add everything to grid
    leftmenu.getChildren().addAll(img, usernamelabel, mycarbonButton, statisticsButton, leaderboardButton,friendsbutton, quitButton);
    bp.setLeft(leftmenu);
    bp.setCenter(centerMenu);
    bp.setStyle("-fx-background-image: url('https://drive.google.com/uc?id=1lK9HHEu9G4_wDKNQuy0B7nrianqprK4r');");

    img.setStyle("-fx-pref-width: 350; -fx-pref-height: 350; -fx-padding: 25");
    usernamelabel.setStyle("-fx-padding: 20 0 50 0; -fx-alignment: center; -fx-font-size: 30");
    CSS.setButtonStyle(mycarbonButton);
    CSS.setButtonStyle(statisticsButton);
    CSS.setButtonStyle(leaderboardButton);
    CSS.setButtonStyle(friendsbutton);
    CSS.setButtonStyle(quitButton);
    leftmenu.setMinWidth(400);
    leftmenu.setStyle("-fx-font-size: 18pt; -fx-alignment: center; -fx-background-color: rgba(255,255,255,0.4);");

        window.setScene(scene);
        window.setMaximized(true);
        window.show();
}
}
