package Eje1_DVDCine;

import java.util.Scanner;

public class MainDVDCine {

	public static void main(String[] args) {
		
		Scanner dat = new Scanner(System.in);
		
		System.out.println("Nombre de pelicula");
		String setDato = dat.nextLine();
		System.out.println("¿Es thriller? ");
		String setesThriller = dat.nextLine();
		System.out.println("¿Tiene resumen? ");
		String setmuestraDuracion = dat.nextLine();
		System.out.println("¿Cuanto dura?");
		String setmuestraDuracion1 = dat.nextLine();
		
		DVDCine peli = new DVDCine();
		System.out.println(peli.muestraDVDCine());
	}

}
