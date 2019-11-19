package Eje2_Vehiculo;

public class Vehiculo {
	
	private String marca;
	private double potencia;
	private boolean traccion; //Solo acepta si es verdadero o farso
	
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
