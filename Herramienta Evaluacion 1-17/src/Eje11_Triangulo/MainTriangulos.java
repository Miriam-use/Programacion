package Eje11_Triangulo;

import java.util.Scanner;
/**
 * <h2>Se quiere definir una clase Triangulo que represente al polígono Triangulo.</h2>
 * @author Miriam
 * 
 */
public class MainTriangulos {

	public static void main(String[] args) {

		Scanner t = new Scanner(System.in);
			
		System.out.println("Lado 1 del triangulo 1:");
		double l11=t.nextDouble();
		System.out.println("Lado 2 del triangulo 1:");
		double l21=t.nextDouble();
		System.out.println("Lado 3 del triangulo 1:");
		double l31=t.nextDouble();
		
		Triangulo triangu1 = new Triangulo(l11, l21, l31);
		
		System.out.println("Lado 1 del triangulo 2:");
		double l12=t.nextDouble();
		System.out.println("Lado 2 del triangulo 2:");
		double l22=t.nextDouble();
		System.out.println("Lado 3 del triangulo 2:");
		double l32=t.nextDouble();
		
		Triangulo triangu2 = new Triangulo(l12, l22, l32);
		
		System.out.println("1º "+triangu1.getTriangulo());
		System.out.println("2º "+triangu2.getTriangulo());
		
		
		
		if(triangu1.compareTo_Triangulos()==triangu2.compareTo_Triangulos()) {
			System.out.println("Los triangulos 1 y 2 son iguales");
		}else {
			System.out.println("Los triangulos 1 y 2 no son iguales");
		}
		
		System.out.println("Si el triángulo es equilátero (1), isósceles (2), escaleno (3)");
		System.out.println("El triangulo 1 es un "+triangu1.tipo_Triangulo());
		System.out.println("Y el triangulo 2 es un "+triangu2.tipo_Triangulo());
	}

}
