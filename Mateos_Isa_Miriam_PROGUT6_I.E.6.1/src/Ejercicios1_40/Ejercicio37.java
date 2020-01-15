package Ejercicios1_40;
/**
 * 
 * @author Miriam
 *
 */
public class Ejercicio37 {
/**
 * 
 * @param fila
 * @param columna
 * @return
 */
	public static int elemento(int fila, int columna) {
		if(columna==1) {
			return 1;
		}
		if(columna<1 || columna>fila) {
			return 0;
		}
		return elemento(fila-1, columna)+elemento(fila-1, columna-1);
	}
	
	public static void main(String[] args) {

		int numfilas = 5;
		
		for(int i=1; i<(numfilas+1); i++) {
			for(int j=0; j<(numfilas-i); j++) {
				System.out.print(" ");
			}
			for(int e=1; e<(numfilas+1); e++) {
				int dato=elemento(i, e);
				if(dato>0) {
					System.out.print(dato+" ");
				}
			}
			System.out.println("");
		}
		
	}

}
