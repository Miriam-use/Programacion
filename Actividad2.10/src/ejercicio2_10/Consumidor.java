package ejercicio2_10;

public class Consumidor {

	private String nombre;
	private int[] carroCompra;
	
	public Consumidor(String string, int[] is) {
		this.nombre=string;
		this.carroCompra=is;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int[] getCarroCompra() {
		return carroCompra;
	}
	public void setCarroCompra(int[] carroCompra) {
		this.carroCompra = carroCompra;
	}
}
