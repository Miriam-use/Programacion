package Ejercicios1_40;

import java.util.Scanner;
/**
 * 
 * @author Miriam
 *
 */
public class Ejercicio30 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		int N, aux, inverso = 0, cifra;
		
		do {
            System.out.print("Introduce un n�mero >= 10: ");
            N = sc.nextInt();
        } while (N < 10);
 
/**
 * le damos la vuelta al n�mero
 */
       aux = N;
        while (aux!=0){
            cifra = aux % 10;
            inverso = inverso * 10 + cifra;
            aux = aux / 10;
        }
 
        if(N == inverso){
            System.out.println("Es capicua");
        }else{
            System.out.println("No es capicua");
        }
	}

}
