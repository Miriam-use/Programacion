package Eje14_Marciano;

import java.util.Scanner;

public class MainMarciano	{

	public static void main(String[] args) {
		
		
		Scanner m = new Scanner(System.in);
		
		System.out.println("Nombre del 1 marciano:");
		String nom=m.nextLine();
		Marciano et1 = new Marciano(nom);
		System.out.println(et1.getNace());
		
		System.out.println("Nombre del 2 marciano:");
		String nom2=m.nextLine();
		Marciano et2 = new Marciano(nom2);
		System.out.println(et2.getNace());
		
		System.out.println("Nombre del 3 marciano:");
		String nom3=m.nextLine();
		Marciano et3 = new Marciano(nom3);
		System.out.println(et3.getNace());
		
		System.out.println("Matar marciano 2");
		char mat=m.nextLine().charAt(0);
		et2.setMuere(mat);
		System.out.println(et2.getMuere());
		m.nextLine();
		
		System.out.println("¿Crear otro marciano?");
		boolean peticion=m.nextBoolean();
		
		if(peticion==true) {
		m.nextLine();
		System.out.println("Nombre del 4 marciano:");
		String nom4=m.nextLine();
		Marciano et4 = new Marciano(nom4);
		System.out.println(et4.getNace());		
		}
		
		
		
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
