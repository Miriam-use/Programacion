package ejercicio6;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * 
 * @author Miriam
 *
 */
public class Catalogo {

	static Scanner sc;
	static ArrayList<Obras> listaObras;
	
	public static void main(String[] args) {

		listaObras = new ArrayList<>();
		sc = new Scanner(System.in);
		int opcion;
		
		do {
			menu();
			opcion = sc.nextInt();
			switch (opcion) {
			case 1:
				break;
			case 2:
				menu2();
				int opc = sc.nextInt();
				switch(opc) {
				case 1:
					System.out.println("Introduzca el nombre: ");
					String nom=sc.next();
					System.out.println("Introduzca el lugar de nacimiento: ");
					String lug=sc.next();
					System.out.println("Introduzca dia de nacimiento: ");
					int dia=sc.nextInt();
					System.out.println("Introduzca mes de nacimiento: ");
					int mes=sc.nextInt();
					System.out.println("Introduzca año de nacimiento: ");
					int anio=sc.nextInt();
					System.out.println("Introduzca dia de fallecimiento: ");
					int dia2=sc.nextInt();
					System.out.println("Introduzca mes de fallecimiento: ");
					int mes2=sc.nextInt();
					System.out.println("Introduzca año de fallecimiento: ");
					int anio2=sc.nextInt();
					
					System.out.println("Introduzca titulo de obra:");
					String tit=sc.next();
					System.out.println("Introduzca numero de inventario:");
					int num=sc.nextInt();
					System.out.println("Introduzca año de obra:");
					int ani=sc.nextInt();
					
					System.out.println("Introduzca material de obra:");
					String mat=sc.next();
					System.out.println("Introduzca altura de obra:");
					double alt=sc.nextDouble();
					
					listaObras.add(new Escultura(tit, num, (new Artista(nom, lug, dia, mes, anio, dia2, mes2, anio2)), ani, mat, alt));
					
					break;
				case 2:
					System.out.println("Introduzca el nombre: ");
					String nom2=sc.next();
					System.out.println("Introduzca el lugar de nacimiento: ");
					String lug2=sc.next();
					System.out.println("Introduzca dia de nacimiento: ");
					int dia3=sc.nextInt();
					System.out.println("Introduzca mes de nacimiento: ");
					int mes3=sc.nextInt();
					System.out.println("Introduzca año de nacimiento: ");
					int anio3=sc.nextInt();
					System.out.println("Introduzca dia de fallecimiento: ");
					int dia4=sc.nextInt();
					System.out.println("Introduzca mes de fallecimiento: ");
					int mes4=sc.nextInt();
					System.out.println("Introduzca año de fallecimiento: ");
					int anio4=sc.nextInt();
					
					System.out.println("Introduzca titulo de obra:");
					String tit2=sc.next();
					System.out.println("Introduzca numero de inventario:");
					int num2=sc.nextInt();
					System.out.println("Introduzca año de obra:");
					int ani2=sc.nextInt();
					
					System.out.println("Introduzca soporte de obra:");
					String sop=sc.next();
					System.out.println("Introduzca altura de obra:");
					double alt2=sc.nextDouble();
					System.out.println("Introduzca ancho de obra:");
					double anc=sc.nextDouble();
					
					listaObras.add(new Pintura(tit2, num2, (new Artista(nom2, lug2, dia3, mes3, anio3, dia4, mes4, anio4)), ani2, alt2, anc, sop));
					
					break;
				}
				break;
			case 3:
				eliminarObra();
				break;
			case 4:
				eliminarTodas();
				break;
			default:
				System.out.println("Opcion no valida. Introduzca una opcion valida, por favor.");
			}
		}while (opcion != 0);
	}
	
	public static void menu() {
		System.out.println("CATALOGO DE MUSEO");
		System.out.println("===================");
		System.out.println("1. Listar todos las obras");
		System.out.println("2. Añadir obra");
		System.out.println("3. Eliminar obra");
		System.out.println("4. Eliminar todos las obras");
		System.out.println("0. Salir del programa\n\n");
		System.out.print("Introduzca una opcion: ");

	}
	
	public static void menu2() {
		System.out.println("1. Escultura");
		System.out.println("2. Pintura");
		System.out.print("Introduzca una opcion: ");
	}
	
	public static void listarPersonas() {
		if (listaObras.isEmpty()) {
			System.out.println("El catalogo no tiene obras\n");
		} else {
			for (int i = 0; i < listaObras.size(); i++) {
				Escultura e =(Escultura) listaObras.get(i);
				System.out.println("%n"+i+" "+e.toString());
			}
			for (int i = 0; i < listaObras.size(); i++) {
				Pintura p =(Pintura) listaObras.get(i);
				System.out.println("%n"+i+" "+p.toString());
			}
			System.out.println("");
		}
	}
	
	public static void eliminarObra() {
		System.out.println("\n\nELIMINAR OBRA");
		System.out.print("Introduzca la posicion de obra: ");
		int posicion = Integer.parseInt(sc.nextLine());
		if (posicion < 0 || posicion >= listaObras.size()) {
			System.out.println("Posicion erronea");
		} else {
			System.out.print("¿Esta seguro? (S/N): ");
			String siono = sc.nextLine();
			if (siono.equalsIgnoreCase("S") || siono.equalsIgnoreCase("s")) {
				listaObras.remove(posicion);
			}
		}
		System.out.println("\n");
	}
	
	public static void eliminarTodas() {
		System.out.println("\n\nELIMINAR OBRAS");
		System.out.print("¿Esta seguro? (S/N): ");
		String siono = sc.nextLine();
		if (siono.equalsIgnoreCase("S") || siono.equalsIgnoreCase("s")) {
			listaObras.clear();
		}
		System.out.println("\n");

	}
}
