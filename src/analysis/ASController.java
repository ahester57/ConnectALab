package analysis;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Rectangle2D;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.chart.LineChart;
import javafx.scene.chart.NumberAxis;
import javafx.scene.chart.XYChart;
import javafx.scene.control.Button;
import javafx.stage.Screen;
import javafx.stage.Stage;

import java.io.IOException;

public class ASController extends Application
{

    @FXML
    public Button button_view;
    public LineChart chart_linechart;

    @Override
    public void start(Stage stage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("analysis.fxml"));


        Scene scene = new Scene(chart_linechart, 600, 400);
        stage.setTitle("Analysis");
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
                final NumberAxis xAxis = new NumberAxis();
                final NumberAxis yAxis = new NumberAxis();
                xAxis.setLabel("Wavelength (nm)");
                chart_linechart.setTitle("Atomic Absorption Spectrometer");
                XYChart.Series series  = new XYChart.Series();
                series.setName("stuff");
                series.getData().add(new XYChart.Data(1, 23));
                series.getData().add(new XYChart.Data(100, 23));
                chart_linechart.getData().add(series);
                stage = (Stage) button_view.getScene().getWindow();
                centerWindow(stage);
            }

        }catch (Exception e){
            e.printStackTrace();

        }

    }

    private void centerWindow(Stage stage) {
        Rectangle2D screenBounds = Screen.getPrimary().getVisualBounds();
        stage.setX((screenBounds.getWidth() - stage.getWidth()) / 2);
        stage.setY((screenBounds.getHeight() - stage.getHeight()) / 2);
    }
}
