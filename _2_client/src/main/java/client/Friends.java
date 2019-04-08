package client;


import classes.*;
import css.Css;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;

import java.util.List;

/**
 * Class friends.
 */
public class Friends {
    /**
     * Variables.
     */
    static TableView friendsTable = new TableView();
    /**
     * Show options for friends method.
     *
     * @param grid   parameter grid
     * @param scene  scene parameter
     * @param user   user parameter
     * @param window window parameter
     */
    public static void showOptions(final GridPane grid, final Scene scene, final User user, final Stage window) {

        String icon = UserBadge.iconChoice(user);


        //CLEARING THE GRID FROM PREVIOUS ADDITIONS.
        grid.getChildren().clear();

        //Creating Labels for addition
        Label friendsL = new Label("My Friends");
        HBox Friendsbox= new HBox();
        Button backButton = new Button();
        Css.setBackButtonStyle(backButton);
        Friendsbox.getChildren().addAll(backButton, friendsL);
        TextField searchField = new TextField();
        Label findfriendsLabel = new Label("ADD FRIENDS");
        VBox results= new VBox();
        VBox pending= new VBox();
        VBox friendsVbox = new VBox(Friendsbox, friendsTable);
        VBox findfriendsVbox = new VBox(findfriendsLabel,searchField, results);
        addFriendRequests(user,pending);

        searchField.setPromptText("Search to Follow");
        searchField.textProperty().addListener((observable, oldValue, newValue) -> {
            getResults(user, newValue, results, searchField);
            System.out.println("textfield changed from " + oldValue + " to " + newValue);

        });

        //ADDING THE COLLUMNS TO THE TABLES.
        TableColumn col1 = new TableColumn("Username");
        col1.setCellValueFactory(new PropertyValueFactory<>("Username"));
        TableColumn col2 = new TableColumn("Score");
        col2.setCellValueFactory(new PropertyValueFactory<>("Polarscore"));
        TableColumn col3 = new TableColumn("Badge");
        col3.setCellValueFactory(new PropertyValueFactory<>("Badge"));
        friendsTable.getColumns().setAll(col1, col2, col3);
        col1.setMinWidth(200);
        col1.setMaxWidth(200);
        col2.setMaxWidth(200);
        col2.setMinWidth(200);
        col3.setMinWidth(125);
        col3.setMaxWidth(125);

        //backButton
        backButton.setOnAction(e -> {
            Home.showHome(window, user);
        });


        HBox ROW1 = new HBox();
        ROW1.getChildren().addAll(friendsVbox,findfriendsVbox, pending);
        ROW1.setAlignment(Pos.CENTER);
        grid.getChildren().addAll(ROW1);

        friendsTable.setItems(addFriend(user));
        friendsL.setFont(Font.font("Amble CN", FontWeight.BOLD, 35));
        friendsL.setTextFill(Color.web("#0076a3"));
        findfriendsLabel.setFont(Font.font("Amble CN", FontWeight.BOLD, 35));
        findfriendsLabel.setTextFill(Color.web("#0076a3"));
        friendsVbox.setStyle("-fx-padding:15;");
        friendsVbox.setSpacing(20);
        friendsVbox.setAlignment(Pos.CENTER_LEFT);
        findfriendsVbox.setStyle("-fx-padding:20; -fx-background-color: white");
        findfriendsVbox.setSpacing(20);
        pending.setStyle("-fx-padding:20; -fx-background-color: white");
        grid.setMinWidth(1500);
        grid.setStyle("-fx-font-size: 18pt; -fx-padding: 10px;");
    }

    /**
     * Gives back the list of friends to addd to thetable.
     *
     * @param user parameter
     * @return returns al ist.
     */
    public static ObservableList<Friend> addFriend(User user) {
        ObservableList<Friend> friend = FXCollections.observableArrayList();
        List<User> friendList = new Controller().getAllFriends(user);

        for (User a : friendList) {
            friend.add(new Friend(a));
        }
        return friend;
    }

    /**
     * Returns a list of friend requests.
     *
     * @param user parameter
     * @return a list of requests.
     */
    public static void addFriendRequests(final User user, VBox pending) {
        List<FriendRequest> friendRequestList = new Controller().getAllRequests(user);
        pending.getChildren().clear();
        for (FriendRequest a : friendRequestList) {
            HBox row= new HBox();
            Label sender= new Label(a.getSender());
            Button accept= new Button("Accept");
            Button reject = new Button("Reject");
            accept.setOnAction(e->{
                new Controller().sayYes(a);
                friendsTable.setItems(addFriend(user));
                addFriendRequests(user, pending);
            });
            reject.setOnAction(e->{
                new Controller().sayNo(a);
                friendsTable.setItems(addFriend(user));
                addFriendRequests(user, pending);
            });
            row.getChildren().addAll(sender,accept,reject);
            row.setSpacing(20);
            pending.getChildren().add(row);
        }
    }

    public static void getResults(User user, String search, VBox resultsbox, TextField searchfield) {
        if (search.length()>=1) {
            List<String> Results = new RestfulClient().findUsersByRegex(search, user.getUsername());
            // new RestfulClient().findUsersByRegex(search, user.getUsername());
            resultsbox.getChildren().clear();
            for (String a : Results) {
                if(!a.equals(user.getUsername())) {
                    HBox row = new HBox();
                    Label username = new Label(a);
                    Button add = new Button("ADD");
                    add.setOnAction(e -> {
                        classes.FriendRequest friendRequest = new classes.FriendRequest(user.getUsername(), a);
                        new RestfulClient().sendFriendRequest(friendRequest);
                        searchfield.clear();
                    });
                    row.getChildren().addAll(username, add);
                    row.setSpacing(15);
                    resultsbox.getChildren().add(row);
                }
            }
        }
        else {
            resultsbox.getChildren().clear();
        }
    }
}
