package ejercicios;

import java.util.Scanner;

public class excepcion2 {

	public static void main(String[] args) {
		
		Scanner dat = new Scanner(System.in);
		
			try {
				System.out.println("Introduce el texto");
				int texto = dat.nextInt();
				System.out.println(texto);
			}catch(Exception e) {
				System.out.println("Problemas en la escritura");
				
			}
	}

}
