package Ejercicios1_40;

import java.util.Scanner;
/**
 * 
 * @author Miriam
 *
 */
public class Ejercicio39 {

	public static void main(String[] args) {
		
		Scanner Leer = new Scanner(System.in);
		
		int burbuja[][] = new int[5][5];
		int burbujaFila[] = new int[5];
		int diagonal[] = new int[5];

		System.out.println("\n/////MATRIZ SIN ORDENADA/////\n");
		for(int i=0; i<burbuja.length; i++) {
			for(int j=0; j<burbuja[i].length; j++) {
				int num = (int)(Math.random()*20+1);
				burbuja[i][j]=num;
				System.out.print(burbuja[i][j]+"\t");
			}
			System.out.println("");
		}
		
		System.out.println("\nIntroduce el numero de fila para ordenar:");
		int num=Leer.nextInt();
		int n=num-1;
/**
 * Guardas la fila para poder ordenarla 		
 */
		System.out.println("\n/////SU FILA ELEGIDA SIN ORDENADOS/////\n");
		for(int i=0; i<burbujaFila.length; i++) {
				burbujaFila[i]=burbuja[n][i];
			System.out.print(burbujaFila[i]+"\t");
		}
/**
 * Metodo burbuja fila
 */
		int aux;
		for(int i=0; i<burbujaFila.length-1; i++) {
			for(int j=1; j<burbujaFila.length; j++) {
				if(burbujaFila[j]<burbujaFila[j-1]) {
					aux=burbujaFila[j];
					burbujaFila[j]=burbujaFila[j-1];
					burbujaFila[j-1]=aux;
				}
			}
		}
		
		System.out.println("\n/////SU FILA ELEGIDA ORDENADOS/////\n");
		for(int i=0; i<burbujaFila.length; i++) {
			System.out.print(burbujaFila[i]+"\t");
		}
/**
 * guardas la diagonal 1	
 */
		for(int i=0; i<burbuja.length; i++) {
			for(int  j=0; j<burbuja.length; j++) {
				if(i==j) {
					diagonal[i]=burbuja[i][j];
				}
			}
		}
		
		int auxD;
		for(int i=0; i<diagonal.length-1; i++) {
			for(int j=1; j<diagonal.length; j++) {
				if(diagonal[j]<diagonal[j-1]) {
					auxD=diagonal[j];
					diagonal[j]=diagonal[j-1];
					diagonal[j-1]=auxD;
				}
			}
		}
		
		/*int x = diagonal.length;
		//empezamos por el segundo (1) y terminamos en el último (n-1)
		for (int i = 1; i < n; i++)
		{
		//guardamos el valor del elemento i
		int v = diagonal[i];
		//empezamos a compararlo con el anterior
		int j = i - 1;
		//y seguimos mientras no hayamos llegado al principio del array y los
		//elementos que encontremos sean mayores que el que analizamos
		while (j >= 0 && diagonal[j] > v)
		{
		//desplazamos el elemento un lugar a la derecha
		diagonal[j + 1] = diagonal[j];
		//y pasamos al anterior
		j--;
		}
		//Al terminar el bucle, j indica el lugar inmediatamente anterior a donde
		//debemos encajar v
		diagonal[j + 1] = v;
		}*/
		
		System.out.println("\n/////DIAGONAL ORDENADOS/////\n");
		for(int i=0; i<diagonal.length; i++) {
			System.out.print(diagonal[i]+"\t");
		}
	}

}
