package Ejercicios1_40;
/**
 * 
 * @author Miriam
 *
 */
public class Ejercicio21 {

	public static void main(String[] args) {
/**
 * Crear un arreglo de tipo entero con 4 elementos
 * Crear una matriz ce 4x4 elemento
 */
		int a[]= {2,3,4,5};
		int b[][]= {
			{2,3,4,5},
			{6,7,8,9},
			{1,5,9,0},
			{3,5,7,0}
		};
		
		//int n=0;
		
		for(int i=0; i<4; i++) {
			for(int j=0; j<4; j++) {
				if(b[i][j]==a[j]) {
					System.out.println("El vector a esta contenido en la matriz b, en la posicion ("+i+","+j+")");
				}
			}
		}
		
		
	}

}
