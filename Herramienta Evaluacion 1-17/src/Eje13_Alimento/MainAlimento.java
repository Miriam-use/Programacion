package Eje13_Alimento;

import java.util.Scanner;

public class MainAlimento {

	public static void main(String[] args) {
		
		Scanner alimento = new Scanner(System.in);
		
		System.out.println("Introduce nombre de alimento:");
		String nombre = alimento.nextLine();
		System.out.println("Introduce numero de Lipidos:");
		int lipido = alimento.nextInt();
		System.out.println("Introduce numero Hodratos de Carbono:");
		int hidrato = alimento.nextInt();
		System.out.println("Introduce numero de Proteinas:");
		int proteinas = alimento.nextInt();
		
		Alimento comida = new Alimento(nombre, lipido, hidrato, proteinas);
		System.out.println("¿Nivel de Vitaminas?(A alto, M medio y B bajo)");
		String vitamina = alimento.nextLine();
		comida.setMineral(vitamina);
		
		System.out.println("¿Nivel de Minerales?(A alto, M medio y B bajo)");
		String mineral = alimento.nextLine();
		comida.setMineral(mineral);
		
		System.out.println("¿Es de origen animal?");
		boolean origen = alimento.nextBoolean();
		comida.setOrigenAnimal(origen);
		
		System.out.println(comida.getInformacion());
	}

}
