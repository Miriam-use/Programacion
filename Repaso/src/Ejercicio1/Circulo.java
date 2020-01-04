package Ejercicio1;

public class Circulo {

	private double radio=0;
	
	Circulo(double r){
		this.radio=r;
	}
	
	public void setAreaCirculo(double r){
		this.radio=r;
	}
	
	public String getAreaCirculo() {
		double area = Math.PI * Math.pow(radio,2);
		return "El area del Circulo es: "+area;
	}
}
