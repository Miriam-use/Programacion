package Eje_4Conversion;

public class Conversion {

	private int conversion;
	private double millasAKilometros;
	private double millasAMetros;
	
	public Conversion() {
		conversion=1;
	}
	
	public int getValor() {
		return conversion;
	}
	
	public void setValor(int i) {
		conversion = i;
	}
	
	public double getmillasAMetros() {
		return millasAMetros=conversion*1852;
	}
	
	public double getmillasAKilometros() {
		return millasAKilometros=conversion*1.852;
	}
}
