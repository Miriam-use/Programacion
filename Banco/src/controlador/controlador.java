package controlador;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JOptionPane;

import controlador.conexion;
import modelo.Cuenta;
/**
 * 
 * @author Miriam
 *
 */
public class controlador {

	private static conexion conx;
	private Cuenta cuen;
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
	public boolean crearCuenta(String nif) {
		Connection conn = null;
        PreparedStatement prst = null;
        ResultSet rs = null;
        int rows = 0; //registros afectados
        String nueus="INSERT INTO cuenta (n_cuenta, fecha_creacion, saldo, nif_usuario) VALUES (NULL, CURRENT_TIMESTAMP, '0', '"
        			+nif+"')";
        try {
			conn = conx.conectar();
			prst = conn.prepareStatement(nueus);
            rows = prst.executeUpdate();//registros afectados
            JOptionPane.showMessageDialog(null,"Nueva cuenta creado");
			return true;
        }catch (SQLException e) {
            e.printStackTrace();
            return false;
        } finally {
            conexion.close(conn);
        }
	}
	
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
            return false;
        } finally {
            conexion.close(conn);
        }
	}

	public boolean eliminarCuenta(int id, String nif) {
		Connection conn = null;
        PreparedStatement prst = null;
        ResultSet rs = null;
        int rows = 0; //registros afectados
        String nueus="DELETE FROM cuenta WHERE n_cuenta='"+id+"' and nif_usuario='"+nif+"'";
        try {
			conn = conx.conectar();
			prst = conn.prepareStatement(nueus);
            rows = prst.executeUpdate();//registros afectados
            JOptionPane.showMessageDialog(null,"La cuenta "+id+" del usuario '"+nif+"' se a eliminado");
			return true;
        }catch (SQLException e) {
            e.printStackTrace();
            return false;
        } finally {
            conexion.close(conn);
        }
	}
	
	public boolean listarUsuario() {
		
	}
}
