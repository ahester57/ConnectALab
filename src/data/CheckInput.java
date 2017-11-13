package data;

public class CheckInput {
    private AtomicAbsorption aa;

    public CheckInput() {
    }

    public CheckInput(AtomicAbsorption aa) {
        this.aa = aa;
    }

    public int checkAll() {
        if (this.checkSlit() == 0 || this.checkWavelength() == 0 || this.checkBgrdComp() == 0
                || this.checkLampCurr() == 0 || this.checkLightKnob() == 0 || this.checkAirFlow() == 0
                || this.checkFuelFlow() == 0)
            return 0;
        else
            return 1;
    }

    public int checkPower() {
        if (aa.getPower() != 0 && aa.getPower() != 5)
            return 0;
        else
            return 1;
    }

    public int checkSlit() {
        if (aa.getSlitWidth() != 3)
            return 0;
        else
            return 1;
    }

    public int checkWavelength() {
        if (aa.getWavelength() != 4)
            return 0;
        else
            return 1;
    }

    public int checkBgrdComp() {
        if (aa.getBgrdComp() != 1)
            return 0;
        else
            return 1;
    }

    public int checkLampCurr() {
        if (aa.getLampCurr() != 3)
            return 0;
        else
            return 1;
    }

    public int checkLightKnob() {
        if (aa.getLightKnob() != 2)
            return 0;
        else
            return 1;
    }

    public int checkAutoZeroBtn() {
        if (aa.getAutoZeroBtn() != 5)
            return 0;
        else
            return 1;
    }

    public int checkReadBtn() {
        if (aa.getReadBtn() != 5)
            return 0;
        else
            return 1;
    }

    public int checkAirFlow() {
        if (aa.getAirFlow() >= 1 && aa.getAirFlow() <= 3)
            return 1;
        else
            return 0;
    }

    public int checkFuelFlow() {
        if (aa.getFuelFlow() >= 1 && aa.getFuelFlow() <= 3)
            return 1;
        else
            return 0;
    }
}