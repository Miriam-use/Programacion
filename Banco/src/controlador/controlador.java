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
import modelo.Modelo;
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
	Modelo m = new Modelo();
	Usuario us = new Usuario();
	
/**
 * 	
 * @param nif
 * @return true si el usuario ya se encuentra y false si el usuario no existe
 */
	public boolean verificarUsuario(String nif) {
		if(m.verificarUsuario(nif)==true) {
			return true;
		}else {
			return false;
		}
	}
/**
 * 	
 * @param nif
 * @return true si el usuario ya se encuentra y false si el usuario no existe
 */	
	public boolean verificarCuenta(String nif) {
		if(m.verificarCuenta(nif)==true) {
			return true;
		}else {
			return false;
		}		
	}
/**
 * 	
 * @param id
 * @return true
 */
	public boolean verificarTitular(int id) {
		if(m.verificarTitular(id)==true) {
			return true;
		}else {
			return false;
		}	
	}	
/**
 * 	
 * @param id
 * @param nif
 * @return true
 */
	public boolean verificarTitularOperacion(int id, String nif) {
		if(m.verificarTitularOperacion(id, nif)==true) {
			return true;
		}else {
			return false;
		}	
	}	
/**
 * 	
 * @param id
 * @param nif
 * @return true
 */
	public boolean eliminarTitular(int id, String nif) {
		if(m.eliminarTitular(id, nif)==true) {
			return true;
		}else {
			return false;
		}
	}
/**
 * 	
 * @param nif
 * @return true
 */
	public boolean eliminarTitularUsu(String nif) {
		if(m.eliminarTitularUsu(nif)==true) {
			return true;
		}else {
			return false;
		}
	}
	
/**
 * 	
 * @param id
 * @param nif
 * @return true
 */
	public boolean nuevoNoTitular(int id, String nif) {
		if(m.nuevoNoTitular(id, nif)==true) {
			return true;
		}else {
			return false;
		}
	}
	
	public boolean nuevoTitular(int id, String nif) {
		if(m.nuevoTitular(id, nif)==true) {
			return true;
		}else {
			return false;
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
		if(m.crearUsuario(nom, apll, nif, dirc, anio, telf, ema)==true) {
			return true;
		}else {
			return false;
		}
	}
/**
 * 
 * @param id
 * @return true
 */
	
	public boolean crearCuenta(int id) {
		if(m.crearCuenta(id)==true) {
			return true;
		}else {
			return false;
		}
	}
/**
 * 	
 * @param nif
 * @return true usuario borrado
 */
	
	public boolean eliminarUsuario(String nif) {
		if(m.eliminarUsuario(nif)==true) {
			return true;
		}else {
			return false;
		}
	}
/**
 * 
 * @param id
 * @param nif
 * @return true cuenta borrada
 */
	public boolean eliminarCuenta(int id, String nif) {
		if(m.eliminarCuenta(id, nif)==true) {
			return true;
		}else {
			return false;
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
		if(m.modificarUsuario(nom, apll, nif, dirc, anio, telf, ema)==true) {
			return true;
		}else {
			return false;
		}
	}
/**
 * 
 * @param id
 * @param cantidad
 * @return true
 */
	
	public boolean Ingresa(int id, int cantidad) {
		if(m.Ingresa(id, cantidad)==true) {
			return true;
		}else {
			return false;
		}		
	}
/**
 * 
 * @param id
 * @param cantidad
 * @return true
 */
	public boolean Retirada(int id, int cantidad) {
		if(m.Retirada(id, cantidad)==true) {
			return true;
		}else {
			return false;
		}		
	}
/**
 * 	
 * @param id2
 * @param cantidad
 * @return true Transaccion Realizada
 */
	public boolean Transferir(int id2, int cantidad) {
		if(m.Transferir(id2, cantidad)==true) {
			return true;
		}else {
			return false;
		}	
	}
	
/**
 * 	
 * @param tipo
 * @param cantidad
 * @param id
 * @param nif
 * @return true
 */
	public boolean Operar(String tipo,  int cantidad, int id, String nif) {
		if(m.Operar(tipo, cantidad, id, nif)==true) {
			return true;
		}else {
			return false;
		}
	}
	
	
	DefaultTableModel modelotabla;
/**
 * 
 * @param valor
 * @param opcion
 * @param table
 */
	public void Ubuscar(String valor, String  opcion, JTable table) {
		m.Ubuscar(valor, opcion, table);
	}
	
/**
 * 
 * @param valor
 * @param table
 */
	public void buscarOperacion(String valor, JTable table) {
		m.buscarOperacion(valor, table);
	}
/**
 * 
 * @param valor
 * @param table
 */
	public void buscarCuenta(String valor, JTable table) {
		m.buscarCuenta(valor, table);
	}
/**
 * 	
 * @param nif
 * @return true si es valido
 */
	public boolean validarNIF(String nif) {
		if(us.validarNIF(nif)==true) {
			return true;
		}else {
			return false;
		}
	}
/**
 * 	
 * @param cantidad
 * @param id
 * @return true si es negativo y false si es positivo
 */
	public boolean comprovarsaldo(int cantidad, int id) {
		if(m.comprovarsaldo(cantidad, id)==true) {
			return true;
		}else {
			return false;
		}
	}
}
