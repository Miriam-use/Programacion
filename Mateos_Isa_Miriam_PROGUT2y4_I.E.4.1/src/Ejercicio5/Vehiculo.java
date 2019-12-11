package Ejercicio5;

public class Vehiculo {

	private int numRueda, cilindrada, potencia;
	private String color, matricula;
	
	public Vehiculo(String m, String co, int r) {
		matricula=m;
		color=co;
		numRueda=r;
	}
	
	public void setCilindrada(int c) {
		this.cilindrada=c;
	}
	
	public int getCilindrada() {
		return cilindrada;
	}
	
	public void setPotencia(int p) {
		this.potencia=p;
	}
	
	public int getPotencia() {
		return potencia;
	}
	
	public String getCrear() {
		return matricula+" "+color+" "+numRueda;
}
}
