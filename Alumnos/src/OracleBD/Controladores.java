package OracleBD;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.time.LocalDate;
import java.util.InputMismatchException;
import java.util.Scanner;

import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import OracleBD.Conectar;
/**
 * 
 * @author Miriam
 *
 */
public class Controladores {

	Scanner sn = new Scanner(System.in);
	private Conectar conx;
	private DefaultTableModel dt;
	private PreparedStatement ps;
	private ResultSet rs;
	DefaultTableModel modelotabla;
	/**
	/**
	 * 
	 * @param dni
	 * @param nom
	 * @param direccion
	 * @param poblacion
	 * @param cp
	 * @param provincia
	 * @param tlf
	 * @param tlf2
	 * @param fecha
	 * @param id
	 * @param cod
	 * @param n1
	 * @param n2
	 * @param n3
	 * @return true si ha salido bien y false si ha fallado
	 */
	public boolean insertarAlumno(String dni, String nom, String direccion, String poblacion, int cp, String provincia, String tlf, String tlf2, String fecha,
			int id, int cod, int n1, int n2, int n3){
		Connection conn = null;
        PreparedStatement prst = null;
        ResultSet rs = null;
        int rows = 0; //registros afectados
        String procedimiento = null;
        
        
        int nJ=(n1+n2+n3)/3;
        int nS=0;
        if(nJ>=5) {
        	procedimiento = "BEGIN INSERTAR_ALUMNO ('"+dni+"', '"+nom+"', '"+direccion+"', '"+poblacion+"', "+cp+", '"+provincia+"', '"+tlf+"', '"+tlf2+"', '"+fecha+"', "+id+", "+cod+", "+n1+", "+n2+", "+n3+", "+nJ+", "+nS+"); COMMIT; END;";
        }else {
        	System.out.println("Introducir Nota de Septiembre:");
        	nS=sn.nextInt();
        	procedimiento = "BEGIN INSERTAR_ALUMNO ('"+dni+"', '"+nom+"', '"+direccion+"', '"+poblacion+"', "+cp+", '"+provincia+"', '"+tlf+"', '"+tlf2+"', '"+fecha+"', "+id+", "+cod+", "+n1+", "+n2+", "+n3+", "+nJ+", "+nS+"); COMMIT; END;";
        }
        try {
			conn = conx.conectar();
			prst = conn.prepareStatement(procedimiento);
			rows = prst.executeUpdate();//registros afectados   
			JOptionPane.showMessageDialog(null,"Nuevo alumno agregado");
			return true;
        }catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null,"ERROR en la operacion"); 
            return false;
        } 
	}
	/**
	 * 
	 * @param dni
	 * @return true si ha salido bien y false si ha fallado
	 */
	public boolean borrarAlumno(String dni) {
		Connection conn = null;
        PreparedStatement prst = null;
        ResultSet rs = null;
        int rows = 0; //registros afectados
        String procedimiento = "BEGIN BORRAR_ALUMNO ('"+dni+"'); COMMIT; END;";
        try {
			conn = conx.conectar();
			prst = conn.prepareStatement(procedimiento);
			rows = prst.executeUpdate();//registros afectados   
			JOptionPane.showMessageDialog(null,"Alumno borrado");
			return true;
        }catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null,"ERROR en la operacion"); 
            return false;
        }
	}
	/**
	 * 
	 * @param id
	 * @param nom
	 * @param tipo
	 * @return true si ha salido bien y false si ha fallado
	 */
	public boolean insertarAsignatura(int id, String nom, String tipo) {
		Connection conn = null;
        PreparedStatement prst = null;
        ResultSet rs = null;
        int rows = 0; //registros afectados
        String procedimiento = "BEGIN INSERTAR_ASIGNATURA ("+id+", '"+nom+"', '"+tipo+"'); COMMIT; END;";
        try {
			conn = conx.conectar();
			prst = conn.prepareStatement(procedimiento);
			rows = prst.executeUpdate();//registros afectados   
			JOptionPane.showMessageDialog(null,"Nueva asignatura agregado");
			return true;
        }catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null,"ERROR en la operacion"); 
            return false;
        }
	}
	/**
	 * 
	 * @param id
	 * @return true si ha salido bien y false si ha fallado
	 */
	public boolean borrarAsignatura(int id) {
		Connection conn = null;
        PreparedStatement prst = null;
        ResultSet rs = null;
        int rows = 0; //registros afectados
        String procedimiento = "BEGIN BORRAR_ASIGNATURA ("+id+"); COMMIT; END;";
        try {
			conn = conx.conectar();
			prst = conn.prepareStatement(procedimiento);
			rows = prst.executeUpdate();//registros afectados   
			JOptionPane.showMessageDialog(null,"Asignatura borrada");
			return true;
        }catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null,"ERROR en la operacion"); 
            return false;
        }
	}
	/**
	 * 
	 * @param id
	 * @param descrip
	 * @param nvl
	 * @param turno
	 * @return true si ha salido bien y false si ha fallado
	 */
	public boolean insertarCurso(int id, String descrip, String nvl, String turno) {
		Connection conn = null;
        PreparedStatement prst = null;
        ResultSet rs = null;
        int rows = 0; //registros afectados
        String procedimiento = "BEGIN INSERTAR_CURSO ("+id+", '"+descrip+"', '"+nvl+"', '"+turno+"'); COMMIT; END;";
        try {
			conn = conx.conectar();
			prst = conn.prepareStatement(procedimiento);
			rows = prst.executeUpdate();//registros afectados   
			JOptionPane.showMessageDialog(null,"Nuevo curso agregado");
			return true;
        }catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null,"ERROR en la operacion"); 
            return false;
        }
	}
	/**
	 * 
	 * @param id
	 * @return true si ha salido bien y false si ha fallado
	 */
	public boolean borrarCurso(int id) {
		Connection conn = null;
        PreparedStatement prst = null;
        ResultSet rs = null;
        int rows = 0; //registros afectados
        String procedimiento = "BEGIN BORRAR_CURSO ("+id+"); COMMIT; END;";
        try {
			conn = conx.conectar();
			prst = conn.prepareStatement(procedimiento);
			rows = prst.executeUpdate();//registros afectados   
			JOptionPane.showMessageDialog(null,"Curso Borrado");
			return true;
        }catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null,"ERROR en la operacion"); 
            return false;
        }
	}
	/**
	 * 
	 * @param valor
	 * @param opcion
	 * @param table
	 */
	public void buscar(String valor, JTable table) {
		String[] columna = {"DNI", "NOMBRE", "DIRECCION", "POBLACION"};
		String[] registro= new String[7];
		modelotabla = new DefaultTableModel(null, columna);
		String ssql = null;
		Connection conect = null;
		
			ssql="SELECT DNI, NOMBRE, DIRECCION, POBLACION FROM TALUMNO WHERE DNI='"+valor+"'";
		
		try {
			conect=conx.conectar();
			PreparedStatement st = conect.prepareStatement(ssql);
			ResultSet rs = st.executeQuery();
			
			while(rs.next()) {
				registro[0]=rs.getString("DNI");
				registro[1]=rs.getString("NOMBRE");
				registro[2]=rs.getString("DIRECCION");
				registro[3]=rs.getString("POBLACION");
				
				modelotabla.addRow(registro);
			}
			
			table.setModel(modelotabla);
			
		}catch (SQLException e) {
			JOptionPane.showMessageDialog(null,"ERROR en la operacion "+e);
		}
	}
	
	
	public void Menu(){
		boolean salir = false;
	    int opcion; //Guardaremos la opcion del usuario
	    
	    while(!salir){
	    	System.out.println("////////////////////////////////////");
	    	System.out.println("/////////GESTION DE CURSOS//////////");
	    	System.out.println("////////////////////////////////////");
	    	System.out.println("1. Añadir Alumno");
	        System.out.println("2. Añadir Asignatura");
	        System.out.println("3. Añadir Curso");
	        System.out.println("4. Eliminar Alumno");
	        System.out.println("5. Eliminar Asignatura");
	        System.out.println("6. Eliminar Curso");
	        System.out.println("7. Buscar Alumno");
	        System.out.println("8. Salir");
	        System.out.println();
	        
	        try {
	        	
	        System.out.println("Escribe una de las opciones");
	        opcion = sn.nextInt();
	       
	       switch(opcion){
           case 1:
        	   System.out.println("DNI:");
        	   String dni = sn.nextLine();
        	   sn.nextLine();
        	   System.out.println("Nombre:");
        	   String nom = sn.nextLine();
        	   System.out.println("Direccion:");
        	   String direccion = sn.nextLine();
        	   System.out.println("Poblacion:");
        	   String poblacion = sn.nextLine();
        	   System.out.println("Codigo Postal:");
        	   int cp = sn.nextInt();
        	   System.out.println("Provincia:");
        	   String provincia = sn.nextLine();
        	   sn.nextLine();
        	   System.out.println("Telefono 1:");
        	   String tlf = sn.nextLine();
        	   System.out.println("Telefono 2:");
        	   String tlf2 = sn.nextLine();
        	   System.out.println("Fecha de nacimiento (yyyy/mm/dd):");
        	   String fecha = sn.nextLine();
        	   System.out.println("Id de Curso:");
        	   int id = sn.nextInt();
        	   System.out.println("Codigo de Asignatura:");
        	   int cod = sn.nextInt();
        	   System.out.println("Nota 1 Evaluacion:");
        	   int n1 = sn.nextInt();
        	   System.out.println("Nota 2 Evaluacion:");
        	   int n2 = sn.nextInt();
        	   System.out.println("Nota 3 Evaluacion:");
        	   int n3 = sn.nextInt();
        	   
               insertarAlumno(dni, nom, direccion, poblacion, cp, provincia, tlf, tlf2, fecha, id, cod, n1, n2, n3);
               break;
               
           case 2:
        	   System.out.println("Codigo de Asignatura:");
        	   int idA = sn.nextInt();
        	   System.out.println("Nombre de Asignatura:");
        	   String nomA = sn.nextLine();
        	   sn.nextLine();
        	   System.out.println("Tipo de Asignatura:");
        	   String tipo = sn.nextLine();
        	   
               insertarAsignatura(idA, nomA, tipo);
               break;
               
            case 3:
            	System.out.println("Codigo de Curso:");
            	int idC = sn.nextInt();
            	System.out.println("Descripcion de Curso:");
            	String descrip = sn.nextLine();
            	System.out.println("Nivel de Curso:");
            	String nvl = sn.nextLine();
            	System.out.println("Turno:");
            	String turno = sn.nextLine();
         	   
            	insertarCurso(idC, descrip, nvl, turno);
            	break;
            	
            case 4:
            	System.out.println("DNI:");
         	   	String dniB = sn.nextLine();
         	   	
            	borrarAlumno(dniB);
            	break;
            	
            case 5:
            	System.out.println("Codigo de Asignatura:");
         	   	int idAB = sn.nextInt();
            	
            	borrarAsignatura(idAB);
            	break;
            	
            case 6:
            	System.out.println("Codigo de Curso:");
            	int idCB = sn.nextInt();
            	
            	borrarCurso(idCB);
            	break;
            	
            case 7:
            	break;
               
            case 8:
               salir=true;
               break;
               
            default:
               System.out.println("Solo números entre 1 y 8");
	       }
	        } catch (InputMismatchException e) {
                System.out.println("Debes insertar un número");
                sn.next();
            }
	    }
	}
}
