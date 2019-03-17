package client;

import classes.RestfulClient;
import classes.User;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.layout.*;
import javafx.stage.Stage;

import java.security.NoSuchAlgorithmException;

import static client.ValidatePassword.validatePassword;

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

        Button back= new Button("Back");
        back.setOnAction(e->{Login.showLogin(window);});

        //Register
        Button register = new Button("Register");
        GridPane.setConstraints(register, 1, 3);
        register.setOnAction(e -> {
            int step = 0;
            String valid = validatePassword(passwordInput.getText());
            if (passwordInput.getText().equals(passwordInput2.getText())) {
                String Password = passwordInput.getText();
                step = 1;
            }
            else
            {
                AlertBox.display("ERROR","The entered passwords do not match.");
            }

            if (step == 1 && valid.equals("valid")) {
                try {
                    User user = new User(usernameInput.getText(), Hash.generateHash(passwordInput.getText(), "SHA-256"));
                    restfulClient.postEntity(user);
                    System.out.println("Username: " + usernameInput.getText());
                    System.out.println("Password hash: " + Hash.generateHash(passwordInput.getText(), "SHA-256"));

                    usernameInput.clear();
                    passwordInput.clear();
                    passwordInput2.clear();
                    Home.showHome(window, user);
                } catch (NoSuchAlgorithmException error) {
                    AlertBox.display("ERROR", "No such algorithm exception");
                    error.printStackTrace();
                }
            }
            else if (step == 1){
                    AlertBox.display("ERROR", validatePassword(passwordInput.getText()));
            }
        });

        ImageView img= new ImageView("https://drive.google.com/uc?id=12Bowa9WczV-WVRlgH-zsZcdcSQyMa2nn");
        img.setFitWidth(350);
        img.setFitHeight(350);
        img.setStyle("-fx-padding: 10");
        VBox vbox = new VBox();
        usernameLabel.setStyle("-fx-padding: 0 20 0 40");
        passwordLabel.setStyle("-fx-padding: 0 20 0 40");

        Pane backpane= new Pane();
        backpane.setMinWidth(300);

        //Add everything to grid
        HBox hbox= new HBox();
        hbox.getChildren().addAll(back,backpane);
        grid.getChildren().addAll(usernameLabel, usernameInput, passwordLabel, passwordInput,passwordInput2, register);
        vbox.getChildren().addAll(hbox,img,grid);

        Pane test1=new Pane();
        Pane test2=new Pane();
        Pane test3=new Pane();
        Pane test4=new Pane();
        test1.setMinWidth(675);
        test2.setMinWidth(675);
        test3.setMinHeight(200);
        test4.setMinHeight(200);

        bp.setCenter(vbox);
        bp.setLeft(test1);
        bp.setRight(test2);
        bp.setTop(test3);
        bp.setBottom(test4);

        hbox.setStyle("-fx-padding: 0 0 0 20");
        bp.setStyle("-fx-background-image: url('https://i.pinimg.com/originals/36/f7/3d/36f73d2a6d91981d5a3aa644d897d467.jpg');");
        vbox.setStyle("-fx-background-color: rgba(255,255,255, 0.4); -fx-alignment: top-center; -fx-font-size: 17pt");
        vbox.setPadding(new Insets(20,0,40,0));

        Scene scene = new Scene(bp, 1920, 1080);
//        grid.setPadding(new Insets(100,0,0,0));

        window.setScene(scene);
        window.setMaximized(true);
        window.show();
    }

}
