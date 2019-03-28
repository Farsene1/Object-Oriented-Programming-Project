package client;

import classes.Controller;
import classes.RestfulClient;
import classes.User;
import com.jfoenix.controls.JFXButton;
import com.jfoenix.controls.JFXPasswordField;
import com.jfoenix.controls.JFXTextField;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.ImageView;
import javafx.scene.layout.*;
import javafx.stage.Stage;

import java.security.NoSuchAlgorithmException;

public class Login {

    public static void showLogin(Stage window){
        String icon = "https://drive.google.com/uc?id=17b0fCmDcAogmyqUERNk7bMBOCRxwnYd_";

        JFXTextField usernameInput;
        JFXPasswordField passwordInput;
        RestfulClient restfulClient = new RestfulClient();
        restfulClient.getEntity();
        window.setTitle("Login");
        VBox vbox = new VBox();

        BorderPane bp= new BorderPane();
        //username Input
        usernameInput = new JFXTextField();
        usernameInput.setPromptText("username");
        usernameInput.setLabelFloat(true);

        //Password Input
        passwordInput = new JFXPasswordField();
        passwordInput.setPromptText("password");
        passwordInput.setLabelFloat(true);

        //Login
        Button loginButton = new Button("Login");
        loginButton.setDefaultButton(true);
        Label errorlabel = new Label();
        errorlabel.setVisible(false);
        errorlabel.setStyle("-fx-font-size: 16; -fx-text-fill: red;");
        loginButton.setOnAction(e -> {
            String username = usernameInput.getText();
            String password = passwordInput.getText();
            usernameInput.clear();
            passwordInput.clear();
            try {
                User user = new User(username, Hash.generateHash(password, "SHA-256"));
                String res = restfulClient.login(user);
                if(res.equals("POSITIVE")){
                    // getting updates from the database
                    user = new Controller().getUpdates(user);
                    Home.showHome(window, user, icon);
                }
                else{
                    errorlabel.setText("INVALID CREDENTIALS");
                    errorlabel.setVisible(true);
                }
            }catch (NoSuchAlgorithmException NSA) {
                System.out.println("No such Algorithm");
            }
        });

        //Signup
        HBox SignupBox= new HBox();
        Label regLabel = new Label("Not registered?");
        JFXButton Signup= new JFXButton("Signup");
        Signup.setStyle("-fx-text-fill: red");
        SignupBox.getChildren().addAll(regLabel,Signup);
        SignupBox.setAlignment(Pos.CENTER);
        Signup.setOnAction(e -> client.Signup.showSignup(window));
        ImageView img= new ImageView("https://i.ibb.co/qskM93N/polar-alpha.png");
        img.setFitWidth(350);
        img.setFitHeight(350);
        img.setStyle("-fx-padding: 10");
        //Add everything to grid


        vbox.getChildren().addAll(img,usernameInput, passwordInput,errorlabel, loginButton, SignupBox);
        vbox.setSpacing(30);
        Pane test1=new Pane();
        Pane test2=new Pane();
        Pane test3=new Pane();
        Pane test4=new Pane();
        test1.setPrefWidth(675);
        test2.setPrefWidth(675);
        test3.setMinHeight(200);
        test4.setMinHeight(200);
        bp.setCenter(vbox);
        bp.setLeft(test1);
        bp.setRight(test2);
        bp.setTop(test3);
        bp.setBottom(test4);

        CSS.setSmallButtonStyle(loginButton);
        bp.setStyle("-fx-background-image: url('https://i.ibb.co/855rPQb/polar-bear-3277930-1920.jpg');");
        vbox.setStyle("-fx-background-color: rgba(255,255,255, 0.4); -fx-alignment: top-center; -fx-font-size: 17pt");
        vbox.setPadding(new Insets(20,60,40,60));
        Scene scene = new Scene(bp, 1920, 1080);
        window.setScene(scene);
        window.setMaximized(true);
        window.show();
    }


}
