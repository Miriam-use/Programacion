package GestionVideojuegos;

import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
/**
 * 
 * @author Miriam
 *
 */
public class Videojuegos {
	
	private int codigo;
	private String nombre;
	private String fecha;
	private String plataforma;
	private Date Fecha;
	
	public Videojuegos() {
		
	}
	/**
	 * 
	 * @param cod
	 * @param nom
	 * @param fecha
	 * @param plata
	 */
	public Videojuegos(int cod, String nom,  String plata, String fecha) {
		this.codigo=cod;
		this.nombre=nom;
		this.fecha=fecha;	// Entrada recogida como sea (scanner)
		this.plataforma=plata;
		
		DateFormat format = new SimpleDateFormat("DD/MM/YYYY");	// Creamos un formato de fecha
		try {
			this.Fecha = format.parse(fecha);	// Creamos un date con la entrada en el formato especificado
		} catch (ParseException e) {
			e.printStackTrace();
		}
	}

	/**
	 * 
	 * @return codigo
	 */
	public int getCodigo() {
		return codigo;
	}

	/**
	 * 
	 * @param codigo
	 */
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	/**
	 * 
	 * @return nombre
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * 
	 * @param nombre
	 */
	public void setNombre(String nombre) {
			this.nombre = nombre;
	}
	/**
	 * 
	 * @return fecha
	 */
	public String getFecha() {
		return fecha;
	}

	/**
	 * 
	 * @param fecha
	 */
	public void setFecha(String fecha) {
		this.fecha = fecha;
	}

	/**
	 * 
	 * @return Fecha
	 */
	public Date getFecha2() {
		return Fecha;
	}

	/**
	 * 
	 * @param fecha
	 */
	public void setFecha2(Date fecha) {
		Fecha = fecha;
	}

	/**
	 * 
	 * @return plataforma
	 */
	public String getPlataforma() {
		return plataforma;
	}

	/**
	 * 
	 * @param plataforma
	 */
	public void setPlataforma(String plataforma) {
		this.plataforma = plataforma;
	}
	/**
	 * 
	 * @return Mostrar()
	 */
	public String Mostrar() {
		return "Código del videojuego: "+codigo
				+"\nNombre del videojuego: "+nombre
				+"\nPlataforma: "+plataforma
				+"\nFecha de lanzamiento: "+fecha;
	}
	/**
	 * 
	 * @return Fichero Escritura
	 */
	public String FicheroEscritura() {
		return codigo+"%"+nombre+"%"+plataforma+"%"+fecha;
	}

	@Override
	public String toString() {
		return "Videojuegos [codigo=" + codigo + ", nombre=" + nombre + ", plataforma=" + plataforma + ", Fecha="
				+ Fecha + "]";
	}

}
