package client;

import classes.Controller;
import classes.User;
import javafx.scene.chart.CategoryAxis;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontWeight;
import javafx.stage.Stage;
import java.util.List;

/**
 * Statistics class.
 */
public class Statistics {
    /**
     * Show options for statistics button.
     *
     * @param grid gridf parameter.
     * @param user user parameter.
     * @param window window parameter.
     */
    public static void showOptions(final GridPane grid, final User user, final Stage window) {
        final CategoryAxis xAxis = new CategoryAxis();
        final NumberAxis yAxis = new NumberAxis();
        xAxis.setLabel("Date");
        final LineChart<String, Number> lineChart = new LineChart<>(xAxis, yAxis);

        lineChart.setTitle("MY STATISTICS");

        XYChart.Series polarSeries = new XYChart.Series();
        polarSeries.setName("POLAR SCORE");
        XYChart.Series foodSeries = new XYChart.Series();
        foodSeries.setName("FOOD SCORE");
        XYChart.Series transportSeries = new XYChart.Series();
        transportSeries.setName("TRANSPORT SCORE");
        XYChart.Series electricitySeries = new XYChart.Series();
        electricitySeries.setName("ELECTRICITY SCORE");

        List<classes.Statistics> polardata = new Controller().getStatsByType(user.getUsername(), "ALL");
        for (classes.Statistics stat : polardata) {
            polarSeries.getData().add(new XYChart.Data(stat.getDate(), stat.getScore()));
        }
        List<classes.Statistics> fooddata = new Controller().getStatsByType(user.getUsername(), "FOOD");
        for (classes.Statistics stat : fooddata) {
            foodSeries.getData().add(new XYChart.Data(stat.getDate(), stat.getScore()));
        }
        List<classes.Statistics> transportdata = new Controller().getStatsByType(user.getUsername(), "TRANSPORT");
        for (classes.Statistics stat : transportdata) {
            transportSeries.getData().add(new XYChart.Data(stat.getDate(), stat.getScore()));
        }
        List<classes.Statistics> electricitydata = new Controller().getStatsByType(user.getUsername(), "ELECTRICITY");
        for (classes.Statistics stat : electricitydata) {
            electricitySeries.getData().add(new XYChart.Data(stat.getDate(), stat.getScore()));
        }

        lineChart.getData().addAll(polarSeries, foodSeries, transportSeries, electricitySeries);
        lineChart.setMinWidth(1420);
        lineChart.setMinHeight(900);
        grid.getChildren().setAll(lineChart);
    }
}
