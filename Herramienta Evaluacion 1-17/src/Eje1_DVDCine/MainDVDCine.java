package Eje1_DVDCine;

import java.util.Scanner;

public class MainDVDCine {

	public static void main(String[] args) {
		
		DVDCine peli = new DVDCine();
		Scanner dat = new Scanner(System.in);
		
		System.out.println("Nombre de pelicula");
		String dato = dat.nextLine();
		peli.setDato(dato);
		
		System.out.println("¿Su Genero?");
		String genero = dat.nextLine();
		peli.setGenero(genero);
		
		System.out.println("¿Es thriller?");
		boolean thriller = dat.nextBoolean();
		peli.setesThriller(thriller);
		
		System.out.println("¿Tiene resumen?");
		boolean resumen = dat.nextBoolean();
		peli.settieneResumen(resumen);
		
		/*System.out.println("Escribe el resumen:");
		String resumen2 = dat.nextLine();
		peli.setResumenes(resumen2);*/
		
		System.out.println("¿Cuanto dura?");
		int duracion = dat.nextInt();
		peli.setmuestraDuracion(duracion);
		
		
		System.out.println(peli.muestraDVDCine());
	}

}
