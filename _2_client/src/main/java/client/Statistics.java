package client;

import classes.Controller;
import classes.User;
import javafx.scene.chart.CategoryAxis;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;
import java.util.List;

public class Statistics {

    public static void showOptions(GridPane grid, User user, Stage window) {
        final CategoryAxis xAxis = new CategoryAxis();
        final NumberAxis yAxis = new NumberAxis();
        xAxis.setLabel("Date");
        final LineChart<String, Number> lineChart = new LineChart<>(xAxis, yAxis);

        lineChart.setTitle("MY STATISTICS");

        XYChart.Series PolarSeries = new XYChart.Series();
        PolarSeries.setName("POLAR SCORE");

        List<classes.Statistics> data= new Controller().getStatistics(user.getUsername());
        for (classes.Statistics stat:data) {
            PolarSeries.getData().add(new XYChart.Data(stat.getDate(), stat.getScore()));
        }

//        XYChart.Series series2 = new XYChart.Series();
//        series2.setName("Portfolio 2");
//        series2.getData().add(new XYChart.Data("Jan", 33));
//        series2.getData().add(new XYChart.Data("Feb", 34));
//        series2.getData().add(new XYChart.Data("Mar", 25));
//        series2.getData().add(new XYChart.Data("Apr", 44));
//        series2.getData().add(new XYChart.Data("May", 39));
//        series2.getData().add(new XYChart.Data("Jun", 16));
//        series2.getData().add(new XYChart.Data("Jul", 55));
//        series2.getData().add(new XYChart.Data("Aug", 54));
//        series2.getData().add(new XYChart.Data("Sep", 48));
//        series2.getData().add(new XYChart.Data("Oct", 27));
//        series2.getData().add(new XYChart.Data("Nov", 37));
//        series2.getData().add(new XYChart.Data("Dec", 29));
//
//        XYChart.Series series3 = new XYChart.Series();
//        series3.setName("Portfolio 3");
//        series3.getData().add(new XYChart.Data("Jan", 44));
//        series3.getData().add(new XYChart.Data("Feb", 35));
//        series3.getData().add(new XYChart.Data("Mar", 36));
//        series3.getData().add(new XYChart.Data("Apr", 33));
//        series3.getData().add(new XYChart.Data("May", 31));
//        series3.getData().add(new XYChart.Data("Jun", 26));
//        series3.getData().add(new XYChart.Data("Jul", 22));
//        series3.getData().add(new XYChart.Data("Aug", 25));
//        series3.getData().add(new XYChart.Data("Sep", 43));
//        series3.getData().add(new XYChart.Data("Oct", 44));
//        series3.getData().add(new XYChart.Data("Nov", 45));
//        series3.getData().add(new XYChart.Data("Dec", 44));

        lineChart.getData().addAll(PolarSeries);
        grid.getChildren().setAll(lineChart);


    }
}
