package Ejercicios1_40;

import java.util.StringTokenizer;
/**
 * 
 * @author Miriam
 *
 */
public class Ejercicio28 {

	public static void main(String[] args) {
/**
 * StringTokenizer para separar
 */
		String notas="Juan Carlos \n 8.5 \n Andrés \n 4.9 \n Pedro \n 3.8 \n Juan \n 6.3";
		StringTokenizer tokens=new StringTokenizer(notas, "\n");
		
		while(tokens.hasMoreTokens()) {
			System.out.println("El alumno "+tokens.nextToken()+" ha sacado una nota "+tokens.nextToken());
		}
	}

}
