package scenes;

import data.AtomicAbsorption;
import javafx.scene.*;


public class AtomicAbScene extends Scene
{
    // Decorates the standard constructor with a custom one
    public AtomicAbScene(Parent root, double width, double height, AtomicAbsorption aa, int validity)
    {
        // Standard Constructor
        super(root, width, height);

        // Specialty assignment
        AAData = aa;
        AAValidity = validity;
    }
    private AtomicAbsorption AAData;
    private int AAValidity;

    public AtomicAbsorption getAAData() { return AAData; }
    public int getAAValidity() { return AAValidity; }
}
