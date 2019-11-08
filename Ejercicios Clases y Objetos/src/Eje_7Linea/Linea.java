package Eje_7Linea;

public class Linea extends Punto {

	private int[] puntoA, puntoB;
	private double derch;
	private double izq;
	
	Linea(){
		this.puntoA = puntoA;
		this.puntoB = puntoB;
	}
	
	public void Datos() {
		puntoA = new int[2];
		puntoB = new int[2];
		
		puntoA[0] = xA;
		puntoA[1] = yA;
		
		puntoB[0] = xB;
		puntoB[1] = yB;
	}
	
	public void mueveDerecha(double derch) {
		this.derch = 4;
	}
	
	public void mueveIzquierda(double izq) {
		this.izq = 2;
	}
	
	public String Mover() {
		return "[("+(puntoA[0] + derch)+","+(puntoA[1] + derch)+") , ("+(puntoB[0] - izq)+","+(puntoB[1] - izq+")]");
	}
	
}
