package actividad;

import java.util.Scanner;

public class EJ12 {

	public static void main(String[] args) {
		Scanner numero = new Scanner(System.in);
		
		int res=1;
			System.out.println("¿Cuantas veces lanzas el dado?");
			int n=numero.nextInt();
			
			double ca1=(int) (Math.random() * 100) + 1;
			double ca2=(int) (Math.random() * ca1-100) + 1;
			double ca3=(int) (Math.random() * ca2-100) + 1;
			double ca4=(int) (Math.random() * ca3-100) + 1;
			double ca5=(int) (Math.random() * ca4-100) + 1;
			double ca6=(int) (Math.random() * ca5-100) + 1;
			
			System.out.println("El numero 1 a salido: "+(ca1*6)/100+"%");
			System.out.println("El numero 2 a salido: "+(ca2*6)/100+"%");
			System.out.println("El numero 3 a salido: "+(ca3*6)/100+"%");
			System.out.println("El numero 4 a salido: "+(ca4*6)/100+"%");
			System.out.println("El numero 5 a salido: "+(ca5*6)/100+"%");
			System.out.println("El numero 6 a salido: "+(ca6*6)/100+"%");
			
	}

}
