package Array;

public class Array {

public static void main(String[] args) {
		
		// declara un array de enteros
		int[] arr;
		
		//asignar memoria para 5 enteros
		arr = new int[5];
		
		//inicial el primer elemento del array
		arr[0] = 10;
		
		//y asi...
		arr[1] = 20;
		arr[2] = 30;
		arr[3] = 40;
		arr[4] = 50;
		
		// accediendo a los elementos del array
		for(int i = 0; i < arr.length; i++)
			 System.out.println("Elemento en el índice "+i+" : "+arr[i]);
	}
}
