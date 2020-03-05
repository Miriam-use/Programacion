package ejercicio4;

import java.util.Scanner;

public class Main {

	Scanner sc; 
	static int op,libro,revis;
	Libro t[]=new Libro[3]; 
	Revista tab[]=new Revista[2];
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		//AppMain a=new AppMain();
		
		//1ª parte
	//Libro l1=new Libro("B612","La Metarmorfosis",1915,false);    // ¿¿??
	//l1.toString();
	//Revista r1=new Revista("B613","El Buscon",1626,false);  // ¿¿??
	// r1.toString();
		//2ª parte - MENU
		System.out.print("¿Cuantos libros tienes? ");
		libro=sc.nextInt();       
		System.out.print("¿Cuantas revistas tienes? "); 
		revis=sc.nextInt();       
		//a.menu();       
		sc.close();
	}
	
	

}
