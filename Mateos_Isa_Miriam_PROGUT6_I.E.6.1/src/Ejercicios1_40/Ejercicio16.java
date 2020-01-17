package Ejercicios1_40;
/**
 * 
 * @author Miriam
 *
 */
public class Ejercicio16 {

	public static void main(String[] args) {

		int array[] = new int[20];
		
		int n=1;
		for(int i=0; i<array.length; i++) {
			array[i]=n;
			n++;
			System.out.println(array[i]);
		}
		
		int suma=0;
		int mayor=array[0];
		for(int i=0; i<array.length; i++) {
			if(i%2==0) {
				suma+=array[i];
			}else {
				if(array[i]>mayor) {
					mayor=array[i];
				}
			}
		}
		System.out.println("La suma de los numeros en posiciones pares es de: "+suma);
		System.out.println("El mayor de las posicion de los inpares es: "+mayor);
	}

}
