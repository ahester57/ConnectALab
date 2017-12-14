package scenes;

import data.AtomicAbsorption;
import javafx.scene.*;


public class AtomicAbScene extends Scene
{
    // This class extends Scene. In Setup Controller, when Done, set the new Scene to this Data type.
    // Send it AtomicAbsorption object and a validity.
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
