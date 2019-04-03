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

public class Friends {
    static TableView friendsTable = new TableView();
    static TableView pendingTable = new TableView();


    public static void showOptions(GridPane grid, Scene scene, User user, Stage window) {

        String icon = UserBadge.getIcon();


        FriendRequest test = new FriendRequest("ok", "pablo");
        User pablo = new User("pablo", "alsihdbasd");
        pablo.setPolarScore(123);
        //CLEARING THE GRID FROM PREVIOUS ADDITIONS
        grid.getChildren().clear();

        //Creating Labels for addition
        Label friendsL = new Label("My Friend List");
        Label friendsP = new Label("Pending friend Requests");
        TextField addaFriend = new TextField();
        Button addaFriendB = new Button("Add A Friend");
        Label FriendsLabel = new Label("FRIENDS");
        Button backButton = new Button("Back");


        //Making of Vboxes and Hboxes in order to show the tables on screen
        HBox Vbox = new HBox(addaFriend, addaFriendB);
        VBox Vbox1 = new VBox(friendsL, Vbox, friendsTable);
        VBox Vbox2 = new VBox(friendsP, pendingTable);
        Vbox1.setStyle("-fx-padding:15;");
        Vbox2.setStyle("-fx-padding:15;");
        Vbox1.setSpacing(20);
        Vbox2.setSpacing(20);

        Vbox1.setAlignment(Pos.CENTER_LEFT);
        Vbox2.setAlignment(Pos.CENTER_RIGHT);
        // GridPane.setConstraints(Vbox1,0,0);
        //  GridPane.setConstraints(Vbox2,7,0);
        //ADDING THE COLLUMNS TO THE TABLES
        TableColumn Col1 = new TableColumn("Username");
        Col1.setCellValueFactory(new PropertyValueFactory<>("username"));
        TableColumn Col2 = new TableColumn("Score");
        Col2.setCellValueFactory(new PropertyValueFactory<>("PolarScore"));


        TableColumn Col3 = new TableColumn("Username");
        Col3.setCellValueFactory(new PropertyValueFactory<>("sender"));

        TableColumn Col4 = new TableColumn("Badge (click to see)");
        Col4.setCellValueFactory(new PropertyValueFactory<>("badge")) ;
        //   TableColumn Col4 = new TableColumn("Accept/Decline");
        //  Col4.setCellValueFactory(new PropertyValueFactory<>("accept/decline"));
        friendsTable.getColumns().setAll(Col1, Col2, Col4);
        pendingTable.getColumns().setAll(Col3);
        Col1.setMinWidth(200);
        Col1.setMaxWidth(200);
        Col2.setMaxWidth(200);
        Col2.setMinWidth(200);
        Col3.setMinWidth(250);
        Col4.setMinWidth(250);
        //backButton
        backButton.setOnAction(e -> {
            Home.showHome(window, user);
        });


        //Lastly creating 2 different
        //Hboxes so we can add everything to the grid

        HBox toplayer = new HBox();
        HBox middleLayer = new HBox();
        toplayer.getChildren().addAll(FriendsLabel, backButton);
        middleLayer.getChildren().addAll(Vbox1, Vbox2);
        GridPane.setConstraints(toplayer, 5, 0);
        GridPane.setConstraints(middleLayer, 5, 30);
        toplayer.setAlignment(Pos.TOP_CENTER);
        middleLayer.setAlignment(Pos.CENTER);
        grid.getChildren().addAll(toplayer, middleLayer);

        grid.setMinWidth(1500);
        grid.setStyle("-fx-font-size: 18pt; -fx-padding: 10px;");


        addaFriendB.setOnAction(e -> {
            classes.FriendRequest friendRequest = new classes.FriendRequest(user.getUsername(), addaFriend.getText());
            new RestfulClient().sendFriendRequest(friendRequest);
            addaFriend.clear();
        });


        //ON CLICKING ON A ROW YOU CHOOSE WHAT TOU WANT TO DO WITH THE FRIEND REQUEST
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
                    } else if(answer== 1){
                        clickedRow.setAccepted(true);
                        if(!clickedRow.getSender().equals(clickedRow.getReceiver())){
                            new Controller().sayYes(clickedRow);
                        }
                        pendingTable.getItems().remove(clickedRow);
                    }

                }
            });
            return row;

        });


        //ON CLICKING ON A ROW YOU CHOOSE WHAT TOU WANT TO DO WITH THE FRIEND REQUEST
        friendsTable.setRowFactory(tv -> {
            TableRow row = new TableRow<>();
            row.setOnMouseClicked(event -> {
                if (!row.isEmpty() && event.getButton() == MouseButton.PRIMARY
                        && event.getClickCount() == 2) {

                    Object friend = friendsTable.getSelectionModel().getSelectedItem();
                    String testBadge = friend.toString();
                    System.out.println(testBadge);
                    String badge = testBadge.split(",")[2].substring(1);
                    badge = badge.replace("badge= ","");
                    badge = badge.replace("}", "");
                    int badgeNumber = Integer.parseInt(badge);

                    if (badgeNumber == 36 || badgeNumber == 27) {
                        System.out.println(badge);
                    //BoxBadge.display("Badge", clickedRow);
//                    if (answer == 2) {
//                        friendsTable.getItems().remove(clickedRow);
//                        new Controller().sayNo(clickedRow);
//                    } else if(answer== 1){
//                        clickedRow.setAccepted(true);
//                        if(!clickedRow.getSender().equals(clickedRow.getReceiver())){
//                            new Controller().sayYes(clickedRow);
//                        }
//                        friendsTable.getItems().remove(clickedRow);
//                    }

                }
            });
            return row;

        });



        //TIMER for friends
     //   Timeline timer = new Timeline(new KeyFrame(Duration.seconds(10), new EventHandler<ActionEvent>() {

            //showing  friends
       //     @Override
       //     public void handle(ActionEvent event) {
                pendingTable.setItems(addFriendRequests(user));
                friendsTable.setItems(addFriend(user));

         //   }
     //   }));
      //  timer.setCycleCount(Timeline.INDEFINITE);
     //   timer.play();





    }

    public static ObservableList<User> addFriend(User user) {
        ObservableList<User> Friend = FXCollections.observableArrayList();
        List<User> FriendList = new Controller().getAllFriends(user);

        for (User a : FriendList) {
            Friend.add(a);
        }
        return Friend;
    }


    public static ObservableList<FriendRequest> addFriendRequests(User user) {
        ObservableList<FriendRequest> friendRequests = FXCollections.observableArrayList();
        List<FriendRequest> friendRequestList = new Controller().getAllRequests(user);

        for (FriendRequest a : friendRequestList) {
            friendRequests.add(a);
        }
        return friendRequests;
    }


}
