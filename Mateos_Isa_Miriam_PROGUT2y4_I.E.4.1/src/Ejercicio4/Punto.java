package Ejercicio4;

public class Punto {

	private double punto1, punto2;
	
	public Punto(double p1, double p2) {
		punto1=p1;
		punto2=p2;
	}
	
	public Punto() {
		punto1=15;
		punto2=2;
	}
	
	public double getPunto1() {
		return punto1;
	}
	
	public double getPunto2() {
		return punto2;
	}
	
	public double calcularDistanciaDesde() {
		double d;
		return d=(Math.sqrt((punto1-punto2)));
	}
}
