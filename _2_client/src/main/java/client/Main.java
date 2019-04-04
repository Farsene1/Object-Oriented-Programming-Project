package client;

import classes.Activity;
import classes.Controller;
import classes.User;
import javafx.application.Application;
import javafx.scene.image.Image;
import javafx.stage.Stage;

import java.io.FileNotFoundException;
import java.security.NoSuchAlgorithmException;

/**
 * MAIN CLASS.
 */
public class Main extends Application {
    Stage window;

    /**
     * Main Program.
     * @param args
     */
    public static void main(String[] args) {
        launch(args);
    }

    /**
     * This is the main. starts the whole program.
     * @param primaryStage
     * @throws FileNotFoundException
     */
    @Override
    public void start(final Stage primaryStage) throws FileNotFoundException {
        primaryStage.getIcons().add(new Image("https://i.imgur.com/diKacP0.png"));

        //EASTER EGG// default value in the database for shortcut when developing
        try {
            new Controller().signUp(new User("admin", Hash.generateHash("root", "SHA-256")));
            new Controller().sendFood(new Activity("admin", 1, "easteregg", 1500, "12-03-2019"));
            new Controller().sendFood(new Activity("admin", 1, "easteregg", 300, "13-03-2019"));
            new Controller().sendFood(new Activity("admin", 1, "easteregg", 700, "14-03-2019"));
            new Controller().sendFood(new Activity("admin", 1, "easteregg", 20, "15-03-2019"));
            new Controller().sendFood(new Activity("admin", 1, "easteregg", 500, "16-03-2019"));
            new Controller().sendFood(new Activity("admin", 1, "easteregg", 1500, "17-03-2019"));
            new Controller().sendFood(new Activity("admin", 1, "easteregg", 100, "26-03-2019"));
            new Controller().sendFood(new Activity("admin", 1, "easteregg", 1500, "29-03-2019"));
            new Controller().sendFood(new Activity("admin", 2, "easteregg", 400, "12-03-2019"));
            new Controller().sendFood(new Activity("admin", 2, "easteregg", 600, "13-03-2019"));
            new Controller().sendFood(new Activity("admin", 2, "easteregg", 1400, "14-03-2019"));
            new Controller().sendFood(new Activity("admin", 2, "easteregg", 260, "15-03-2019"));
            new Controller().sendFood(new Activity("admin", 2, "easteregg", 50, "16-03-2019"));
            new Controller().sendFood(new Activity("admin", 2, "easteregg", 100, "17-03-2019"));
            new Controller().sendFood(new Activity("admin", 2, "easteregg", 700, "26-03-2019"));
            new Controller().sendFood(new Activity("admin", 2, "easteregg", 500, "29-03-2019"));
            new Controller().sendFood(new Activity("admin", 3, "easteregg", 700, "12-03-2019"));
            new Controller().sendFood(new Activity("admin", 3, "easteregg", 100, "13-03-2019"));
            new Controller().sendFood(new Activity("admin", 3, "easteregg", 100, "14-03-2019"));
            new Controller().sendFood(new Activity("admin", 3, "easteregg", 600, "15-03-2019"));
            new Controller().sendFood(new Activity("admin", 3, "easteregg", 520, "16-03-2019"));
            new Controller().sendFood(new Activity("admin", 3, "easteregg", 1030, "17-03-2019"));
            new Controller().sendFood(new Activity("admin", 3, "easteregg", 170, "26-03-2019"));
            new Controller().sendFood(new Activity("admin", 3, "easteregg", 900, "29-03-2019"));
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
        }

        //.........//
        window = primaryStage;
        window.setOnCloseRequest(e -> {
            e.consume();
            closeProgram();
        });
        window.setResizable(false);
        Login.showLogin(window);
    }


    /**
     * Closes the progoram.
     */
    public void closeProgram() {
        boolean answer = BoxConfirm.display("Exit Box", "Are you sure you want to exit?");
        if (answer) {
            window.close();
        }
    }

}