package Ejercicios33;

import java.util.Scanner;

/**
 * 
 * @author Miriam
 *
 */
public class SopaLetra {
	
	public String palabra;
/**
 * Coloca las palabras en horizontal de manera normal
 * @param sopa
 * @param palabra
 * @param f
 * @param c
 */
	public static void pasarHorizontal(String sopa[][], String palabra, int f, int c) {
		for(int i=0; i<palabra.length(); i++) {
			sopa[f][c+i]=""+palabra.charAt(i);
		}
	}
/**
 * 	Coloca las palabras en vertical de manera normal
 * @param sopa
 * @param palabra
 * @param f
 * @param c
 */
	public static void pasarVertical(String sopa[][], String palabra, int f, int c) {
		for(int i=0; i<palabra.length(); i++) {
			sopa[f+i][c]=""+palabra.charAt(i);
		}
	}
/**
 * 	
 * @param sopa
 */
	public static void VisualizarSopa(String sopa[][]) {
		System.out.print("******************************\n");
		System.out.print("********SOPA DE LETRAS********\n");
		System.out.print("******************************\n");
		for(int i=0; i<sopa.length; i++) {
			for(int j=0; j<sopa[i].length; j++) {
				System.out.print(" "+sopa[i][j]);
			}
			System.out.println("");
		}
	}
	
	
	
	
	
	
	
	public static void main(String[] args) {

		String sopa[][]=new String[15][15];
/**
 * Coloca aleatoria mente las palabras en la matriz
 */
		String letra[]= {"A", "B", "C", "D", "E", "F", "G", "H", "I", "J",
				"K", "L", "M","N","O","P","Q","R","S","T","U","V","W", "X","Y","Z"};
		
			for(int i=0; i<sopa.length; i++) {
				for(int j=0; j<sopa[i].length; j++) {
					sopa[i][j]=(letra[(int)(Math.random()*(26))]);
				}
			}
			
			String palabra1="PERRITO";
			String palabra2="GATIRO";
			String palabra3="SESAMO";
			String palabra4="MURCIELAGO";
		
			pasarHorizontal(sopa, palabra1, 1, 1);
			pasarHorizontal(sopa, palabra4, 14, 1);
			pasarVertical(sopa, palabra2, 5, 10);
			pasarVertical(sopa, palabra3, 0, 2);
			
			VisualizarSopa(sopa);
			System.out.println("\nBuscas las sigientes palabras:\n");
			System.out.println(palabra1+"\n"+palabra2+"\n"+palabra3+"\n"+palabra4);
		
	}
}
