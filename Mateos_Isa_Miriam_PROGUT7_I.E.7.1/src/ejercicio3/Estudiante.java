package ejercicio3;

import ejercicio1.Persona;
/**
 * 
 * @author Miriam
 *
 */
public class Estudiante {

	private int id;
	private Persona persona;
	
	public Estudiante() {
		this.id=0;
		this.persona=null;
	}
	
/**
 * 	
 * @param id
 * @param persona
 */
	public Estudiante(int id, Persona persona) {
		this.id = id;
		this.persona = persona;
	}
/**
 * 
 * @return id
 */
	public int getId() {
		return id;
	}
/**
 * 	
 * @param id
 */
	public void setId(int id) {
		this.id=id;
	}
/**
 * 	
 * @return persona
 */
	public Persona getPersona() {
		return persona;
	}
/**
 * 	
 * @param pe
 */
	public void setPersona(Persona pe) {
		this.persona=pe;
	}

	@Override
	public String toString() {
		return "Estudiante [id=" + id + ", persona=" + persona.toString() + "]";
	}
}
