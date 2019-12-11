package Ejercicio6;

public class Coche {

	private String matricula, marca, modelo;
	
	public Coche(String m, String ma, String mo) {
		this.matricula=m;
		this.marca=ma;
		this.modelo=mo;
	}
	
	public void setMatricula(String m) {
		this.matricula=m;
	}
	
	public void setMarca(String ma) {
		this.marca=ma;
	}
	
	public void setModelo(String mo) {
		this.modelo=mo;
	}
	
	public String getModelo() {
		return modelo;
	}
	
	public String getMarca() {
		return marca;
	}
	
	public String getMatricula() {
		return matricula;
	}
}
