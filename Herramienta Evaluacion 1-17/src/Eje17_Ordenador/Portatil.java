package Eje17_Ordenador;

public class Portatil extends Ordenador {

	private String marca;
	private double pantalla, peso;
	
	public void setMarca(String marca) {
		this.marca = marca;
	}
	
	public void setPantalla(double pantalla) {
		this.pantalla = pantalla;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}
	
	public String getPortatil() {
		return "marca del portatil "+marca+", pantalla de "+pantalla+" y peso "+peso;
	}
}
