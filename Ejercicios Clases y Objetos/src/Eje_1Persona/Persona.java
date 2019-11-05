package Eje_1Persona;
/**Crea una clase persona de la que solo debemos mantener información
 * relacionada con su nombre, apellidos y nif. Configúrala añadiendo los métodos
 * y propiedades que creas oportunas.
 */

public class Persona {

	private String nombre;
	private String apellidos;
	private String nif;
	
	Persona(){
		nombre = "introduce nombre";
		apellidos = "introduce apellido";
		nif = "introduce NIF/DNI";
	}
	
	Persona (String n, String a, String nf ){
		nombre = n;
		apellidos = a;
		nif = nf;
	}
	
	public void setDatos(String n, String a, String nf) {
		nombre = n;
		apellidos = a;
		nif = nf;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public String getApellidos() {
		return apellidos;
	}
	
	public String setNif() {
		return nif;
	}
	
}
