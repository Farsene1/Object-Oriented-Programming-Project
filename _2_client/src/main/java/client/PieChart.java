package client;

        import javafx.application.Application;
        import javafx.scene.Scene;
        import javafx.scene.chart.PieChart;
        import javafx.scene.layout.HBox;
        import javafx.scene.layout.VBox;
        import javafx.stage.Stage;

        public class PieChart{

    /**
     * Declare Hbox.
     */
    static HBox pieChartBox;


    @Override
    public void PieChart() {
        //primaryStage.setTitle("My First JavaFX App");

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