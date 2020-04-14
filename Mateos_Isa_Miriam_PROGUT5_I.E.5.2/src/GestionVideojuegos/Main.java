package GestionVideojuegos;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.PrintWriter;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * 
 * @author Miriam
 *
 */
public class Main {

	public static void main(String[] args) {
		
		/**Obtenemos la fecha del sistema y la convertirmos al String
		  *  con el formato en el que vamos a trabajar*/
		Date fechaActual = new Date();
	    SimpleDateFormat formateador = new SimpleDateFormat("dd/MM/yyyy");
	    String fechaSistema=formateador.format(fechaActual);
		
		   Scanner sn = new Scanner(System.in);
	       boolean salir = false;
	       int opcion; //Guardaremos la opcion del usuario
	       
	       ArrayList <Videojuegos> videojuego = new ArrayList <Videojuegos>();
	       
	       PlataformaLista p = new PlataformaLista();
	       Funciondat fdat = new Funciondat();
	       String[] pl = p.Lista();
	       Videojuegos v = null;
	       int cont=1;
	       
	       boolean bor = false;
	       boolean ania = false;
	       
	       /**
	        * Comprovar si el fichero existe
	        */
	       File archivo = new File("videojue.dat");
	       if (!archivo.exists()) {
	           System.out.println("OJO: ¡¡No existe el archivo de configuración!!\n");
	       }else {
	    	   fdat.imprimir(videojuego);
	    	   System.out.println("El fichero ya existe\n");
	    	   
	       }
	       
	       
	       while(!salir){
	           System.out.println("=====================================================\n"
	           		+ "      =========Gestion de Videojuegos=========      "
	           		+ "\n=====================================================\n");
	           System.out.println("1.- Añadir un videojuego."
	           		+ "\n2.- Listar videojuegos."
	           		+ "\n3.- Borrar un videojuego"
	           		+ "\n4.- Guardar datos en fichero."
	           		+ "\n5.- Recuperar datos desde Fichero."
	           		+ "\n"
	           		+ "\n0.- Salir de la aplicacion.");
	           try { 
	        	   System.out.println("====================================================="
	        			   + "\nIntroduzca la opcion elegida:");
	        	   opcion = sn.nextInt();
	           
	        	   switch(opcion){
	        	   case 1:
	        		   
	        	            System.out.println("Introduzca los datos del videojuego:");
	        	            System.out.println("Nombre del videojuego:");
	        	            String nombre=sn.next();
	        	            System.out.println("\n");
	        	            System.out.println("Plataforma principal:");
	        	            String plataforma=sn.next();
	        	            sn.nextLine();
	        	            System.out.println("\n");
	        	            System.out.println("Fecha de lanzamiento: (DD/MM/YYYY)");
	        	            String fecha=sn.next();
	        	            
	        	            try {
	        	     		   /**Obtenemos las fechas enviadas en el formato a comparar*/
	        	     		   SimpleDateFormat formatear = new SimpleDateFormat("dd/MM/yyyy"); 
	        	     		   Date fechaDate1 = formateador.parse(fecha);
	        	     		   Date fechaDate2 = formateador.parse(fechaSistema);
	        	     		//Se verifica la fecha, la plataforma y se crea el objeto Videojuegos
	        	     		   
	        	     			   for(int i=0; i<pl.length; i++) {
	        	     				   if(pl[i].equals(plataforma)) {
	        	     					  
	        	     					 if ( fechaDate1.before(fechaDate2) ){
	        	     						 
	        	     						videojuego.add(v = new Videojuegos(cont++, nombre, plataforma, fecha));
	        	     						 
	        	     					}else{
	        	     						
	   	        	    			     if ( fechaDate2.before(fechaDate1) ){
	   	        	    			    	 System.err.println("Error en los datos de fecha");
	   	        	    			     }
	   	        	    			     
	   	        	    			    }
	        	     					 
	        	     				   }
	        	     			   }
	        	     			  
	        	     		  
	        	    			  } catch (ParseException e) {
	        	    			   System.out.println("Se Produjo un Error!!!  "+e.getMessage());
	        	    			  }
	        	            
	        	            ania=true;
	        		   break;
	        	   case 2:
	        		   
	        		   int total = 0;
	        		   for(int i=0; i<videojuego.size(); i++) {
	        			   System.out.println(videojuego.get(i).Mostrar());
	        			   System.out.println("\n");
	        			   total=i+1;
	        		   }
	        		   System.out.println("Total de videojuegos: "+total);
	        		   
	        		   break;
	        	   case 3:
	        		   
	        		   System.out.println("Codigo de videojuego a borra: ");
	        		   int borrar=sn.nextInt();
	        		   
	        		   System.out.println("Se va a proceder a borrar de la lista:");
	        		   
	        		   for(int i=0; i<videojuego.size(); i++) {
	        			   if(i==(borrar-1)) {
	        				   System.out.println(videojuego.get(i).Mostrar());
	        			   }
	        		   }
	        		   
	        		   System.out.println("¿Desea continuar con el borrado? (S/N):");
	        		   String ns=sn.next();
	        		   
	        		   if(ns.equals("S") || ns.equals("s")) {
	        			   videojuego.remove(borrar-1);
	        		   }else {
	        			   System.out.println("Cancelando Borrado.\n");
	        		   }
	        		   
	        		   bor=true;	        		   
	        		   break;
	        	   case 4:
	        		   
	        		 // try {
     	            	
     	            	//Guardando ArrayList en el fichero videojuegos.dat
     	            	
     	            	/*ObjectOutputStream escribiendoFichero = new ObjectOutputStream(new FileOutputStream("videojue.dat"));
     	            	escribiendoFichero.writeObject(videojuego);
     	            	escribiendoFichero.close();*/
     	            	
     	            	fdat.guardar(videojuego);
     	            	
     	            	/*String ruta = "videojue.dat";
     	                File f = new File(ruta);
     	                FileWriter fw = new FileWriter(f);
     	                PrintWriter escritura = new PrintWriter(fw);
     	                for(int i=0;i<videojuego.size();i++){
     	                     escritura.println(videojuego.get(i).FicheroEscritura());
     	                }
     	                escritura.close();*/
     	            	
     	            	//System.out.println("Los datos se han guardado correctamente en el fichero videojue.dat");
     	                
     	          /*  } catch (Exception e) {
     	                System.out.println(e.getMessage());
     	            }*/
	        		   
	        		   break;
	        	   case 5:
              	
	        		   if(ania == true || bor ==true) {
	        			   System.out.println("Ha realizado cambios que no ha guardado en disco.\r\n" + 
	   	        		   		"Si continúa la carga del archivo se restaurarán los datos\r\n" + 
	   	        		   		"de disco y se perderán los cambios no guardados.\r\n" + 
	   	        		   		"¿Desea continuar con la carga y restaurar los datos del archivo? (S/N)");
	        			   
	        			   String s=sn.next();
	        			   if(s.equals("S") || s.equals("s")) {
	        				   /**
	        				    * Cargar el fichero
	        				    */
	        				   String fichero = "videojue.dat";
	        				   
	        				   fdat.imprimir(videojuego);
	        				   
	        				   
		        		   }else {
		        			   System.out.println("Cancelando la carga del archivo...");
		        		   }
	        		   }else {
	        			   
	        			   ania=false;
	        			   bor=false;
	        		   }
	        		   break;
	        	   case 0:
	        		   System.out.println("Salir...");
	        		   salir=true;
	        		   break;
	        	   default:
	        		   System.out.println("Solo números entre 1 y 5");
	        	   }
	           } catch (InputMismatchException e) {
	                	System.out.println("Debes insertar un número");
	                	sn.next();   
	           }
	     }
	}
}
