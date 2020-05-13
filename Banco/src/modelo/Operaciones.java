package modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JOptionPane;

import controlador.conexion;
import controlador.controlador;
/**
 * 
 * @author Miriam
 *
 */
public class Operaciones {

	private Cuenta cuenta;
	private Usuario usuario;
	private int cod_operacion;
	private String tipo;
	private String fecha_operacion;
	private int cantidad;
	private String nomUsuario;
	private static conexion conx;
	controlador con;
	
	public Operaciones() {
		
	}
/**
 * 
 * @return cod_operacion
 */
	public int getCod_operacion() {
		return cod_operacion;
	}
/**
 * 
 * @param cod_operacion
 */
	public void setCod_operacion(int cod_operacion) {
		this.cod_operacion = cod_operacion;
	}
/**
 * 
 * @return tipo
 */
	public String getTipo() {
		return tipo;
	}
/**
 * 
 * @param tipo
 */
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}
/**
 * 
 * @return fecha_operacion
 */
	public String getFecha_operacion() {
		return fecha_operacion;
	}
/**
 * 
 * @param fecha_operacion
 */
	public void setFecha_operacion(String fecha_operacion) {
		this.fecha_operacion = fecha_operacion;
	}
/**
 * 
 * @return cantidad
 */
	public int getCantidad() {
		return cantidad;
	}
/**
 * 
 * @param cantidad
 */
	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}
/**
 * 
 * @return nomUsuario
 */
	public String getNomUsuario() {
		return nomUsuario;
	}
/**
 * 
 * @param id
 * @param cantidad
 * @param dni
 */
	public void Ingresa(int id, int cantidad, String dni) {
		con.Ingresa(id, cantidad);
	}
/**
 * 	
 * @param id
 * @param cantidad
 * @param dni
 */
	public void Retirada(int id, int cantidad, String dni) {
		con.Retirada(id, cantidad);
	}
/**
 * 	
 * @param id2
 * @param cantidad
 */
	public void Transferir(int id2, int cantidad) {
		con.Transferir(id2, cantidad);
	}
	
/**
 * 
 * @param cantidad
 * @param id
 * @return true si es negativo y false si es positivo
 */
	public boolean comprovarsaldo(int cantidad, int id) {
		String ssql = ssql="SELECT saldo FROM cuenta WHERE n_cuenta = '"+id+"'";
		int saldo=0;
		Connection conect = null;
		try {
			conect=conx.conectar();
			PreparedStatement st = conect.prepareStatement(ssql);
			ResultSet rs = st.executeQuery();
			while(rs.next()) {
				saldo=Integer.parseInt(rs.getString("saldo"));
			}
			if((saldo-cantidad)<0) {
				JOptionPane.showMessageDialog(null,"el numero en negatico");
				return true;
			}else {
				JOptionPane.showMessageDialog(null,"el numero es positivo");
				return false;
			}
			
			
		} catch (SQLException e) {
			JOptionPane.showMessageDialog(null,"ERROR en la operacion "+e);
			return true;
		}finally {
			conx.close(null);
		}
	}
}
