package Ejercicios1_40;

import java.util.Scanner;

public class Ejercicio13 {

	public static void main(String[] args) {

		Scanner numero = new Scanner(System.in);
		
		int array[]=new int[20];
		int factorial;
		
		for(int i=0; i<array.length; i++) {
			System.out.println("Introduce numero:");
			int num=numero.nextInt();
			factorial=num;
			
			for(int j=1; j<num; j++) {
				factorial=factorial*j;
			}
			array[i]=factorial;
		}
		
		System.out.println("Los factoriales son:");
		for(int i=0; i<array.length; i++) {
			System.out.println(array[i]);
		}
	}

}
