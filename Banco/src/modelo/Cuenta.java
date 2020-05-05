package modelo;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
/**
 * 
 * @author Miriam
 *
 */
public class Cuenta {

	private int num_Cuenta;
	private String fechaCreada;
	private double saldo;
	private Date Fecha;
	private Usuario nif;
	
	public Cuenta() {
		
	}
/**
 * 	
 * @param num
 * @param fecha
 * saldo inicial es 0
 */
	public Cuenta(String nif, int num) {
		this.num_Cuenta=num;
		this.Fecha = new Date();
		this.saldo=0;
		this.nif.setNif(nif);
	}
/**
 * 	
 * @return numero de cuenta
 */
	public int getNum_Cuenta() {
		return num_Cuenta;
	}
/**
 * 	
 * @param num_Cuenta
 */
	public void setNum_Cuenta(int num_Cuenta) {
		this.num_Cuenta = num_Cuenta;
	}
/**
 * 	
 * @return fecha de creacion
 */
	public String getFechaCreada() {
		return fechaCreada;
	}
/**
 * 	
 * @param fechaCreada
 */
	public void setFechaCreada(String fechaCreada) {
		DateFormat format = new SimpleDateFormat("DD/MM/YYYY");	// Creamos un formato de fecha
		try {
			this.Fecha = format.parse(fechaCreada);	// Creamos un date con la entrada en el formato especificado
		} catch (ParseException e) {
			e.printStackTrace();
		}
	}
/**
 * 	
 * @return saldo
 */
	public double getSaldo() {
		return saldo;
	}
/**
 * 	
 * @param saldo
 */
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}
/**
 * 	
 * @return fecha en formato Date
 */
	public Date getFecha() {
		return Fecha;
	}
/**
 * 	
 * @param fecha
 */
	public void setFecha(String fecha) {
		DateFormat format = new SimpleDateFormat("DD/MM/YYYY");	// Creamos un formato de fecha
		try {
			this.Fecha = format.parse(fecha);	// Creamos un date con la entrada en el formato especificado
		} catch (ParseException e) {
			e.printStackTrace();
		}
	}
	
	@Override
	public String toString() {
		return "Cuenta [num_Cuenta=" + num_Cuenta + ", fechaCreada=" + fechaCreada + ", saldo=" + saldo + "]";
	}	
}
