package Eje11_Triangulo;

import java.util.Scanner;

public class MainTriangulos {

	public static void main(String[] args) {

		Scanner t = new Scanner(System.in);
			
		System.out.println("Lado 1 del triangulo 1:");
		int l11=t.nextInt();
		System.out.println("Lado 2 del triangulo 1:");
		int l21=t.nextInt();
		System.out.println("Lado 3 del triangulo 1:");
		int l31=t.nextInt();
		
		Triangulo triangu1 = new Triangulo(l11, l21, l31);
		
		System.out.println("Lado 1 del triangulo 2:");
		int l12=t.nextInt();
		System.out.println("Lado 2 del triangulo 2:");
		int l22=t.nextInt();
		System.out.println("Lado 3 del triangulo 2:");
		int l32=t.nextInt();
		
		Triangulo triangu2 = new Triangulo(l12, l22, l32);
		
		
		
		System.out.println(triangu1.getTriangulo());
		System.out.println(triangu2.getTriangulo());
		
		System.out.println("Si el triángulo es equilátero (1), isósceles (2), escaleno (3)");
		System.out.println("El triangulo 1 es un "+triangu1.tipo_Triangulo());
		System.out.println("Y el triangulo 2 es un "+triangu2.tipo_Triangulo());
	}

}
