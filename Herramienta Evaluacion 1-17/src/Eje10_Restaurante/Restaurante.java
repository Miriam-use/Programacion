package Eje10_Restaurante;

/**
 * <h2>El método recibe la cantidad de papas y chocos en kilos y devuelve el número de clientes que puede atender</h2>
 * 
 * Buscar informacion de javadoc en <a href="http://google.com">GOOGLE</a>
 * @version 1-2019
 * @author Miriam
 */

public class Restaurante {

	private int choco, papa, tapaPapa, tapaChoco;	//kilo
	
	/**
	 * Añade x kilos de chocos a los yaexistentes.
	 */
	
	public void addChocos(int c) {
		this.choco = c;
		this.tapaChoco = choco*6;	
	}
	
	/**
	 * Añade x kilos de papas a los ya existentes.
	 */
	
	public void addPapas(int p) {
		this.papa = p;
		this.tapaPapa = papa*3;
	}
	
	/**
	 * Muestra por pantalla los kilos de chocos que hay en el almacén.
	 */
	
	public String showChocos() {
		return choco+" kg";
	}
	
	/**
	 * Muestra por pantalla los kilos de papas que hay en el almacén.
	 */
	
	public String showPapas() {
		return papa+" kg";
	}
	
	/**
	 * Devuelve el número de clientes que peude atender el restaurante (este es el método anterior).
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
		return "Hay "+showChocos()+" chocos en el almacén."+"\n"+
				"Hay "+showPapas()+" papas en el almacén."+"\n"+getComensales();
	}
}
