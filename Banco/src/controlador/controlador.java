package controlador;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.sql.Statement;

import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

import org.junit.Test;

import controlador.conexion;
import modelo.Cuenta;
import modelo.Usuario;
/**
 * 
 * @author Miriam
 *
 */
public class controlador {

	private static conexion conx;
	private Cuenta cuen;
	private DefaultTableModel dt;
	private PreparedStatement ps;
	private ResultSet rs;
	
/**
 * 	
 * @param nif
 * @return true si el usuario ya se encuentra y false si el usuario no existe
 */
	public boolean verificarUsuario(String nif) {
		Connection conn = null;
        PreparedStatement prst = null;
        ResultSet rs = null;
        ResultSet rows;
        String nueus="SELECT nif FROM usuario WHERE nif='"+nif+"'";
        try {
			conn = conx.conectar();
			prst = conn.prepareStatement(nueus);
            rows = prst.executeQuery();
            if(rows.next()){
            	JOptionPane.showMessageDialog(null,"El Usuario ya existe");
            	return true;
            } else {
            	return false;
            }            
			
        }catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null,"ERROR en la operacion"); 
            return true;
        } finally {
            conx.close(conn);
        }
		
	}
/**
 * 	
 * @param nif
 * @return true si el usuario ya se encuentra y false si el usuario no existe
 */	
	public boolean verificarCuenta(String nif) {
		Connection conn = null;
        PreparedStatement prst = null;
        ResultSet rs = null;
        ResultSet rows;
        String nueus="SELECT nif FROM usuario WHERE nif='"+nif+"'";
        try {
			conn = conx.conectar();
			prst = conn.prepareStatement(nueus);
            rows = prst.executeQuery();
            if(rows.next()){
            	
            	return true;
            } else {
            	JOptionPane.showMessageDialog(null,"El Usuario no existe");
            	return false;
            }            
			
        }catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null,"ERROR en la operacion"); 
            return false;
        } finally {
            conx.close(conn);
        }
		
	}
	
	public boolean verificarTitular(int id) {
		Connection conn = null;
        PreparedStatement prst = null;
        ResultSet rs = null;
        ResultSet rows;
        String nueus="SELECT n_cuenta FROM titular WHERE n_cuenta='"+id+"'";
        try {
			conn = conx.conectar();
			prst = conn.prepareStatement(nueus);
            rows = prst.executeQuery();
            if(rows.next()){
            	return true;
            } else {
            	return false;
            }            
			
        }catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null,"ERROR en la operacion"); 
            return false;
        } finally {
            conx.close(conn);
        }	
	}	
	
	public boolean verificarTitularOperacion(int id, String nif) {
		Connection conn = null;
        PreparedStatement prst = null;
        ResultSet rs = null;
        ResultSet rows;
        String nueus="SELECT n_cuenta FROM titular WHERE n_cuenta='"+id+"' AND nif_usuario='"+nif+"'";
        try {
			conn = conx.conectar();
			prst = conn.prepareStatement(nueus);
            rows = prst.executeQuery();
            if(rows.next()){
            	return true;
            } else {
            	return false;
            }            
			
        }catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null,"ERROR en la operacion"); 
            return false;
        } finally {
            conx.close(conn);
        }	
	}	
	
	public boolean eliminarTitular(int id, String nif) {
		Connection conn = null;
        PreparedStatement prst = null;
        ResultSet rs = null;
        int rows = 0; //registros afectados
        String nueus="DELETE FROM titular WHERE n_cuenta='"+id+"' AND nif_usuario='"+nif+"'";
        try {
			conn = conx.conectar();
			prst = conn.prepareStatement(nueus);
			rows = prst.executeUpdate();//registros afectados         
			return true;
        }catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null,"ERROR en la operacion"); 
            return false;
        } finally {
            conx.close(conn);
        }
	}
	
	public boolean nuevoTitular(int id, String nif) {
		Connection conn = null;
        PreparedStatement prst = null;
        ResultSet rs = null;
        int rows = 0; //registros afectados
        String nueus="INSERT INTO titular (n_titular, n_cuenta, nif_usuario) VALUES (NULL, '"+id+"', '"+nif+"')";
        try {
			conn = conx.conectar();
			prst = conn.prepareStatement(nueus);
			rows = prst.executeUpdate();//registros afectados   
			return true;
        }catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null,"ERROR en la operacion"); 
            return false;
        } finally {
            conx.close(conn);
        }
	}
