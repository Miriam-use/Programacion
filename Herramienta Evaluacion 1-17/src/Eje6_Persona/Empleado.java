package Eje6_Persona;
/**
 * <h2>Plantear una segunda clase Empleado que herede de la clase Persona. Añadir
 * un atributo sueldo y los métodos de cargar el sueldo e imprimir su sueldo.</h2>
 * @author Miriam
 * @see Persona
 */
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
