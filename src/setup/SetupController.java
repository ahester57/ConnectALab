package setup;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Rectangle2D;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Screen;
import javafx.stage.Stage;

import java.io.IOException;

public class SetupController extends Application
{


    @FXML
    public Button button_done;
    public Button button_power;
    public Button button_read;
    public TextField text_lampintensity;
    public TextField text_lampcurrent;
    public TextField text_wavelength;
    public TextField text_slitwidth;
    public TextField text_backgroundcorrect;
    public TextField text_airflow;
    public TextField text_fuelflow;

    @Override
    public void start(Stage stage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("setup.fxml"));
        Scene scene = new Scene(root, 300, 400);
        stage.setScene(scene);
        stage.show();
    }

    @FXML
    private void handleButtonAction(ActionEvent event) throws IOException {
        Parent root;
        Scene scene;
        Stage stage;

        try {
            if (event.getSource() == button_done) {
                int power;
                int slitWidth;
                int wavelength;
                int bgrdComp;
                int lampCurr;
                int lightKnob;
                int autoZeroBtn;
                int readBtn;
                int airFlow;
                int fuelFlow;
                root = FXMLLoader.load(getClass().getResource("../analysis/analysis.fxml"));
                scene = new Scene(root, 600, 400);

                stage = (Stage) button_done.getScene().getWindow();
                stage.setTitle("Analysis");
                stage.setScene(scene);
                stage.show();

                centerWindow(stage);
            }

        }catch (IOException e){
            e.printStackTrace();

        }

    }

    private void centerWindow(Stage stage) {
        Rectangle2D screenBounds = Screen.getPrimary().getVisualBounds();
        stage.setX((screenBounds.getWidth() - stage.getWidth()) / 2);
        stage.setY((screenBounds.getHeight() - stage.getHeight()) / 2);
    }
}
