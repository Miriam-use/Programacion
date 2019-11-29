package Eje9_Persona;

import Eje6_Persona.Persona;

/**
 * <h2>la subclase Docente de la clase Persona que tiene los
 * atributos: Código, categoría, Estudios de Postgrado, horas de clase y pago por hora</h2>
 * @author Miriam
 * @see
 */
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
	
	public String getInformacion() {
		return codigo+" "+categoria+" "+estudio+"\n"+pagohora;
	}
	
	public static void main(String[] args) {
		
		Docente docen = new Docente(1025, "Mecanica", "Tecnico");
		docen.setPagoParcial(5, 10);
		System.out.println(docen.getInformacion());
	}
}