/**
 * 	
 * @param nom
 * @param apll
 * @param nif
 * @param dirc
 * @param anio
 * @param telf
 * @param ema
 * @return true Nuevo usuario creado
 */
	
	public boolean crearUsuario(String nom, String apll, String nif, String dirc, int anio, int telf, String ema) {
		Connection conn = null;
        PreparedStatement prst = null;
        ResultSet rs = null;
        int rows = 0; //registros afectados
        String nueus="INSERT INTO usuario (nif, nombre, apellido, anio_nacimiento, direccion, email, telefono) VALUES ('"+nif+"', '"
        		+nom+"', '"+apll+"', '"+anio+"', '"+dirc+"', '"+ema+"', '"+telf+"')";
        try {
			conn = conx.conectar();
			prst = conn.prepareStatement(nueus);
            rows = prst.executeUpdate();//registros afectados
            JOptionPane.showMessageDialog(null,"Nuevo usuario creado");
			return true;
        }catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null,"ERROR en la operacion");
            return false;
        } finally {
            conx.close(conn);
        }
	}
/**
 * 	
 * @param nif
 * @return true Nueva cuenta creada
 */
	
	public boolean crearCuenta(int id) {
		Connection conn = null;
        PreparedStatement prst = null;
        ResultSet rs = null;
        int rows = 0; //registros afectados
        String nueus="INSERT INTO cuenta (n_cuenta, fecha_creacion, saldo) VALUES ('"+id+"', CURRENT_TIMESTAMP, '0')";
        try {
			conn = conx.conectar();
			prst = conn.prepareStatement(nueus);
            rows = prst.executeUpdate();//registros afectados
            JOptionPane.showMessageDialog(null,"Nueva cuenta creado");
			return true;
        }catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null,"ERROR en la operacion");
            return false;
        } finally {
            conexion.close(conn);
        }
	}
/**
 * 	
 * @param nif
 * @return true usuario borrado
 */
	
	public boolean eliminarUsuario(String nif) {
		Connection conn = null;
        PreparedStatement prst = null;
        ResultSet rs = null;
        int rows = 0; //registros afectados
        String nueus="DELETE FROM usuario WHERE nif='"+nif+"'";
        try {
			conn = conx.conectar();
			prst = conn.prepareStatement(nueus);
            rows = prst.executeUpdate();//registros afectados
            JOptionPane.showMessageDialog(null,"El usuario '"+nif+"' a sido eliminado correctamente");
			return true;
        }catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null,"ERROR en la operacion");
            return false;
        } finally {
            conexion.close(conn);
        }
	}
/**
 * 
 * @param id
 * @param nif
 * @return true cuenta borrada
 */
	public boolean eliminarCuenta(int id, String nif) {
		Connection conn = null;
        PreparedStatement prst = null;
        ResultSet rs = null;
        int rows = 0; //registros afectados
        String nueus="DELETE FROM cuenta WHERE n_cuenta='"+id+"'";
        try {
			conn = conx.conectar();
			prst = conn.prepareStatement(nueus);
            rows = prst.executeUpdate();//registros afectados
            JOptionPane.showMessageDialog(null,"La cuenta "+id+" del usuario '"+nif+"' se a eliminado");
			return true;
        }catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null,"ERROR en la operacion");
            return false;
        } finally {
            conexion.close(conn);
        }
	}
/**
 * 	
 * @param nom
 * @param apll
 * @param nif
 * @param dirc
 * @param anio
 * @param telf
 * @param ema
 * @return true operacion realizada con exito
 */
	public boolean modificarUsuario(String nom, String apll, String nif, String dirc, int anio, int telf, String ema) {
		Connection conn = null;
        PreparedStatement prst = null;
        ResultSet rs = null;
        int rows = 0; //registros afectados
        String nueus="UPDATE usuario SET nombre='"+nom+"', apellido='"+apll+"', anio_nacimiento='"+anio+"', direccion='"+dirc+"', email='"+ema
        			+"', telefono='"+telf+"' WHERE nif='"+nif+"'";
        try {
			conn = conx.conectar();
			prst = conn.prepareStatement(nueus);
            rows = prst.executeUpdate();//registros afectados
            JOptionPane.showMessageDialog(null,"Operacion realizada con exito");
			return true;
        }catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null,"ERROR en la operacion");
            return false;
        } finally {
            conexion.close(conn);
        }
	}
