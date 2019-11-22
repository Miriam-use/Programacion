package Eje1_DVDCine;

public class DVDCine {
	
	private boolean thriller, resumen;
	private String pelicula, resumen2, genero;
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
	
	/*public void setResumenes(String resu) {
		this.resumen2 = resu;
	}
	
	public String getResumenes() {
		return resumen2;
	}*/
	
	public String gettieneResumen() {
		if(resumen == true) {
			return "si tiene resumen";
		}else {
			return "no tiene resumen";
		}
	}
	
	public void setmuestraDuracion(int duracion) {
		this.duracion = duracion;
	}
	public String getmuestraDuracion() {
		return duracion+"min";
	}

	public String muestraDVDCine() {
		return "La pelicula es: "+pelicula+" Su genero es "+getGenero()+" "+getesThriller()+"\n"
		+gettieneResumen()+". Y su duracion es de "+getmuestraDuracion();
	} 

}
