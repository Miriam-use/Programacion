package Eje_3Numero;

public class Numero {

	private int numero;
	
	public Numero() {
		numero = 0;
	}
	
	public int getValor() {
		return numero;
	}
	
	public int getAniade() {
		return numero=numero+1;
	}
	
	public int getResta() {
		return numero=numero-1;
	}
	
	public int getDoble() {
		return numero*2;
	}
	
	public int getTriple() {
		return numero*3;
	}
	
	public void setNumero(int i) {
		numero=i;
	}

}
