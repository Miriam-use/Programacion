package Ejercicios1_40;

import java.util.Scanner;
/**
 * 
 * @author Miriam
 *
 */
public class Ejercicio7 {

	public static void main(String[] args) {

		Scanner numero = new Scanner(System.in);
		
		int array[] = new int[20];
		
		Object invertir[] = new Object[array.length];
		
		int maximo = array.length;
		
		try {
			
		for(int i=0; i<array.length; i++) {
			int j=0;
			j++;
		System.out.println("Introduce el "+j+" numeros:");
		int n=numero.nextInt();
		array[i]=n;
		
		}
		}catch(Exception e) {
			System.out.println("Error");
		}
		
		for(int i=0; i<array.length; i++) {
			invertir[maximo-1]=array[i];
			maximo--;
		}
		
		System.out.println("Arreglo invertido:");
		for(int i=0; i<invertir.length; i++) {
			Object j = invertir[i];
			System.out.println(j);
		}
	}

}
