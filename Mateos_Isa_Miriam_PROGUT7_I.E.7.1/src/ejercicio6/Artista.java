package ejercicio6;

import java.util.Date;
/**
 * 
 * @author Miriam
 *
 */
public class Artista {

	private String nombre;
	private String lugarnacimiento;
	int dia, mes, año, di, me, anio; 
	Date fechaNacimiento = new Date(dia, mes, año);
	Date fechaMuerte = new Date(di, me, anio);
/**
 * 	
 * @param nom
 * @param lugar
 * @param d
 * @param m
 * @param a
 * @param d2
 * @param m2
 * @param a2
 */
	public Artista(String nom, String lugar, int d, int m, int a, int d2, int m2, int a2) {
		this.nombre=nom;
		this.lugarnacimiento=lugar;
		this.dia=d;
		this.mes=m;
		this.año=a;
		this.di=d2;
		this.me=m2;
		this.anio=a2;
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
 * @return lugar de nacimiento
 */
	public String getLugarNacimiento() {
		return lugarnacimiento;
	}

	@Override
	public String toString() {
		return "[Nombre: "+nombre+", Lugar Nacimiento: "+lugarnacimiento+", Fecha Nacimiento: "+fechaNacimiento
				+", Fecha de Fallecimiento"+fechaMuerte;
	}
	
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		return super.equals(obj);
	}
	
}
