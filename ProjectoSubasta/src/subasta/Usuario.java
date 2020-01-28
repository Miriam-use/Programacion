package subasta;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

/**
 * 
 * @author Ruso
 * @author Juan
 * @author Miriam
 *
 * Representa al usuario del sistema de subastas. Estos usuarios pueden pujar
 * por productos que ofrecen otros usuarios.
 * 
 */
public class Usuario {

	private String nombre=null;
	private double credito;
	private LinkedList<Subasta> subastasCreadas;
/**
 * 	
 * @param nombre
 * @param credito
 */
	public Usuario(String nombre, double credito) {
		this.nombre=nombre;
		this.credito=credito;
		this.subastasCreadas = new LinkedList<Subasta>();
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public double getCredito() {
		return credito;
	}
	
	public List<Subasta> getSubastasCreadas() {
		return Collections.unmodifiableList(subastasCreadas);
	}
/**
 * 	
 * @param cantidad
 */
	public void incrementarCredito(double cantidad){
		credito += cantidad;
	}
/**
 * 	
 * @param cantidad
 */
	public void decrementarCredito(double cantidad){
		credito -= cantidad;
	}
/**
 * 	
 * @param subasta
 */
	public void addSubasta (Subasta subasta){
		subastasCreadas.add(subasta);
	}

	@Override
	public String toString() {
		return getClass().getName() + " [nombre=" + nombre  
									+ ", credito="+ credito
									+", subastasCreadas="+subastasCreadas.size()
									+ "]";
	}
}
