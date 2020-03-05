package ejercicio1;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		Scanner sn = new Scanner(System.in);
		boolean salir = false;
		boolean salir2 = false;
		int opcion;
		CuentaCorriente cc=new CuentaCorriente(new Persona(null, null, null), 00000);
		CuentaAhorro ca=new CuentaAhorro(new Persona(null, null, null), 00000, 0, 0);
		
		while(!salir) {
			System.out.println("1. Elegir tipo de cuenta"
					+ "\n2. Salir"
					+ "\nEscribe una de las opciones");
			opcion=sn.nextInt();
			switch(opcion) {
			case 1:
				System.out.println("1. Cuenta Corriente"
						+ "\n2. Cuenta de Ahorro"
						+ "\nElija opcion:");
				int cuenta=sn.nextInt();
				switch(cuenta) {
				case 1:
					while(!salir2) {
						System.out.println("1. Crear cuenta en 0"
								+ "\n2. Ingresar dinero"
								+ "\n3. Retirar saldo"
								+ "\n4. Actualizando saldo"
								+ "\n5. Salir"
								+ "\nElija opcion:");
						int op=sn.nextInt();
						switch(op) {
						case 1:
							System.out.println("Introduce nombre:");
							String nom=sn.next();
							sn.nextLine();
							System.out.println("Introduce appellido:");
							String apll=sn.next();
							System.out.println("Introduce NIF:");
							String nif=sn.next();
							System.out.println("Introduce numero de cuenta:");
							long num=sn.nextLong();
							
							cc=new CuentaCorriente(new Persona(nom, apll, nif), num);
							System.out.println(cc.toString());
							break;
						case 2:
							System.out.println("Incrementa saldo:");
							double saldoin=sn.nextDouble();
							cc.setIngresar(saldoin);
							System.out.println(cc.toString());
							break;
						case 3:
							System.out.println("Retirar saldo:");
							double saldore=sn.nextDouble();
							cc.setRetirar(saldore);
							System.out.println(cc.toString());
							break;
						case 4:
							System.out.println("Actualizando saldo...");
							cc.getactualizarSaldo();
							System.out.println(cc.toString());
						case 5:
							salir2= true;
							break;
						}
					}
				case 2:
					while(!salir2) {
						System.out.println("1. Crear cuenta en 0"
								+ "\n2. Ingresar dinero"
								+ "\n3. Retirar saldo"  
								+ "\n4. Actualizando saldo"
								+ "\n5. Cambiar interes" 
								+ "\n6. Salir"
								+ "\nElija opcion:");
						int op=sn.nextInt();
						switch(op) {
						case 1:
							System.out.println("Introduce nombre:");
							String nom2=sn.next();
							sn.nextLine();
							System.out.println("Introduce appellido:");
							String apll2=sn.next();
							System.out.println("Introduce NIF:");
							String nif2=sn.next();
							System.out.println("Introduce numero de cuenta:");
							long num2=sn.nextLong();
							System.out.println("Ingresar interes:");
							double in=sn.nextLong();
							System.out.println("Ingresar interes:");
							double min=sn.nextLong();
							
							ca=new CuentaAhorro(new Persona(nom2, apll2, nif2), num2, in, min);
							System.out.println(ca.toString());
							break;
						case 2:
							System.out.println("Incrementa saldo:");
							double incsaldo=sn.nextDouble();
							ca.setIngresar(incsaldo);
							System.out.println(ca.toString());
							break;
						case 3:
							System.out.println("Retirar saldo:");
							double resaldo=sn.nextDouble();
							ca.setRetirarDinero(resaldo);
							System.out.println(ca.toString());
							break;
						case 4:
							System.out.println("Actualizando saldo...");
							ca.getactualizarSaldo();
							System.out.println(ca.toString());
							break;
						case 5:
							System.out.println("Ingresa nuevo interes:");
							double inte=sn.nextDouble();
							ca.setInteres(inte);
							ca.getactualizarSaldo();
							System.out.println(ca.toString());
							break;
						case 6:
							salir2= true;
							break;
						}
					}	
				}
				break;
			case 2:
				salir= true;
				break;
			default:
				System.out.println("Solo números entre 1 y 5");
			}
		}
	}

}
