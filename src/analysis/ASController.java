package analysis;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import java.io.IOException;

public class ASController extends Application
{

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

        try {
            if (event.getSource() == button_view) {
                final NumberAxis yAxis = new NumberAxis();
                //chart_linechart.setTitle("Atomic Absorption Spectrometer");
                XYChart.Series series  = new XYChart.Series();
                series.setName("stuff");
                series.getData().add(new XYChart.Data(200, 2));
                series.getData().add(new XYChart.Data(233, 3));
                series.getData().add(new XYChart.Data(238, 40));
                series.getData().add(new XYChart.Data(243, 3));
                series.getData().add(new XYChart.Data(800, 2));
                chart_linechart.getData().add(series);
                NumberAxis xAxis = (NumberAxis) chart_linechart.getXAxis();
                xAxis.setAutoRanging(false);
                xAxis.setLowerBound(200);
                xAxis.setUpperBound(800);

                xAxis.setLabel("Time (ms)");
                yAxis.setLabel("Concentration (mg/L)");

                stage = (Stage) button_view.getScene().getWindow();

            } else if (event.getSource() == button_backtosetup) {

                root = FXMLLoader.load(getClass().getResource("../setup/setup.fxml"));
                scene = new Scene(root, 600, 400);

                stage = (Stage) button_backtosetup.getScene().getWindow();
                stage.setScene(scene);
                stage.show();

            }

        }catch (Exception e){
            e.printStackTrace();

        }

    }

}
