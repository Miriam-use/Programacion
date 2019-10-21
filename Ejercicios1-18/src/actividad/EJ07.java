package actividad;

import java.util.Scanner;

public class EJ07 {

	public static void main(String[] args) {
		
		Scanner numero = new Scanner(System.in);
		
		System.out.println("Ingresa numero:");
		int n=numero.nextInt();
		
		int resto=n%3;
		
		for (int i=1; i <=n; i++) {

			if (i%3==0)
			{
			 System.out.println("Los multiplos de 3 hasta "+n+" son: "+i);

			   }

			}
		
	}

}
