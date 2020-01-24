package HashMap;
/**
 * 
 * @author Miriam
 *
 */
public class Clientes {

	private String nombre, dni, apellido, direccion;
	private int tlf;
	private double saldo;
	
	Clientes(){
		
	}
	/**
	 * 
	 * @param nombre
	 * @param apellido
	 * @param dni
	 * @param direccion
	 * @param tlf
	 * @param saldo
	 */
	Clientes(String nombre, String apellido, String dni, String direccion, int tlf, double saldo){
		this.nombre=nombre;
		this.apellido=apellido;
		this.dni=dni;
		this.direccion=direccion;
		this.tlf=tlf;
		this.saldo=saldo;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre=nombre;
	}
	
	public String getApellido() {
		return apellido;
	}
	
	public void setApellido(String apellido) {
		this.apellido=apellido;
	}
	
	public String getDNI() {
		return dni;
	}
	
	public void setDNI(String dni) {
		this.dni=dni;
	}
	
	public String getDireccion() {
		return direccion;
	}
	
	public void setDireccion(String direccion) {
		this.direccion=direccion;
	}
	
	public int getTLF() {
		return tlf;
	}
	
	public void setTLF(int tlf) {
		this.tlf=tlf;
	}
	
	public double getSaldo() {
		return saldo;
	}
	
	public void setSaldo(double saldo) {
		this.saldo=saldo;
	}
	
	@Override
	public String toString() {
		return "Persona [nombre= "+nombre+", apellido: "+apellido+", dni: "+dni
				+", direccion: "+direccion+", telefono: "+tlf+", saldo: "+saldo+"]";
	}
}
