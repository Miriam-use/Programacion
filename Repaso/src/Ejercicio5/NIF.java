package Ejercicio5;

public class NIF {

	private int numDNI, auxiliar;
	private String letra;
	public static final String[] letras={"T", "R", "W", "A", "G", "M", "Y", "F", "P", "D", "X", "B", "N", "J", "Z", "S", "Q", "V", "H", "L", "C", "K", "E"};
	
	NIF(){
		this.numDNI=0;
		this.letra=null;
	}
	
	public void setDNI(int num) {
		this.numDNI=num;
	}
	
	public int getAuxiliar() {
		auxiliar=(numDNI%23);
		return auxiliar;
	}
	
	public String getLetra() {
		for(int i=0; i<22; i++) {
			if(auxiliar==i) {
				return letra=letras[i];
			}else {
				return "DNI no valido";
			}
		}
		return letra;
	}
	
	public String getMostrar() {
		return numDNI+"-"+letra;
	}
}
