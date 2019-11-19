package Eje9_Persona;

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
	
	public static void main(String[] args) {
		
		Persona perso = new Persona("Garcia", "Mario", "Hombre", 12345678);
		System.out.println(perso.getDatosPersona());
	}
}
