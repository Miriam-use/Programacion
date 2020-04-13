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
	
	public Videojuegos(int cod, String nom, String fecha, String plata) {
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

	public int getCodigo() {
		return codigo;
	}

	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
			this.nombre = nombre;
	}
	
	public String getFecha() {
		return fecha;
	}

	public void setFecha(String fecha) {
		this.fecha = fecha;
	}

	public Date getFecha2() {
		return Fecha;
	}

	public void setFecha2(Date fecha) {
		Fecha = fecha;
	}

	public String getPlataforma() {
		return plataforma;
	}

	public void setPlataforma(String plataforma) {
		this.plataforma = plataforma;
	}
	
	public String Mostrar() {
		return "Código del videojuego: "+codigo
				+"\nNombre del videojuego: "+nombre
				+"\nPlataforma: "+plataforma
				+"\nFecha de lanzamiento: "+fecha;
	}
	
	public String FicheroEscritura() {
		return codigo+","+nombre+","+plataforma+","+fecha;
	}

	@Override
	public String toString() {
		return "Videojuegos [codigo=" + codigo + ", nombre=" + nombre + ", plataforma=" + plataforma + ", Fecha="
				+ Fecha + "]";
	}

}
