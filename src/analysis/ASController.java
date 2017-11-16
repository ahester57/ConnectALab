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

public class ASController extends Application
{
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

        AtomicAbScene abScene = (AtomicAbScene) button_view.getScene();
        aaData = abScene.getAAData();
        aaValidity = abScene.getAAValidity();
        System.out.println( aaData );
        System.out.println( aaValidity );

        try {
            if (event.getSource() == button_view) {
                //Clear chart
                chart_linechart.getData().clear();

                //Create new series
                XYChart.Series<Number, Number> series  = new XYChart.Series<>();
                series.setName("Chemical Concentration");

                //X-axis setup
                NumberAxis xAxis = (NumberAxis) chart_linechart.getXAxis();
                xAxis.setAutoRanging(false);
                xAxis.setLowerBound(200);
                xAxis.setUpperBound(800);
                xAxis.setLabel("Time (ms)");

                //Y-axis setup
                NumberAxis yAxis = (NumberAxis) chart_linechart.getYAxis();
                yAxis.setAutoRanging(false);
                yAxis.setLowerBound(0);
                yAxis.setUpperBound(50);
                yAxis.setLabel("Concentration (mg/L)");

                //Set data points
                if (aaValidity == 1) {
                    series.getData().add(new XYChart.Data<>(200, 2));
                    series.getData().add(new XYChart.Data<>(233, 3));
                    series.getData().add(new XYChart.Data<>(238, 40));
                    series.getData().add(new XYChart.Data<>(243, 3));
                    series.getData().add(new XYChart.Data<>(800, 2));

                } else if (aaValidity == 0) {
                    series.getData().add(new XYChart.Data<>(200, 2));
                    series.getData().add(new XYChart.Data<>(233, 3));
                    series.getData().add(new XYChart.Data<>(238, 3));
                    series.getData().add(new XYChart.Data<>(243, 3));
                    series.getData().add(new XYChart.Data<>(800, 2));
                }

                //Draw graph
                chart_linechart.getData().add(series);

            } else if (event.getSource() == button_backtosetup) {

                root = FXMLLoader.load(getClass().getResource("../setup/setup.fxml"));
                scene = new Scene(root, 600, 400);

                stage = (Stage) button_backtosetup.getScene().getWindow();
                stage.setTitle("Connect-A-Lab (Setup)");
                stage.setScene(scene);
                stage.show();

            }

        }catch (Exception e){
            e.printStackTrace();

        }

    }

}
