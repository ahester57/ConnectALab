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
}