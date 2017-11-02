package data;

public class AtomicAbsorbtion {
	private int power;
	private int slitWidth;
	private int wavelength;
	private int bgrdComp;
	private int lampCurr;
	private int lightKnob;
	private int autoZeroBtn;
	private int readBtn;
	private int airFlow;
	private int fuelFlow;


	public AtomicAbsorbtion(int power, int slitWidth, int wavelength, int bgrdComp, int lampCurr, int lightKnob, int autoZeroBtn, int readBtn, int airFlow, int fuelFlow) {
		this.power = power;
		this.slitWidth = slitWidth;
		this.wavelength = wavelength;
		this.bgrdComp = bgrdComp;
		this.lampCurr = lampCurr;
		this.lightKnob = lightKnob;
		this.autoZeroBtn = autoZeroBtn;
		this.readBtn = readBtn;
		this.airFlow = airFlow;
		this.fuelFlow = fuelFlow;
	}

	public int getPower() {
		return power;
	}

	public void setPower(int power) {
		this.power = power;
	}

	public int getSlitWidth() {
		return slitWidth;
	}

	public void setSlitWidth(int slitWidth) {
		this.slitWidth = slitWidth;
	}

	public int getWavelength() {
		return wavelength;
	}

	public void setWavelength(int wavelength) {
		this.wavelength = wavelength;
	}

	public int getBgrdComp() {
		return bgrdComp;
	}

	public void setBgrdComp(int bgrdComp) {
		this.bgrdComp = bgrdComp;
	}

	public int getLampCurr() {
		return lampCurr;
	}

	public void setLampCurr(int lampCurr) {
		this.lampCurr = lampCurr;
	}

	public int getLightKnob() {
		return lightKnob;
	}

	public void setLightKnob(int lightKnob) {
		this.lightKnob = lightKnob;
	}

	public int getAutoZeroBtn() {
		return autoZeroBtn;
	}

	public void setAutoZeroBtn(int autoZeroBtn) {
		this.autoZeroBtn = autoZeroBtn;
	}

	public int getReadBtn() {
		return readBtn;
	}

	public void setReadBtn(int readBtn) {
		this.readBtn = readBtn;
	}

	public int getAirFlow() {
		return airFlow;
	}

	public void setAirFlow(int airFlow) {
		this.airFlow = airFlow;
	}

	public int getFuelFlow() {
		return fuelFlow;
	}

	public void setFuelFlow(int fuelFlow) {
		this.fuelFlow = fuelFlow;
	}
}