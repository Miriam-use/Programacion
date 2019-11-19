package Eje8_Alumno;

public class Alumno {

	private String nombre;
	private int edad;
	
	Alumno(String nom, int edad){
		this.nombre = nom;
		this.edad = edad;
	}
	
	public void setNombre(String nom) {
		this.nombre = nom;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public void setEdad(int edad) {
		this.edad = edad;
	}
	
	public int getEdad() {
		return edad;
	}
	
	public String getDatos() {
		return nombre+"\n"+edad+" años";
	}
	
}
