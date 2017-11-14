package scenes;

import data.AtomicAbsorption;
import javafx.scene.*;


public class AtomicAbScene extends Scene
{
    // Decorates the standard constructor with a custom one
    public AtomicAbScene(Parent root, double width, double height, AtomicAbsorption aa)
    {
        // Standard Constructor
        super(root, width, height);

        // Specialty assignment
        AAData = aa;
    }
    private AtomicAbsorption AAData;
    public AtomicAbsorption getAAData() { return AAData; }
}
