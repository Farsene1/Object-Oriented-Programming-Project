package client;

import classes.Activity;
import classes.Controller;
import classes.Electricity;
import classes.User;
import com.jfoenix.controls.JFXTextField;

import javafx.scene.Scene;

import javafx.scene.control.Button;
import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.layout.VBox;
import javafx.stage.Modality;
import javafx.stage.Stage;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;

/**
 * Electrcity box.
 */
public class BoxElectricity {


    /**
     * Variables.
     */
    static Boolean solar;
    static int light_hrs;
    static int heat_hrs;
    static int lightscore;
    static int htScore;
    static String date;
    static int score;

    /**
     * add usage box for electricity.
     *
     * @param title   title parameter.
     * @param message message parameter.
     * @param user    user parameter.
     */
    public static void addUsage(final String title, final String message, final classes.User user) {
        Stage window = new Stage();
        window.initModality(Modality.APPLICATION_MODAL);
        window.setTitle(title);
        window.setMinWidth(475);
        window.setMaxWidth(475);
        window.setMinHeight(400);
        window.setMaxHeight(400);
        Label label = new Label();
        label.setText(message);
        Label errorlabel = new Label("You can only type numbers");
        Label gap = new Label();
        Label hint  = new Label("Bro, if you're not using solar energy, consider lowering the temp of your home.");
        gap.setVisible(false);
        errorlabel.setVisible(false);
        errorlabel.setStyle("-fx-text-fill: red;");
        VBox layout = new VBox(10);

        final CheckBox solarbox = new CheckBox("Solar energy");
        JFXTextField lightfield = new JFXTextField();
        lightfield.setLabelFloat(true);
        lightfield.setPromptText("Add your hours of light usage");
        lightfield.setMaxWidth(300);
        JFXTextField heatfield = new JFXTextField();
        heatfield.setLabelFloat(true);
        heatfield.setPromptText("Add your hours of heating usage");
        heatfield.setMaxWidth(300);

        lightfield.setOnAction(e -> {
            submit(solarbox, lightfield, heatfield, user, window, errorlabel);
        });

        heatfield.setOnAction(e -> {
            submit(solarbox, lightfield, heatfield, user, window, errorlabel);
        });

        Button installSolar = new Button("I have installed solar panels");
        installSolar.setOnAction(e -> {
            //SET USER SOLAR SHIT TO TRUE PLS FLORENTIN
            userHasSolar(installSolar, solarbox, hint);
        });

        /*if (USER HAS SOLAR PANELS INSTALLED PLS FLORENTIN) {
            userHasSolar(installSolar, solarbox, hint);
        }*/

        Button submitButton = new Button("Submit");
        submitButton.setOnAction(e -> {
            submit(solarbox, lightfield, heatfield, user, window, errorlabel);
        });

        solarbox.selectedProperty().addListener((e,oldValue,newValue) -> {
            if(newValue.equals(true)){
                hint.setVisible(false);
            }
            else{
                hint.setVisible(true);
            }
        });

        label.setStyle("-fx-font-size: 12pt; -fx-padding: 10;");
        heatfield.setStyle("-fx-padding: 10;");
        lightfield.setStyle("-fx-padding: 10;");
        errorlabel.setStyle("-fx-padding: 4;-fx-text-fill: red;");
        gap.setStyle("-fx-font-size: 4");
        solarbox.setStyle("-fx-padding: 3;");
        submitButton.setStyle("-fx-padding: 7;-fx-background-color: rgba(255,255,255,0);-fx-border-color: darkblue;-fx-border-radius: 2");
        installSolar.setStyle("-fx-padding: 7;-fx-background-color: rgba(255,255,255,0);-fx-border-color: darkblue;-fx-border-radius: 2");
        layout.setStyle(" -fx-padding: 10px;-fx-alignment: top-center");
        layout.getChildren().addAll(label, lightfield,gap, heatfield, errorlabel, solarbox, hint, submitButton, installSolar);
        Scene scene = new Scene(layout);
        window.setScene(scene);
        window.showAndWait();

    }

    private static void userHasSolar(Button installSolar, CheckBox solarbox, Label hint) {
        installSolar.setVisible(false);
        solarbox.setSelected(true);
        solarbox.setDisable(true);
        hint.setText("You have solar panels installed, good job!");
        hint.setVisible(true);
    }

    private static void submit(CheckBox solarbox, JFXTextField lightfield, JFXTextField heatfield, User user, Stage window, Label errorlabel) {
            try{
                LocalDateTime mydateObj = LocalDateTime.now();
                DateTimeFormatter myFormatObj = DateTimeFormatter.ofPattern("dd-MM-yyyy");
                date = mydateObj.format(myFormatObj);
                solar = solarbox.isSelected();
                if (lightfield.getText() == null || lightfield.getText().trim().isEmpty()) {
                    light_hrs = 0;
                }
                else {
                    light_hrs = Integer.parseInt(lightfield.getText());
                }
                if (heatfield.getText() == null || heatfield.getText().trim().isEmpty()) {
                    heat_hrs = 0;
                }
                else {
                    heat_hrs = Integer.parseInt(heatfield.getText());
                }
                if(light_hrs!=0)
                {
                    if (heat_hrs!=0)
                    {
                        Electricity electricity = new Electricity(heat_hrs, light_hrs, solar);
                        if (solar) {
                            score = 50 * light_hrs + -300 * heat_hrs;
                            lightscore = 50 * light_hrs;
                            htScore = -300 * heat_hrs;
                        } else {
                            score = -50 * light_hrs + -300 * heat_hrs;
                            lightscore = -50 * light_hrs;
                            htScore = -300 * heat_hrs;
                        }
                        electricity.setScore(score);
                        new Controller().sendElectricity(user, score);
                        // add electricity in the database.
                        List<Activity> list = new Controller().sendFood(
                                new Activity(
                                        user.getUsername(),
                                        3,
                                        "Lights usage: " + light_hrs + " Hours",
                                        lightscore, date));
                        System.out.println("\n The items are" + list.toString());
                        list = new Controller().sendFood(
                                new Activity(user.getUsername(),
                                        3,
                                        "Heat usage: " + heat_hrs + " Hours",
                                        htScore, date));
                        System.out.println("\n The items are" + list.toString());
                        window.close();
                    } else {
                        Electricity electricity = new Electricity(0, light_hrs, solar);
                        if (solar) {
                            score = 50 * light_hrs;
                            lightscore = 50 * light_hrs;
                        } else {
                            score = -50 * light_hrs;
                            lightscore = -50 * light_hrs;
                        }
                        electricity.setScore(score);
                        new Controller().sendElectricity(user, score);
                        // add electricity in the database.
                        List<Activity> list = new Controller().sendFood(new Activity(
                                user.getUsername(),
                                3,
                                "Lights usage: " + light_hrs + " Hours",
                                lightscore, date));
                        System.out.println("\n The items are" + list.toString());
                        window.close();
                    }
                } else {
                    Electricity electricity = new Electricity(heat_hrs, 0, solar);
                    score = -300 * heat_hrs;
                    htScore = -300 * heat_hrs;
                    electricity.setScore(score);
                    new Controller().sendElectricity(user, score);
                    // add electricity in the database.
                    List<Activity> list = new Controller().sendFood(
                            new Activity(user.getUsername(),
                                    3,
                                    "Heat usage: " + heat_hrs + " Hours",
                                    htScore, date));
                    System.out.println("\n The items are" + list.toString());
                    window.close();
                }

            } catch (NumberFormatException nfe) {
                lightfield.clear();
                heatfield.clear();
                errorlabel.setVisible(true);
            }
    }


}