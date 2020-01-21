package ColeccionesArrayList;

import java.util.ArrayList;
import java.util.Scanner;

/**
 * 
 * @author Miriam
 *
 */
public class VentasUso {

	static Scanner sc;
	static ArrayList<Ventas> Venta;
	
	public static void main(String[] args) {
		
		Venta = new ArrayList<>();
		sc=new Scanner (System.in);
		int opcion;
		
		do {
			// Al inicio de cada iteración mostramos el menú, y recogemos la opción
			menu();
			opcion = sc.nextInt();
			
			switch(opcion) {
			case 1: 
				introducirVentas();
				break;
			case 2:
				mostrarVentas();
				break;
			case 3:
				sumaAnio();
				break;
			case 4:
				sumaA();
				break;
			case 5:
				masVenta();
				break;
			case 6:
				System.out.println("Gracias!!!!! por usar este programa");
				break;
			default:
				System.out.println("Introduce un valor entre 1 y 6");
			}
			
		}while(opcion != 6);
		sc.close();
	}
/*
 * metodo imprime menu
 */
	public static void menu() {
		System.out.println("********MENU*********\n"
				+ "1. Introducir las ventas de cada mes\n"
				+ "2. Mostrar las ventas\n"
				+ "3. Mostrar suma total del año\n"
				+ "4. Mostrar suma total de los meses que empiecen por A\n"
				+ "5. Mes con más ventas\n"
				+ "6. Salir del programa\n"
				+ "Introduzca una opcion:");
	}
/*
 * metodo que nos pide ingresar el mes
 * y las ventas	
 */
	public static void introducirVentas() {
		for(int i=0; i<4; i++) {
			System.out.println("Introduce nombre del mes:");
			String m=sc.next();
			System.out.println("Introduce ventas del mes:");
			double vc=sc.nextDouble();
			
			Venta.add(new Ventas(m, vc));
			
			System.out.println("");
		}
	}
/*
 * metodo que nos muestra los meses y sus ventas	
 */
	public static void mostrarVentas() {
		System.out.println("\n***Ventas del año***");
		if(Venta.isEmpty()) {
			System.out.println("No hay registros de ventas\n");
		}else {
			for(int i=0; i<Venta.size(); i++) {
				Ventas v = Venta.get(i);
				System.out.printf("%s (%s) %n", v.getMes(), v.getVentasCoche());
			}
		}
		System.out.println("");
	}
/*
* metodo que suma todas las ventas del año	
*/
	static double suma=0;
	public static void sumaAnio() {
		if(Venta.isEmpty()) {
			System.out.println("No hay registros de ventas\n");
		}else {
			for(Ventas v : Venta) {
				suma+=v.getVentasCoche();
			}
		}
		System.out.println("Suma total del año: "+suma);
	}
/*
 * 	metodo que suma todas las ventas de los meses que empiezan en A
 */
	static double sumaA=0;
	public static void sumaA() {
		if(Venta.isEmpty()) {
			System.out.println("No hay registros de ventas\n");
		}else {
			for(int i=0; i<Venta.size(); i++) {
				if(Venta.get(i).getMes().charAt(0)=='A' || Venta.get(i).getMes().charAt(0)=='a') {
					sumaA+=Venta.get(i).getVentasCoche();
				}
			}
		}
		System.out.println("Para los meses que empiezan por A vendieron un total de: "+sumaA);
	}
/*
 * metodo que saca el mes con mas ventas	
 */
	static String mesMax;
	public static void masVenta() {
		if(Venta.isEmpty()) {
			System.out.println("No hay registros de ventas\n");
		}else {
			for(Ventas v : Venta) {
				double max=0;
				if(v.getVentasCoche()>max) {
					mesMax=v.getMes();
				}
			}
		}
		System.out.println("El mes con mas ventas es: "+mesMax);
	}
	
}
