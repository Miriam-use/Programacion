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
			
			double ca1=(int) (Math.random() * n) + 1;
			double ca2=(int) (Math.random() * n-ca1) + 1;
			double ca3=(int) (Math.random() * n-ca2) + 1;
			double ca4=(int) (Math.random() * n-ca3) + 1;
			double ca5=(int) (Math.random() * n-ca4) + 1;
			double ca6=(int) (Math.random() * n-ca5) + 1;
			
			System.out.println("El numero 1 a salido: "+(ca1/100)+"%");
			System.out.println("El numero 2 a salido: "+(ca2/100)+"%");
			System.out.println("El numero 3 a salido: "+(ca3/100)+"%");
			System.out.println("El numero 4 a salido: "+(ca4/100)+"%");
			System.out.println("El numero 5 a salido: "+(ca5/100)+"%");
			System.out.println("El numero 6 a salido: "+(ca6/100)+"%");
			
			System.out.print("¿Desea lanzar otra vez? (1=si; 0=no) ");
			res=numero.nextInt();
		}while(res==0);

	}

}
