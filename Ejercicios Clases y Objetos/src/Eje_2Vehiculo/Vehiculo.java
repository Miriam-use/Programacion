package Eje_2Vehiculo;
/**Crea una clase de nombre Vehiculo que contenga como atributos
*el modelo de tipo String, la potencia de tipo double y la tracción a las cuatro
*ruedas cRuedas de tipo boolean. El constructor de la clase admitirá como
*argumento el modelo y tendrá como métodos de tipo get y set para la potencia y
*para la tracción a las cuatro ruedas. La clase contará con el método imprimir que
*retorna los datos de cada vehículo y si tiene tracción a las cuatro ruedas.
*/

public class Vehiculo {
	
	private String marca;
	private double potencia;
	private boolean traccion;
	
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
