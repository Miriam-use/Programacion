package Eje6_Persona;
/**
 * <h2>Confeccionar una clase Persona que tenga como atributos el nombre y la edad.</h2>
 * 
 * Buscar informacion de javadoc en <a href="http://google.com">GOOGLE</a>
 * @version 1-2019
 * @author Miriam
 */
public class Persona {

	private String nombre;
	private int edad;
	
	public Persona() {
		
	}
	
	public Persona(String nom, int edad) {
		this.nombre = nom;
		this.edad = edad;
	}
	
	public String getResponsabilidades() {
		return "Su nombre es "+nombre+" y su edad es "+edad;
	}

}
