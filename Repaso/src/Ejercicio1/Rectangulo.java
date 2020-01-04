package Ejercicio1;

public class Rectangulo {

	private double base=0, altura=0;
	
	Rectangulo(double b, double h){
		this.base=b;
		this.altura=h;
	}
	
	public void setAreaRectangulo(double b, double h){
		this.base=b;
		this.altura=h;
	}
	
	public String getAreaRectangulo() {
		double area=base*altura;
		return "El area del Rectangulo es: "+area;
	}
}
