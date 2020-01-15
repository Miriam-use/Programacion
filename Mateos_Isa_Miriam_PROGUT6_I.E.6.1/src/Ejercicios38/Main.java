package Ejercicios38;

import java.util.Scanner;
/**
 * 
 * @author Miriam
 *
 */
public class Main {

	public static void main(String[] args) {

		Caracol c = new Caracol();
		
        Scanner in = new Scanner(System.in);
        System.out.println("Dimesión De La Matriz: ");
        int n=in.nextInt();
        
        c.mostrarCaracol((c.MatrizCaracol(n, 1)), n, n);
	}

}
