package Eje11_Triangulo;

public class Triangulo {

	private double long_lado1, long_lado2, long_lado3, a, b;
	private int compara, triangulos;
	
	/**Constructor sobrecargado que inicializa los atributos.*/
	
	public Triangulo(double l1, double l2, double l3) {		
		this.long_lado1 = l1;
		this.long_lado2 = l2;
		this.long_lado3 = l3;
	}
	
	public String getTriangulo() {
		return "Triangulo de lados "+long_lado1+" "+long_lado2+" "+long_lado3;
	}
	
	public double compareTo_Triangulos() {
		return a=long_lado1+long_lado2+long_lado3;
	}
	
	
	
	/**Método que indica si el triángulo es equilátero (1), isósceles (2), escaleno (3).*/
	
	public int tipo_Triangulo() {		
		if(long_lado1==long_lado2 && long_lado1==long_lado3 && long_lado2==long_lado3) {
			return 1;
		}else {
			if(long_lado1!=long_lado2 && long_lado1!=long_lado3 && long_lado2!=long_lado3) {
				return 3;
			}else {
				return 2;
			}
		}
	}
	
	
}
