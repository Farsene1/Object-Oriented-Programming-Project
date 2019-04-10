package css;

import javafx.beans.binding.Bindings;

import javafx.scene.control.Button;
import javafx.scene.control.TextField;

/**
 * css class.
 */
public class Css {
    /**
     * Sets button style.
     *
     * @param button button parameter.
     */
    public static void setButtonStyle(final Button button) {
        button.styleProperty().bind(Bindings.when(button.hoverProperty())
                .then("-fx-pref-width: 400;"
                        + "-fx-pref-height: 70;-fx-font-size: 42;"
                        + " -fx-background-color: #81b8d7;"
                        + " -fx-text-fill: White;"
                        + "-fx-border-color: white;")
                .otherwise("-fx-pref-width: 400;"
                        + "-fx-pref-height: 70;"
                        + "-fx-font-size: 42;"
                        + " -fx-background-color: #a8d2e9;"
                        + " -fx-text-fill: black;"
                        + "-fx-border-color: white;"));
    }

    /**
     * Sets small button style.
     *
     * @param button small button parameter.
     */
    public static void setSmallButtonStyle(final Button button) {
        button.styleProperty().bind(Bindings.when(button.hoverProperty())
                .then("-fx-background-color: #81b8d7;"
                        + " -fx-text-fill: white;"
                        + "-fx-border-color:rgba(0,0,0,0) ;"
                        + "-fx-background-radius: 10;")
                .otherwise("-fx-background-color: #a8d2e9;"
                        + " -fx-text-fill: white;"
                        + "-fx-border-color: rgba(0,0,0,0);"
                        + "-fx-background-radius: 10;"));
    }

    /**
     * Sets back button style.
     *
     * @param button button parameter.
     */
    public static void setBackButtonStyle(final Button button) {
        button.styleProperty().bind(Bindings.when(button.hoverProperty())
                .then("-fx-graphic: url('https://i.ibb.co/dgvMZgJ/back-hover-small.png'); "
                        + "-fx-background-color: rgba(0,0,0,0); -fx-border-color: rgba(0,0,0,0);")
                .otherwise("-fx-graphic: url('https://i.ibb.co/j9CkHzX/back-small.png'); "
                        + "-fx-background-color: rgba(0,0,0,0); -fx-border-color: rgba(0,0,0,0);"));
    }

    /**
     * Sets home button style.
     *
     * @param button button parameter.
     */
    public static void setHomeButtonStyle(final Button button) {
        button.styleProperty().bind(Bindings.when(button.hoverProperty())
                .then("-fx-graphic: url('https://i.ibb.co/9qcK3Vt/home.png'); "
                        + "-fx-background-color: rgba(0,0,0,0); -fx-border-color: rgba(0,0,0,0);")
                .otherwise("-fx-graphic: url('https://i.ibb.co/2yQnNyG/home-alt.png'); "
                        + "-fx-background-color: rgba(0,0,0,0); -fx-border-color: rgba(0,0,0,0);"));
    }

    /**
     * Sets trophy button style.
     *
     * @param button trophy button
     */
    public static void setTrophyButtonStyle(final Button button) {
        button.styleProperty().bind(Bindings.when(button.hoverProperty())
                .then("-fx-graphic: url('https://i.ibb.co/Jxsmw99/trophy-hover.png'); "
                      +  "-fx-background-color: rgba(0,0,0,0); -fx-border-color: rgba(0,0,0,0);")
                .otherwise("-fx-graphic: url('https://i.ibb.co/YcCNG8K/trophy.png'); "
                        + "-fx-background-color: rgba(0,0,0,0); -fx-border-color: rgba(0,0,0,0);"));
    }

    /**
     * Sets text field style.
     *
     * @param textField textfield parameter.
     */
    public static void setTextFieldStyle(final TextField textField) {
        textField.styleProperty().bind(Bindings.when(textField.hoverProperty())
                .then("")
                .otherwise(""));
    }

    /**
     * Sets plus button style.
     *
     * @param button button parameter.
     */
    public static void setplusButtonStyle(final Button button) {
        button.styleProperty().bind(Bindings.when(button.hoverProperty())
                .then("-fx-background-color: #79b4e5; "
                        + "-fx-background-radius: 100; "
                        + "-fx-font-size: 42; "
                        + "-fx-border-radius: 100;"
                        + "-fx-border-color: #52e5d6; "
                        + "-fx-border-width: 5px;"
                        + "-fx-text-fill: white")
                .otherwise("-fx-background-color: #87c9ff; "
                        + "-fx-background-radius: 100; "
                        + "-fx-font-size: 42; "
                        + "-fx-border-radius: 100;"
                        + "-fx-border-color: #5cffee; "
                        + "-fx-border-width: 5px;"));
    }
}
