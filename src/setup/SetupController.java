package setup;

import data.AtomicAbsorption;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;

public class SetupController extends Application
{


    @FXML
    public Button button_done;
    public Button button_read;
    public Button button_clear;
    public Button button_backtomenu;
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
                try {
                    int slitWidth = Integer.parseInt(text_slitwidth.getText());
                    int wavelength = Integer.parseInt(text_wavelength.getText());
                    int bgrdComp = Integer.parseInt(text_backgroundcorrect.getText());
                    int lampCurr = Integer.parseInt(text_lampcurrent.getText());
                    int lightKnob = Integer.parseInt(text_lampintensity.getText());
                    int autoZeroBtn;
                    int readBtn;
                    int airFlow = Integer.parseInt(text_airflow.getText());
                    int fuelFlow = Integer.parseInt(text_fuelflow.getText());
                    AtomicAbsorption aas = new AtomicAbsorption(1, slitWidth, wavelength, bgrdComp, lampCurr,
                                                        lightKnob, 1, 1, airFlow, fuelFlow);
                } catch (NumberFormatException nfe) {
                    System.out.println("Please enter data.");
                    return;
                }

                root = FXMLLoader.load(getClass().getResource("../analysis/analysis.fxml"));
                scene = new Scene(root, 600, 400);

                stage = (Stage) button_done.getScene().getWindow();
                stage.setTitle("Connect-A-Lab (Analysis)");
                stage.setScene(scene);
                stage.show();

            } else if(event.getSource() == button_read) {
                System.out.println("Filling Data");
                text_lampintensity.setText("3");
                text_lampcurrent.setText("3");
                text_wavelength.setText("3");
                text_slitwidth.setText("3");
                text_backgroundcorrect.setText("3");
                text_airflow.setText("3");
                text_fuelflow.setText("3");
            } else if(event.getSource() == button_clear) {
                System.out.println("Clearing Data");
                text_lampintensity.setText("");
                text_lampcurrent.setText("");
                text_wavelength.setText("");
                text_slitwidth.setText("");
                text_backgroundcorrect.setText("");
                text_airflow.setText("");
                text_fuelflow.setText("");
            } else if (event.getSource() == button_backtomenu) {

                root = FXMLLoader.load(getClass().getResource("../startup/startup.fxml"));
                scene = new Scene(root, 600, 400);

                stage = (Stage) button_backtomenu.getScene().getWindow();
                stage.setTitle("Connect-A-Lab");
                stage.setScene(scene);
                stage.show();
            }

        }catch (IOException e){
            e.printStackTrace();

        }

    }

}
