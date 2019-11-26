package Eje15_CajeroAutomático;

import java.util.Scanner;

public class MainCuenta {

	public static void main(String[] args) {
		
		Cuenta cuen = new Cuenta();
		Scanner dat = new Scanner(System.in);
		boolean salir = false;
		/**
		 * <h2>Crea un menu que pide que de a una opcion del menu</h2>
		 * 
		 * Buscar informacion de javadoc en <a href="http://google.com">GOOGLE</a>
		 * @version 1-2019
		 * @author Miriam
		 * @since 26-11-2019
		 */		
		while(!salir) {
			System.out.println("1.-Crear cuenta vacía");
			System.out.println("2.-Crear cuenta con saldo inicial");
			System.out.println("3.-Ingresar dinero");
			System.out.println("4.-Sacar dinero");
			System.out.println("5.-Ver saldo");
			System.out.println("6.-Salir");
			
			System.out.println("¿Que quieres hacer?");
			int opcion=dat.nextInt();
			
			switch(opcion) {
			case 1:
				System.out.println("Cuenta creada. Saldo 0 euros");
				break;
			case 2:
				System.out.println("Ingrese cantida inicial:");
				float saldo=dat.nextFloat();
				cuen.setSaldo(saldo);
				System.out.println("Cuenta creada, con saldo "+cuen.getSaldo()+" euros");
				break;
			case 3:
				System.out.println("Ingrese cantida:");
				float ingresa=dat.nextFloat();
				cuen.setIngresar(ingresa);
				System.out.println("Ingresar saldo. Su saldo es: "+cuen.getSaldo()+" euros");
				break;
			case 4:
				System.out.println("Cantidad que quiera retirar:");
				float retira=dat.nextFloat();
				cuen.setExtraer(retira);
				System.out.println("Retirada de saldo. Su saldo es: "+cuen.getSaldo()+" euros");
				break;
			case 5:
				System.out.println("Su saldo actual es de: "+cuen.getSaldo()+" euros");
				break;
			case 6:
				System.out.println("Esta saliendo...");
				salir=true;
				break;
			default:
				System.out.println("Solo números entre 1 y 6");
			}
		}
	}

}
