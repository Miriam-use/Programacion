package Ejercicios1_40;

import java.util.Arrays;

public class Ejercicio8 {

	public static void main(String[] args) {

		int array[] = new int[5];
		
		for(int i=0; i<array.length; i++) {
			int n = (int)(Math.random()*10);
			array[i]=n;
			System.out.println(array[i]);
			}
		
	/*	int mayor1=array[0];
		for(int i=0; i<array.length; i++) {
			if(array[i]>mayor1) {
				mayor1 = array[i];
			}
		}
		*/
		Arrays.sort(array);
		int j=0;
		for(int i=array.length-1; i>=3; i--) {
			j++;
			System.out.println("El "+j+" mayor es: "+array[i]);
		}
	}
}
