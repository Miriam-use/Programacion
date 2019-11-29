package Eje9_Persona;
/**
 * <h2>Construya una clase Persona que tiene los siguientes atributos,
 * apellidos, nombres, sexo y DNI, incluya sus constructores y un método que
 * permita visualizar la información de los atributos.</h2>
 * @author Miriam
 * 
 */
public class Persona {

	private String apellido, nombre, sexo;
	private int dni;
	
	Persona(String a, String nom, String sex, int dni){
		this.apellido = a;
		this.nombre = nom;
		this.sexo = sex;
		this.dni = dni;
	}
	
	public String getDatosPersona() {
		return nombre+" "+apellido+" "+sexo+"\n"+dni;
	}
	
}
