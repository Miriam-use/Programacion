package Eje17_Ordenador;
/**
 * <h2>La subclase Portátil contiene los siguientes atributos: marca, tamaño de pantalla y peso.</h2>
 * @author Miriam
 * @see
 */
public class Servidor extends Ordenador	{
	
	private double monitor;
	private String teclado, raton;
	
	public void setMonitor(double monitor) {
		this.monitor = monitor;
	}
	
	public double getMonitor() {
		return monitor;
	}
	
	public void setTeclado(String teclado) {
		this.teclado = teclado;
	}
	
	public void setRaton(String raton) {
		this.raton = raton;
	}
		
	public String getServidor() {
		return "Tamaño del monitor "+monitor+", teclado "+teclado+" y raton "+raton;
	}
	
}
