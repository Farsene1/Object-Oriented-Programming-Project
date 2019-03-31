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
        lineChart.getData().addAll(PolarSeries);
        grid.getChildren().setAll(lineChart);


    }
}
