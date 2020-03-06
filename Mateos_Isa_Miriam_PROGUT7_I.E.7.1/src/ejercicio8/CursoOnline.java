package ejercicio8;

import java.util.Collections;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;

public class CursoOnline extends Cursos{

	private Alumno alumno;
	private LinkedList<Cursos> curso;
	
	public CursoOnline(String titulo, Date fechainicio, Date fechafinal, int numdias, double precio, int numalumno) {
		super(titulo, fechainicio, fechafinal, numdias, precio, numalumno);
	}

	public List<Cursos> getSubastasCreadas() {
		return Collections.unmodifiableList(curso);
	}
	
	public void addCursos(Cursos cursos) {
		curso.add(cursos);
	}

}
