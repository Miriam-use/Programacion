package Eje10_Restaurante;

import java.util.Scanner;

public class MainRestaurante {

	public static void main(String[] args) {
		
		Restaurante tapa = new Restaurante();
		Scanner comida = new Scanner(System.in);
		
		System.out.println("¿Cuantos kilos de chocos comprara?");
		int choco = comida.nextInt();
		tapa.addChocos(choco);
		System.out.println("¿Cuantos kilos de papas comprara?");
		int papa = comida.nextInt();
		tapa.addPapas(papa);
		
		System.out.println(tapa.getMuestra());

	}

}
