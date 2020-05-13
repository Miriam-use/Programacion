package modelo;

import java.util.LinkedList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import javax.swing.JOptionPane;

import modelo.Cuenta;
/**
 * 
 * @author Miriam
 *
 */
public class Usuario {

	private String nif;
	private String nombre, apellido;
	private int año_nacimiento;
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
		this.año_nacimiento=anio;
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
 * @return año de nacimiento
 */
	public int getAño_nacimiento() {
		return año_nacimiento;
	}
/**
 * 
 * @param año_nacimiento
 */
	public void setAño_nacimiento(int año_nacimiento) {
		this.año_nacimiento = año_nacimiento;
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
/**
 * 	
 * @param nif
 * @return true si es valida y false si no
 */
	public static boolean validarNIF(String nif) {
	    boolean correcto = false;
	    Pattern pattern = Pattern.compile("(\\d{1,8})([TRWAGMYFPDXBNJZSQVHLCKEtrwagmyfpdxbnjzsqvhlcke])");
	    Matcher matcher = pattern.matcher(nif);
	    if (matcher.matches()) {
	        String letra = matcher.group(2);
	        String letras = "TRWAGMYFPDXBNJZSQVHLCKE";
	        int index = Integer.parseInt(matcher.group(1));
	        index = index % 23;
	        String reference = letras.substring(index, index + 1);
	        if (reference.equalsIgnoreCase(letra)) {
	            correcto = true;
	        } else {
	            correcto = false;
	            JOptionPane.showMessageDialog(null,"DNI incorrecto");
	        }
	    } else {
	        correcto = false;
	        JOptionPane.showMessageDialog(null,"DNI incorrecto");
	    }
	    return correcto;
	}
	
	@Override
	public String toString() {
		return "Usuario [nif=" + nif + ", nombre=" + nombre + ", apellido=" + apellido + ", año_nacimiento="
				+ año_nacimiento + ", direccion=" + direccion + ", email=" + email + ", telefono=" + telefono
				+ "]";
	}
}
