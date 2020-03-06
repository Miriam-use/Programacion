package ejercicio4;

import java.util.Scanner;

public class Main {

	Scanner sc; 
	static int op,libro,revis;
	Libro t[]=new Libro[3]; 
	Revista tab[]=new Revista[2];
	
	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		Main a=new Main();
		
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
		a.menu();       
		sc.close();
	}
	
	public void menu(){
		sc=new Scanner(System.in);
		do{ 
			do{ 
				System.out.print("\nMENU:\n1. REGISTRAR LIBRO\n2. REGISTRAR REVISTA\n"
						  + "3. VISUALIZAR COLECCION\n0. SALIR\n    Introduce una opcion: ");
				op=sc.nextInt();
			}while (op<0 || op>3);
			switch (op) {
			case 1:  
				cargarLibro(t);
				break; 
			case 2:             
				cargarRevis(tab);     
				break; 
			case 3:             
				verLibros(t);             
				verRevis(tab); 
				break; 
			case 0:             
				System.out.println("¡HASTA PRONTO!"); 
				break;
			}
		}while(op!=0);
	}
	
	public void cargarLibro(Libro t[]){
		sc=new Scanner(System.in);
		Libro l=new Libro(); 
		int c=0;
		for(int i=0;i<t.length;i++) {
			if (t[i]==null) {
				c++;
			}
			if (c>0){
				System.out.print("Introduce codigo del libro: "); 
				String cod=sc.nextLine();
				l.setCod(cod);
				System.out.print("Introduce titulo: ");
				String tit=sc.nextLine();
				l.setTit(tit);
				System.out.print("Introduce año de publicacion: ");
				String fecha=sc.next();
				l.setFecha(fecha);
				sc.nextLine();
				t[t.length-c]=new Libro(tit, cod, fecha, false); 
				System.out.println();
			}else {
				System.out.println("No se pueden introducir mas libros"); 
			}
		}
	}
	
	public void cargarRevis(Revista tab[]){
		sc=new Scanner(System.in);
		Revista r=new Revista();
		int c=0;
		for(int i=0;i<tab.length;i++) {
			if (tab[i]==null) {
				c++;
			}
		}
		if (c>0){
			System.out.print("Introduce codigo de la revista: ");
			String cod=sc.next(); 
			System.out.print("Introduce titulo: ");
			String tit=sc.next();
			System.out.print("Introduce año de publicacion: ");
			String fecha=sc.next();
			System.out.print("Introduce nº de revista: ");
			int num=sc.nextInt(); 
			tab[tab.length-c]=new Revista(tit, cod, fecha, num);
		}else {
			System.out.println("No se pueden introducir mas libros");
		}
	}
	
	public void verLibros(Libro t[]){ 
		System.out.println("\nLISTADO LIBROS"); 
		if(t[0]==null) {
			System.out.println("    No hay libros"); 
		}else {
			for (int i=0;i<t.length;i++) {
				if (t[i]!=null) {
					System.out.print(t[i]+"\n"); 
				}
			}
		}
	}
	
	public void verRevis(Revista tab[]){ 
		System.out.println("\nLISTADO REVISTAS");
		if(tab[0]==null) {
			System.out.println("    No hay revistas");
		}else {
			for (int i=0;i<tab.length;i++) {
				if (t[i]!=null) {
					System.out.print(tab[i]+"\n");
				}
			}
		}
	}
}
