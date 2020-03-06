package ejercicio3;

import ejercicio1.Persona;

public class Profesor {

	private int despacho;
	private Persona persona;
	
	public Profesor() {
		this.despacho=0;
		this.persona=null;
	}
/**
 * 	
 * @param despacho
 * @param persona
 */
	public Profesor(int despacho, Persona persona) {
		this.despacho = despacho;
		this.persona = persona;
	}
/**
 * 	
 * @param despach
 * @return despacho
 */
	public int getDespacho(int despach) {
		return despacho;
	}
/**
 * 	
 * @param despach
 */
	public void setDespacho(int despach) {
		this.despacho=despach;
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
		return "Profesor [despacho=" + despacho + ", persona=" + persona.toString() + "]";
	}
}
