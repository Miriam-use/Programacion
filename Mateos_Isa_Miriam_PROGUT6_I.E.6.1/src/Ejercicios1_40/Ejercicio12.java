package Ejercicios1_40;

import java.util.Scanner;
/**
 * 
 * @author Miriam
 *
 */
public class Ejercicio12 {

	public static void main(String[] args) {

		Scanner numero = new Scanner(System.in);
		
		int A[]=new int[5];
		int j=0;
		
		try {
		for(int i=0; i<A.length; i++) {
			j++;
			System.out.println("Introduce el "+j+" numero:");
			int num=numero.nextInt();
			A[i]=num;
		}
		}catch(Exception e){
			System.out.println("Error");
		}
		
		boolean salir=false;
		
		while(!salir) {
			System.out.println("1.-Comprobar numero");
			System.out.println("2.-Salir");
			
			System.out.println("¿Que quieres hacer?");
			int opcion=numero.nextInt();
			
			switch(opcion) {
			case 1:
				System.out.println("Introduce numero para comprobar:");
				int n=numero.nextInt();
				boolean encontrado=false;
				for(int i=0; i<A.length; i++) {
					if(n==A[i]) {
						System.out.println("El numero "+n+" esta en el vector");
						encontrado=true;
					}
				}
				if(!encontrado) {
					System.out.println("El numero "+n+" no esta en el vector");
				}
				break;
			case 2:
				System.out.println("Saliendo");
				salir=true;
				break;
			default:
				System.out.println("No es una opcion");
			}
		}
	}
}
