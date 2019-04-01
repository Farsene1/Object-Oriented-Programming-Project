package client;

import classes.RestfulClient;
import classes.UserBadge;
import com.jfoenix.controls.JFXSnackbar;
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javafx.util.Duration;

import java.io.*;
import java.net.URL;
import java.nio.charset.Charset;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.*;

public class Home {
   static ArrayList<String>  list= new ArrayList<String>();






    public static void showHome(Stage window, classes.User user) {




            factreading(list);
            RestfulClient restfulClient = new RestfulClient();
            restfulClient.getEntity();
            window.setTitle("Home");

            BorderPane bp = new BorderPane();
            VBox leftmenu = new VBox();
            Scene scene = new Scene(bp, 1920, 1080);
            GridPane centerMenu = new GridPane();
            centerMenu.setPadding(new Insets(10, 10, 10, 10));

            ImageView img = new ImageView(UserBadge.iconChoice(user));
            Label homeLabel = new Label("WE CARE , \n DO YOU?");
            homeLabel.getStyleClass().add("HomeLabelCss");
            homeLabel.setAlignment(Pos.CENTER);
       //  GridPane.setConstraints(homeLabel,5,5);
            Label usernamelabel = new Label(user.getUsername().toUpperCase());

            HBox statusbar = new HBox();
            Label Polartext = new Label("Polar Score:");
            Label PolarScore = new Label();
            PolarScore.setText(user.getPolarScore().toString());
            Button trophy = new Button();
            CSS.setTrophyButtonStyle(trophy);
            statusbar.setStyle("-fx-alignment: center");
            statusbar.getChildren().addAll(Polartext, PolarScore, trophy);
            statusbar.setMinHeight(50);

            //Trophy button click
            trophy.setOnAction(e -> {
                Achievements.showBadges(centerMenu, user, window);
            });

            //My Carbon footprint
            Button mycarbonButton = new Button("Footprint");
            GridPane.setConstraints(mycarbonButton, 0, 1);
            mycarbonButton.setOnAction(e -> {
                FootPrint.showOptions(centerMenu, user, PolarScore,window);
            });

            //Statistics Button
            Button statisticsButton = new Button("Statistics");
            GridPane.setConstraints(statisticsButton, 0, 2);
            statisticsButton.setOnAction(e -> {
                Statistics.showOptions(centerMenu, user, window);
            });

            //LeaderBoard button
            Button leaderboardButton = new Button("LeaderBoard");
            leaderboardButton.setOnAction(e -> {
                Leaderboard.showOptions(centerMenu, scene, user, window);
            });
            Button friendsbutton = new Button("Friends");
            friendsbutton.setOnAction(e -> {
                Friends.showOptions(centerMenu, scene, user,window);
            });
            //Quit
            Button quitButton = new Button("Quit");
            quitButton.setOnAction(e -> {
                boolean result = ConfirmBox.display("Confirm", "Are you sure you want to quit?");
                if (result) {
                    Login.showLogin(window);
                }

            });

            centerMenu.getChildren().addAll(homeLabel);

            //Add everything to grid
            leftmenu.getChildren().addAll(img, usernamelabel, statusbar, mycarbonButton, statisticsButton, leaderboardButton, friendsbutton, quitButton);
            bp.setLeft(leftmenu);
            bp.setCenter(centerMenu);
            bp.setStyle("-fx-background-image: url('https://i.ibb.co/855rPQb/polar-bear-3277930-1920.jpg');");

            img.setStyle("-fx-pref-width: 350; -fx-pref-height: 350; -fx-padding: 25");
            usernamelabel.setStyle("-fx-padding: 20 0 50 0; -fx-alignment: center; -fx-font-size: 30");
            CSS.setButtonStyle(mycarbonButton);
            CSS.setButtonStyle(statisticsButton);
            CSS.setButtonStyle(leaderboardButton);
            CSS.setButtonStyle(friendsbutton);
            CSS.setButtonStyle(quitButton);
            leftmenu.setMinWidth(400);
            leftmenu.setStyle("-fx-font-size: 18pt; -fx-alignment: center; -fx-background-color: rgba(255,255,255,0.4);");



            //TIMER for facts
            Timeline timer = new Timeline(new KeyFrame(Duration.seconds(30), new EventHandler<ActionEvent>() {

            //showing the fact
                @Override
                public void handle(ActionEvent event) {

                    showFact(generate(list),centerMenu);
                }
            }));
            timer.setCycleCount(Timeline.INDEFINITE);
            timer.play();

            scene.getStylesheets().add((new File("_2_client/src/resources/CSS/SnackBar.css")).toURI().toString());
            window.setScene(scene);
            window.setMaximized(true);
            window.show();
        }



        public static void showFact(String message,GridPane center){
            JFXSnackbar  factbar = new JFXSnackbar(center);
            factbar.setPrefWidth(500);


            factbar.show(message,10000);
        }
//GENERATING A RANDOM STRING FRO MTHE LIST
        public static String generate(List<String> list){
            Random random= new Random();
            return list.get(random.nextInt(list.size()));
        }
    //READING TO THE LIST

        public static void factreading( List<String> list){

            try {
                BufferedReader br = new BufferedReader(new FileReader("_2_client/src/main/java/client/DailyFacts.txt"));
                String currentL;

                while((currentL = br.readLine())!= null){
                    currentL = br.readLine();
                    list.add(currentL);
                }
            } catch (FileNotFoundException e) {
                System.out.println(list);
            } catch(IOException c){
                c.printStackTrace();
            }

        }
}
