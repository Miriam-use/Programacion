package ejercicio2;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sn = new Scanner(System.in);
		boolean salir = false;
		int opcion;
		
		while(!salir) {
			System.out.println("1.) Moderedor"
					+"\n2.) Administrador"
					+ "\n3.) Salir"
					+ "\nElige opcion pare empezar:");
			opcion=sn.nextInt();
			
			switch(opcion) {
			case 1:
				Moderador mod = new Moderador();
					
				mod.setIncrementar();
				System.out.println(mod.MostrarM());
				
				mod.setDecrementa();
					
				System.out.println("Ingrese nuevo correo:");
				String correo=sn.next();
				mod.setModificaCorreo(correo);
				
				System.out.println("Ingrese nuevo nick:");
				String nick=sn.next();
				mod.setModificaNick(nick);
						
				mod.setPapelerainc();
						
				System.out.println(mod.MostrarM());
				break;
				
			case 2:
				Administrador adm = new Administrador();
				
				adm.setIncrementar();
				System.out.println(adm.MostrarA());
					
				adm.setDecrementa();
					
				System.out.println("Ingrese nuevo correo:");
				String cor=sn.next();
				adm.setModificaCorreo(cor);
				
				
				System.out.println("Ingrese nuevo nick:");
				String nic=sn.next();
				adm.setModificaNick(nic);
						
				adm.setPapelerainc();
				
				adm.setBaneosinc();
						
				System.out.println(adm.MostrarA());
				break;
				
			case 3:
				System.out.println("Saliendo...");
				salir=true;
				break;
			}
		}
	}

}
