package ejercicio8;
/**
 * 
 * @author Miriam
 *
 */
public class Alumno {

	private String nombre;
	private String dni;
	private double saldo;
/**
 * 	
 * @param nom
 * @param dni
 */
	public Alumno(String nom, String dni) {
		this.nombre=nom;
		this.dni=dni;
		this.saldo=100;
	}
/**
 * 	
 * @param incrementa
 */
	public void setIncrementar(double incrementa) {
		this.saldo+=incrementa;
	}
/**
 * 	
 * @param decremente
 */
	public void setDecremente(double decremente) {
		this.saldo-=decremente;
	}

	@Override
	public String toString() {
		return "Alumno [nombre=" + nombre + ", dni=" + dni + ", saldo=" + saldo + "]";
	}
	
}
