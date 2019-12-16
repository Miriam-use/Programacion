package Ejercicios1_40;

import java.util.Scanner;
/**
 * 
 * @author Miriam
 *
 */
public class Ejercicio3 {

	public static void main(String[] args) {
		
		Scanner array = new Scanner(System.in);

		int[][] matriz=new int[5][8];
		System.out.print("Imprimiendo la matriz");
		
		for(int i=0; i<matriz.length; i++) {
			System.out.println("\n");
			
			for(int j=0; j<matriz[i].length; j++) {
				/*System.out.println("Introduce valor:");
				int num=array.nextInt();*/
				
				int numero = (int)(Math.random()*10+1);
				matriz[i][j]=numero;
				
				System.out.print(matriz[i][j]+"\t");
			}
		}
		/*
		System.out.println("Imprimiendo la matriz");
		for(int i=0; i<matriz.length; i++) {
			System.out.println("\n");
			
			for(int j=0; j<matriz[i].length; j++) {
				System.out.print(matriz[i][j]+"\t");
			}
		}
		*/
	}

}
