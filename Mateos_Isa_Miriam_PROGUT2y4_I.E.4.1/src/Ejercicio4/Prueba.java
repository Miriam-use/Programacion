package Ejercicio4;

public class Prueba {

	public static void main(String[] args) {

		Punto p1 = new Punto();
		Punto p2 = new Punto(40, 10);
		
		double distancia = p1.calcularDistanciaDesde(p2);
		System.out.println("La distancia de p1 a p2 es: "+distancia);
		
	}
}
