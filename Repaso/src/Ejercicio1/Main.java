package Ejercicio1;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner dat = new Scanner(System.in);
		
		boolean salir=false;
		
		while(!salir) {
			System.out.println("------------MENU--------------");
			System.out.println("1-Cuadrado");
			System.out.println("2-Rectangulo");
			System.out.println("3-Circulo");
			System.out.println("0-Salir");
			
			System.out.println("Selecciona una opción");
			int opcion=dat.nextInt();
			
			switch(opcion) {
			case 0:
				System.out.println("Esta saliendo...");
				salir=true;
				break;
				
			case 1:
				System.out.println("ingrese el lado de cuadrado");
		        double lado=dat.nextDouble();    
		        Cuadrado cuadrado = new Cuadrado(lado);
		        System.out.println(cuadrado.getAreaCuadrado());
		        break;
		        
			case 2:
				System.out.println("ingrese la base del rectangulo");
		        double base=dat.nextDouble(); 
		        System.out.println("ingrese la altura del rectangulo");
		        double altura=dat.nextDouble();
		        Rectangulo rectangulo = new Rectangulo(base, altura);
		        System.out.println(rectangulo.getAreaRectangulo());
		        break;
				
			case 3:
				System.out.println("ingrese el lado del rectangulo");
		        double radio=dat.nextDouble(); 
		        Circulo circulo = new Circulo(radio);
		        System.out.println(circulo.getAreaCirculo());
		        break;
		        
			default:
				System.out.println("Opcion no valida");
			}
	}

 }
}
