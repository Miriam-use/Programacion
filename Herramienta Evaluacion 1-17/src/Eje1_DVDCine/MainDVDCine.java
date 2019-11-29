package Eje1_DVDCine;

import java.util.Scanner;

/**
 * <h2>Clase que nos permite crear la ficfa de una pelicula</h2>
 * 
 * Buscar informacion de javadoc en <a href="http://google.com">GOOGLE</a>
 * @version 1-2019
 * @author Miriam
 */

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
		
		try {
		System.out.println("¿Cuanto dura?");
		int duracion = dat.nextInt();
		peli.setmuestraDuracion(duracion);
		}catch(Exception ex) {
			System.out.println("ERROR 404: MINUTO ERRONEO");
		}
		
		System.out.println(peli.muestraDVDCine());
	}

}
