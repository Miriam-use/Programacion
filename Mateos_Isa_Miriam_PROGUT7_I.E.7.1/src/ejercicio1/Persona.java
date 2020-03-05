package ejercicio1;
/**
 * 
 * @author Miriam
 *
 */
public class Persona {

	private String nombre, apellido;
	private String nif;
/**
 * 	
 * @param nom
 * @param apell
 * @param nif
 */
	public Persona(String nom, String apell, String nif) {
		this.nombre=nom;
		this.apellido=apell;
		this.nif=nif;
	}
/**
 * 	
 * @return nombre
 */
	public String getNombre() {
		return nombre;
	}
/**
 * 	
 * @return apellido
 */
	public String getApellido() {
		return apellido;
	}
/**
 * 	
 * @return nif
 */
	public String getNIF() {
		return nif;
	}
	
	@Override
	public String toString() {
		return "[Nombre: "+nombre
				+", Apellidos: "+apellido
				+", NIF: "+nif;
	}
}
