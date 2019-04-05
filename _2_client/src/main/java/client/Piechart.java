package client;

import javafx.scene.chart.PieChart;
import javafx.scene.layout.HBox;


public class Piechart {

    /**
     * Declare Hbox.
     */
    static HBox pieChartBox;


    public void PieChart() {
        PieChart pieChart = new PieChart();
        PieChart.Data slice1 = new PieChart.Data("Desktop", 213);

        

        }

    /**
     * getter for for electricityHbox.
     */
    public static HBox getPieChartBox() {
        return pieChartBox;
    }

}