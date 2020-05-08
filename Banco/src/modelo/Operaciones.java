package modelo;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javax.swing.JOptionPane;

import controlador.conexion;
import controlador.controlador;

public class Operaciones {

	private Cuenta cuenta;
	private Usuario usuario;
	private int cod_operacion;
	private String tipo;
	private String fecha_operacion;
	private int cantidad;
	private String nomUsuario;
	
	controlador con;
	
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

	public void Ingresa(int id, int cantidad, String dni) {
		con.Ingresa(id, cantidad);
	}
	
	public void Retirada(int id, int cantidad, String dni) {
		con.Retirada(id, cantidad);
	}
	
	public void Transferir(int id2, int cantidad) {
		con.Transferir(id2, cantidad);
	}
}
