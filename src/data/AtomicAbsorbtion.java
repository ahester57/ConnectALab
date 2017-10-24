public class AtomicAbsorbtion {
	private String libName;
	private String methodtype;
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
	
	public AtomicAbsorbtion(String libName, String methodType, String lampType, float wavelength, boolean, bgrdCorr, float slitWidth, int noiseCorr, int bgrdGain, int lampVolt, int detectorVolt, int aceFlow, int backPress, int airFlow) {
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
}