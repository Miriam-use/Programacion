package ejercicio3_1;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.Scanner;

public class actividad3_1 {

	public static void main(String[] args) {
		
		InetAddress dir = null;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("INGRESA URL O IP: ");
		String url=sc.nextLine();
		
		System.out.println("========================================================");
		System.out.println("SALIDA DE BUSQUEDA");
		
		try {
			dir = InetAddress.getByName(url);
			pruebaMetodo(dir);
			
			//ARRAY DE TIPO INETADDRESS CON TODAS LAS DIRECCIONES IP
			//ASIGNADAS A LA URL O IP
			System.out.println("\tDIRECCION IP PARA: "+dir.getHostName());
			InetAddress[] direcciones = InetAddress.getAllByName(dir.getHostName());
			
			for(int i=0; i<direcciones.length; i++){
				System.out.println("\t\t"+direcciones[i].toString());
				
				System.out.println("========================================================");
			}
				
		}catch (UnknownHostException e) {
			e.printStackTrace();
		}
	}

	private static void pruebaMetodo(InetAddress dir) {
		System.out.println("\tDireccion IP de la maquina (host): "+dir);
		InetAddress dir2;
		try {
			dir2 = InetAddress.getLocalHost();
			System.out.println("\tDireccion IP de la maquina: "+dir2);
		}catch (UnknownHostException e) {
			e.printStackTrace();
		}
		
		//USAMOS METODOS DE LA CLASE
		System.out.println("\tNombre del host: "+dir.getHostName());
		System.out.println("\tDireccion IP del objeto: "+dir.getHostAddress());
		System.out.println("\tMetodo toString(): "+dir.toString());
		System.out.println("\tNombre canónico completo: "+dir.getCanonicalHostName());
	}
}


