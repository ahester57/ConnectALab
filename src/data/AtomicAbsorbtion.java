package data;

public class AtomicAbsorbtion {
	private String libName;
	private String methodType;
	private String lampType;
	private float wavelength;
	private boolean bgrdCorr;
	private float slitWidth;
	private int noiseCorr;
	private int bgrdGain;
	private int lampVolt;
	private int detectorVolt;
	private int aceFlow;
	private int backPress;
	private int airFlow;
	
	public AtomicAbsorbtion(String libName, String methodType, String lampType, float wavelength, boolean bgrdCorr, float slitWidth, int noiseCorr, int bgrdGain, int lampVolt, int detectorVolt, int aceFlow, int backPress, int airFlow) {
		this.libName = libName;
		this.methodType = methodType;
		this.lampType = lampType;
		this.wavelength = wavelength;
		this.bgrdCorr = bgrdCorr;
		this.slitWidth = slitWidth;
		this.noiseCorr = noiseCorr;
		this.bgrdGain = bgrdGain;
		this.lampVolt = lampVolt;
		this.detectorVolt = detectorVolt;
		this.aceFlow = aceFlow;
		this.backPress = backPress;
		this.airFlow = airFlow;
	}

	public String getLibName() {
		return libName;
	}

	public void setLibName(String libName) {
		this.libName = libName;
	}

	public String getMethodType() {
		return methodType;
	}

	public void setMethodType(String methodType) {
		this.methodType = methodType;
	}

	public String getLampType() {
		return lampType;
	}

	public void setLampType(String lampType) {
		this.lampType = lampType;
	}

	public float getWavelength() {
		return wavelength;
	}

	public void setWavelength(float wavelength) {
		this.wavelength = wavelength;
	}

	public boolean isBgrdCorr() {
		return bgrdCorr;
	}

	public void setBgrdCorr(boolean bgrdCorr) {
		this.bgrdCorr = bgrdCorr;
	}

	public float getSlitWidth() {
		return slitWidth;
	}

	public void setSlitWidth(float slitWidth) {
		this.slitWidth = slitWidth;
	}

	public int getNoiseCorr() {
		return noiseCorr;
	}

	public void setNoiseCorr(int noiseCorr) {
		this.noiseCorr = noiseCorr;
	}

	public int getBgrdGain() {
		return bgrdGain;
	}

	public void setBgrdGain(int bgrdGain) {
		this.bgrdGain = bgrdGain;
	}

	public int getLampVolt() {
		return lampVolt;
	}

	public void setLampVolt(int lampVolt) {
		this.lampVolt = lampVolt;
	}

	public int getDetectorVolt() {
		return detectorVolt;
	}

	public void setDetectorVolt(int detectorVolt) {
		this.detectorVolt = detectorVolt;
	}

	public int getAceFlow() {
		return aceFlow;
	}

	public void setAceFlow(int aceFlow) {
		this.aceFlow = aceFlow;
	}

	public int getBackPress() {
		return backPress;
	}

	public void setBackPress(int backPress) {
		this.backPress = backPress;
	}

	public int getAirFlow() {
		return airFlow;
	}

	public void setAirFlow(int airFlow) {
		this.airFlow = airFlow;
	}
}