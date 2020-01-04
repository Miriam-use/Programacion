package Ejercicio3;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner libro = new Scanner(System.in);

		System.out.println("Título del libro:");
		String titulo=libro.nextLine();
		System.out.println("Nombre del autor:");
		String autor=libro.nextLine();
		System.out.println("ISBN: (0-00-000000-X)");
		String isbn=libro.nextLine();
		System.out.println("Ciudad de origen:");
		String ciudad=libro.nextLine();		
		System.out.println("Pais de origen:");
		String pais=libro.nextLine();		
		
		Libro l1 = new Libro(titulo, autor, isbn, ciudad, pais);
		
		System.out.println("Numero de edicion:");
		int edicion=libro.nextInt();
		l1.setEdicion(edicion);

		System.out.println("Fecha de salida.");
		System.out.println("Mes:");
		int mes=libro.nextInt();
		System.out.println("Dia");
		int dia=libro.nextInt();
		System.out.println("Año");
		int año=libro.nextInt();
		l1.setFecha(dia, mes, año);
		
		System.out.println("Numero de paginas:");
		int pagina=libro.nextInt();
		l1.setPagina(pagina);
		
		System.out.println(l1.getMostrar());
	}

}
