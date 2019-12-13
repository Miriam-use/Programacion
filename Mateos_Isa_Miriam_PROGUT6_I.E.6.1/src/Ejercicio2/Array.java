package Ejercicio2;

import java.util.Scanner;

/**
 * 
 * @author Miriam
 *
 */
public class Array {

	public static void main(String[] args) {
		
		Scanner ray = new Scanner(System.in);
		
		System.out.println("¿Cuantos arrays crearas?");
		int n=ray.nextInt();
		
		int[] array =new int[n];
		
		double sumatorio=0;
		int j=1;
		
		for(int i=0; i<array.length; i++) {
			System.out.println("Introduzca el "+(j++)+" numero:");	//para pedir numero por teclado
			int num=ray.nextInt();
			array[i]=num;
			sumatorio+=array[i];
		}
		
		double media=0.0;
		/*
		for(int i=0; i<array.length; i++) {
			media = media +array[i];
		}
		media = media/array.length; 
		*/
		media = sumatorio/array.length;
		
		System.out.println("Su sumatorio es de: "+sumatorio+", y su media es de: "+media);
		
	}

}
