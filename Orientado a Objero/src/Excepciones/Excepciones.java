package Excepciones;

import java.util.Scanner;

public class Excepciones {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int a=0, b=0;
		boolean est;
		
	do {
		try {
			est = false;
			System.out.print("Introduce el primer numero a: ");
	        a = sc.nextInt();
	        sc.nextLine();
	        
	        System.out.print("Introduce el segundo numero b: ");
	        b = sc.nextInt();
	        sc.nextLine();
		}catch (Exception exc) {
			System.out.println("Error, lo introducido no es valido");
	        est = true;
		}

	}while(est);

	System.out.println("Primer numero"+a);
	System.out.println("Segundo numero"+b);
}
}
