package Ejercicios1_40;

import java.util.Scanner;

public class Ejercicio27 {

	public static void main(String[] args) {

		Scanner NIF = new Scanner(System.in);
		
		System.out.println("Introduce NIF o DNI:");
		String nif=NIF.nextLine();
		String balidar=nif;
		String comprobar[]= {nif};
		char contar;
		int cont=0;
		
		for(int i=0; i<balidar.length(); i++) {
			contar=Character.toLowerCase(balidar.charAt(i));
			cont = contar;
		}
		if(cont!=9) {
			System.out.println("NIF no valido");
		}else {
			System.out.println("NIF valido");
		}
	}

}
