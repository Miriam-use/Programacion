package ejercicio5;

import java.util.ArrayList;
import java.util.Scanner;
/**
 * 
 * @author Miriam
 *
 */
public class Main {
	
	static ArrayList<Comercial>comercial = new ArrayList<>();
	static ArrayList<Directivo>directivo = new ArrayList<>();
	
	static Scanner sc;
	
	public static void main(String[] args) {
		
		sc = new Scanner(System.in);
		
		boolean salir = false;
		int opcion;
		
		while(!salir) {
			System.out.println("1.) Comercial"
					+"\n2.) Directivo"
					+ "\n0.) Salir"
					+ "\nElige opcion pare empezar:");
			opcion=sc.nextInt();
			switch(opcion) {
			case 1:
				System.out.println("Nombre:");
				String nombre=sc.next();
				System.out.println("DNI:");
				String dni=sc.next();
				
				System.out.println("Saldo:");
				double saldo=sc.nextDouble();
				System.out.println("Importe de venta:");
				int importe=sc.nextInt();
				
				comercial.add(new Comercial(nombre, dni, saldo, importe));
				
				Retencion(saldo);
				
				System.out.println("Hijos?:");
				int hijo=sc.nextInt();
				
				Gratificacion(hijo, saldo);
				System.out.println(comercial.get(0).calcularSaldo());
				System.out.println(comercial.get(0).toString());
				break;
				
			case 2: 
				System.out.println("Nombre:");
				String nom=sc.next();
				System.out.println("DNI:");
				String d=sc.next();
				
				System.out.println("Saldo:");
				double saldos=sc.nextDouble();
				System.out.println("Comicion:");
				int comicion=sc.nextInt();
				
				directivo.add(new Directivo(nom, d, saldos, comicion));
				
				Retencion(saldos);
				
				System.out.println("Hijos?:");
				int hijos=sc.nextInt();
				
				Gratificacion(hijos, saldos);
				System.out.println(directivo.get(0).calcularSaldo());
				System.out.println(directivo.get(0).toString());
				break;
				
			case 0:
				System.out.println("Saliendo...");
				salir=true;
				break;
			}
		}

	}

	public static void Retencion(double sueldo){
		if(sueldo<1000) {
			System.out.println("Su retencion es de 12%");
			sueldo-=0.12;
		}else {
			if(sueldo>=1000 && sueldo<1500) {
				System.out.println("Su retencion es de 15%");
				sueldo-=0.15;
			}else {
				if(sueldo>=1500 && sueldo<2500) {
					System.out.println("Su retencion es de 18%");
					sueldo-=0.18;
				}else {
					System.out.println("Su retencion es de 20%");
					sueldo-=0.20;
				}
			}
		}
	}
	
	public static void Gratificacion(int hijo, double sueldo) {
		if(hijo==0) {
			System.out.println("No tiene gratificacion");
		}else {
			if(hijo>=1 && hijo<=3) {
				System.out.println("Tiene gratificacion de 200 euros");
				sueldo+=200;
			}else {
				System.out.println("Tiene gratificacion de 300 euros");
				sueldo+=300;
			}
		}
	}
}
