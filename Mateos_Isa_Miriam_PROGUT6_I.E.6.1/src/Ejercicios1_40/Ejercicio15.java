package Ejercicios1_40;
/**
 * 
 * @author Miriam
 *
 */
public class Ejercicio15 {

	public static void main(String[] args) {

		int array[][]=new int[3][6];
		System.out.println("Mostrar matriz");
		
		for(int i=0; i<array.length; i++) {
			System.out.println("\n");
			
			for(int j=0; j<array[i].length; j++) {
				int num = (int)(Math.random()*50+1);
				array[i][j]=num;
				System.out.print(array[i][j]+"\t");
			}
		}
		
		int mayor=array[0][0];
		int I=0, J=0;
/**
 * te encuentra el mayor y te guarda las cordenadas en la que estan		
 */
		for(int i=0; i<array.length; i++) {
			
			for(int j=0; j<array[i].length; j++) {
				
				if(array[i][j]>mayor) {
					mayor=array[i][j];
					J=j+1;
					I=i+1;
				}
				
			}
		}
		System.out.print("\nEl mayor es: "+mayor+" Con vector: ("+I+","+J+")");
		
		int menor=array[0][0];
		int X=0, Y=0;
		
		for(int i=0; i<array.length; i++) {
			
			for(int j=0; j<array[i].length; j++) {
				
				if(array[i][j]<menor) {
					menor=array[i][j];
					Y=j+1;
					X=i+1;
				}
				
			}
		}
		System.out.print("\nEl menor es: "+menor+" Con vector: ("+X+","+Y+")");
	}

}
