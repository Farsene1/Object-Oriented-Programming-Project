package client;

import classes.RestfulClient;
import classes.User;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

import java.io.FileNotFoundException;
import java.security.NoSuchAlgorithmException;

public class Main extends Application {
    Stage window;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws FileNotFoundException {

        primaryStage.getIcons().add(new Image("https://i.imgur.com/diKacP0.png"));
        window = primaryStage;
        window.setOnCloseRequest(e -> {
            e.consume();
            closeProgram();
        });
        Login.showLogin(window);
    }


    //Closing down the program method.
    public void closeProgram() {
        boolean answer = ConfirmBox.display("Exit Box", "Are you sure you want to exit?");
        if (answer) {
            window.close();
        }
    }


}