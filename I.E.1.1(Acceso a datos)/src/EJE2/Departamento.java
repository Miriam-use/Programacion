package EJE2;
/**
 * 
 * @author Miriam
 *
 */
public class Departamento {
	
	private int numero; 
	private String nombre; 
	private String localidad;
	
	public Departamento() {
		
	}
/**
 * 	
 * @param id
 * @param nom
 * @param loc
 */
	public Departamento(int id, String nom, String loc) {
		this.numero=id;
		this.nombre=nom;
		this.localidad=loc;
	}
/**
 * 
 * @return numero
 */
	public int getNumero() {
		return numero;
	}
/**
 * 
 * @param numero
 */
	public void setNumero(int numero) {
		this.numero = numero;
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
 * @param nombre
 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
/**
 * 
 * @return localidad
 */
	public String getLocalidad() {
		return localidad;
	}
/**
 * 
 * @param localidad
 */
	public void setLocalidad(String localidad) {
		this.localidad = localidad;
	}
/**
 * 	
 * @return muestra el id , el nombre y la localidad
 */
	public String Mostrar() {
		return "Código del departamento: "+numero
				+"\nNombre del departamento: "+nombre
				+"\nLocalidad: "+localidad;
	}
	/**
	 * 
	 * @return numero+"%"+nombre+"%"+nombre+"%"+localidad
	 */
	public String FicheroEscritura() {
		return numero+"%"+nombre+"%"+localidad;
	}

	@Override
	public String toString() {
		return "Departamento [numero=" + numero + ", nombre=" + nombre + ", localidad=" + localidad + "]";
	}
}
