package Eje14_Marciano;

import java.util.Scanner;
/**
 * <h2>Clase que nos permite crear y matar marcianos</h2>
 * @author Miriam
 * 
 */
public class Marte	{

	public static void main(String[] args) {
		
		
		Scanner m = new Scanner(System.in);
		Marciano alien = new Marciano(null);
		
		String [] et;
		et = new String[4];
		int j=1;
		
		for(int i=0; i<3; i++) {
			System.out.println("Nombre del "+(j++)+" marciano:");
			String nom=m.nextLine();
			et[i]=nom;
			Marciano alie = new Marciano(et[i]);
			System.out.println(alie.getNacer());
		}
		
		System.out.println("¿Matar al marciano "+et[1]+"?");
		boolean op=m.nextBoolean();
		alien.setMuerto(op);
		if(op==true) {
		alien.setMuer(et[1]);
		}
		m.nextLine();
		
		System.out.println("Nombre del 4 marciano:");
		String nom=m.nextLine();
		et[3]=nom;
		alien.setNacer(et[3]);
		System.out.println(alien.getNacer());
		m.nextLine();
		
		System.out.println("El marciano "+et[1]);
		alien.setestaVivo(et[1]);
		
		System.out.println("El marciano "+et[0]);
		alien.setestaVivo(et[0]);
		

	}

}
