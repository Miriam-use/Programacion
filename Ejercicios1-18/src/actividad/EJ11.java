package actividad;

import java.util.Scanner;

public class EJ11 {

	public static void main(String[] args) {
		
		int sum1=0, i=1, sum2=0;
		Scanner numero = new Scanner(System.in);
		
		int n1, n2;
		
		System.out.println("Ingrese el valor de los numeros para comprobar si son amigos:");
		n1=numero.nextInt();
		n2=numero.nextInt();
		
		do
		{
			if((n1%i)==0)
			{
				sum1+=i;
			}
			i++;
		}while(i==n1);
		i=1;
		do
		{
			if((n2%i)==0)
			{
				sum2+=i;
			}
			i++;
		}while(i==n2);
		if(sum1==n2&&sum2==n1)
		{
			System.out.print("Si son numeros primos");
		}else
		{
			System.out.print("No son numeros amigos");
		}

	}

}
