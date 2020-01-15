package Ejercicios1_40;

import java.util.Scanner;
/**
 * 
 * @author Miriam
 *
 */
public class Ejercicio39 {

	public static void main(String[] args) {
		
		Scanner Leer = new Scanner(System.in);
		
		int burbuja[][] = new int[5][5];
		int burbujaFila[] = new int[5];

		System.out.println("\n/////MATRIZ SIN ORDENADA/////\n");
		for(int i=0; i<burbuja.length; i++) {
			for(int j=0; j<burbuja[i].length; j++) {
				int num = (int)(Math.random()*50+1);
				burbuja[i][j]=num;
				System.out.print(burbuja[i][j]+"\t");
			}
			System.out.println("");
		}
		
		System.out.println("\nIntroduce el numero de fila para ordenar:");
		int num=Leer.nextInt();
		int n=num-1;
		
		System.out.println("\n/////SU FILA ELEGIDA SIN ORDENADOS/////\n");
		for(int i=0; i<burbujaFila.length; i++) {
				burbujaFila[i]=burbuja[n][i];
			System.out.print(burbujaFila[i]+"\t");
		}
/**
 * Metodo burbuja fila
 */
		int aux;
		for(int i=0; i<burbujaFila.length-1; i++) {
			for(int j=1; j<burbujaFila.length; j++) {
				if(burbujaFila[j]<burbujaFila[j-1]) {
					aux=burbujaFila[j];
					burbujaFila[j]=burbujaFila[j-1];
					burbujaFila[j-1]=aux;
				}
			}
		}
		
		System.out.println("\n/////SUS NUMEROS ORDENADOS/////\n");
		for(int i=0; i<burbujaFila.length; i++) {
			System.out.print(burbujaFila[i]+"\t");
		}
	}

}
