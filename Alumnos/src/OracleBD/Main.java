package OracleBD;

import javax.swing.JFrame;
/**
 * 
 * @author Miriam
 *
 */
public class Main {

	public static void main(String[] args) {

		Conectar c = new Conectar();
		//c.conectar();
		
		Controladores con = new Controladores();
		
		/**
		 * ALUMNO
		 */
		//con.insertarAlumno("12365498B", "ANA", "CALLE NORTE", "SEVILLA", 41003, "SEVILLA", "954534808", "321456987", "2020/11/2", 1, 1, 5, 5, 5);
		//con.insertarAlumno("11111111C", "SARA", "CALLE SUR", "SEVILLA", 41002, "SEVILLA", "123456789", "987654321", "2002/2/2", 1, 1, 4, 4, 4);
		con.borrarAlumno("12365498B");
		
		
		/**
		 * ASIGNATURA
		 */
		con.insertarAsignatura(2, "FARMACIA", "MEDICINA");
		con.insertarAsignatura(3, "INGENIERO", "FISICA");
		con.borrarAsignatura(2);
		
		
		/**
		 * CURSO
		 */
		con.insertarCurso(2, "MEDICINA", "MEDIO", "M");
		con.insertarCurso(3, "FISICA", "SUPERIOR", "T");
		con.borrarCurso(3);
		
		
		/**
		 * MOSTRAR ALUMNO
		 */
		Tabla tabla = new Tabla();
		tabla.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		tabla.setVisible(true);
	}
}
