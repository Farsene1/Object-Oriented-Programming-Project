package client;

import classes.User;
import javafx.scene.chart.PieChart;
import javafx.scene.layout.HBox;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.layout.VBox;
import javax.swing.text.html.ImageView;
import javafx.scene.control.Label;


public class Piechart {
    /**
     * Declare Vbox.
     */
    static VBox pieChartBox;
    static int foodTotal, foodPercent, transportTotal, transportPercent, electricityTotal, electricityPercent;

    public static void showPieChart(final User user) {

        Label label = new Label("Track your progress!");

        PieChart.Data data[] = new PieChart.Data[3];

        // string and integer data
        String status[] = {"Transport",  "Electricity", "Food"};

        pieChartBox = new VBox();

        foodTotal = user.getFoodScore();
        System.out.println(foodTotal);
        if(foodTotal == 0){foodTotal = 33;}

        transportTotal = user.getTransportScore();
        System.out.println(transportTotal);
        if(transportTotal == 0){transportTotal = 34;}

        electricityTotal = user.getElectricityScore();
        System.out.println(electricityTotal);
        if(electricityTotal == 0){electricityTotal = 33;}

        int sum = foodTotal + transportTotal + electricityTotal;

        foodPercent = (foodTotal / sum) * 100;
        transportPercent = (transportTotal / sum) * 100;
        electricityPercent = (electricityTotal / sum) * 100;
        System.out.println(foodPercent);
        System.out.println(transportPercent);
        System.out.println(electricityPercent);

        int values[] = {foodPercent, transportPercent, electricityPercent};

        for (int i = 0; i < 3; i++) {
            data[i] = new PieChart.Data(status[i], values[i]);
        }
//
//        ObservableList<PieChart.Data> pieChartData =
//                FXCollections.observableArrayList(
//                        new PieChart.Data("Food", foodPercent),
//                        new PieChart.Data("Transport", transportPercent),
//                        new PieChart.Data("Electricity", electricityPercent));
//        final PieChart chart = new PieChart(pieChartData);

        //chart.setTitle("Track your progress!");

        PieChart pie_chart = new PieChart(FXCollections.observableArrayList(data));

        //Group group = new Group(pie_chart);

       pieChartBox.getChildren().addAll(label, pie_chart);
    }


    /**
     * getter for for PicChartVbox.
     */
    public static VBox getPieChartBox() {
        return pieChartBox;
    }
}

