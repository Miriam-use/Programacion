package actividad;

import java.util.Scanner;

public class EJ10 {

	public static void main(String[] args) {
		
		Scanner numero = new Scanner(System.in);
		
		int num_secreto=(int) (Math.random() * 100) + 1; //Para crear un numero aleatorio
		int intentos=10;
		
		System.out.println("Adivine el numero (del 1 al 100):");
		int num_ingresado=numero.nextInt();
		

		while(num_secreto!=num_ingresado && intentos>1 )
		{
			if(num_secreto>num_ingresado)
			{
				System.out.println("Muy bajo");
			}else
			{
				System.out.println("Muy alto");
			}
			intentos-=1;
			System.out.print("Le quedan "+intentos+" intentos:");
			num_ingresado=numero.nextInt();
		}
		
		if(num_secreto==num_ingresado)
		{
			System.out.print("Exacto! Ustedes adivino en "+(11-intentos)+" intentos");
		}else
		{
			System.out.print("Lo lamento, el numero era: "+num_secreto);
		}
		
	}

}
