package client;

import com.jfoenix.controls.JFXButton;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Modality;
import javafx.stage.Stage;



/**
 * box confirm.
 */
public class BoxConfirm {

    //Create variable.
    static boolean answer;


    /**
     * Display method for the confirm box.
     *
     * @param title   title parameter.
     * @param message message parameter.
     * @return answer.
     */
    public static boolean display(final String title, final String message) {
        Stage window = new Stage();
        window.initModality(Modality.APPLICATION_MODAL);
        window.setTitle(title);
        window.setMinWidth(250);
        Label label = new Label();
        label.setText(message);

        //Create two buttons.
        JFXButton yesButton = new JFXButton("Yes");
        JFXButton noButton = new JFXButton("No");

        //Button styling
        yesButton.setStyle("-jfx-button-type: RAISED;"
                + "-fx-background-color: white;"
                + "-fx-text-fill: black;"
                + "-jfx-disable-visual-focus: true");
        noButton.setStyle("-jfx-button-type: RAISED;"
                + "-fx-background-color: white;"
                + "-fx-text-fill: black;"
                + "-jfx-disable-visual-focus: true");

        //Clicking will set answer and close window.
        yesButton.setOnAction(e -> {
            answer = true;
            window.close();
        });
        noButton.setOnAction(e -> {
            answer = false;
            window.close();
        });

        VBox vlayout = new VBox(10);
        HBox hlayout = new HBox(10);

        //Add buttons.
        hlayout.getChildren().addAll(yesButton, noButton);
        vlayout.getChildren().addAll(label, hlayout);

        vlayout.setAlignment(Pos.CENTER);
        hlayout.setAlignment(Pos.CENTER);
        Scene scene = new Scene(vlayout);
        window.setScene(scene);
        window.showAndWait();

        //Make sure to return answer.
        return answer;
    }
}