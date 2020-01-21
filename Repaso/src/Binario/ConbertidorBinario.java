package Binario;

import java.util.Scanner;
/**
 * Programa que pasa un número
 * de decimal a binario
 * @author Miriam
 *
 */
public class ConbertidorBinario {

	public static void main(String[] args) {

		int numero, exp=0, digito;
		double binario=0;
		
		Scanner sc = new Scanner(System.in);
		
		do {
			System.out.print("Introduce un numero entero >= 0: ");
            numero = sc.nextInt();
		}while (numero<0);
		
		while(numero!=0) {
			digito=numero%2;
			binario+=digito*Math.pow(10, exp);
			exp++;
			numero=numero/2;
		}
		System.out.printf("Binario: %.0f %n", binario);
	}

}
