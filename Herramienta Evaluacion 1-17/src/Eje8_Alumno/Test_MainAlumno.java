package Eje8_Alumno;

import Eje7_Asignatura.Asignatura;

public class Test_MainAlumno {

	public static void main(String[] args) {
		
		Alumno alum = new Alumno("Mario", 25);
		Asignatura asig = new Asignatura("Matematica", 6);
		
		System.out.println(alum.getDatos());
		System.out.println(asig.getNotasAsignatura());
		
		Alumno alum2 = new Alumno("Almudena", 24);
		Asignatura asig2 = new Asignatura("Lengua", 5);
		
		System.out.println(alum2.getDatos());
		System.out.println(asig2.getNotasAsignatura());
		
		Alumno alum3 = new Alumno("Fermin", 30);
		Asignatura asig3 = new Asignatura("Fisica", 3);
		
		System.out.println(alum3.getDatos());
		System.out.println(asig3.getNotasAsignatura());
	}

}
