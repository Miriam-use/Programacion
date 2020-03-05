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
	
	public abstract String calcularSaldo();
}
