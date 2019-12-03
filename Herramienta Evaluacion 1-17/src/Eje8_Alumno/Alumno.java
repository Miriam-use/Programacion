package Eje8_Alumno;
/**
 * <h2>Implementar la clase Alumno que incluya la Asignatura a la que el alumno ha asistido.</h2>
 * @author Miriam
 *
 */
import Eje7_Asignatura.Asignatura;

public class Alumno {

	private String nombre;
	private int edad;
	
	/**
	 * Constructor que acepte como par·metro el nombre del alumno y edad.
	 * @param nom
	 * @param edad
	 */
	Alumno(String nom, int edad){
		this.nombre = nom;
		this.edad = edad;
	}

	/**
	 * MÈtodos para modificar el nombre (setNombre) y para consultarlo (getNombre).
	 * @param nom
	 */
	public void setNombre(String nom) {
		this.nombre = nom;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	/**
	 * MÈtodos para modificar y consultar la edad.
	 * @param edad
	 */
	public void setEdad(int edad) {
		this.edad = edad;
	}
	
	public int getEdad() {
		return edad;
	}
	
	public String getDatos() {
		return nombre+"\n"+edad+" a√±os";
	}
	
}
