package Ejercicio5;

public class Coche extends Vehiculo {

	private int numRuedas;
	
	public Coche(String m, String co, int r, int p) {
		super(m, co, r);
		this.numRuedas=p;
	}

	public void intNumRuedas(int p) {
		this.numRuedas=p;
	}
	
	public int getNumRuedas() {
		return numRuedas;
	}
}
