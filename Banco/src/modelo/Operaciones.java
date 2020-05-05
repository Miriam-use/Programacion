package modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import controlador.conexion;

public class Operaciones {

	private Cuenta cuenta;
	private Usuario usuario;
	private int cod_operacion;
	private String tipo;
	private String fecha_operacion;
	private int cantidad;
	private String nomUsuario;
	
	public Operaciones() {
		
	}

	public int getCod_operacion() {
		return cod_operacion;
	}

	public void setCod_operacion(int cod_operacion) {
		this.cod_operacion = cod_operacion;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public String getFecha_operacion() {
		return fecha_operacion;
	}

	public void setFecha_operacion(String fecha_operacion) {
		this.fecha_operacion = fecha_operacion;
	}

	public int getCantidad() {
		return cantidad;
	}

	public void setCantidad(int cantidad) {
		this.cantidad = cantidad;
	}

	public String getNomUsuario() {
		return nomUsuario;
	}

	public void setNomUsuario(String nomUsuario) {
		this.nomUsuario = nomUsuario;
	}
	double saldo;
	public boolean Saldo(int id, String dni) {
		Connection conn = null;
		PreparedStatement prst = null;
		ResultSet res=null;
		try {
			conn = conexion.conectar();
			String sal="SELECT saldo FROM cuenta ORDE BY n_cuenta="+id+" and nif_usuario='"+dni+"'";
			prst = conn.prepareStatement(sal);
			res = prst.executeQuery();
			saldo=res.getDouble("saldo");
			return true;
		}catch (SQLException e) {
            e.printStackTrace();
            return false;
		}finally {
            conexion.close(conn);
        }
	}
	
	public boolean IngresaRetira(int id, double cantidad, String dni) {
		Connection conn = null;
		PreparedStatement prst = null;
		saldo+=cantidad;
		try {
			conn = conexion.conectar();
			String ing="UPDATE cuenta SET saldo="+saldo+" WHERE n_cuenta="+id+" and nif_usuario="+dni;
			prst = conn.prepareStatement(ing);
			return true;
		}catch (SQLException e) {
            e.printStackTrace();
            return false;
		}finally {
            conexion.close(conn);
        }		
	}
	
}
