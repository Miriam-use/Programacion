package actividad;

import java.util.Scanner;

public class EJ15_1 {

	public static void main(String[] args) {
		
		Scanner numero = new Scanner(System.in);
		
		System.out.println("¿Cuantos numero quieres?");
		int n=numero.nextInt();
		
		int[]Num;
		Num=new int[n];
		
		int j=1;
		for(int i=0; i<n; i++ ) {
			System.out.println("Introduce el "+j+++" numeros");
			int num=numero.nextInt();
			Num[i]=num;
		}
		
		int mayor1, mayor2;
		mayor1 = mayor2 = Num[0];
		
		for(int i=0; i<n; i++ ) {
			if(Num[i]>mayor1) {
				mayor1 = Num[i];
			}
			if(Num[i]>mayor2 && mayor1!=mayor2) {
				mayor2 = Num[i];
			}
		}
		
		System.out.println("El primero mayor es: "+mayor1+"\n El segundo mayor es: "+mayor2);

	}

}
