package Ejercicio4;

public class Circulo {

	private Punto punto;
	private double raiz;
	
	public Circulo(Punto p, double r) {
		punto=p;
		raiz=r;
	}
	
	public Circulo() {
		punto=new Punto(8, 5);
		raiz=4;
	}
	
	public double getRaiz() {
		return raiz;
	}
	
	public Punto getPunto() {
		return punto;
	}
	
	public double calcularDistanciaDesde() {
		Punto d = null;
		return d.calcularDistanciaDesde(getPunto());
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
