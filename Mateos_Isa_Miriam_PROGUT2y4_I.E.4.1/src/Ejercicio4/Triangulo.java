package Ejercicio4;

public class Triangulo {

	private Punto punto1, punto2, punto3;
	
	public Triangulo(Punto p1,Punto p2,Punto p3) {
		punto1=p1;
		punto2=p2;
		punto3=p3;
	}
	
	public Triangulo() {
		punto1=new Punto(1,20);
		punto2=new Punto(1, 9);
		punto3=new Punto(9, 20);
	}
	
	public Punto getPunto1() {
		return punto1;
	}
	
	public Punto getPunto2() {
		return punto2;
	}
	
	public Punto getPunto3() {
		return punto3;
	}
	
	public double calcularPerimetro() {
		Object p;
		return p=(punto1+punto2+punto3);
	}
	
}