/**
 * 	
 * @param id
 * @param cantidad
 * @param dni
 * @return true ingresar saldo
 */
	
	public boolean Ingresa(int id, int cantidad) {
		Connection conn = null;
		PreparedStatement prst = null;
		ResultSet rs = null;
		
		int rows = 0; //registros afectados
		String ing="UPDATE cuenta SET saldo=(saldo+"+cantidad+") WHERE n_cuenta='"+id+"'";
		try {
			conn = conx.conectar();
			prst = conn.prepareStatement(ing);
			rows = prst.executeUpdate();//registros afectados
			JOptionPane.showMessageDialog(null,"Ingreso Realizaso");
			return true;
		}catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null,"Ingreso Fallido");
            return false;
		}finally {
            conexion.close(conn);
        }		
	}
/**
 * 	
 * @param id
 * @param cantidad
 * @param dni
 * @return true retirar saldo
 */
	public boolean Retirada(int id, int cantidad) {
		Connection conn = null;
		PreparedStatement prst = null;
		ResultSet rs = null;
		int rows = 0; //registros afectados
		String ing="UPDATE cuenta SET saldo=(saldo-"+cantidad+") WHERE n_cuenta='"+id+"'";
		try {
			conn = conx.conectar();
			prst = conn.prepareStatement(ing);
			rows = prst.executeUpdate();//registros afectados
			JOptionPane.showMessageDialog(null,"Retirada Realizada");
			return true;
		}catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null,"Retirada Fallida");
            return false;
		}finally {
            conexion.close(conn);
        }		
	}
/**
 * 	
 * @param id2
 * @param cantidad
 * @return true Transaccion Realizada
 */
	public boolean Transferir(int id2, int cantidad) {
		Connection conn = null;
		PreparedStatement prst = null;
		ResultSet rs = null;
		int rows = 0; //registros afectados
		String ing="UPDATE cuenta SET saldo=(saldo+"+cantidad+") WHERE n_cuenta='"+id2+"'";
		try {
			conn = conx.conectar();
			prst = conn.prepareStatement(ing);
			rows = prst.executeUpdate();//registros afectados
			JOptionPane.showMessageDialog(null,"Transaccion Realizada");
			return true;
		}catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null,"Transaccion Erronea");
            return false;
		}finally {
            conexion.close(conn);
        }	
	}
	
	
	public boolean Operar(String tipo,  int cantidad, int id, String nif) {
		Connection conn = null;
        PreparedStatement prst = null;
        ResultSet rs = null;
        int rows = 0; //registros afectados
        String nueus="INSERT INTO operaciones (n_operacion, tipo, fecha_operacion, cantidad, n_cuenta, nif_usuario) VALUES (NULL, '"+tipo+"', CURRENT_TIMESTAMP, '"+cantidad+"', '"+id+"', '"+nif+"')";
        try {
			conn = conx.conectar();
			prst = conn.prepareStatement(nueus);
            rows = prst.executeUpdate();//registros afectados
			return true;
        }catch (SQLException e) {
            e.printStackTrace();
            JOptionPane.showMessageDialog(null,"ERROR en la operacion");
            return false;
        } finally {
            conx.close(conn);
        }
	}
	
	public Object[] TablaUsuario(int n) {
		Connection conn = null;
		PreparedStatement prst = null;
		ResultSet rs = null;
		DefaultTableModel tablemodel = new DefaultTableModel();
	    
	  //se crea una matriz con tantas filas y columnas que necesite
		Object[] data = null;
	    try{
	          //realizamos la consulta sql y llenamos los datos en la matriz "Object[][] data"
	    	conn = conx.conectar();
			prst = conn.prepareStatement("SELECT * FROM usuario");
	         ResultSet res = prst.executeQuery();
	        	 while(res.next()){
	        		 data = new Object[n];
	        		 for (int i = 0; i < n; i++) {
						data[i]=res.getObject(i+1);
					}		                
	         }
		     res.close();
	         return data;
	         }catch(SQLException e){
	        	 JOptionPane.showMessageDialog(null,"ERROR en la operacion "+e);
	        }
	    return data;
	}
}