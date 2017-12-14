package data;

public class AtomicAbsorption {
	// Holds all the data 
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

	public AtomicAbsorption() {
	}

	public AtomicAbsorption(int power, int slitWidth, int wavelength, int bgrdComp, int lampCurr, int lightKnob, int autoZeroBtn, int readBtn, int airFlow, int fuelFlow) {
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

	@Override
	public String toString() {
		return String.format("Power:%d, SlitWidth:%d, WaveLength:%d, BackgroundComp:%d, lampCurr:%d, LightKnob:%d, autoZeroBtn:%d, readBtn:%d, airFlow:%d, fuelFlow:%d"
		                    , power, slitWidth, wavelength, bgrdComp, lampCurr, lightKnob, autoZeroBtn, readBtn, airFlow, fuelFlow);
	}

	public int getPower() {
		return power;
	}

	public AtomicAbsorption setPower(int power) {
		this.power = power;
		return this;
	}

	public int getSlitWidth() {
		return slitWidth;
	}

	public AtomicAbsorption setSlitWidth(int slitWidth) {
		this.slitWidth = slitWidth;
		return this;
	}

	public int getWavelength() {
		return wavelength;
	}

	public AtomicAbsorption setWavelength(int wavelength) {
		this.wavelength = wavelength;
		return this;
	}

	public int getBgrdComp() {
		return bgrdComp;
	}

	public AtomicAbsorption setBgrdComp(int bgrdComp) {
		this.bgrdComp = bgrdComp;
		return this;
	}

	public int getLampCurr() {
		return lampCurr;
	}

	public AtomicAbsorption setLampCurr(int lampCurr) {
		this.lampCurr = lampCurr;
		return this;
	}

	public int getLightKnob() {
		return lightKnob;
	}

	public AtomicAbsorption setLightKnob(int lightKnob) {
		this.lightKnob = lightKnob;
		return this;
	}

	public int getAutoZeroBtn() {
		return autoZeroBtn;
	}

	public AtomicAbsorption setAutoZeroBtn(int autoZeroBtn) {
		this.autoZeroBtn = autoZeroBtn;
		return this;
	}

	public int getReadBtn() {
		return readBtn;
	}

	public AtomicAbsorption setReadBtn(int readBtn) {
		this.readBtn = readBtn;
		return this;
	}

	public int getAirFlow() {
		return airFlow;
	}

	public AtomicAbsorption setAirFlow(int airFlow) {
		this.airFlow = airFlow;
		return this;
	}

	public int getFuelFlow() {
		return fuelFlow;
	}

	public AtomicAbsorption setFuelFlow(int fuelFlow) {
		this.fuelFlow = fuelFlow;
		return this;
	}
}