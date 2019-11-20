package Eje10_Restaurante;

public class Restaurante {

	private int choco, papa;	//kilo
	
	public void addChocos(int c) {
		this.choco = c;
	}
	
	public void addPapas(int p) {
		this.papa = p;
	}
	
	public String showChocos() {
		return choco+" kg";
	}
	
	public String showPapas() {
		return papa+" kg";
	}
	
	public int getComensales() {	//por cada tres personas se utiliza un kilo de papas y medio de chocos.
		return papa;
			
	}
}
