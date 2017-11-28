package startup;

import javafx.application.Application;
import javafx.application.Platform;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.chart.AreaChart;
import javafx.scene.chart.StackedBarChart;
import javafx.scene.chart.XYChart;
import javafx.scene.control.Button;
import javafx.stage.Stage;

import java.io.IOException;

public class StartupController extends Application {

    @FXML
    public Button button_begin;
    public Button button_power;
    public AreaChart chart_rightchart;
    public StackedBarChart chart_leftchart;
    public Button button_quit;

    private boolean isOn = false;

    @Override
    public void start(Stage stage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("../startup/startup.fxml"));
        Scene scene = new Scene(root, 600, 400);
        stage.setScene(scene);
        stage.setTitle("Connect-A-Lab");
        stage.show();
    }
    @FXML
    private void handleButtonAction(ActionEvent event) throws IOException {
        Parent root;
        Scene scene;
        Stage stage;

        try {
            if (event.getSource() == button_begin) {

                root = FXMLLoader.load(getClass().getResource("../setup/setup.fxml"));
                scene = new Scene(root, 1000, 600);

                stage = (Stage) button_begin.getScene().getWindow();
                stage.setTitle("Connect-A-Lab (Setup)");
                stage.setScene(scene);
                stage.show();

            } else if (event.getSource() == button_power) {
                if (!isOn) {
                    button_begin.setDisable(false);
                    button_power.setStyle("-fx-background-color: #00ff42;");
                    isOn = true;
                    XYChart.Series<String, Integer> series  = new XYChart.Series<>();
                    series.getData().add(new XYChart.Data<>("12", 20));
                    series.getData().add(new XYChart.Data<>("16", 40));
                    chart_leftchart.getData().add(series);
                    chart_leftchart.setLegendVisible(false);
                    XYChart.Series<String, Integer> series2  = new XYChart.Series<>();
                    series2.getData().add(new XYChart.Data<>("5", 20));
                    series2.getData().add(new XYChart.Data<>("15", 40));
                    chart_rightchart.getData().add(series2);
                    chart_rightchart.setLegendVisible(false);
                } else {
                    button_begin.setDisable(true);
                    button_power.setStyle("-fx-background-color: #d3d3d3;");
                    isOn = false;
                    chart_leftchart.getData().clear();
                    chart_leftchart.setLegendVisible(false);
                    chart_rightchart.getData().clear();
                    chart_rightchart.setLegendVisible(false);
                }
            } else if (event.getSource() == button_quit) {
                Platform.exit();
                System.exit(0);
            }

        }catch (IOException e){
            e.printStackTrace();

        }

    }
}
