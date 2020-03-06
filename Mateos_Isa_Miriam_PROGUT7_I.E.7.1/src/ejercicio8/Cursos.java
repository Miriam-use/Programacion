package ejercicio8;

import java.util.Collections;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;

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
	private Alumno alum;
	private LinkedList<Alumno> alumno;
	private int numalumno;
/**
 * 	
 * @param titulo
 * @param fechainicio
 * @param fechafinal
 * @param numdias
 * @param precio
 */
	public Cursos(String titulo, Date fechainicio, Date fechafinal, int numdias, double precio, int numalumno) {
		this.titulo = titulo;
		this.fechainicio = fechainicio;
		this.fechafinal = fechafinal;
		this.numdias = numdias;
		this.precio = precio;
		this.alumno = new LinkedList<Alumno>();
		this.numalumno=numalumno;
	}
/**
 * 	
 * @return alumno
 */
	public List<Alumno> getColeccionMatricula() {
		return Collections.unmodifiableList(alumno);
	}
/**
 * 	
 * @param alumnos
 */
	public void addCursos(Alumno alumnos) {
		alumno.add(alumnos);
	}
/**
 * 	
 * @return precio
 */
	public double Precio() {
		return precio;
	}
	
	public String Titulo() {
		return titulo;
	}
/**
 * 	
 * @param alumnos
 * @return
 */
	public boolean Matricula(Alumno alumnos) {
		if((int) alumnos.getSaldo()>=(int) Precio()) {
			alumnos.setDecremente(precio);
			alumno.add(alumnos);
			System.out.println("El alumno se a matriculado con exito");
			return true;
		}else {
			System.out.println("El alumno no se a matriculado por falta de pago");
			return false;
		}
	}
	
	public void asistir(Alumno alumnos, Date fecha) {
		alumnos.asistir(fecha);
		alumno.add(alumnos);
	}
/**
 * 	
 * @param dia
 * @param alum
 */
	public void Titulo(Date dia, Alumno alum) {
		if(dia.equals(fechafinal)) {
			System.out.println("\nD/Da "+alum.getNombre()+" ha realizado con aprovechamiento el curso: "+titulo+",\r\n" + 
				"en la modalidad Curso Presencial, con una duración de "+numdias+" dias.");
		}else {
			System.out.println("NO optiene titulo");
		}
	}

	@Override
	public String toString() {
		return "Cursos [titulo=" + titulo + ", fechainicio=" + fechainicio + ", fechafinal=" + fechafinal + ", numdias="
				+ numdias + ", precio=" + precio + ", alum=" + alum + ", alumno=" + alumno + ", numalumno=" + numalumno
				+ "]";
	}
}
