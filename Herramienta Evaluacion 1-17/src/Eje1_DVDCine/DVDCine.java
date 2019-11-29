package Eje1_DVDCine;

/**
 * <h2>Clase que nos permite crear la ficfa de una pelicula</h2>
 * 
 * Buscar informacion de javadoc en <a href="http://google.com">GOOGLE</a>
 * @version 1-2019
 * @author Miriam
 */

public class DVDCine {
	
	private boolean thriller, resumen;
	private String pelicula, genero;
	private int duracion;
	
	public void setDato(String pelicula){
		this.pelicula = pelicula;
	}
	public String getDato() {
		return pelicula;
	}
	
	public void setGenero(String gene) {
		this.genero = gene;
	}
	
	public String getGenero() {
		return genero;
	}
	
	/**
	 * Este método retorna cierto (true), si la película pertenece a este género cinematográfico.
	 * @param thriller
	 */
	
	public void setesThriller(boolean thriller) {
		this.thriller = thriller;
	}
	
	public String getesThriller() {
		if(thriller == true) {
			return "si es thriller";
		}else {
			return "no es thiller";
		}
	}
	
	public void settieneResumen(boolean resumen) {
		this.resumen = resumen;
	}
	
	/**
	 * Retorna cierto si la película tiene el resumen escrito.
	 * @return
	 */
	
	public String gettieneResumen() {
		if(resumen == true) {
			return "si tiene resumen";
		}else {
			return "no tiene resumen";
		}
	}
	
	/**
	 * Retorna la duración con el formato: "114 min ."
	 * @param duracion
	 */
	
	public void setmuestraDuracion(int duracion) {
		this.duracion = duracion;
	}
	public String getmuestraDuracion() {
		return duracion+" min";
	}

	public String muestraDVDCine() {
		return "La pelicula es: "+pelicula+". Su genero es "+getGenero()+" "+getesThriller()+"\n"
		+gettieneResumen()+"\n"+"Y su duracion es de "+getmuestraDuracion();
	} 

}
