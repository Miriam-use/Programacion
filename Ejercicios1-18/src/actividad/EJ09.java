package actividad;

import java.util.Scanner;

public class EJ09 {

	public static void main(String[] args) {
		
		Scanner eleccion = new Scanner(System.in);
		
		
		System.out.println("Introduce dos numeros:");
		int a=eleccion.nextInt();
		int b=eleccion.nextInt();
		
		System.out.println("Seleccione opcion:");
		System.out.println("(1) Sumar los numeros");
		System.out.println("(2) Restar los numeros");
		System.out.println("(3) Multiplicar los numetos");
		System.out.println("(4) Dividir los Numeros");
		System.out.println("(5) Salir del programa");
		int x=eleccion.nextInt();
		
		while(x!=5)
		{
			switch (x)
			{
				case 1 :
					System.out.println("Su suma es: "+(a+b));
					System.out.println("Vuelve a seleccionar otro:");
					x=eleccion.nextInt();
					break;
				case 2 :
					System.out.println("Su resta es: "+(a-b));
					System.out.println("Vuelve a seleccionar otro:");
					x=eleccion.nextInt();
					break;
				case 3 :
					System.out.println("Su multiplicacion es: "+(a*b));
					System.out.println("Vuelve a seleccionar otro:");
					x=eleccion.nextInt();
					break;
				case 4 :
					System.out.println("Su division es: "+(a/b));
					System.out.println("Vuelve a seleccionar otro:");
					x=eleccion.nextInt();
					break;
				default :
					System.out.println("No esta dentro de las opciones");
					System.out.println("Vuelve a seleccionar otro:");
					x=eleccion.nextInt();
					break;
			}
		}
		System.out.println("Salir");
		
		
	}

}
