package Eje14_Marciano;

public class Marciano {

	private boolean vivo=false;
	private String nombre;
	private String numMarcianos;
	
	
	public void setAlien(String nombre) {
		this.nombre = nombre;
		this.vivo = true;
	}
	
	
	public String getNace() {
		return "Hola, he nacido y soy el marciano "+nombre;
	}
	
	public String getMuere() {
		this.vivo=false;
		return "El marciano "+nombre+" ha muerto";
	}
	
	public String getestaVivo() {
		if(vivo==false) {
			return "El marciano ya está muerto";
		}else {
			return "El marciano está vivo";
		}
	}
	
	
}
