package Ejercicios1_40;

import java.util.Scanner;
/**
 * 
 * @author Miriam
 *
 */
public class Ejercicio25 {

	public static void main(String[] args) {

		Scanner array = new Scanner(System.in);
		
		System.out.println("Introduce palabra o frace:");
		String leer=array.nextLine();
		
		String cadena=leer;
		int vocal[]=new int[3];
		char caracte;
/**
 * 	Esta será la cadena invertida, primero está vacía	
 */
		String invertida="";
/**
 * Recorremos la original del final al inicio
 */
		for(int j=cadena.length()-1; j>=0; j--) {
/**
 * Y vamos concatenando cada carácter a la nueva cadena
 */
			invertida+=cadena.charAt(j);
		}
		
		for(int i=0; i<cadena.length(); i++) {
			caracte=Character.toLowerCase(cadena.charAt(i));
			
			switch(caracte) {
			case 'a':
				vocal[0]++;
				break;
			case 'e':
				vocal[1]++;
				break;
			case 'o':
				vocal[2]++;
				break;
			default:
				break;
			}
		}
		
		System.out.println("Cadena invertida");
		System.out.println("*********************");
		System.out.println(invertida);
		
		System.out.println("\nContar vocales");
		System.out.println("*********************");

		if(vocal[0]>10) {
			System.out.println("Exceso de a");
		}else {
			System.out.println("a se repite "+vocal[0]);
			}
		if(vocal[1]>3) {
			System.out.println("Exceso de e");
		}else {
			System.out.println("e se repite "+vocal[1]);
		}
		if(vocal[2]>5) {
			System.out.println("Exceso de o");
		}else {
			System.out.println("o se repite "+vocal[2]);
		}
		
		System.out.println("\nBuscar palabra");
		System.out.println("*********************");
		System.out.println("Introduce palabra para buscar:");
		String buscar=array.nextLine();
		
		String busqueda=buscar;
/**
 * usamos \\W+ para separar la cadena		
 */
		String[] palabra=busqueda.split("\\W+");
		for(String i:palabra) {
			if(cadena.contains(i)) {
				System.out.println("Palabra encontrada");
			}else {
				System.out.println("Palabra no encontrada");
			}
		}
	}
}
