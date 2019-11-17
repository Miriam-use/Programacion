package Eje1_DVDCine;

public class DVDCine {
	
	private boolean thriller, resumen;
	private String duracion, pelicula;
	
	public void setDato(String pelicula){
		this.pelicula = pelicula;
	}
	public String getDato() {
		return pelicula;
	}
	
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
	public String gettieneResumen() {
		if(resumen == true) {
			return "si tiene resumen";
		}else {
			return "no tiene resumen";
		}
	}
	
	public void setmuestraDuracion(String duracion) {
		this.duracion = duracion;
	}
	public String getmuestraDuracion() {
		return duracion+"min";
	}

	public String muestraDVDCine() {
		return "La pelicula es: "+pelicula+" Su genero "+getesThriller()+" "
		+gettieneResumen()+" y su duracion es de "+getmuestraDuracion();
	}

}
