package ejercicio8;

import java.util.Date;
import java.util.LinkedList;
import java.util.List;
/**
 * 
 * @author Miriam
 *
 */
public class Main {

	static LinkedList<Alumno>alumno = new LinkedList<>();
	static LinkedList<Cursos> curso = new LinkedList<>();
	
	public static void main(String[] args) {
		
		alumno.add(new Alumno("Pepe", "34678904"));
		
		alumno.add(new Alumno("Andres", "17679456"));
		alumno.get(1).setIncrementar(25);
		
		curso.add(new CursoPresencial("Diseño de Bases de Datos", (new Date(12,03,2018)), (new Date(13,03,2018)), 1, 50, 20));

		curso.add(new CursoOnline("Administración de Bases de Datos", (new Date(19,03,2018)), (new Date(21,03,2018)), 5, 50, 0));
		
		curso.get(0).Matricula(alumno.get(0));
		
		curso.get(0).Matricula(alumno.get(1));
		
		curso.get(0).asistir(alumno.get(0), curso.get(0).fechainicio);
		
		curso.get(0).Titulo((new Date(13,03,2018)), alumno.get(0));
		
		System.out.println("\n");
		
		curso.get(0).Titulo((new Date(13,03,2018)), alumno.get(1));
		
		System.out.println("\n");
		
		System.out.println(Condicion(alumno.get(0), curso.get(1)));
	}
	
	public static String Condicion(Alumno alumnos, Cursos cursos) {
		for(int i=0; i<alumnos.getCurso().size(); i++) {
			if(alumnos.getCurso().get(i).Titulo().equals(cursos.Titulo())) {
				cursos.Matricula(alumnos);
				return "El alumno se a matriculado con exito";
			}
		}
		return "El alumno se a matriculado con exito";
	}
}
