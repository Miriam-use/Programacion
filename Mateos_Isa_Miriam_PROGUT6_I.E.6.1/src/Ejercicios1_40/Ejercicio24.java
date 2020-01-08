package Ejercicios1_40;

public class Ejercicio24 {

	public static void main(String[] args) {

		String cadena= "jose, buenos dias, que tengas un buen dia";
		String array[]=cadena.split(" ");
		
		for(int i=0; i<array.length; i++) {
			System.out.print(array[i]);
		}
	}

}
