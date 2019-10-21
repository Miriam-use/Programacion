package actividad;

import java.util.Scanner;

public class EJ05 {
	
	public static void main(String[] args) {
		
		Scanner numero = new Scanner(System.in);
		
		int cont=1,ceo=0;
		float suma=0, post=0, contpost=1, neg=0, contneg=1;
		
		do
		{
			System.out.print("Ingrese numero:");
			int num=numero.nextInt();
			suma=suma+num;
			
			if(num==0)
			{
				ceo++;
			}
			if(num>0)
			{
				post=post+num;
				contpost++;
			}
			if(num<0)
			{
				neg=neg-num;
				contneg++;
			}
			cont++;
		}while(cont<11);
		
		System.out.println("El promedio de los 10 numeros es: "+(suma/10));
		System.out.println("El promedio de los los positivos es: "+(post/contpost));
		System.out.println("El promedio de los negativos es: "+(neg/contneg));
		System.out.println("El numero de cero que aparece es: "+ceo);
	}

}
