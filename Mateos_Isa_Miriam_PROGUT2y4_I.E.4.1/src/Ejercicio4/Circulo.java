package Ejercicio4;

public class Circulo {

	private Punto punto1, punto2;
	private double raiz;
	
	public Circulo(Punto p1, Punto p2, double r) {
		punto1=p1;
		punto2=p2;
		raiz=r;
	}
	
	public Circulo() {
		punto1=new Punto();
		punto2=new Punto(8, 5);
		raiz=4;
	}
	
	public double getRaiz() {
		return raiz;
	}
	
	public Punto getPunto1() {
		return punto1;
	}
	
	public Punto getPunto2() {
		return punto2;
	}
	
	public double calcularDistanciaDesde() {
		Punto d = null;
		return d.calcularDistanciaDesde();
	}
	
	public double calcularArea() {
		double a;
		return a=(Math.PI*(raiz*raiz));
	}
	
	public double calcularPerimetro() {
		double p;
		return p=(calcularDistanciaDesde()*raiz);
	}
}
