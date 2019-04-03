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
        XYChart.Series FoodSeries = new XYChart.Series();
        FoodSeries.setName("FOOD SCORE");
        XYChart.Series TransportSeries = new XYChart.Series();
        TransportSeries.setName("TRANSPORT SCORE");
        XYChart.Series ElectricitySeries = new XYChart.Series();
        ElectricitySeries.setName("ELECTRICITY SCORE");

        List<classes.Statistics> polardata= new Controller().getStatsByType(user.getUsername(),"ALL");
        for (classes.Statistics stat:polardata) {
            PolarSeries.getData().add(new XYChart.Data(stat.getDate(), stat.getScore()));
        }
        List<classes.Statistics> fooddata= new Controller().getStatsByType(user.getUsername(),"FOOD");
        for (classes.Statistics stat:fooddata) {
            FoodSeries.getData().add(new XYChart.Data(stat.getDate(), stat.getScore()));
        }
        List<classes.Statistics> transportdata= new Controller().getStatsByType(user.getUsername(),"TRANSPORT");
        for (classes.Statistics stat:transportdata) {
            TransportSeries.getData().add(new XYChart.Data(stat.getDate(), stat.getScore()));
        }
        List<classes.Statistics> electricitydata= new Controller().getStatsByType(user.getUsername(),"ELECTRICITY");
        for (classes.Statistics stat:electricitydata) {
            ElectricitySeries.getData().add(new XYChart.Data(stat.getDate(), stat.getScore()));
        }

        lineChart.getData().addAll(PolarSeries, FoodSeries, TransportSeries,ElectricitySeries);
        lineChart.setMinWidth(1420);
        lineChart.setMinHeight(900);
        grid.getChildren().setAll(lineChart);
    }
}
