package client;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.Scene;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Table {


    public static void display(String title) throws FileNotFoundException {
        Stage window = new Stage();
        TableView<Product> table;
        TextField emailInput, usernameInput, passwordInput;
        window.setTitle("Table");

        //Name column
        TableColumn<Product, String> emailColumn = new TableColumn<>("Email");
        emailColumn.setMinWidth(200);
        emailColumn.setCellValueFactory(new PropertyValueFactory<>("email"));

        //Price column
        TableColumn<Product, String> usernameColumn = new TableColumn<>("Username");
        usernameColumn.setMinWidth(100);
        usernameColumn.setCellValueFactory(new PropertyValueFactory<>("username"));

        //Quantity column
        TableColumn<Product, String> passwordColumn = new TableColumn<>("Password");
        passwordColumn.setMinWidth(550);
        passwordColumn.setCellValueFactory(new PropertyValueFactory<>("password"));


        table = new TableView<>();
        table.setItems(getProduct());
        table.getColumns().addAll(emailColumn, usernameColumn, passwordColumn);

        VBox vBox = new VBox();
        vBox.getChildren().addAll(table);

        Scene scene = new Scene(vBox);
        window.setScene(scene);
        window.showAndWait();
    }

    //Get all of the products
    public static ObservableList<Product> getProduct() throws FileNotFoundException {
        ObservableList<Product> products = FXCollections.observableArrayList();
        String email = "";
        String username = "";
        String password = "";
        Scanner sc = new Scanner(new File("_2_client/src/Table"));
        while (sc.hasNextLine()) {
            email = sc.next().replace(",", "");
            username = sc.next().replace(",", "");
            password = sc.next().replace(",", "");
            products.add(new Product(email, username, password));
        }
        return products;
    }


}