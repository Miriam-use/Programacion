package actividad;

import java.util.Scanner;

public class EJ15 {

	public static void main(String[] args) {
		Scanner numero = new Scanner(System.in);
		
		System.out.println("Dada una secuencia de 3 numeros de enteros se sacara los dos mayores.");
		System.out.println("Introduce los numeros");
		int n1=numero.nextInt();
		int n2=numero.nextInt();
		int n3=numero.nextInt();
		int n4=numero.nextInt();
		
		
		if (n1>n2 && n1>n3 && n1>n4) {
                System.out.println("El primero mayor es mayor es: " + n1);
        }else {
        	if(n2>n1 && n2>n3 && n2>n4) {
        		System.out.println("El primero mayor es mayor es: " + n2);
        	}else {
        		if(n3>n1 && n3>n2 && n3>n4) {
        			System.out.println("El primero mayor es mayor es: " + n3);
        		}else {
        			if(n4>n1 && n4>n2 && n4>n3) {
        				System.out.println("El primero mayor es mayor es: " + n4);
        			}
        		}
        	}
        }
		
        if(n1<n2 && n1>n3 && n1>n4) {
        	System.out.println("El segundo mayor es mayor es: " + n1);
        }else {
        	if(n1<n3 && n1>n2 && n1>n4) {
        		System.out.println("El segundo mayor es mayor es: " + n1);
        	}else {
        		if(n1<n4 && n1>n2 &&n1>n3) {
        			System.out.println("El segundo mayor es mayor es: " + n1);
        		}
        	}
        }
        
	}

}
