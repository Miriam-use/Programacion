package Eje14_Marciano;

import java.util.Scanner;

public class MainMarciano	{

	public static void main(String[] args) {
		
		Marciano alien = new Marciano();
		Scanner m = new Scanner(System.in);
		
		/**boolean salir = false;
		
		while(!salir) {
			System.out.println("1.-Nacer Marciano");
			System.out.println("2.-Matar marciano");
			System.out.println("3.-Comprovar marciano");
			System.out.println("4.-Salir");
			
			System.out.println("¿Que quieres hacer?");
			int opcion=m.nextInt();
			
			switch(opcion) {
			case 1:
				//int j=1;
				int[] et;
				System.out.println("¿Cuantos marcianos crearas?");
				int e=m.nextInt();
				et = new int[e];
				
				for(int i=0; i<et.length; i++) {
					System.out.println("Nombre del "+i+" marciano:");
					String nom=m.nextLine();
					alien.setAlien(nom);
					System.out.println(alien.getNace());
				}
				break;
			case 2:
				System.out.println("¿Que marciano vas a matar?");
				int mat=m.nextInt();
				
			}
		}
		*/

	}

}
