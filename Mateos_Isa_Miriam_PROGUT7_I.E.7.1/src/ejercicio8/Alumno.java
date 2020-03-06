package ejercicio8;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Date;

import ejercicio8.Cursos;
/**
 * 
 * @author Miriam
 *
 */
public class Alumno {

	private String nombre;
	private String dni;
	private double saldo;
	private LinkedList<Cursos> curso;
	private LinkedList<Date> asistencia;
	
/**
 * 	
 * @param nom
 * @param dni
 */
	public Alumno(String nom, String dni) {
		this.nombre=nom;
		this.dni=dni;
		this.saldo=100;
		this.curso = new LinkedList <Cursos>();
		this.asistencia = new LinkedList <Date>();
	}
/**
 * 	
 * @param incrementa
 */
	public void setIncrementar(double incrementa) {
		this.saldo+=incrementa;
	}
/**
 * 	
 * @param decremente
 */
	public void setDecremente(double decremente) {
		this.saldo-=decremente;
	}
/**
 * 	
 * @return saldo
 */
	public double getSaldo() {
		return saldo;
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
 * @return curso
 */
	public List<Cursos> getCurso() {
		return Collections.unmodifiableList(curso);
	}
/**
 * 	
 * @param cursos
 */
	public void setCursos(Cursos cursos) {
		curso.add(cursos);
	}
	
	public void add(boolean matricula) {
		// TODO Auto-generated method stub
		
	}
	
	
	public void asistir(Date fecha) {
		asistencia.add(fecha);
	}

	@Override
	public String toString() {
		return "Alumno [nombre=" + nombre + ", dni=" + dni + ", saldo=" + saldo + "]";
	}
	
}
