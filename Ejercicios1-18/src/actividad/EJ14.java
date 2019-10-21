package actividad;

import java.util.Scanner;

public class EJ14 {

	public static void main(String[] args) {
		Scanner euros = new Scanner(System.in);
		int re=1;
		do
		{
			System.out.println("Insecte Sueldo Fijo:");
			double sueldo_fijo=euros.nextInt();
			System.out.println("Insecte Comision:");
			double comision=euros.nextInt();
			System.out.println("Insecte Kilometraje:");
			double km=euros.nextInt();
			System.out.println("Instecte Dietas:");
			double dieta=euros.nextInt();
			
			sueldo_fijo-=0.18;
			double suma=(sueldo_fijo+comision+km+dieta);
			suma-=150;
			
			System.out.println("Sueldo liquido: "+suma+"euros");
			System.out.println("Pulsa 0 para salir");
			re=euros.nextInt();
		}while(re==0);
	}

}
