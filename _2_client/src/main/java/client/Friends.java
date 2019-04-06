package client;

import classes.*;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.input.MouseButton;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
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
    static TableView pendingTable = new TableView();

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
        Label friendsL = new Label("My Friend List");
        Label friendsP = new Label("Pending friend Requests");
        TextField addaFriend = new TextField();
        Button addaFriendB = new Button("Add A Friend");
        Label friendsLabel = new Label("FRIENDS");
        Button backButton = new Button("Back");


        //Making of Vboxes and Hboxes in order to show the tables on screen
        HBox vbox = new HBox(addaFriend, addaFriendB);
        VBox vbox1 = new VBox(friendsL, vbox, friendsTable);
        VBox vbox2 = new VBox(friendsP, pendingTable);
        vbox1.setStyle("-fx-padding:15;");
        vbox2.setStyle("-fx-padding:15;");
        vbox1.setSpacing(20);
        vbox2.setSpacing(20);

        vbox1.setAlignment(Pos.CENTER_LEFT);
        vbox2.setAlignment(Pos.CENTER_RIGHT);
        // GridPane.setConstraints(Vbox1,0,0);
        //  GridPane.setConstraints(Vbox2,7,0);
        //ADDING THE COLLUMNS TO THE TABLES.
        TableColumn col1 = new TableColumn("Username");
        col1.setCellValueFactory(new PropertyValueFactory<>("username"));
        TableColumn col2 = new TableColumn("Score");
        col2.setCellValueFactory(new PropertyValueFactory<>("PolarScore"));


        TableColumn col3 = new TableColumn("Username");
        col3.setCellValueFactory(new PropertyValueFactory<>("sender"));

        TableColumn col4 = new TableColumn("Badge (click to see)");
        col4.setCellValueFactory(new PropertyValueFactory<>("badge"));
        //   TableColumn col4 = new TableColumn("Accept/Decline");
        //  col4.setCellValueFactory(new PropertyValueFactory<>("accept/decline"));
        friendsTable.getColumns().setAll(col1, col2, col4);
        pendingTable.getColumns().setAll(col3);
        col1.setMinWidth(200);
        col1.setMaxWidth(200);
        col2.setMaxWidth(200);
        col2.setMinWidth(200);
        col3.setMinWidth(250);
        col4.setMinWidth(250);
        //backButton
        backButton.setOnAction(e -> {
            Home.showHome(window, user);
        });


        //Lastly creating 2 different.
        //Hboxes so we can add everything to the grid.

        HBox toplayer = new HBox();
        HBox middleLayer = new HBox();
        toplayer.getChildren().addAll(friendsLabel, backButton);
        middleLayer.getChildren().addAll(vbox1, vbox2);
        GridPane.setConstraints(toplayer, 5, 0);
        GridPane.setConstraints(middleLayer, 5, 30);
        toplayer.setAlignment(Pos.TOP_CENTER);
        middleLayer.setAlignment(Pos.CENTER);
        grid.getChildren().addAll(toplayer, middleLayer);

        grid.setMinWidth(1500);
        grid.setStyle("-fx-font-size: 18pt; -fx-padding: 10px;");

        /**
         * Button set on action method.
         */

        addaFriendB.setOnAction(e -> {
            classes.FriendRequest friendRequest = new classes.FriendRequest(user.getUsername(), addaFriend.getText());
            new RestfulClient().sendFriendRequest(friendRequest);
            addaFriend.clear();
        });


        /**
         * Row factory method
         * so you can click and accept or decline
         * a friend request.
         */
        pendingTable.setRowFactory(tv -> {
            TableRow<FriendRequest> row = new TableRow<>();
            row.setOnMouseClicked(event -> {
                if (!row.isEmpty() && event.getButton() == MouseButton.PRIMARY
                        && event.getClickCount() == 2) {

                    FriendRequest clickedRow = row.getItem();
                    int answer = BoxAddFriend.display("Add A friend", clickedRow);
                    if (answer == 2) {
                        pendingTable.getItems().remove(clickedRow);
                        new Controller().sayNo(clickedRow);
                    } else if (answer == 1) {
                        clickedRow.setAccepted(true);
                        if (!clickedRow.getSender().equals(clickedRow.getReceiver())) {
                            new Controller().sayYes(clickedRow);
                        }
                        pendingTable.getItems().remove(clickedRow);
                    }

                }
            });
            return row;

        });

        /**
         * Row click to show badges of friends.
         */
        friendsTable.setRowFactory(tv -> {
            TableRow row = new TableRow<>();
            row.setOnMouseClicked(event -> {
                if (!row.isEmpty() && event.getButton() == MouseButton.PRIMARY
                        && event.getClickCount() == 1) {
                    Object friend = friendsTable.getSelectionModel().getSelectedItem();
                    String testBadge = friend.toString();
                    String badge = testBadge.split(",")[2].substring(1);
                    badge = badge.replace("badge= ", "");
                    badge = badge.replace("}", "");
                    int badgeNumber = Integer.parseInt(badge);
                    BoxBadge.displayFriendBadge("Friends badge", badgeNumber);
                }
            });
            return row;
        });

        pendingTable.setItems(addFriendRequests(user));
        friendsTable.setItems(addFriend(user));

    }

    /**
     * Gives back the list of friends to addd to thetable.
     *
     * @param user parameter
     * @return returns al ist.
     */
    public static ObservableList<User> addFriend(User user) {
        ObservableList<User> friend = FXCollections.observableArrayList();
        List<User> friendList = new Controller().getAllFriends(user);

        for (User a : friendList) {
            friend.add(a);
        }
        return friend;
    }

    /**
     * Returns a list of friend requests.
     *
     * @param user parameter
     * @return a list of requests.
     */
    public static ObservableList<FriendRequest> addFriendRequests(final User user) {
        ObservableList<FriendRequest> friendRequests = FXCollections.observableArrayList();
        List<FriendRequest> friendRequestList = new Controller().getAllRequests(user);

        for (FriendRequest a : friendRequestList) {
            friendRequests.add(a);
        }
        return friendRequests;
    }


}
