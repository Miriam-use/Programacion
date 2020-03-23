package ejercicio6;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.JOptionPane;

/**
 * 
 * @author Miriam
 *
 */
public class Alumno {

	/* DATOS DE EJEMPLO
	 * Pepe,Rodrigue,5
	 * Ana,Barragan,6
	 * Sara,Perez,4
	 * Paco,Mateos,8
	 */
	
	public static void main(String[] args) {
		
		double media = 0;
		
		for(int i=0; i<4; i++) {
			String nom=JOptionPane.showInputDialog("Nombre:");
			String apell=JOptionPane.showInputDialog("Apellido:");
			String not=JOptionPane.showInputDialog("Nota Media:");
		
			String[] texto= {nom+","+apell+","+not};
		
			escribirFichero("Alumno.txt", texto);
			
			int numEntero = Integer.parseInt(not);
			
			media+=numEntero;
			
			mostrarFicheroMay("Alumno.txt");
		}
        
        	System.out.println("\nMedia de notas: "+media/4);
 
    }
	
	public static void escribirFichero(String nomFich, String[] texto){
        try(FileWriter fw=new FileWriter(nomFich);){
        	
        	for (String textos : texto) {
        		fw.write(textos+"\n");
			}	
        		fw.close();
 
        }catch(IOException e){
            System.out.println("Problemas en la escritura E/S "+e);
        }
     
    }
	
	public static void mostrarFicheroMay(String nomFich){
		FileInputStream f=null;
		String s="";
		char c;
		try{
			f=new FileInputStream(nomFich);
			int size = f.available();
			for (int i=0;i<size;i++){
				c=(char)f.read();
				s=s+c;
			}
		}catch (FileNotFoundException fnf){
			System.err.println("Fichero no encontrado");
		}catch (IOException e) {
			System.err.println("Se ha producido una IOException");
			e.printStackTrace();
		}catch (Throwable e) {
			System.err.println("Error de programa: "+e);
			e.printStackTrace();
		}finally{
			System.out.println(s);
			try{
				f.close();
			}catch(IOException e){
				System.err.println("Se ha producido una IOException");
				e.printStackTrace();
			}
		}
    }
}
