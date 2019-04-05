package client;

import CSS.CSS;
import classes.RestfulClient;
import classes.UserBadge;
import com.jfoenix.controls.JFXSnackbar;
import javafx.animation.KeyFrame;
import javafx.animation.Timeline;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.chart.PieChart;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javafx.util.Duration;
import javafx.scene.Group;
import java.io.*;
import java.util.*;
import javafx.scene.layout.VBox;

/**
 * HOME CLASS.
 */
public class Home {

    /**
     * List variable.
     */
    static ArrayList<String> list = new ArrayList<String>();

    /**
     * Shows home . and all the options.
     *
     * @param window window parameter.
     * @param user   user parameter.
     */
    public static void showHome(final Stage window, final classes.User user) {


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
        Label polarText = new Label("Polar Score:");
        Label polarScore = new Label();
        polarScore.setText(user.getPolarScore().toString());
        Button trophy = new Button();
        CSS.setTrophyButtonStyle(trophy);
        statusbar.setStyle("-fx-alignment: center");
        statusbar.getChildren().addAll(polarText, polarScore, trophy);
        statusbar.setMinHeight(50);

        //Trophy button click
        trophy.setOnAction(e -> {
            Achievements.showBadges(centerMenu, user, window);
        });

        //My Carbon footprint
        Button mycarbonButton = new Button("Footprint");
        GridPane.setConstraints(mycarbonButton, 0, 1);
        mycarbonButton.setOnAction(e -> {
            FootPrint.showOptions(centerMenu, user, polarScore, window);
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
            Friends.showOptions(centerMenu, scene, user, window);
        });
        //Quit
        Button quitButton = new Button("Quit");
        quitButton.setOnAction(e -> {
            boolean result = BoxConfirm.display("Confirm", "Are you sure you want to quit?");
            if (result) {
                Login.showLogin(window);
            }

        });

        Piechart.showPieChart(user);
        VBox pieChart = Piechart.getPieChartBox();
        

        centerMenu.getChildren().addAll(homeLabel, pieChart);

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
            public void handle(final ActionEvent event) {

                showFact(generate(list), centerMenu);
            }
        }));
        timer.setCycleCount(Timeline.INDEFINITE);
        timer.play();

        scene.getStylesheets().add((new File("_2_client/src/resources/CSS/SnackBar.css")).toURI().toString());

        window.setScene(scene);
        window.setMaximized(true);
        window.show();
    }

    /**
     * Fact showing method.
     *
     * @param message message of the fact.
     * @param center  where the fact will be.
     */
    public static void showFact(final String message, final GridPane center) {
        JFXSnackbar factbar = new JFXSnackbar(center);
        factbar.setPrefWidth(500);


        factbar.show(message, 10000);
    }

    /**
     * GENERATING a random string from the list.
     *
     * @param list list parameter.
     * @return returns a string to provide to the string.
     */
    public static String generate(final List<String> list) {
        Random random = new Random();
        return list.get(random.nextInt(list.size()));
    }

    /**
     * Reading stuff fro mthe text file into the list.
     *
     * @param list list parameter.
     */
    public static void factreading(final List<String> list) {

        try {
            BufferedReader br = new BufferedReader(new FileReader("_2_client/src/main/java/client/DailyFacts.txt"));
            String currentL;

            while ((currentL = br.readLine()) != null) {
                currentL = br.readLine();
                list.add(currentL);
            }
        } catch (FileNotFoundException e) {
            System.out.println(list);
        } catch (IOException c) {
            c.printStackTrace();
        }

    }
}
