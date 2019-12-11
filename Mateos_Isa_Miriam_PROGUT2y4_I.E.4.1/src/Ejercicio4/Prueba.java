package Ejercicio4;

public class Prueba {

	public static void main(String[] args) {

		Punto p1 = new Punto();
		Punto p2 = new Punto(40, 10);
		System.out.println(p1.calcularDistanciaDesde());
		System.out.println(p2.calcularDistanciaDesde());
		
		Circulo c1 = new Circulo(p1, p1, 4);	
		System.out.println(c1.calcularArea());
		
		Triangulo t1 = new Triangulo();
		System.out.println(t1.calcularPerimetro());
	}

}
