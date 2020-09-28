package EJE1;

import java.io.File;
import java.io.IOException;

import javax.swing.JOptionPane;

/**
 * 
 * @author Miriam
 *
 */
public class Main {

	public static void main(String[] args) {
		
		Empleado em = new Empleado();
		Controlador c = new Controlador();
		
		//crear fichero y ingresar empleado Pepe
		try {
			c.crearFile(new File("personas.dat"));
			c.añadirPersona(new Empleado(1, "Pepe", "ventas", 20000, true));
			c.cerrar();
			JOptionPane.showMessageDialog(null, "Nuevo empleado registrado", "Notificacion", JOptionPane.WARNING_MESSAGE);
		} catch (IOException e1) {
			e1.printStackTrace();
		}
		
		//buscar a Pepe
		try {
			
			c.crearFile( new File("personas.dat") );
            int i = c.buscarRegistro( 1 );
            if(i==-1) {
                JOptionPane.showMessageDialog(null, "Ningun registro coincide con los datos de busqueda.", "Advertencia", JOptionPane.WARNING_MESSAGE);             
                return;
            }
            JOptionPane.showMessageDialog(null, "La primera coincidencia indica: "+c.getEmpleado(i), "Notificacion", JOptionPane.INFORMATION_MESSAGE);
            c.cerrar();
			
		}catch (Exception e2) {
			e2.printStackTrace();
		}
		
		//ingresar empleado Ana
		try {
			
			c.crearFile(new File("personas.dat"));
			c.añadirPersona(new Empleado(2, "Ana", "publicidad", 50000, true));
			c.cerrar();
			JOptionPane.showMessageDialog(null, "Nuevo empleado registrado", "Notificacion", JOptionPane.WARNING_MESSAGE);
		} catch (IOException e) {
			JOptionPane.showMessageDialog(null, "Error en la escritura de datos.", "Error", JOptionPane.ERROR_MESSAGE);
		}
		
		//buscar a Ana
		try {
			
			c.crearFile( new File("personas.dat") );
            int i = c.buscarRegistro( 2 );
            if(i==-1) {
                JOptionPane.showMessageDialog(null, "Ningun registro coincide con los datos de busqueda.", "Advertencia", JOptionPane.WARNING_MESSAGE);             
             
            }
            JOptionPane.showMessageDialog(null, "La primera coincidencia indica: "+c.getEmpleado(i), "Notificacion", JOptionPane.INFORMATION_MESSAGE);
            c.cerrar();
			
		}catch (Exception e) {
			JOptionPane.showMessageDialog(null, "Error en la escritura de datos.", "Error", JOptionPane.ERROR_MESSAGE);
		}
		
		//eliminar a Pepe
		try {
			
			c.crearFile(new File("personas.dat"));
			if( c.eliminarPersona(1) ) {
				JOptionPane.showMessageDialog(null, "El registro correspondiente fue eliminado correctamente.", "Eliminacion correcta", JOptionPane.INFORMATION_MESSAGE);
			}else {
				JOptionPane.showMessageDialog(null, "Error al intentar eliminar un registro inexistente.", "Error", JOptionPane.ERROR_MESSAGE);
			}
			
		}catch (Exception e) {
			JOptionPane.showMessageDialog(null, "Error en la escritura de datos.", "Error", JOptionPane.ERROR_MESSAGE);
		}
		
		//buscar a Pepe que no deve de encontrarce
		try {
					
			c.crearFile( new File("personas.dat") );
		    int i = c.buscarRegistro( 1 );
		    if(i==-1) {
		       JOptionPane.showMessageDialog(null, "Ningun registro coincide con los datos de busqueda.", "Advertencia", JOptionPane.WARNING_MESSAGE);             
		    }
		    JOptionPane.showMessageDialog(null, "La primera coincidencia indica: "+c.getEmpleado(i), "Notificacion", JOptionPane.INFORMATION_MESSAGE);
		    c.cerrar();
					
		}catch (Exception e2) {
			e2.printStackTrace();
		}

	}

}
