package ejercicio5;

public abstract class Empleado {

	private String nombre;
	private String dni;
	
	public Empleado(String nom, String d) {
		this.nombre=nom;
		this.dni=d;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public String getDNI() {
		return dni;
	}
	
	public void setNombre(String nom) {
		this.nombre=nom;
	}
	
	public void setDNI(String dni) {
		this.dni=dni;
	}

	public String calcularSaldo() {
		return null;
	}

	@Override
	public String toString() {
		return "Empleado [nombre=" + nombre + ", dni=" + dni + "]";
	}
	
}
