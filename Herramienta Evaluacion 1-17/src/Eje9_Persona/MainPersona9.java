package Eje9_Persona;

import java.util.Scanner;

public class MainPersona9 {

		public static void main(String[] args) {

		Estudiante al = new Estudiante(null, null, 0);
		
		Scanner alum = new Scanner(System.in);
		
		System.out.println("Introduce pago: ");
		double pago = alum.nextDouble();
		al.setPago(pago);
		System.out.println("Introduce rango: ");
		double rango = alum.nextDouble();
		al.setRando(rango);
		System.out.println(al.getDescuento());
	
		Persona perso = new Persona("Garcia", "Mario", "Hombre", 12345678);
		System.out.println(perso.getDatosPersona());
		
		
		
	}
}
