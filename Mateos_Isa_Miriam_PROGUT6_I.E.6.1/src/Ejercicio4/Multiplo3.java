package Ejercicio4;

import java.util.Scanner;
/**
 * 
 * @author Miriam
 *
 */
public class Multiplo3 {

	public static void main(String[] args) {

		Scanner array = new Scanner(System.in);
		
		System.out.println("¿Cuantos numeros escribiras?");
		int num=array.nextInt();
		
		int[] multiplo=new int[num];
		
		for(int i=0; i<multiplo.length; i++) {
			System.out.println("Ingresa multiplo de 3:");
			int n=array.nextInt();
			multiplo[i]=n;
			
				if(n%3==0) {
					System.out.println(multiplo[i]+" es multiplo de 3");
				}else {
					System.out.println(multiplo[i]+" NO es un multiplo de 3");
				}
		}
	}

}
