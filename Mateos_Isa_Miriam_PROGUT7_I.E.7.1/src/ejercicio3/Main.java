package ejercicio3;

import java.util.ArrayList;
import java.util.Scanner;

import ejercicio1.Persona;
/**
 * 
 * @author Miriam
 *
 */
public class Main {
	
	static Scanner sc;
	
	static ArrayList<Estudiante>estudiante = new ArrayList<>();
	static ArrayList<Profesor>profesor = new ArrayList<>();
	
	public static void main(String[] args) {

		sc = new Scanner(System.in);
		int opcion;

		do {
			menu();
			opcion=sc.nextInt();
			switch (opcion) {
			case 1:
				System.out.println("Id del alumno:");
				int id=sc.nextInt();
				System.out.println("Nombre:");
				String nombre=sc.next();
				System.out.println("Apellido:");
				String apellido=sc.next();
				System.out.println("NIF:");
				String nif=sc.next();
				
				estudiante.add(new Estudiante(id, (new Persona(nombre, apellido, nif))));
				break;
			case 2:
				System.out.println("Id del profesor:");
				int despacho=sc.nextInt();
				System.out.println("Nombre:");
				String nom=sc.next();
				System.out.println("Apellido:");
				String ape=sc.next();
				System.out.println("NIF:");
				String n=sc.next();
				
				profesor.add(new Profesor(despacho, (new Persona(nom, ape, n))));
				break;
			case 3:
				listarEstudiante();
				break;
			case 4:
				listarProfesor();
				break;
			case 0:
				System.out.println("Salir");
				break;
			default:
				System.out.println("Opcion no valida. Introduzca una opcion valida, por favor.");
			}
		}while (opcion != 0);
	}

	public static void menu() {
		System.out.println("1. Añadir estudiante");
		System.out.println("2. Añadir profesor");
		System.out.println("3. Lista de estudiantes");
		System.out.println("4. Lista de profesores");
		System.out.println("0. Salir del programa\n\n");
		System.out.print("Introduzca una opcion: ");

	}
	
	public static void listarEstudiante() {
		if (estudiante.isEmpty()) {
			System.out.println("La agenda no tiene contactos\n");
		} else {
			for (int i = 0; i < estudiante.size(); i++) {
				Estudiante e = estudiante.get(i);
				System.out.println(e.toString());
			}
			System.out.println("");
		}
	}
	
	public static void listarProfesor() {
		if (profesor.isEmpty()) {
			System.out.println("La agenda no tiene contactos\n");
		} else {
			for (int i = 0; i < profesor.size(); i++) {
				Profesor p = profesor.get(i);
				System.out.println(p.toString());
			}
			System.out.println("");
		}
	}
}
