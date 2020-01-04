package Ejercicio1;

public class Cuadrado {

	private double lado=0;
	
	Cuadrado(double l){
		this.lado=l;
	}
	
	public void setAreaCuadrado(double l) {
		this.lado=l;
	}
	
	public String getAreaCuadrado() {
		double area=lado*lado;
		return "El area del Cuadrado es: "+area;
	}
}
