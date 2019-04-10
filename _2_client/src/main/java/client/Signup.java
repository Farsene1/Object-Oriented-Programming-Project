package client;

import static client.ValidatePassword.validatePassword;

import classes.Controller;
import classes.RestfulClient;
import classes.User;
import com.jfoenix.controls.JFXPasswordField;
import com.jfoenix.controls.JFXTextField;
import css.Css;

import javafx.geometry.Insets;

import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;

import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.security.NoSuchAlgorithmException;



/**
 * Signup page.
 */
public class Signup {
    /**
     * Show singup method.
     *
     * @param window window parameter.
     */
    public static void showSignup(final Stage window) {

        String icon = "https://drive.google.com/uc?id=17b0fCmDcAogmyqUERNk7bMBOCRxwnYd_";
        RestfulClient restfulClient = new RestfulClient();
        restfulClient.getEntity();
        window.setTitle("Signup");
        final BorderPane bp = new BorderPane();
        VBox vbox = new VBox();
        vbox.setPadding(new Insets(10, 10, 10, 10));

        //username-r Input
        JFXTextField usernameInput = new JFXTextField();
        usernameInput.setPromptText("username");
        usernameInput.setLabelFloat(true);

        //Password Input
        JFXPasswordField passwordInput = new JFXPasswordField();
        passwordInput.setPromptText("password");
        passwordInput.setLabelFloat(true);

        //password2 Input
        JFXPasswordField passwordInput2 = new JFXPasswordField();
        passwordInput2.setPromptText("confirm password");
        passwordInput2.setLabelFloat(true);

        Button back = new Button();
        back.setOnAction(e -> {
            Login.showLogin(window);
        });
        back.setAlignment(Pos.TOP_LEFT);


        //Register
        Button register = new Button("Register");
        register.setDefaultButton(true);
        Label errorlabel = new Label();
        errorlabel.setVisible(false);
        errorlabel.setStyle("-fx-font-size: 12; -fx-text-fill: red; -fx-padding:0 0 3 0");
        register.setOnAction(e -> {
            int step = 0;

            /**
             * Whole register procedure.
             */
            String valid = validatePassword(passwordInput.getText());
            if (passwordInput.getText().equals(passwordInput2.getText())) {
                String password1 = passwordInput.getText();
                step = 1;
            } else {
                errorlabel.setText("The entered passwords do not match.");
                errorlabel.setVisible(true);
            }

            if (step == 1 && valid.equals("valid")) {
                try {
                    User user = new User(
                            usernameInput.getText(),
                            Hash.generateHash(passwordInput.getText(),
                                    "SHA-256"));
                    final String res = new Controller().signUp(user);

                    System.out.println("Username: " + usernameInput.getText());
                    System.out.println(
                            "Password hash: " + Hash.generateHash(passwordInput.getText(),
                                    "SHA-256"));

                    usernameInput.clear();
                    passwordInput.clear();
                    passwordInput2.clear();
                    // check if registration is possible
                    if (res.equals("/POST successful")) {
                        Home.showHome(window, user);
                    } else {
                        errorlabel.setText("ALREADY REGISTERED UP!");
                        errorlabel.setVisible(true);
                    }
                } catch (NoSuchAlgorithmException error) {
                    BoxAlert.display("ERROR", "No such algorithm exception");
                    error.printStackTrace();
                }
            } else if (step == 1) {
                errorlabel.setText(validatePassword(passwordInput.getText()));
                errorlabel.setVisible(true);
            }
        });

        ImageView img = new ImageView("https://i.ibb.co/qskM93N/polar-alpha.png");
        img.setFitWidth(350);
        img.setFitHeight(350);
        img.setStyle("-fx-padding: 10");

        Pane backpane = new Pane();
        backpane.setMinWidth(300);

        //Add everything to grid
        HBox hbox = new HBox();
        hbox.getChildren().addAll(back, backpane);

        vbox.getChildren().addAll(
                hbox, img, usernameInput, passwordInput, passwordInput2, errorlabel, register);

        Pane test1 = new Pane();
        Pane test2 = new Pane();
        Pane test3 = new Pane();
        final Pane test4 = new Pane();
        test1.setMinWidth(675);
        test2.setMinWidth(675);
        test3.setPrefHeight(100);
        test4.setPrefHeight(100);

        bp.setCenter(vbox);
        bp.setLeft(test1);
        bp.setRight(test2);
        bp.setTop(test3);
        bp.setBottom(test4);

        hbox.setStyle("-fx-padding: 0 0 0 20");
        bp.setStyle("-fx-background-image: url('https://i.ibb.co/855rPQb/polar-bear-3277930-1920.jpg');");
        vbox.setStyle("-fx-background-color: rgba(255,255,255, 0.4);"
                + " -fx-alignment: top-center;"
                + " -fx-font-size: 17pt");
        vbox.setPadding(new Insets(20, 60, 40, 60));
        vbox.setSpacing(30);
        Css.setSmallButtonStyle(register);
        Css.setBackButtonStyle(back);


        Scene scene = new Scene(bp, 1920, 1080);


        window.setScene(scene);
        window.setMaximized(true);
        window.show();
    }

}
