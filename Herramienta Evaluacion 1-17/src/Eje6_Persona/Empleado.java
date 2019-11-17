package Eje6_Persona;

public class Empleado extends Persona {

	private double sueldo;
	
	public Empleado() {
		super();
	}
	
	public Empleado(String nom, int edad, double sueldo) {
		super(nom, edad);
		this.sueldo = sueldo;
	}
	
	public String getSueldo() {
		return ". Su sueldo es "+sueldo;
	}
}
