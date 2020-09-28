package EJE2;

import java.io.File;
import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Scanner;

import EJE2.Departamento;
/**
 * 
 * @author Miriam
 *
 */
public class Main {

	public static void main(String[] args) {
		 
		Funcionalidad fdat = new Funcionalidad();
		
		Scanner sn = new Scanner(System.in);
	       boolean salir = false;
	       int opcion; //Guardaremos la opcion del usuario
	       
	       ArrayList <Departamento> departamento = new ArrayList <Departamento>();
	       
	       Departamento v = null;
	       int cont=1;
	       
	       boolean bor = false;
	       boolean ania = false;
	       
	       //compueva si el fichero ya existe
	       File archivo = new File("Departamentos.dat");
	       if (!archivo.exists()) {
	           System.out.println("OJO: ¡¡No existe el archivo de configuración!!\n");
	       }else {
	    	   fdat.imprimir(departamento);
	    	   cont=(fdat.CodigoID()+1);
	    	   System.out.println("El fichero ya existe\n");
	    	   
	       }
	       
	       while(!salir){
	           System.out.println("=====================================================\n"
	           		+ "      =========Gestion de Videojuegos=========      "
	           		+ "\n=====================================================\n");
	           System.out.println("1.- Introducir."
	           		+ "\n2.- Listar"
	        		+ "\n3.- Modificar"
	           		+ "\n4.- Borrar"
	           		+ "\n5.- Guardar datos en fichero."
	           		+ "\n6.- Recuperar datos desde Fichero."
	           		+ "\n"
	           		+ "\n0.- Salir de la aplicacion.");
	           try { 
	        	   System.out.println("====================================================="
	        			   + "\nIntroduzca la opcion elegida:");
	        	   opcion = sn.nextInt();
	           
	        	   switch(opcion){
	        	   case 1:
	        		   
	        	            System.out.println("Introduzca numero de departamento:(entero)");
	        	            int id=sn.nextInt();
	        	            System.out.println("Nombre del departamento:");
	        	            String nombre=sn.next();
	        	            System.out.println("\n");
	        	            System.out.println("Localidad del departamento:");
	        	            String localidad=sn.next();
	        	            sn.nextLine();
	        	            
	        	            try {
	        	     		   
	        	     		   departamento.add(v = new Departamento(id, nombre, localidad));
	        	     		   
	        	     		} catch (Exception e) {
	        	     			System.err.println("Se Produjo un Error!!!  "+e.getMessage());
							}
	        	            
	        	            ania=true;
	        		   break;
	        	   case 2:
	        		   
	        		   int total = 0;
	        		   for(int i=0; i<departamento.size(); i++) {
	        			   System.out.println(departamento.get(i).Mostrar());
	        			   System.out.println("\n");
	        			   total=i+1;
	        		   }
	        		   System.out.println("Total de departamntos: "+total);
	        		   
	        		   break;
	        	   case 3:
	        		   
	        		   System.out.println("Codigo de departamento a modificar: ");
	        		   int modificar=sn.nextInt();
	        		   
	        		   for(int i=0; i<departamento.size(); i++) {
	        			   if(i==(modificar-1)) {
	        				   System.out.println(departamento.get(i).Mostrar());
	        			   }
	        		   }
	        		   
	        		   System.out.println("¿Desea continuar con la modificacion? (S/N):");
	        		   String md=sn.next();
	        		   
	        		   if(md.equals("S") || md.equals("s")) {
	        			   departamento.remove(modificar-1);
	        			   System.out.println("Nombre del departamento:");
	        	            String nomb=sn.next();
	        	            System.out.println("\n");
	        	            System.out.println("Localidad del departamento:");
	        	            String local=sn.next();
	        	            sn.nextLine();
	        	            
	        	            departamento.add(v=new Departamento(modificar, nomb, local));
	        	            
	        		   }else {
	        			   System.out.println("Cancelando la modificacion.\n");
	        		   }
	        		   
	        		   break;
	        	   case 4:
	        		   
	        		   System.out.println("Codigo de departamento a borra: ");
	        		   int borrar=sn.nextInt();
	        		   
	        		   System.out.println("Se va a proceder a borrar de la lista:");
	        		   
	        		   for(int i=0; i<departamento.size(); i++) {
	        			   if(i==(borrar-1)) {
	        				   System.out.println(departamento.get(i).Mostrar());
	        			   }
	        		   }
	        		   
	        		   System.out.println("¿Desea continuar con el borrado? (S/N):");
	        		   String ns=sn.next();
	        		   
	        		   if(ns.equals("S") || ns.equals("s")) {
	        			   departamento.remove(borrar-1);
	        		   }else {
	        			   System.out.println("Cancelando Borrado.\n");
	        		   }
	        		   
	        		   bor=true;	        		   
	        		   break;
	        	   case 5:
	        		   fdat.guardar(departamento);
	        		   break;
	        	   case 6:
              	
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
	        				   String fichero = "Departamentos.dat";
	        				   
	        				   fdat.imprimir(departamento);
	        				   
	        				   
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
	        		   System.out.println("Solo números entre 1 y 6");
	        	   }
	           } catch (InputMismatchException e) {
	                	System.out.println("Debes insertar un número");
	                	sn.next();   
	           }
	     }
	       
	     
	 /* final String RUTA="Departamentos.dat";
		
		String numero=JOptionPane.showInputDialog("Introduce el numero de departamento");
        int num=(int) Double.parseDouble(numero);
		String nombre=JOptionPane.showInputDialog("Introduce el nombre");
        String localidad=JOptionPane.showInputDialog("Introduce la localidad");
        
        try(DataOutputStream dos=new DataOutputStream(new FileOutputStream(RUTA,true));
                DataInputStream dis=new DataInputStream(new FileInputStream(RUTA))){
 
        	fdat.introduceDatos(dos, num, nombre, localidad);
 
        	fdat.muestraDatos(dis);
            
        	InputStreamReader leer = new InputStreamReader(System.in);
        	BufferedReader buff = new BufferedReader(leer);
        	 
        	int departamentoAModificar = 99999;
        	int datoAModificar = 99999;
        	 
        	while(departamentoAModificar!=0){
        	 System.out.print("Escriba el numero del departamento a MODIFICAR en el caso de no querer modificar introduzca el numero cero: ");
        	 departamentoAModificar = Integer.parseInt(buff.readLine());
        	 if(departamentoAModificar!=0){
        	  System.out.println("Si desea modificar el nombre del departamento   introduzca 1, si desea modificar la localidad 2");
        	  datoAModificar = Integer.parseInt(buff.readLine());
        	  Departamento dep = leidos.get(departamentoAModificar);
        	  if(datoAModificar==1){
        	   System.out.println("Introduce el nuevo nombre del departamento");
        	   dep.setNombre(buff.readLine());
        	  }
        	  if(datoAModificar==2){
        	   System.out.println("Introduce el nuevo lugar del departamento");
        	   dep.setLocalidad(buff.readLine());
        	  }
        	 
        	 }
        	}                        
            
        }catch(EOFException e){
 
        }catch(IOException e){
            JOptionPane.showMessageDialog(null, "Error: "+e.getMessage() , "Error", JOptionPane.ERROR_MESSAGE);
        }
		
        InputStreamReader leer = new InputStreamReader(System.in);
    	BufferedReader buff = new BufferedReader(leer);
        
        int departamentoAModificar = 99999;
    	int datoAModificar = 99999;
    	
        while(departamentoAModificar!=0){
         System.out.print("Escriba el numero del departamento a ELIMINAR en el caso de no querer eliminar introduzca el numero cero: ");
         departamentoAModificar = Integer.parseInt(buff.readLine());
         if(departamentoAModificar!=0){
          boolean departamentoEncontrado = false;
          int departamentoPorElQueVoy = 0;
          Departamento dep = null;
         
          while(departamentoEncontrado==false &amp;&amp;    departamentoPorElQueVoy&lt;leidos.size()){
           dep = leidos.get(departamentoPorElQueVoy);
           departamentoPorElQueVoy++;
           if(dep.getNumeroDeDepartamento()==departamentoAModificar){
            departamentoEncontrado = true;
           }
          }
        if(departamentoEncontrado==false){
         System.out.println("============================\nDepartamento no  encontrado\n============================");
        }
        boolean remove = leidos.remove(dep);
         
         
        }
        }
        */
	}
	
}
