package modelo;

import java.util.LinkedList;

import modelo.Cuenta;
/**
 * 
 * @author Miriam
 *
 */
public class Usuario {

	private String nif;
	private String nombre, apellido;
	private int a�o_nacimiento;
	private String direccion, email;
	private int telefono;
	
	public Usuario() {
		
	}
/**
 * 	
 * @param n
 * @param nom
 * @param apll
 * @param anio
 * @param dic
 * @param mai
 * @param tlf
 */
	public Usuario(String n, String nom, String apll, int anio, String dic, String mai, int tlf) {
		this.nif=n;
		this.nombre=nom;
		this.apellido=apll;
		this.a�o_nacimiento=anio;
		this.direccion=dic;
		this.email=mai;
		this.telefono=tlf;
	}
/**
 * 
 * @return nif
 */
	public String getNif() {
		return nif;
	}
/**
 * 
 * @param nif
 */
	public void setNif(String nif) {
		this.nif = nif;
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
 * @return apellido
 */
	public String getApellido() {
		return apellido;
	}
/**
 * 
 * @param apellido
 */
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
/**
 * 
 * @return a�o de nacimiento
 */
	public int getA�o_nacimiento() {
		return a�o_nacimiento;
	}
/**
 * 
 * @param a�o_nacimiento
 */
	public void setA�o_nacimiento(int a�o_nacimiento) {
		this.a�o_nacimiento = a�o_nacimiento;
	}
/**
 * 
 * @return direccion
 */
	public String getDireccion() {
		return direccion;
	}
/**
 * 
 * @param direccion
 */
	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}
/**
 * 
 * @return e-mail
 */
	public String getEmail() {
		return email;
	}
/**
 * 
 * @param email
 */
	public void setEmail(String email) {
		this.email = email;
	}
/**
 * 
 * @return telefono
 */
	public int getTelefono() {
		return telefono;
	}
/**
 * 
 * @param telefono
 */
	public void setTelefono(int telefono) {
		this.telefono = telefono;
	}
	
	@Override
	public String toString() {
		return "Usuario [nif=" + nif + ", nombre=" + nombre + ", apellido=" + apellido + ", a�o_nacimiento="
				+ a�o_nacimiento + ", direccion=" + direccion + ", email=" + email + ", telefono=" + telefono
				+ "]";
	}
}
