package Eje10_Restaurante;

import java.util.Scanner;

/**
 * <h2>El método recibe la cantidad de papas y chocos en kilos y devuelve el número de clientes que puede atender</h2>
 * 
 * Buscar informacion de javadoc en <a href="http://google.com">GOOGLE</a>
 * @version 1-2019
 * @author Miriam
 */

public class MainRestaurante {

	public static void main(String[] args) {
		
		Restaurante tapa = new Restaurante();
		Scanner comida = new Scanner(System.in);
		
		/**
		 * Excepcion que nos pone un mensaje de error si metes una cantidad que no sea numero.
		 */
		
		try {
		System.out.println("¿Cuantos kilos de chocos comprara?");
		int choco = comida.nextInt();
		tapa.addChocos(choco);
		}catch(Exception ex){
			System.out.println("ERROR AL INTRODUCIR KILOS");
		}
		comida.nextLine();
		try{
		System.out.println("¿Cuantos kilos de papas comprara?");
		int papa = comida.nextInt();
		tapa.addPapas(papa);
		}catch(Exception ex) {
			System.out.println("ERROR AL INTRODUCIR KILOS");
		}
		
		System.out.println(tapa.getMuestra());

	}

}
