package Ejercicio5;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
	
		Scanner nif = new Scanner(System.in);
		
		NIF dni1 = new NIF();
		System.out.println(dni1.getMostrar());
		
		NIF dni2 = new NIF();
		System.out.println("Introduce NUMERO del NIF:");
		int numdni=nif.nextInt();
		dni2.setDNI(numdni);
		System.out.println(dni2.getMostrar());
	}
}
