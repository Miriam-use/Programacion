package Eje6_Persona;

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
