package actividad;

import java.util.Scanner;

public class EJ01 {

	public static void main(String[] args) {
		
		Scanner reader = new Scanner(System.in);
		
		double p,m,d, f, s, b;
		int  nota;
		
		System.out.println("Programacion:");
		p=reader.nextDouble();
		System.out.println("Lenguage de Marca:");
		m=reader.nextDouble();
		System.out.println("FOL:");
		f=reader.nextDouble();
		System.out.println("Sistema:");
		s=reader.nextDouble();
		System.out.println("Entorno:");
		d=reader.nextDouble();
		System.out.println("Base de datos:");
		b=reader.nextDouble();
		
		nota=(int) (p+m+f+s+b+d);
		System.out.println("Nota Media: "+(nota/6));
		

	}

}
