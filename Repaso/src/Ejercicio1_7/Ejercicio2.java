package Ejercicio1_7;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {

		Scanner dat = new Scanner(System.in);
		
		char V='V', v='v';
		char M='M', m='m';
		
		System.out.println("Introduce sexo de la persona: (V, v ó M, m)");
		char sex=dat.nextLine().charAt(0);
		char sexo=sex;
		System.out.println("Introduce su altura:");
		double alt=dat.nextDouble();
		double altura=alt;
		
		if(sexo==V || sexo==v) {
			if(altura<1.60) {
				System.out.println("El hombre es de altura baja.");
			}else {
				if(altura>=1.60 && altura<=1.75) {
					System.out.println("El hombre es de altura normal.");
				}else {
					System.out.println("El hombre es de altura alta.");
				}
			}
		}
		
		if(sexo==M || sexo==m) {
			if(altura<1.50) {
				System.out.println("La mujer es de altura baja.");
			}else {
				if(altura>=1.50 && altura<=1.65) {
					System.out.println("La mujer es de altura normal.");
				}else {
					System.out.println("La mujer es de altura alta.");
				}
			}
		}
	}

}
