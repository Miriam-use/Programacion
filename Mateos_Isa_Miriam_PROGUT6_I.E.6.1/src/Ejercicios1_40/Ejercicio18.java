package Ejercicios1_40;
/**
 * 
 * @author Miriam
 *
 */
public class Ejercicio18 {

	public static void main(String[] args) {

		int paresImpares[]=new int[100];
		int x=0;
		for(int i=0; i<paresImpares.length; i++) {
			int n = (int)(Math.random()*(1000-1)+1);
			paresImpares[i]=n;
			x++;
			System.out.println(x+") "+paresImpares[i]);
		}
		
		int pares[]=new int[100];
		int impares[]=new int[100];
		int y=0, h=0;
		
		System.out.println("\nPARES:");
		for(int i=0; i<pares.length; i++) {
			if(paresImpares[i]%2==0) {
				pares[i]=paresImpares[i];
				y++;
				System.out.println(y+") "+pares[i]);
			}
		}
		
		System.out.println("\nIMPARES:");
		for(int i=0; i<pares.length; i++) {
			impares[i]=paresImpares[i];
			if(paresImpares[i]%2!=0) {
				
				h++;
				System.out.println(h+") "+impares[i]);
			}
		}
	}
}
