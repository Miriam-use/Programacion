package Ejercicios1_40;

import java.util.Scanner;
/**
 * 
 * @author Miriam
 *
 */
public class Ejercicio6 {

	public static void main(String[] args) {

		Scanner numero = new Scanner(System.in);
		
		int array[] = new int[25];
		
		for(int i=0; i<array.length; i++) {
			int n = (int)(Math.random()*10);
			array[i]=n;
			System.out.println(array[i]);
		}
		
		System.out.println("introduce numero para comprovar:");
		int n=numero.nextInt();
		
		int cont=0;
		for(int i=0; i<array.length; i++) {
			if(array[i]==n) {
				cont++;
			}
		}
		System.out.println("El numero "+n+" se repite "+cont+" de veces");
	}

}
