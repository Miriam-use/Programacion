package Eje10_Restaurante;

/**
 * <h2>El m�todo recibe la cantidad de papas y chocos en kilos y devuelve el n�mero de clientes que puede atender</h2>
 * 
 * Buscar informacion de javadoc en <a href="http://google.com">GOOGLE</a>
 * @version 1-2019
 * @author Miriam
 */

public class Restaurante {

	private int choco, papa, tapaPapa, tapaChoco;	//kilo
	
	/**
	 * A�ade x kilos de chocos a los yaexistentes.
	 */
	
	public void addChocos(int c) {
		this.choco = c;
		this.tapaChoco = choco*6;	
	}
	
	/**
	 * A�ade x kilos de papas a los ya existentes.
	 */
	
	public void addPapas(int p) {
		this.papa = p;
		this.tapaPapa = papa*3;
	}
	
	/**
	 * Muestra por pantalla los kilos de chocos que hay en el almac�n.
	 */
	
	public String showChocos() {
		return choco+" kg";
	}
	
	/**
	 * Muestra por pantalla los kilos de papas que hay en el almac�n.
	 */
	
	public String showPapas() {
		return papa+" kg";
	}
	
	/**
	 * Devuelve el n�mero de clientes que peude atender el restaurante (este es el m�todo anterior).
	 */
	
	public String getComensales() {			//por cada tres personas se utiliza un kilo de papas y medio de chocos.
		if(tapaPapa>3 && tapaChoco>6) {
		if(tapaPapa < tapaChoco) {
				return "Hay papas con choco para "+tapaPapa+" clientes";
			}else {
				return "Hay papas con choco para "+tapaChoco+" clientes";
			}
		}else {
			return "No hay sufisiente ingredientes";
		}
	}
	
	public String getMuestra() {
		return "Hay "+showChocos()+" chocos en el almac�n."+"\n"+
				"Hay "+showPapas()+" papas en el almac�n."+"\n"+getComensales();
	}
}
