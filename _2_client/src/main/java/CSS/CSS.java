package client;

import com.jfoenix.controls.JFXSnackbar;
import javafx.beans.binding.Bindings;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class CSS {
    public static void setButtonStyle(Button button){
        button.styleProperty().bind(Bindings.when(button.hoverProperty())
                .then("-fx-pref-width: 400;-fx-pref-height: 70;-fx-font-size: 42; -fx-background-color: #81b8d7; -fx-text-fill: White;-fx-border-color: white;")
                .otherwise("-fx-pref-width: 400;-fx-pref-height: 70;-fx-font-size: 42; -fx-background-color: #a8d2e9; -fx-text-fill: black;-fx-border-color: white;"));
    }

    public static void setSmallButtonStyle(Button button){
        button.styleProperty().bind(Bindings.when(button.hoverProperty())
                .then("-fx-background-color: #81b8d7; -fx-text-fill: white;-fx-border-color:rgba(0,0,0,0) ;-fx-background-radius: 10;")
                .otherwise("-fx-background-color: #a8d2e9; -fx-text-fill: white;-fx-border-color: rgba(0,0,0,0);-fx-background-radius: 10;"));
    }

    public static void setBackButtonStyle(Button button){
        button.styleProperty().bind(Bindings.when(button.hoverProperty())
                .then("-fx-graphic: url('https://i.ibb.co/dgvMZgJ/back-hover-small.png'); " +
                        "-fx-background-color: rgba(0,0,0,0); -fx-border-color: rgba(0,0,0,0);")
                .otherwise("-fx-graphic: url('https://i.ibb.co/j9CkHzX/back-small.png'); " +
                        "-fx-background-color: rgba(0,0,0,0); -fx-border-color: rgba(0,0,0,0);"));
    }

    public static void setTrophyButtonStyle(Button button){
        button.styleProperty().bind(Bindings.when(button.hoverProperty())
                .then("-fx-graphic: url('https://i.ibb.co/Jxsmw99/trophy-hover.png'); " +
                        "-fx-background-color: rgba(0,0,0,0); -fx-border-color: rgba(0,0,0,0);")
                .otherwise("-fx-graphic: url('https://i.ibb.co/YcCNG8K/trophy.png'); " +
                        "-fx-background-color: rgba(0,0,0,0); -fx-border-color: rgba(0,0,0,0);"));
    }
    public static void setTextFieldStyle(TextField textField){
        textField.styleProperty().bind(Bindings.when(textField.hoverProperty())
                .then("")
                .otherwise(""));
    }

}
