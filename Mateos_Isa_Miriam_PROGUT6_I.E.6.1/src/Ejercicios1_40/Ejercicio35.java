package Ejercicios1_40;

import java.util.Scanner;
/**
 * 
 * @author Miriam
 *
 */
public class Ejercicio35 {
/**
 * 	
 * @param num
 * @return
 */
	public static int factorial(int num) {
		if(num == 0) {
			return 1;
		}
		return num*factorial(num-1);
	}

	public static void main(String[] args) {
		
		Scanner factor = new Scanner(System.in);
		
		System.out.println("Introduce numero para factorizar:");
		int numero=factor.nextInt();
		
		System.out.println("El factorial de "+numero+" es: "+factorial(numero));

	}

}
