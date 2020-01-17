package Ejercicios1_40;
/**
 * 
 * @author Miriam
 *
 */
public class Ejercicio14 {

	public static void main(String[] args) {

		int A[][]=new int[3][5];
		int B[][]=new int[3][5];
		System.out.println("\nMatriz A\n*****************");
		for(int i=0; i<A.length; i++) {
			System.out.println("\n");
			for(int j=0; j<A[i].length; j++) {
				int num = (int)(Math.random()*100+1);
				A[i][j]=num;
				System.out.print(A[i][j]+"\t");
			}
		}
		System.out.println("\nMatriz B\n*****************");
		for(int i=0; i<B.length; i++) {
			System.out.println("\n");
			for(int j=0; j<B[i].length; j++) {
				int num = (int)(Math.random()*100+1);
				B[i][j]=num;
				System.out.print(B[i][j]+"\t");
			}
		}
		
		System.out.println("\nSuma de Matrices A y B\n*****************");
		for(int i=0; i<3; i++) {
			System.out.println("\n");
			for(int j=0; j<5; j++) {
				int suma[][]=new int[3][5];
				suma[i][j]=(A[i][j]+B[i][j]);
				System.out.print(suma[i][j]+"\t");
			}
		}
	}
}
