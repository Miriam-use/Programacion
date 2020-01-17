package Ejercicios1_40;
/**
 * 
 * @author Miriam
 *
 */
public class Ejercicio5 {

	public static void main(String[] args) {

		int vector[] = new int[20];
		
		for(int i=0; i<vector.length; i++) {
			int n = (int)(Math.random()*100);
			vector[i]=n;
			System.out.println(vector[i]);
			}
		
		int mayor = vector[0];
		int p=0;
		for(int i=0; i<vector.length; i++) {
			if(vector[i]>mayor) {
				mayor = vector[i];
				p = i;
			}
		}
		System.out.println("El mayor en la posicion "+p+" es: "+mayor);
	}

}
