package Eje12_Sueldo;

import java.util.Scanner;
/**
 * <h2>clase que determine el sueldo bruto para cada uno de los tres empleados de una empresa..</h2>
 * @author Miriam
 * 
 */
public class MainSueldo {

	public static void main(String[] args) {

		Scanner empleado = new Scanner(System.in);
		
		System.out.println("Introduce Nombre:");
		String nom = empleado.nextLine();
		
		System.out.println("Introduce horas trabajadas:");
		int hora = empleado.nextInt();
		
		System.out.println("Introduce cual es la tarifa por horas trabajadas:");	
		double cobra = empleado.nextDouble();
		
		Sueldo emple = new Sueldo(nom, hora, cobra);
		System.out.println(emple.getDatos());
	}

}
