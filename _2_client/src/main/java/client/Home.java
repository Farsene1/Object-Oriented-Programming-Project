package client;

import classes.RestfulClient;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Home {

    private static  boolean sceneOpen = false;
    private static int sceneType = 0;

    public static void showHome(Stage window, classes.User user){

        RestfulClient restfulClient = new RestfulClient();
        restfulClient.getEntity();
        window.setTitle("Home");

        BorderPane bp= new BorderPane();
        VBox leftmenu = new VBox();
        Scene scene = new Scene(bp, 1920, 1080);
        GridPane centerMenu= new GridPane();
        centerMenu.setPadding(new Insets(10, 10, 10, 10));

        ImageView img= new ImageView("https://drive.google.com/uc?id=12Bowa9WczV-WVRlgH-zsZcdcSQyMa2nn");
        Label usernamelabel = new Label(user.getUsername().toUpperCase());

        if ((sceneType == 1)&&(sceneOpen == true))  {
            Achievements.showBadges(centerMenu, scene, user);
        }
        if ((sceneType == 2)&&(sceneOpen == true))  {
            FootPrint.showOptions(centerMenu, scene, user);
        }
        if ((sceneType == 3)&&(sceneOpen == true))  {
            //add call to show statistics scene // not an alert box
            AlertBox.display("This is an error message", "To Be Implemented");
        }
        if ((sceneType == 4)&&(sceneOpen == true))  {
            //add call to show leaderboard scene // not an alert box
            AlertBox.display("This is an error message", "To Be Implemented");
        }
        if ((sceneType == 5)&&(sceneOpen == true))  {
            //add call to show friends scene // not an alertbox
            AlertBox.display("This is an error message", "To Be Implemented");
        }

        HBox statusbar= new HBox();
        Label Polartext= new Label("Polar Score:");
        Label PolarScore= new Label();
        PolarScore.setText(user.getPolarScore().toString());
        Button trophy= new Button();
        CSS.setTrophyButtonStyle(trophy);
        Polartext.setStyle("-fx-font: 22");
        PolarScore.setStyle("-fx-font: 22;");
        statusbar.setStyle("-fx-alignment: center");
        statusbar.getChildren().addAll(Polartext,PolarScore,trophy);
        statusbar.setMinHeight(50);

        //Trophy button click
        trophy.setOnAction(e -> {
            if(sceneOpen == false) {
                sceneOpen = true;
                Achievements.showBadges(centerMenu, scene, user);
            }
            if(sceneOpen == true) {
                sceneType = 1;
                showHome(window, user);
            }
        });

        //My Carbon footprint
        Button mycarbonButton = new Button("Footprint");
        GridPane.setConstraints(mycarbonButton, 0, 1);
        mycarbonButton.setOnAction(e -> {
            if(sceneOpen == false) {
                sceneOpen = true;
                FootPrint.showOptions(centerMenu, scene, user);
            }
            if(sceneOpen == true) {
                sceneType = 2;
                showHome(window, user);
            }
        });

        //Statistics Button
        Button statisticsButton = new Button("Statistics");
        GridPane.setConstraints(statisticsButton, 0, 2);
        statisticsButton.setOnAction(e -> {
            if(sceneOpen == false) {
                sceneOpen = true;
                AlertBox.display("This is an error message", "To Be Implemented");
            }
            if(sceneOpen == true) {
                sceneType = 3;
                showHome(window, user);
            }
        });

        //LeaderBoard button
        Button leaderboardButton = new Button("LeaderBoard");
        leaderboardButton.setOnAction(e -> {
            if(sceneOpen == false) {
                sceneOpen = true;
                AlertBox.display("This is an error message", "To Be Implemented");
            }
            if(sceneOpen == true) {
                sceneType = 4;
                showHome(window, user);
            }
        });

        //Friends button
        Button friendsbutton = new Button("Friends");
        friendsbutton.setOnAction(e -> {
            if(sceneOpen == false) {
                sceneOpen = true;
                AlertBox.display("This is an error message", "To Be Implemented");
            }
            if(sceneOpen == true) {
                sceneType = 5;
                showHome(window, user);
            }
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
        leftmenu.getChildren().addAll(img, usernamelabel,statusbar, mycarbonButton, statisticsButton, leaderboardButton,friendsbutton, quitButton);
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
