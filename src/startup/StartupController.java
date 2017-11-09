package startup;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.Background;
import javafx.scene.layout.BackgroundFill;
import javafx.stage.Stage;

import java.io.IOException;

public class StartupController extends Application {

    @FXML
    public Button button_begin;
    public Button button_power;

    private boolean isOn = false;

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
            if (event.getSource() == button_begin) {

                root = FXMLLoader.load(getClass().getResource("../setup/setup.fxml"));
                scene = new Scene(root, 600, 400);

                stage = (Stage) button_begin.getScene().getWindow();
                stage.setScene(scene);
                stage.show();

            } else if (event.getSource() == button_power) {
                if (!isOn) {
                    button_begin.setDisable(false);
                    button_power.setStyle("-fx-background-color: #00ff42;");
                    isOn = true;
                } else {
                    button_begin.setDisable(true);
                    button_power.setStyle("-fx-background-color: #d3d3d3;");
                    isOn = false;
                }
            }

        }catch (IOException e){
            e.printStackTrace();

        }

    }
}
