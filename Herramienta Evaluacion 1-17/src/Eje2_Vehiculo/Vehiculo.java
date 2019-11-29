package Eje2_Vehiculo;

/**
 * <h2>Clase que guarde y muestre las caracterestica de un vehiculo</h2>
 * 
 * Buscar informacion de javadoc en <a href="http://google.com">GOOGLE</a>
 * @version 1-2019
 * @author Miriam
 */

public class Vehiculo {
	
	private String marca;
	private double potencia;
	private boolean traccion; //Solo acepta si es verdadero o farso
	
	/**
	 * Guarda la marca, la potencia y la traccion en las cuatro ruedas
	 */
	
	Vehiculo(String mar, double pot, boolean tra) {
		marca = mar;
		potencia = pot;
		traccion = tra;
	}
	
	public void setDatos(String mar, double pot, boolean tra) {
		marca = mar;
		potencia = pot;
		traccion = tra;
	}
	
	public String getMarca() {
		return marca;
	}
	
	public double setPotencia() {
		return potencia;
	}
	
	public boolean setTraccion() {
		return traccion;
	}

}
