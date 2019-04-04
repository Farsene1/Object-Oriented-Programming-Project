package client;

import CSS.CSSTable;
import classes.Activity;
import classes.Controller;
import classes.User;
import classes.UserBadge;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.geometry.Pos;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;

import java.util.List;

/**
 * FootPrint class.
 */
public class FootPrint {

    /**
     * Initialise table.
     */
    static TableView table = new TableView();

    /**
     * Show options for footprint.
     *
     * @param grid       gird parameter
     * @param user       user parameter
     * @param polarscore polarscore parameter
     * @param window     window parameter
     */
    public static void showOptions(final GridPane grid, final User user, final Label polarscore, final Stage window) {

        /**
         * Gets user specific badge.
         */
        String icon = UserBadge.getIcon();

        /**
         * Labels / Vbox added and styling.
         */
        Label myFootprint = new Label("My Activities!");
        myFootprint.setFont(Font.font("Amble CN", FontWeight.BOLD, 30));
        VBox footprint = new VBox(myFootprint, table);
        footprint.setStyle("-fx-padding: 15;");
        footprint.setSpacing(20);
        footprint.setAlignment(Pos.CENTER);

        /**
         * Adds columns to footprint table // simple styling.
         */
        TableColumn col1 = new TableColumn("Category");
        col1.setCellValueFactory(new PropertyValueFactory<>("cat"));
        TableColumn col2 = new TableColumn("Description");
        col2.setCellValueFactory(new PropertyValueFactory<>("description"));
        TableColumn col3 = new TableColumn("Footprint");
        col3.setCellValueFactory(new PropertyValueFactory<>("footprint"));
        TableColumn col4 = new TableColumn("Date");
        col4.setCellValueFactory(new PropertyValueFactory<>("date"));
        col1.setMinWidth(300);
        col2.setMinWidth(500);
        col3.setMinWidth(300);
        col4.setMinWidth(300);

        /**
         * Add items to table.
         */
        table.setItems(addItems(user));
        table.getColumns().setAll(col1, col2, col3, col4);

        /**
         * Footprint type labels.
         */
        Label foodLabel = new Label("Food Footprint ");
        Label electricityLabel = new Label("Electricity Footprint");
        Label transportLabel = new Label("Transport Footprint");

        /**
         * Initialixe Vboxes for footprint types.
         */
        VBox foodOptions = new VBox();
        VBox transportOptions = new VBox();
        VBox electricityOptions = new VBox();

        foodOptions.setStyle("-fx-padding: 15;");
        transportOptions.setStyle("-fx-padding: 15;");
        electricityOptions.setStyle("-fx-padding: 15;");
        //Footprint.setStyle("-fx-padding: 15;");
        GridPane.setConstraints(footprint, 0, 1);

        /**
         * Button to add food footprints.
         */
        Button food = new Button("+");
        food.setOnAction(e -> {
            try {
                BoxFood.addMeal("Food Footprint", "Add to your food footprint from the choices below!", user);
                table.setItems(addItems(user));
                polarscore.setText(user.getPolarScore().toString());
            } catch (NullPointerException NPE) {

            }
        });

        /**
         * Button to add transport footprints.
         */
        Button transport = new Button("+");
        // GridPane.setConstraints(Transport, 5, 1);
        transport.setOnAction(e -> {
            try {
                BoxTransport.addVehicle("Transport Footprint", "Select the transport option of your choice", user);
                table.setItems(addItems(user));
                polarscore.setText(user.getPolarScore().toString());
            } catch (NullPointerException NPE) {

            }
        });

        /**
         * Button to add electricity footprints.
         */
        Button electricity = new Button("+");
        //     GridPane.setConstraints(Electricity, 6, 1);
        electricity.setOnAction(e -> {
            try {
                BoxElectricity.addUsage("Electricity Footprint", "Select your electricity usage", user);
                table.setItems(addItems(user));
                polarscore.setText(user.getPolarScore().toString());
            } catch (NullPointerException NPE) {

            }
        });

        /**
         * Back button to return to home.
         */
        Button backButton = new Button("Back");
        backButton.setOnAction(e -> {
            System.out.println("Icon url: " + icon);
            Home.showHome(window, user);
        });

        GridPane.setConstraints(backButton, 1, 10);

        /**
         * Adding everything to the grid.
         */
        foodOptions.getChildren().addAll(foodLabel, food);
        transportOptions.getChildren().addAll(transportLabel, transport);
        electricityOptions.getChildren().addAll(electricityLabel, electricity);
        HBox hbox = new HBox();
        hbox.getChildren().addAll(foodOptions, transportOptions, electricityOptions);
        GridPane.setConstraints(hbox, 0, 0);
        grid.getChildren().setAll(hbox, footprint, backButton);

        /**
         * Simple styling.
         */
        food.setStyle("-fx-background-radius: 100;-fx-font-size: 42");
        transport.setStyle("-fx-background-radius: 100; -fx-font-size: 42");
        // quitButton.setStyle("-fx-pref-width: 400;-fx-pref-height: 70;-fx-font-size: 42");
        electricity.setStyle("-fx-background-radius: 100;-fx-font-size: 42");
        grid.setMinWidth(1500);
        table.setMaxHeight(770);
        table.setMinHeight(770);
        grid.setStyle("-fx-font-size: 18pt; -fx-padding: 10px;");
        foodOptions.setMinWidth(476);
        electricityOptions.setMinWidth(476);
        transportOptions.setMinWidth(476);


        CSSTable.styleTable(table);
    }

    /**
     * Adds item to the table of activities.
     *
     * @param user user parameter.
     * @return returns a list.
     */
    public static ObservableList<Activity> addItems(final User user) {
        ObservableList<Activity> activities = FXCollections.observableArrayList();
        List<Activity> act = new Controller().getAllActivities(user);
        for (Activity a : act) {
            activities.add(a);
        }
        return activities;
    }
}







