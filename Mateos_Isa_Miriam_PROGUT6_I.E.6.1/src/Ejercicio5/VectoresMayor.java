package Ejercicio5;

public class VectoresMayor {

	public static void main(String[] args) {

		int vector[] = new int[20];
		
		for(int i=0; i<vector.length; i++) {
			int n = (int)(Math.random()*100);
			vector[i]=n;
			System.out.println(vector[i]);
			}
		
		int mayor = vector[0];
		for(int i=0; i<vector.length; i++) {
			if(vector[i]>mayor) {
				mayor = vector[i];
				System.out.println("El mayor en la posicion "+i+" es: "+mayor);
			}
		}
		
	}

}