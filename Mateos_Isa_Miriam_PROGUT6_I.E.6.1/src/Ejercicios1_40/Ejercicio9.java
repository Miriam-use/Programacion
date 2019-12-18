package Ejercicios1_40;

import java.util.Arrays;

public class Ejercicio9 {

	public static void main(String[] args) {
		
		int array[] = new int[1000]; //se descuadra al añadir un array de 1000
		
		for(int i=0; i<array.length; i++) {
			int n = (int)(Math.random()*2000+1);
			array[i]=n;
			//System.out.println(array[i]);
			}
		
		Arrays.sort(array);
		int j=0;
		for(int i=array.length-1; i>=990; i--) {
			j++;
			System.out.println("El "+j+" mayor es: "+array[i]);
		}
	}

}
