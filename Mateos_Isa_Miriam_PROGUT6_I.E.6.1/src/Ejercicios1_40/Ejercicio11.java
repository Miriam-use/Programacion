package Ejercicios1_40;
/**
 * 
 * @author Miriam
 *
 */
public class Ejercicio11 {

	public static void main(String[] args) {

		int A[] = new int[15];
		int B[] = new int[15];
		int C[] = new int[15];
		
		System.out.println("ARRAY A:");
		for(int i=0; i<A.length; i++) {
			int nA = (int)(Math.random()*10+1);
			A[i]=nA;
			System.out.println(A[i]);
		}
		
		System.out.println("ARRAY B:");
		for(int i=0; i<B.length; i++) {
			int nB = (int)(Math.random()*10+1);
			B[i]=nB;
			System.out.println(B[i]);
		}
/**
 * Suma las dos matrizes y lo guarda en una 3 matriz		
 */
		System.out.println("ARRAY C:");
		for(int i=0; i<B.length; i++) {
			C[i]=A[i]+B[i];
			System.out.println(C[i]);
		}
	}

}
