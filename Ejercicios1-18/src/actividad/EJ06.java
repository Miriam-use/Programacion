package actividad;

import java.util.Scanner;

public class EJ06 {

	public static void main(String[] args) {
		
		Scanner nota = new Scanner(System.in);
		
		System.out.print("Ingresa nota de alumno (del 0 al 10):");
		double not=nota.nextDouble();
		
		if(not>=0&&not<5)
		{
			System.out.print("El alumno tiene un Suspenso");
		}else
		{
			if(not>4&&not<7)
			{
				System.out.print("El alumno tiene un Bien");
			}else
			{
				if(not>6&&not<9) {
					System.out.print("El alumno tiene un Notable");
				}else
				{
					if(not>8&&not<=10)
					{
						System.out.print("El alumno tiene un Sobresaliente");
					}else
					{
						System.out.print("No esta dentro de los parametros");
					}
				}
			}
		}

	}

}
