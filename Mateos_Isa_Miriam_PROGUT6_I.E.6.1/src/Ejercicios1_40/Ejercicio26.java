package Ejercicios1_40;

import java.util.Scanner;
/**
 * 
 * @author Miriam
 *
 */
public class Ejercicio26 {

	public static void main(String[] args) {
		
		Scanner array = new Scanner(System.in);
		
		System.out.println("Introduce palabra o frace:");
		String leer=array.nextLine();
		
		String palabra=leer;
		String eliminar[]=palabra.split(" ");
		
		String invertida="";
		for(int j=palabra.length()-1; j>=0; j--) {
			invertida+=palabra.charAt(j);
			String eliminar2[]=invertida.split(" ");
		}
/**
 * Para comparar realmente las cadenas y no si son o no la misma instancia, se usa el método equals().
 */
		if(palabra.equals(invertida)) {
			System.out.println("\nla palabra "+palabra+" es palíndroma");
		}else {
			System.out.println("\nla palabra "+palabra+" no es palíndroma");
		}
	}

}
