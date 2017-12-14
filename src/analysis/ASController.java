package analysis;

import data.AtomicAbsorption;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;
import javafx.scene.control.Button;
import javafx.stage.Stage;
import scenes.AtomicAbScene;

import java.io.IOException;
import java.util.Random;

public class ASController extends Application
{
    /*
        This class serves as the Analysis screen controller.
         To add handleButtonAction event = if (event.getSource() == <name_of_button>)
                                            { do button stuff }

     */
    private AtomicAbsorption aaData;
    private int aaValidity;
    @FXML
    public Button button_view;
    public LineChart chart_linechart;
    public Button button_backtosetup;

    @Override
    public void start(Stage stage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("analysis.fxml"));
        Scene scene = new Scene(root, 1000, 600);
        stage.setTitle("Connect-A-Lab (Analysis)");
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    private void handleButtonAction(ActionEvent event) throws IOException {
        Parent root;
        Scene scene;
        Stage stage;
        // Get data that was sent to the screen
        AtomicAbScene abScene = (AtomicAbScene) button_view.getScene();
        aaData = abScene.getAAData();            // Get input from setup
        aaValidity = abScene.getAAValidity();    // Determine validity
        System.out.println( aaData );
        System.out.println( aaValidity );

        try {
            if (event.getSource() == button_view) {
                // You pressed the view  button
                //Clear chart
                chart_linechart.getData().clear();
                //Create new series
                XYChart.Series<Number, Number> series  = new XYChart.Series<>();
                series.setName("Chemical Concentration");
                //X-axis setup
                NumberAxis xAxis = (NumberAxis) chart_linechart.getXAxis();
                xAxis.setAutoRanging(false);
                xAxis.setLowerBound(0);
                xAxis.setUpperBound(150);
                xAxis.setLabel("Time (s)");
                //Y-axis setup
                NumberAxis yAxis = (NumberAxis) chart_linechart.getYAxis();
                yAxis.setAutoRanging(false);
                yAxis.setLowerBound(0);
                yAxis.setUpperBound(50);
                yAxis.setLabel("Concentration (ppm)");
                // ppm, maybe do something else here
                int ppm = 40;
                //Set data points
                if (aaValidity == 1) {
                    if (ppm == 40) {
                        // Get graph for 40 ppm
                        series = getFortySeries();
                    } else if (ppm == 10) {
                        // Get graph for 40 ppm
                        series = getTenSeries();
                    }
                } else if (aaValidity == 0) {
                    // Make a "bad" graph
                    Random rand = new Random();
                    for (int i = 0; i < 30; i++) {
                        int y = rand.nextInt() % 3 + 2;
                        series.getData().add(new XYChart.Data<>(i*5, y));
                    }
                }
                //Draw pts + lines on graph
                chart_linechart.getData().add(series);

            } else if (event.getSource() == button_backtosetup) {
                // Go back to setup screen
                root = FXMLLoader.load(getClass().getResource("../setup/setup.fxml"));
                scene = new Scene(root, 1000, 600);
                stage = (Stage) button_backtosetup.getScene().getWindow();
                stage.setTitle("Connect-A-Lab (Setup)");
                stage.setScene(scene);
                stage.show();
            }

        }catch (Exception e){
            e.printStackTrace();
        }

    }

    // Get graph for 40 ppm
    private XYChart.Series<Number, Number> getFortySeries() {
        //Create new series
        XYChart.Series<Number, Number> series = new XYChart.Series<>();
        series.setName("Chemical Concentration");
        Random rand = new Random();
        int c = 5;                      // Constant for x-axis scale
        for (int i = 0; i < 17; i++) {
            int y = rand.nextInt() % 5 + 10;
            series.getData().add(new XYChart.Data<>(i*5, y));
        }
        series.getData().add(new XYChart.Data<>(17 * c, 17));
        series.getData().add(new XYChart.Data<>(18 * c, 21));
        series.getData().add(new XYChart.Data<>(19 * c, 40));
        series.getData().add(new XYChart.Data<>(20 * c, 39));
        series.getData().add(new XYChart.Data<>(21 * c, 36));
        series.getData().add(new XYChart.Data<>(22 * c, 21));

        for (int i = 23; i < 30; i++) {
            int y = rand.nextInt() % 5 + 10;
            series.getData().add(new XYChart.Data<>(i*5, y));
        }
        return series;
    }

    // Get graph for 10 ppm
    private XYChart.Series<Number, Number> getTenSeries() {
        //Create new series
        XYChart.Series<Number, Number> series = new XYChart.Series<>();
        series.setName("Chemical Concentration");
        Random rand = new Random();
        int c = 5;                      // Constant for x-axis scale
        for (int i = 0; i < 17; i++) {
            int y = rand.nextInt() % 3 + 2;
            series.getData().add(new XYChart.Data<>(i*5, y));
        }
        series.getData().add(new XYChart.Data<>(17 * c, 4));
        series.getData().add(new XYChart.Data<>(18 * c, 5));
        series.getData().add(new XYChart.Data<>(19 * c-2,8));
        series.getData().add(new XYChart.Data<>(19 * c, 10));
        series.getData().add(new XYChart.Data<>(19 * c+2,8));
        series.getData().add(new XYChart.Data<>(20 * c, 6));
        series.getData().add(new XYChart.Data<>(21 * c, 4));

        for (int i = 22; i < 30; i++) {
            int y = rand.nextInt() % 3 + 2;
            series.getData().add(new XYChart.Data<>(i*5, y));
        }
        return series;
    }
}
