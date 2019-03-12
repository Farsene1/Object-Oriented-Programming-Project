package client;

import classes.Controller;
import classes.RestfulClient;
import classes.User;
import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

import java.io.FileNotFoundException;
import java.security.NoSuchAlgorithmException;

public class Main extends Application {
    RestfulClient restfulClient;
    int id = 0;
    Stage window;
    Scene scene, scene1, scene2;
    TextField usernameInput, passwordInput, emailInputR, usernameInputR, passwordInputR;
    private Controller controller;
    private User currentUser;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) throws FileNotFoundException {

        restfulClient = new RestfulClient();
        restfulClient.getEntity();

        window = primaryStage;

        window.setTitle("Login");
        window.setOnCloseRequest(e -> {
            e.consume();
            closeProgram();
        });
        //GridPane with 10px padding around edge
        GridPane grid = new GridPane();
        grid.setPadding(new Insets(10, 10, 10, 10));
        grid.setVgap(8);
        grid.setHgap(10);

        GridPane grid1 = new GridPane();
        grid1.setPadding(new Insets(10, 10, 10, 10));
        grid1.setVgap(8);
        grid1.setHgap(10);


        GridPane grid2 = new GridPane();
        grid2.setPadding(new Insets(10, 10, 10, 10));
        grid.setVgap(8);
        grid.setHgap(10);
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
                currentUser = new User(username, Hash.generateHash(password, "SHA-256"));
                String res = restfulClient.login(currentUser);
                if(res.equals("POSITIVE"))
                    window.setScene(scene2);
                else{
                    System.out.println("INVALID CREDENTIALS");
                }
            }catch (NoSuchAlgorithmException NSA) {
                System.out.println("No such Algorithm");
            }
        });

        //Signup
        Button Signup = new Button("Signup");
        GridPane.setConstraints(Signup, 1, 3);
        Signup.setOnAction(e -> window.setScene(scene1));

        //email Label - constrains use (child, column, row)
        Label emailLabel = new Label("Email:");
        GridPane.setConstraints(emailLabel, 0, 0);

        //email-r Input
        emailInputR = new TextField();
        emailInputR.setPromptText("username");
        GridPane.setConstraints(emailInputR, 1, 0);

        //username-r Label - constrains use (child, column, row)
        Label usernameLabelr = new Label("Username:");
        GridPane.setConstraints(usernameLabelr, 0, 1);

        //username-r Input
        usernameInputR = new TextField();
        usernameInputR.setPromptText("username");
        GridPane.setConstraints(usernameInputR, 1, 1);

        //Password-r Label
        Label passwordLabelr = new Label("Password:");
        GridPane.setConstraints(passwordLabelr, 0, 2);

        //Password-r Input
        passwordInputR = new PasswordField();
        passwordInputR.setPromptText("password");
        GridPane.setConstraints(passwordInputR, 1, 2);

        //Quit
        Button quitButton = new Button("Quit");
        GridPane.setConstraints(quitButton, 0, 4);
        quitButton.setOnAction(e -> {
            boolean result = ConfirmBox.display("Confirm", "Are you sure you want to quit?");
            if (result == true) {
                window.setScene(scene);
            }

        });
        //My Carbon footprint
        Button mycarbonButton = new Button("My carbon footprint");
        GridPane.setConstraints(mycarbonButton, 0, 1);
        mycarbonButton.setOnAction(e -> {
            controller.sendMeal(currentUser, 100);
            AlertBox.display("This is an error message", "To Be Implemented");
        });

        //Statistics Button
        Button statisticsButton = new Button("Statistics");
        GridPane.setConstraints(statisticsButton, 0, 2);
        statisticsButton.setOnAction(e -> {
            AlertBox.display("This is an error message", "To Be Implemented");
        });
        //LeaderBoard button
        Button leaderboardButton = new Button("LeaderBoard");
        GridPane.setConstraints(leaderboardButton, 0, 3);
        leaderboardButton.setOnAction(e -> {
            AlertBox.display("This is an error message", "To Be Implemented");
        });


        //Register
        Button registerButton = new Button("Register");
        GridPane.setConstraints(registerButton, 1, 3);
        registerButton.setOnAction(e -> {


            try {
                System.out.println("Email: " + emailInputR.getText());
                System.out.println("Username: " + emailInputR.getText());
                System.out.println("Password: " + passwordInputR.getText());
                System.out.println("Password hash: " + Hash.generateHash(passwordInputR.getText(), "SHA-256"));
            } catch (NoSuchAlgorithmException error) {
                AlertBox.display("ERROR", "No such algorithm exception");
                error.printStackTrace();
            }

            try {
                addButtonClicked();
            } catch (FileNotFoundException error) {
                System.out.println("File not found");
            }
        });

        Label Welcome = new Label("Welcome to the homepage!");

        //Add everything to grid
        grid.getChildren().addAll(usernameLabel, usernameInput, passwordLabel, passwordInput, loginButton, Signup);
        grid1.getChildren().addAll(emailLabel, emailInputR, usernameLabelr, usernameInputR, passwordLabelr, passwordInputR, registerButton);

        grid2.getChildren().addAll(Welcome, mycarbonButton, statisticsButton, leaderboardButton, quitButton);

        scene = new Scene(grid, 250, 180);
        scene1 = new Scene(grid1, 250, 180);
        scene2 = new Scene(grid2, 500, 500);


        window.setScene(scene);
        window.show();
    }

    public void addButtonClicked() throws FileNotFoundException {
        String email = emailInputR.getText();
        String username = usernameInputR.getText();
        String password = passwordInputR.getText();

        try {
            currentUser = new User(username, Hash.generateHash(password, "SHA-256"));
            restfulClient.postEntity(currentUser);
            id++;
        }catch (NoSuchAlgorithmException NSA) {
            System.out.println("No such Algorithm");
        }
        emailInputR.clear();
        usernameInputR.clear();
        passwordInputR.clear();
    }

    //Closing down the program method.
    public void closeProgram() {
        boolean answer = ConfirmBox.display("Exit Box", "Are you sure you want to exit?");
        if (answer) {
            window.close();
        }
    }
}