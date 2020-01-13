package Ejercicios1_40;

import java.util.StringTokenizer;
/**
 * 
 * @author Miriam
 */
public class Ejercicio29 {

	public static void main(String[] args) {

			String notas="Juan Carlos \n 8.5 \n Andrés \n 4.9 \n Pedro \n 3.8 \n Juan \n 6.3";
			char cadena[]=notas.toCharArray();
			String n="";
			double nota=0;
			
			for(int i=0; i<cadena.length; i++) {
				if(Character.isDigit(cadena[i])) {
					nota+=cadena[i];
				}
			}
			System.out.println(nota);
			
			
			StringTokenizer tokens=new StringTokenizer(notas, "\n");
			
			while(tokens.hasMoreTokens()) {
				System.out.println("El alumno "+tokens.nextToken()+" ha sacado una nota "+tokens.nextToken());
			}
	}

}
