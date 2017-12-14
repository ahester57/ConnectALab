package startup;

import com.sun.javafx.application.LauncherImpl;
import javafx.application.Application;
import javafx.stage.Stage;

public class Main extends Application {
    @Override
    public void start(Stage primaryStage) throws Exception {
        // Launch using preloader for splash screen
        LauncherImpl.launchApplication(StartupController.class, MyPreloader.class, null);
    }

    public static void main(String[] args) {
        // Launch using preloader for splash screen
        LauncherImpl.launchApplication(StartupController.class, MyPreloader.class, args);
    }
}
