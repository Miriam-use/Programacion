package ejercicio8;

import java.util.Date;
import java.util.LinkedList;
import ejercicio8.Alumno;
/**
 * 
 * @author Miriam
 *
 */
public class Cursos {

	private String titulo;
	Date fechainicio = new Date();
	Date fechafinal = new Date();
	private int numdias;
	private double precio;
	private Alumno matriculado;
/**
 * 	
 * @param titulo
 * @param fechainicio
 * @param fechafinal
 * @param numdias
 * @param precio
 * @param matriculado
 */
	public Cursos(String titulo, Date fechainicio, Date fechafinal, int numdias, double precio, Alumno matriculado) {
		this.titulo = titulo;
		this.fechainicio = fechainicio;
		this.fechafinal = fechafinal;
		this.numdias = numdias;
		this.precio = precio;
		this.matriculado=matriculado;
	}

	
}
