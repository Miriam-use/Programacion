package Eje2_Vehiculo;

/**
 * <h2>Clase que guarde y muestre las caracterestica de un vehiculo</h2>
 * 
 * Buscar informacion de javadoc en <a href="http://google.com">GOOGLE</a>
 * @version 1-2019
 * @author Miriam
 */

public class MainVehiculo {

	public static void main(String[] args) {
		
		Vehiculo c1 = new Vehiculo("Renault", 2500, true);

		System.out.println("La marca del veiculo es: "+c1.getMarca());
		System.out.println("Su potencia es: "+c1.setPotencia());
		System.out.println("Tracción a las cuatro ruedas cRuedas: "+c1.setTraccion());
	}

}
