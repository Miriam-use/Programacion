package HashMap;

import java.util.HashMap;
import java.util.Scanner;
/**
 * 
 * @author Miriam
 *
 */
public class Banco {

	static Scanner sc;
	
/**
 * 	
 * @param args
 */
	public static void main(String[] args) {

		
		sc=new Scanner (System.in);
		int opcion;
		
		do {
			menu();
			opcion = sc.nextInt();
			
			switch(opcion) {
			case 1:
				NuevoCliente();
				break;
			case 2:
				
				break;
			case 0:
				System.out.println("Gracias!!!!! por usar este programa");
				break;
			default:
				System.out.println("Introduce un valor entre 0 y 6");
			}
			
		}while(opcion!=0);
		sc.close();
	}
/*
 * metodo que muestra menu	
 */
	public static void menu() {
		System.out.println("********MENU*********\n"
				+"1. Nuevo cliente\n"
				+ "2. Listar clientes\n"
				+ "3. Eliminar clientes por DNI\n"
				+ "4. Ingresar dinero\n"
				+ "5. Sacar dinero\n"
				+ "6. Consultar saldo\n"
				+ "0. Salir\n"
				+ "Introduzca una opcion:");
	}
	
	public static void NuevoCliente() {
		
	}
}
