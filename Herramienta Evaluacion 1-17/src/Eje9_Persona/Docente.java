package Eje9_Persona;

public class Docente {

	private int codigo, hora;
	private double pagohora;
	private String categoria, estudio;
	
	Docente(int codigo, String categoria, String estudio){
		this.codigo = codigo;
		this.categoria = categoria;
		this.estudio = estudio;
	}
	
	public void setPagoParcial(int hora, double pago) {
		this.pagohora = (hora * pago);
	}
	
	public String
	
	public static void main(String[] args) {
		
		Docente docen = new Docente(1025, "Tecnico", "Mecanica");
		System.out.println();
	}
}
