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

	public AtomicAbsorbtion() {
	}

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

	public AtomicAbsorbtion setPower(int power) {
		this.power = power;
		return this;
	}

	public int getSlitWidth() {
		return slitWidth;
	}

	public AtomicAbsorbtion setSlitWidth(int slitWidth) {
		this.slitWidth = slitWidth;
		return this;
	}

	public int getWavelength() {
		return wavelength;
	}

	public AtomicAbsorbtion setWavelength(int wavelength) {
		this.wavelength = wavelength;
		return this;
	}

	public int getBgrdComp() {
		return bgrdComp;
	}

	public AtomicAbsorbtion setBgrdComp(int bgrdComp) {
		this.bgrdComp = bgrdComp;
		return this;
	}

	public int getLampCurr() {
		return lampCurr;
	}

	public AtomicAbsorbtion setLampCurr(int lampCurr) {
		this.lampCurr = lampCurr;
		return this;
	}

	public int getLightKnob() {
		return lightKnob;
	}

	public AtomicAbsorbtion setLightKnob(int lightKnob) {
		this.lightKnob = lightKnob;
		return this;
	}

	public int getAutoZeroBtn() {
		return autoZeroBtn;
	}

	public AtomicAbsorbtion setAutoZeroBtn(int autoZeroBtn) {
		this.autoZeroBtn = autoZeroBtn;
		return this;
	}

	public int getReadBtn() {
		return readBtn;
	}

	public AtomicAbsorbtion setReadBtn(int readBtn) {
		this.readBtn = readBtn;
		return this;
	}

	public int getAirFlow() {
		return airFlow;
	}

	public AtomicAbsorbtion setAirFlow(int airFlow) {
		this.airFlow = airFlow;
		return this;
	}

	public int getFuelFlow() {
		return fuelFlow;
	}

	public AtomicAbsorbtion setFuelFlow(int fuelFlow) {
		this.fuelFlow = fuelFlow;
		return this;
	}
}