package Eje17_Ordenador;
/**
 * <h2>La superclase Ordenador contiene los siguientes atributos: cantidad de
 * memoria RAM, capacidad del disco duro, modelo de procesador, modelo de tarjeta gráfica y precio.</h2>
 * @author Miriam
 * 
 */
public class Ordenador {

	public double ram, discoDuro, precio;
	public String procesador, grafica;
	
	public void setGrafica(String grafica) {
		this.grafica = grafica;
	}
	
	public void setRam(double ram) {
		this.ram = ram;
	}
	
	public void setDiscoDuro(double discoDuro) {
		this.discoDuro = discoDuro;
	}
	
	public double getDiscoDuro() {
		return discoDuro;
	}
	
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	
	public double getPrecio() {
		return precio;
	}
	
	public void setProcesador(String procesador) {
		this.procesador = procesador;
	}
	
	public String getOrdenador() {
			return"RAM de "+ram+", disco duro de "+discoDuro+", grafica "+grafica+" y procesador "+procesador;
	}
}
	
