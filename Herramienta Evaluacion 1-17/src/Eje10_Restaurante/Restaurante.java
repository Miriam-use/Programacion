package Eje10_Restaurante;

public class Restaurante {

	private int choco, papa, tapaPapa, tapaChoco;	//kilo
	
	public void addChocos(int c) {
		this.choco = c;
		this.tapaChoco = choco*6;	
	}
	
	public void addPapas(int p) {
		this.papa = p;
		this.tapaPapa = papa*3;
	}
	
	public String showChocos() {
		return choco+" kg";
	}
	
	public String showPapas() {
		return papa+" kg";
	}
	
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
