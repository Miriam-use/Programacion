package actividad;

import java.util.Scanner;

public class EJ15 {

	public static void main(String[] args) {
		Scanner numero = new Scanner(System.in);
		
		System.out.println("Dada una secuencia de 3 numeros de enteros se sacara los dos mayores.");
		System.out.println("Introduce los numeros");
		int num1=numero.nextInt();
		int num2=numero.nextInt();
		int num3=numero.nextInt();
		
		int n1=0, n2=0;
		if(num1>num2) //no funciona como debe
		{
			if(num1>num3)
			{
				 n1=num1;
			}else
			{
				 n1=num3;
			}
		}else
		{
			if(num2>num3)
			{
				 n2=num2;
			}else
			{
				 n2=num3;
			}
		}
		
		
		System.out.println("El primer mayor es: "+n1);
		System.out.println("El segundo mayor es: "+n2);

	}

}
