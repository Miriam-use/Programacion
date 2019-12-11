package Ejercicio5;

public class Moto extends Vehiculo{

	private int numPlazas;
	
	public Moto(String m, String co, int r, int pl) {
		super(m, co, r);
		this.numPlazas=pl;
	}
	
	public void setnumPlazas(int pl) {
		this.numPlazas=pl;
	}
	
	public int getnumPlazas() {
		return numPlazas;
	}

}
