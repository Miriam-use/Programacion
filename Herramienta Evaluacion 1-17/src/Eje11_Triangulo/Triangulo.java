package Eje11_Triangulo;

public class Triangulo {

	private double long_lado1, long_lado2, long_lado3;
	private int compara, triangulos;
	private int a, b;
	
	public Triangulo(double l1, double l2, double l3) {		//Constructor sobrecargado que inicializa los atributos.
		this.long_lado1 = l1;
		this.long_lado2 = l2;
		this.long_lado3 = l3;
	}
	
	public void compareTo_Triangulos(int a, int b) {
		this.a = a;
		this.b = b;
	}
	
	public String compareTo_Triangulos() {		//Método que te permite determinar si dos triangulos son o no iguales.
		if(a != b) {
			return "NO son iguales";
		}else {
			return "Son iguales";
		}
	}
	/*
	public boolean compareTo_VTriangulos() {		//Método que permite determinar si un conjunto de Triangulos son iguales.
		
	}
	
	public int tipo_Triangulo() {		//Método que indica si el triángulo es equilátero (1), isósceles (2), escaleno (3).
		
	}
	*/
	
}
