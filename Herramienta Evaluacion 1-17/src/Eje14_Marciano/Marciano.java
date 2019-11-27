package Eje14_Marciano;

public class Marciano {

	private boolean vivo=false;
	private String nombre;
	private String numMarcianos;
	private char estado;
	char vivos='s', muertos='n';
	
	Marciano(String nombre) {
		this.nombre = nombre;
		this.vivo = true;
	}
	
	
	public String getNace() {
		return "Hola, he nacido y soy el marciano "+nombre;
	}
	
	public void setMuere(char v) {
		this.estado = v;
		this.vivo = false;
	}
	
	public String getMuere() {
		return "El marciano "+nombre+" ha muerto";
	}
	
	public String getestaVivo() {
		if(vivo==false) {
			return "El marciano ya está muerto";
		}else {
			return "El marciano está vivo";
		}
	}
		
	public String getcuentaMarcianos() {
		if(vivo==true) {
			return "Marciano vivos";
		}else {
			return "Ninguan marciano vivo";
		}
	}
	
	
}
