package Ejercicio4;

import java.util.Scanner;

public class VerAlumno {

	public static void main(String[] args) {

		Scanner alumno = new Scanner(System.in);
		
		System.out.println("Nombre de alumno:");
		String nombre=alumno.nextLine();
		System.out.println("Numero de matricula:");
		int matricula=alumno.nextInt();
		
		Alumno al = new Alumno(nombre, matricula);
		
		System.out.println("1 Nota:");
		double nota1=alumno.nextDouble();
		System.out.println("2 Nota:");
		double nota2=alumno.nextDouble();
		
		al.setNota(nota1, nota2);
		
		System.out.println(al.getmuestraAlumno());
	}

}
