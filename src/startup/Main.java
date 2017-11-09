package startup;

import com.sun.javafx.application.LauncherImpl;

public class Main {

    public static void main(String[] args) {
        LauncherImpl.launchApplication(StartupController.class, MyPreloader.class, args);
    }
}
