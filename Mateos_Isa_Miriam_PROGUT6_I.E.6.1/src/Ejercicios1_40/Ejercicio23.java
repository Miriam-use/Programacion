package Ejercicios1_40;
/**
 * 
 * @author Miriam
 *
 */
public class Ejercicio23 {

	public static void main(String[] args) {
		
		String cadena= "jose, buenos dias, que tengas un buen dia";
		String array[]=cadena.split(",");
		
		System.out.print("ORIGINAL\n****************\n");
		for(int i=0; i<array.length; i++) {
			System.out.print(array[i]);
		}
/**
 * sustitulle la palabra elegida por la que quieras meter		
 */
		System.out.print("\nSUSTITUCION\n****************\n");
		for(int i=0; i<array.length; i++) {
			array[i]=array[i].replace("jose", "manolo");
			System.out.print(array[i]);
		}
	}
}
