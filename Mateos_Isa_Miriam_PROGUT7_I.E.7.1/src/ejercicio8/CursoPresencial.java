package ejercicio8;

import java.util.Date;
import java.util.LinkedList;
/**
 * 
 * @author Miriam
 *
 */
public class CursoPresencial extends Cursos{

	private int minasistencia;
	private int plazalibre;
	private int asistencia=0;
	
/**
 * 	
 * @param titulo
 * @param fechainicio
 * @param fechafinal
 * @param numdias
 * @param precio
 * @param numalumno
 */
	public CursoPresencial(String titulo, Date fechainicio, Date fechafinal, int numdias, double precio,
			int numalumno) {
		super(titulo, fechainicio, fechafinal, numdias, precio, numalumno);
		this.minasistencia=numdias;
		this.asistencia=getAsistencia();
	}
/**
 * 
 * @param ocupadas
 */
	public void PlazasLibres(int ocupadas) {
		plazalibre-=ocupadas;
	}
/**
 * 	
 * @return
 */
	public int getAsistencia() {
		return asistencia;
	}
	
	@Override
	public String toString() {
		return "CursoPresencial [minasistencia=" + minasistencia + ", plazalibre=" + plazalibre
				+ ", asistencia=" + asistencia + "]";
	}
}
