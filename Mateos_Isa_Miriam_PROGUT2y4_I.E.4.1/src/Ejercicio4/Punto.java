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
	
	public void setPunto1(double p1) {
		this.punto1=p1;;
	}
	
	public void setPunto2(double p2) {
		this.punto2=p2;
	}
	
	public double getPunto1() {
		return punto1;
	}
	
	public double getPunto2() {
		return punto2;
	}
	
	public double calcularDistanciaDesde(Punto parametros) {
		double cateto1 = punto1 - parametros.getPunto1();
		double cateto2 = punto2 - parametros.getPunto2();
		double hipotenusa = Math.sqrt(punto1*punto1 + punto2*punto2);
		return hipotenusa;
	}
	
	public String toStringPunto() {
		return "(x= "+getPunto1()+", y= "+getPunto2()+" )";
	}
}
