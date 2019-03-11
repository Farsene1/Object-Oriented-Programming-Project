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

import java.io.FileNotFoundException;
import java.security.NoSuchAlgorithmException;

public class Signup {

    public static void showSignup(Stage window){

        RestfulClient restfulClient = new RestfulClient();
        restfulClient.getEntity();

        window.setTitle("Signup");

        BorderPane bp= new BorderPane();
        //GridPane with 10px padding around edge
        GridPane grid = new GridPane();
        grid.setPadding(new Insets(10, 10, 10, 10));
        grid.setVgap(8);
        grid.setHgap(10);

        //username-r Label - constrains use (child, column, row)
        Label usernameLabel = new Label("Username:");
        GridPane.setConstraints(usernameLabel, 0, 0);

        //username-r Input
        TextField usernameInput = new TextField();
        usernameInput.setPromptText("username");
        GridPane.setConstraints(usernameInput, 1, 0);

        //Password Label
        Label passwordLabel = new Label("Password:");
        GridPane.setConstraints(passwordLabel, 0, 1);

        //Password Input
        PasswordField passwordInput = new PasswordField();
        passwordInput.setPromptText("password");
        GridPane.setConstraints(passwordInput, 1, 1);

        //password2-r Input
        PasswordField passwordInput2 = new PasswordField();
        passwordInput2.setPromptText("confirm password");
        GridPane.setConstraints(passwordInput2, 1, 2);

        //Register
        Button register = new Button("Register");
        GridPane.setConstraints(register, 1, 3);
        register.setOnAction(e -> {

            if (passwordInput.getText().equals(passwordInput2.getText()))
            {
             try {
                 restfulClient.postEntity(new User(usernameInput.getText(), Hash.generateHash(passwordInput.getText(), "SHA-256")));
                  System.out.println("Username: " + usernameInput.getText());
                  System.out.println("Password hash: " + Hash.generateHash(passwordInput.getText(), "SHA-256"));
                }
             catch (NoSuchAlgorithmException error) {
                  AlertBox.display("ERROR", "No such algorithm exception");
                  error.printStackTrace();
              }
                usernameInput.clear();
                passwordInput.clear();
                passwordInput2.clear();
                Login.showLogin(window);
            }
            else
            {
                AlertBox.display("ERROR","PASSWORDS DON'T MATCH");
            }

        });

        //Add everything to grid
        grid.getChildren().addAll(usernameLabel, usernameInput, passwordLabel, passwordInput,passwordInput2, register);

        Pane test1=new Pane();
        Pane test2=new Pane();
        Pane test3=new Pane();
        Pane test4=new Pane();
        test1.setMinWidth(675);
        test2.setMinWidth(675);
        test3.setMinHeight(200);
        test4.setMinHeight(200);

        bp.setCenter(grid);
        bp.setLeft(test1);
        bp.setRight(test2);
        bp.setTop(test3);
        bp.setBottom(test4);

        bp.setStyle("-fx-background-image: url('https://i.pinimg.com/originals/36/f7/3d/36f73d2a6d91981d5a3aa644d897d467.jpg');");
        grid.setStyle("-fx-background-color: rgba(255,255,255, 0.4); -fx-alignment: top-center; -fx-font-size: 17pt");


        Scene scene = new Scene(bp, 1920, 1015);
        grid.setPadding(new Insets(100,0,0,0));

        window.setScene(scene);
        window.setMaximized(true);
        window.show();
    }

}
