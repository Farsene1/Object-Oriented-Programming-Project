package client;

import classes.RestfulClient;
import classes.User;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Home {

public static void showHome(Stage window){
    RestfulClient restfulClient = new RestfulClient();
    restfulClient.getEntity();
    window.setTitle("Home");

    BorderPane bp= new BorderPane();
    VBox leftmenu = new VBox();

    //Quit
    Button quitButton = new Button("Quit");
        GridPane.setConstraints(quitButton, 0, 4);
        quitButton.setOnAction(e -> {
        boolean result = ConfirmBox.display("Confirm", "Are you sure you want to quit?");
        if (result) {
            Login.showLogin(window);
        }

    });
    //My Carbon footprint
    Button mycarbonButton = new Button("My carbon footprint");
        GridPane.setConstraints(mycarbonButton, 0, 1);
        mycarbonButton.setOnAction(e -> {
        AlertBox.display("This is an error message", "To Be Implemented");
    });

    //Statistics Button
    Button statisticsButton = new Button("Statistics");
        GridPane.setConstraints(statisticsButton, 0, 2);
        statisticsButton.setOnAction(e -> {
        AlertBox.display("This is an error message", "To Be Implemented");
    });
    //LeaderBoard button
    Button leaderboardButton = new Button("LeaderBoard");
        GridPane.setConstraints(leaderboardButton, 0, 3);
        leaderboardButton.setOnAction(e -> {
        AlertBox.display("This is an error message", "To Be Implemented");
    });

    Label Welcome = new Label("Welcome to the homepage!");

    //Add everything to grid
    leftmenu.getChildren().addAll(Welcome, mycarbonButton, statisticsButton, leaderboardButton, quitButton);
    bp.setLeft(leftmenu);
    bp.setStyle("-fx-background-image: url('https://i.pinimg.com/originals/36/f7/3d/36f73d2a6d91981d5a3aa644d897d467.jpg');");
    Scene scene = new Scene(bp, 1920, 1015);

    leftmenu.setMinWidth(400);
    leftmenu.setStyle("-fx-font-size: 18pt; -fx-background-color: white; -fx-padding: 10px;");
        window.setScene(scene);
        window.setMaximized(true);
        window.show();
}
}
