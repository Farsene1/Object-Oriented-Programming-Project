package client;

import classes.Controller;
import classes.RestfulClient;
import classes.User;
import classes.Vehicle;
import javafx.application.Application;
import javafx.scene.image.Image;
import javafx.stage.Stage;

import java.io.FileNotFoundException;
import java.security.NoSuchAlgorithmException;
import java.util.List;

public class Main extends Application {
    Stage window;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws FileNotFoundException {
        primaryStage.getIcons().add(new Image("https://i.imgur.com/diKacP0.png"));

        //EASTER EGG// default value in the database for shortcut when developing
        try {
            new Controller().signUp(new User("admin", Hash.generateHash("root", "SHA-256")));
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }

        List<Vehicle> list = new RestfulClient().addTransport(new Vehicle("user","car",14,4,"10/5"));
        System.out.println(list.size());

        //.........//
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