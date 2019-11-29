package Eje13_Alimento;

import java.util.Scanner;
/**
 * <h2>Crear una clase de nombre Alimento cuyos objetos representen alimentos.</h2>
 * @author Miriam
 * 
 */
public class MainAlimento {

	public static void main(String[] args) {
		
		Scanner alimento = new Scanner(System.in);
		
		System.out.println("Introduce porcentaje de alimento:");
		String nombre = alimento.nextLine();
		System.out.println("Introduce porcentaje de Lipidos:");
		double lipido = alimento.nextDouble();
		System.out.println("Introduce porcentaje Hodratos de Carbono:");
		double hidrato = alimento.nextDouble();
		System.out.println("Introduce porcentaje de Proteinas:");
		double proteinas = alimento.nextDouble();
		alimento.nextLine();
		
		Alimento comida = new Alimento(nombre, lipido, hidrato, proteinas);
		System.out.println("¿Nivel de Vitaminas?(A alto, M medio y B bajo)");
		char vitamina = alimento.nextLine().charAt(0);
		comida.setVitaminas(vitamina);
		
		System.out.println("¿Nivel de Minerales?(A alto, M medio y B bajo)");
		char mineral = alimento.nextLine().charAt(0);
		comida.setMineral(mineral);
		
		System.out.println("¿Es de origen animal?");
		boolean origen = alimento.nextBoolean();
		comida.setOrigenAnimal(origen);
		
		System.out.println(comida.getmuestraAlimento());
	}

}
