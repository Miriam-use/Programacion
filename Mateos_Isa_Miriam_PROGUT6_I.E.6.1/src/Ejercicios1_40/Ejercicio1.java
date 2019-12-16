package Ejercicios1_40;

import java.util.Scanner;
/**
 * 
 * @author Miriam
 *
 */
public class Ejercicio1 {

	public static void main(String[] args) {
	
		Scanner array = new Scanner(System.in);
	
		int[] entero=new int[5];
		int j=1;
		
		for(int i=0; i<entero.length; i++) {
			System.out.println("Introduzca el "+(j++)+" numero:");	//para pedir numero por teclado
			int n=array.nextInt();
			entero[i]=n;
		}
		
		int x=1;
		for(int i=0; i<entero.length; i++) {
			System.out.println("El "+(x++)+" numero es: "+entero[i]);
		}
		
		
	}	
}
