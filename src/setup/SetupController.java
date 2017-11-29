package setup;

import data.AtomicAbsorption;
import data.CheckInput;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Slider;
import javafx.scene.control.TextField;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;

import java.io.IOException;
import scenes.AtomicAbScene;

public class SetupController extends Application
{


    @FXML
    public Button button_done;
    public Button button_read;
    public Button button_clear;
    public Button button_backtomenu;
    public TextField text_lightintensity;
    public TextField text_lampcurrent;
    public TextField text_wavelength;
    public TextField text_slitwidth;
    public TextField text_backgroundcorrect;
    public TextField text_airflow;
    public TextField text_fuelflow;
    public TextField text_libraryname;
    public TextField text_methodtype;
    public TextField text_backpressure;
    public Slider wavelength_slider;
    public Slider light_intensity_slider;
    public Slider lamp_current_slider;
    public Slider slit_width_slider;
    public Slider background_correction_slider;
    public Slider air_flow_slider;
    public Slider fuel_flow_slider;


    @Override
    public void start(Stage stage) throws Exception {
        Parent root = FXMLLoader.load(getClass().getResource("setup.fxml"));
        Scene scene = new Scene(root, 1000, 600);
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
                AtomicAbsorption aas;
                try {
                    int power = 5;
                    int slitWidth = Integer.parseInt(text_slitwidth.getText());
                    int wavelength = Integer.parseInt(text_wavelength.getText());
                    int bgrdComp = Integer.parseInt(text_backgroundcorrect.getText());
                    int lampCurr = Integer.parseInt(text_lampcurrent.getText());
                    int lightKnob = Integer.parseInt(text_lightintensity.getText());
                    int autoZeroBtn = 5;
                    int readBtn = 5;
                    int airFlow = Integer.parseInt(text_airflow.getText());
                    int fuelFlow = Integer.parseInt(text_fuelflow.getText());
                    aas = new AtomicAbsorption(power, slitWidth, wavelength, bgrdComp, lampCurr,
                                                        lightKnob, autoZeroBtn, readBtn, airFlow, fuelFlow);
                } catch (NumberFormatException nfe) {
                    System.out.println("Please enter data.");
                    return;
                }

                CheckInput verify = new CheckInput(aas);

                int validity = verify.checkAll();

                if (validity == 0) {
                    System.out.println("Bad input.");
                }

                root = FXMLLoader.load(getClass().getResource("../analysis/analysis.fxml"));
                scene = new AtomicAbScene(root, 1000, 600, aas, validity);

                stage = (Stage) button_done.getScene().getWindow();
                stage.setTitle("Connect-A-Lab (Analysis)");
                stage.setScene(scene);
                stage.show();

            } else if (event.getSource() == button_read) {
                System.out.println("Filling Data");
                text_lightintensity.setText("2");
                text_lampcurrent.setText("3");
                text_wavelength.setText("4");
                text_slitwidth.setText("3");
                text_backgroundcorrect.setText("1");
                text_airflow.setText("1");
                text_fuelflow.setText("3");
                text_libraryname.setText("Pb in Soil");
                text_methodtype.setText("Air/Acetelyne");
                text_backpressure.setText("Default");

            } else if (event.getSource() == button_clear) {
                System.out.println("Clearing Data");
                text_lightintensity.setText("");
                text_lampcurrent.setText("");
                text_wavelength.setText("");
                text_slitwidth.setText("");
                text_backgroundcorrect.setText("");
                text_airflow.setText("");
                text_fuelflow.setText("");
                text_libraryname.setText("");
                text_methodtype.setText("");
                text_backpressure.setText("");

            } else if (event.getSource() == button_backtomenu) {

                root = FXMLLoader.load(getClass().getResource("../startup/startup.fxml"));
                scene = new Scene(root, 600, 400);

                stage = (Stage) button_backtomenu.getScene().getWindow();
                stage.setTitle("Connect-A-Lab");
                stage.setScene(scene);
                stage.show();
            }

        } catch (IOException e){
            e.printStackTrace();

        }

    }

    @FXML
    void clicked(MouseEvent event){
        text_wavelength.setText(Integer.toString((int)wavelength_slider.getValue()));
    }

    @FXML
    void lightIntensityClicked(MouseEvent event) {
        text_lightintensity.setText(Integer.toString((int)light_intensity_slider.getValue()));
    }

    @FXML
    void lampCurrentClicked(MouseEvent event){
        text_lampcurrent.setText(Integer.toString((int)lamp_current_slider.getValue()));
    }

    @FXML
    void slitWidthClicked(MouseEvent event){
        text_slitwidth.setText(Integer.toString((int)slit_width_slider.getValue()));
    }

    @FXML
    void backgroundCorrectionClicked(MouseEvent event) {
        text_backgroundcorrect.setText(Integer.toString((int)background_correction_slider.getValue()));
    }

    @FXML
    void airFlowClicked(MouseEvent event) {
        text_airflow.setText(Integer.toString((int)air_flow_slider.getValue()));
    }

    @FXML
    void fuelFlowClicked(MouseEvent event) {
        text_fuelflow.setText(Integer.toString((int)fuel_flow_slider.getValue()));
    }
}
