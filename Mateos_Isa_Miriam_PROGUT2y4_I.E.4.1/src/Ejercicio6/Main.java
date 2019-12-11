package Ejercicio6;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Coche c1 = new Coche("2222BBB", "F", "M");
		Scanner op = new Scanner(System.in);
		boolean salir = false;
		
		while(!salir) {
			System.out.println("MENU PLAZA APARCAMIENTO");
			System.out.println("1. Aparcar coche");
			System.out.println("2. Sacar coche");
			System.out.println("3. Ver coche aparcado");
			System.out.println("4. Salir aplicación");
			System.out.println("OPCION:");
			int opcion = op.nextInt();
			
			switch(opcion) {
			case 1:
				
			}
		}
		
	}

}
