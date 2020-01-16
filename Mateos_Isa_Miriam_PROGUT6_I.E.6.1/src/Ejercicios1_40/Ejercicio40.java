package Ejercicios1_40;

import java.util.Scanner;

/**
 * 
 * @author Miriam
 *
 */
public class Ejercicio40 {

	public static void main(String[] args) {
		
		int matriz[][]= {{1,2,3,4},
							{5,6,7,8},
							{9,5,2,3},
							{5,9,4,8}
							};
		int array[]= {1,5,9,5};
		int igual[]=new int[4];
/**
 * compara las columnas		
 */
		int x=0, y=0;
		for(int i=0; i<4; i++) {
			for(int j=0; j<4; j++) {
				if(array[i]==matriz[i][j]) {
					igual[i]=array[i];
					x=i;
					y=j;
				}
			}
		}
		System.out.println("El vector se repite en la columna: "+y);
		
		System.out.println("\nComo lo quieres ordenar:");
		System.out.println("1)Ascentente");
		System.out.println("2)Descendente");
		System.out.println("Elija opcion:");
		
		Scanner leer = new Scanner(System.in);
		int opcion=leer.nextInt();
		switch(opcion) {
		case 1 :
			System.out.println("Orden Ascendente:\n");
			int auxt;
			for(int i=0; i<igual.length-1; i++) {
				for(int j=0; j<igual.length-1; j++) {
					if(igual[j]>igual[j+1]) {
						auxt=igual[j];
						igual[j]=igual[j+1];
						igual[j+1]=auxt;
					}
				}
			}
			
			for(int i=0; i<matriz.length; i++) {
				matriz[i][y]=igual[i];
			}
			
			for(int i=0; i<matriz.length; i++) {
				for(int j=0; j<matriz[i].length; j++) {
					System.out.print(matriz[i][j]+"\t");
				}
				System.out.println("");
			}
			
			break;
		case 2:
			System.out.println("Orden Descendente:\n");
			int aux;
			for(int i=0; i<igual.length-1; i++) {
				for(int j=0; j<igual.length-1; j++) {
					if(igual[j]<igual[j+1]) {
						aux=igual[j];
						igual[j]=igual[j+1];
						igual[j+1]=aux;
					}
				}
			}
			
			for(int i=0; i<matriz.length; i++) {
				matriz[i][y]=igual[i];
			}
			
			for(int i=0; i<matriz.length; i++) {
				for(int j=0; j<matriz[i].length; j++) {
					System.out.print(matriz[i][j]+"\t");
				}
				System.out.println("");
			}
			
			break;
		default:
		}
	}
}
