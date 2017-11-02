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

	public int setPower(int power) {
		this.power = power;
		return power;
	}

	public int getSlitWidth() {
		return slitWidth;
	}

	public int setSlitWidth(int slitWidth) {
		this.slitWidth = slitWidth;
		return slitWidth;
	}

	public int getWavelength() {
		return wavelength;
	}

	public int setWavelength(int wavelength) {
		this.wavelength = wavelength;
		return wavelength;
	}

	public int getBgrdComp() {
		return bgrdComp;
	}

	public int setBgrdComp(int bgrdComp) {
		this.bgrdComp = bgrdComp;
		return bgrdComp;
	}

	public int getLampCurr() {
		return lampCurr;
	}

	public int setLampCurr(int lampCurr) {
		this.lampCurr = lampCurr;
		return lampCurr;
	}

	public int getLightKnob() {
		return lightKnob;
	}

	public int setLightKnob(int lightKnob) {
		this.lightKnob = lightKnob;
		return lightKnob;
	}

	public int getAutoZeroBtn() {
		return autoZeroBtn;
	}

	public int setAutoZeroBtn(int autoZeroBtn) {
		this.autoZeroBtn = autoZeroBtn;
		return autoZeroBtn;
	}

	public int getReadBtn() {
		return readBtn;
	}

	public int setReadBtn(int readBtn) {
		this.readBtn = readBtn;
		return readBtn;
	}

	public int getAirFlow() {
		return airFlow;
	}

	public int setAirFlow(int airFlow) {
		this.airFlow = airFlow;
		return airFlow;
	}

	public int getFuelFlow() {
		return fuelFlow;
	}

	public int setFuelFlow(int fuelFlow) {
		this.fuelFlow = fuelFlow;
		return fuelFlow;
	}
}