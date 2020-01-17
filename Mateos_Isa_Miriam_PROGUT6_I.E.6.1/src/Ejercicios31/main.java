package Ejercicios31;

import java.util.Scanner;

import Ejercicios31.BarcoBatalla;
import Ejercicios31.Intercepto;
import Ejercicios31.Patrulla;
import Ejercicios31.Portaaviones;
import Ejercicios31.CampoBatalla;
import Ejercicios31.Coordenada;
/**
 * 
 * @author Miriam
 *
 */
public class main {

	public static void main(String[] args){
		Scanner t = new Scanner(System.in);
		int corX = 0;
		int corY = 0;
		Coordenada disparo;
		CampoBatalla campo = new CampoBatalla();
		
		//Barco 1
		BarcoBatalla bb = new BarcoBatalla(true);
		//Barco 2
		Intercepto inter = new Intercepto(false);
		//Barco 3
		Patrulla pat = new Patrulla(false);
		//Barco 4
		Portaaviones porta = new Portaaviones(true);
		
		//Agregar barcos
		campo.agregarBarco(bb);
		campo.agregarBarco(inter);
		campo.agregarBarco(pat);
		campo.agregarBarco(porta);
		
		//Imprimir barcos
		campo.mostrarBarcos();
		
		while(!(bb.verficarHundimiento() && inter.verficarHundimiento() && pat.verficarHundimiento() && porta.verficarHundimiento())){
			System.out.println("Dame coordenada X");
			corX = t.nextInt();
			System.out.println("Dame coordenada Y");
			corY = t.nextInt();
			disparo = new Coordenada(corX,corY);
			System.out.println("Tu disparo fue en: " + disparo);
			
			campo.disparar(disparo);
			
			
		}
		
	}
}
