package ejercicio2_4;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		MiHilo h = new MiHilo();
		
		Scanner sc = new Scanner(System.in);
		String cadena;
		
		while(true) {
			System.out.println("Iniciando");
			cadena = sc.nextLine();
			h.start();
			
			if(cadena.equals("*")) {
				break;
			}
			if(cadena.equalsIgnoreCase("s")) {
				h.suspende();
			}
			if(cadena.equalsIgnoreCase("r")) {
				h.Reanuda();
			}
		}
	}

}
