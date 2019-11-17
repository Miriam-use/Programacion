package actividad;

import java.util.Scanner;

public class EJ12 {

	public static void main(String[] args) {
		Scanner numero = new Scanner(System.in);
		
		int res=1;
		do
		{
			System.out.println("¿Cuantas veces lanzas el dado?");
			int n=numero.nextInt();
			int porc=(n/6)*100;
			
			double ca1=(int) (Math.random() * porc) + 1;
			double ca2=(int) (Math.random() * porc) + 1;
			double ca3=(int) (Math.random() * porc) + 1;
			double ca4=(int) (Math.random() * porc) + 1;
			double ca5=(int) (Math.random() * porc) + 1;
			double ca6=(int) (Math.random() * porc) + 1;
			
			System.out.println("El numero 1 a salido: "+ca1+"%");
			System.out.println("El numero 2 a salido: "+ca2+"%");
			System.out.println("El numero 3 a salido: "+ca3+"%");
			System.out.println("El numero 4 a salido: "+ca4+"%");
			System.out.println("El numero 5 a salido: "+ca5+"%");
			System.out.println("El numero 6 a salido: "+ca6+"%");
			
			System.out.print("¿Desea lanzar otra vez? (1=si; 0=no) ");
			res=numero.nextInt();
		}while(res==0);

	}

}
