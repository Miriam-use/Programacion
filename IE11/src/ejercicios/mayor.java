package ejercicios;

import java.util.Scanner;

public class mayor {

	public static void main(String[] args) {
		int contador=0, numero=0, numeroGrande=0, numeroGrande1=0;

		 

		Scanner entrada = new Scanner(System.in);

		 

		while(contador < 10){

		System.out.println("Dame un entero");

		numero = entrada.nextInt();

		 

		if(numeroGrande==0){     //1º pasada, rellenamos la variable numeroGrande si todavía no contiene un número ingresado por teclado

			numeroGrande=numero;

		}else if (numeroGrande1==0){  //2º pasada, rellenamos la variable numeroGrande1 si todavía no contiene un número ingresado por teclado

			numeroGrande1=numero;

		}

		else if(numero > numeroGrande){  //Comparación para asignar el valor si es mayor

			numeroGrande = numero;

		}

		else if(numero > numeroGrande1){  //Comparación para asignar el valor si es mayor

			numeroGrande1 = numero;

		}

		else{

			System.out.println("El numero introducido es más pequeño que los anteriores, no se guarda.");  //Caso si es menor o igual que los 2 números anteriores guardados

		}

		 

		contador++; // incrementa contador en 1 

		 

		} // fin while

		 

		 

		// Comparar con IF , de los 2 números elegidos como "MAS GRANDES" , cuál de los 2 es mayor y mostrarlos en orden.

		 

		if(numeroGrande > numeroGrande1){

			System.out.println("El numero más grande es :" + numeroGrande + " y el segundo más grande es :" + numeroGrande1);

		}

		else{

			System.out.println("El numero más grande es :" + numeroGrande1 + " y el segundo más grande es :" + numeroGrande);

		}


		/*System.out.printf("el entero mas grande es %d:", numeroGrande);	*/



		} // termina metodo buscaMayor 
		
		
	}	
