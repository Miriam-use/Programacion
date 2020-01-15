package Ejercicios1_40;
/**
 * 
 * @author Miriam
 *
 */
public class Ejercicio40 {

	public static void main(String[] args) {
		
		int matriz[][]= {{1,2,3,4,5},
							{5,6,7,8,9},
							{9,5,2,3,4}};
		int array[]= {1,5,9};
		int igual[]=new int[3];
		
		int x=0, y=0;
		for(int i=0; i<5; i++) {
			for(int j=0; j<3; j++) {
				if(array[j]==matriz[i][j-1]) {
					igual[j]=array[j];
					x=i;
					y=j;
				}
			}
			System.out.println("La columna de la matrix ["+x+" , "+y+"] es igual al vector: "+igual[i]);
		}
	}

}
