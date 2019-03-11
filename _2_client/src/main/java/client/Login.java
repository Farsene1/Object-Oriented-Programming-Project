package client;

import classes.RestfulClient;
import classes.User;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;
import java.security.NoSuchAlgorithmException;

public class Login {
    public static void showLogin(Stage window){
        TextField usernameInput, passwordInput;
        RestfulClient restfulClient = new RestfulClient();
            restfulClient.getEntity();
            window.setTitle("Login");


            BorderPane bp= new BorderPane();
            //GridPane with 10px padding around edge
            GridPane grid = new GridPane();
            grid.setPadding(new Insets(10, 10, 10, 10));
            grid.setVgap(8);

            //username Label - constrains use (child, column, row)
            Label usernameLabel = new Label("Username:");
            GridPane.setConstraints(usernameLabel, 0, 0);

            //username-r Input
            usernameInput = new TextField();
            usernameInput.setPromptText("username");
            GridPane.setConstraints(usernameInput, 1, 0);

            //Password Label
            Label passwordLabel = new Label("Password:");
            GridPane.setConstraints(passwordLabel, 0, 1);

            //Password Input
            passwordInput = new PasswordField();
            passwordInput.setPromptText("password");
            GridPane.setConstraints(passwordInput, 1, 1);

            //Login
            Button loginButton = new Button("Login");
            GridPane.setConstraints(loginButton, 1, 2);
            loginButton.setOnAction(e -> {
                String username = usernameInput.getText();
                String password = passwordInput.getText();
                usernameInput.clear();
                passwordInput.clear();
                try {
                    String res = restfulClient.login(new User(username, Hash.generateHash(password, "SHA-256")));
                    if(res.equals("POSITIVE"))
                        Home.showHome(window);
                    else{
                        System.out.println("INVALID CREDENTIALS");
                        AlertBox.display("ERROR", "INVALID CREDENTIALS");
                    }
                }catch (NoSuchAlgorithmException NSA) {
                    System.out.println("No such Algorithm");
                }
            });

            //Signup
            Button Signup = new Button("Signup");
            GridPane.setConstraints(Signup, 1, 3);
            Signup.setOnAction(e -> client.Signup.showSignup(window));

            //Add everything to grid
            grid.getChildren().addAll(usernameLabel, usernameInput, passwordLabel, passwordInput, loginButton, Signup);

            Pane test1=new Pane();
            Pane test2=new Pane();
            Pane test3=new Pane();
            Pane test4=new Pane();
            test1.setPrefWidth(675);
            test2.setPrefWidth(675);
            test3.setPrefHeight(200);
            test4.setPrefHeight(200);
            bp.setCenter(grid);
            bp.setLeft(test1);
            bp.setRight(test2);
            bp.setTop(test3);
            bp.setBottom(test4);
            bp.setStyle("-fx-background-image: url('https://i.pinimg.com/originals/36/f7/3d/36f73d2a6d91981d5a3aa644d897d467.jpg');");
            grid.setStyle("-fx-background-color: rgba(255,255,255, 0.4); -fx-alignment: top-center; -fx-font-size: 17pt");
            grid.setPadding(new Insets(100,0,0,0));
            Scene scene = new Scene(bp, 1920, 1015);
            window.setScene(scene);
            window.setMaximized(true);
            window.show();
    }

}
