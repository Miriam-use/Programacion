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
		
		
		
			String texto = "Pepe,Rodrigue,5"
					  +"\nAna,Barragan,6"
					 +"\nSara,Perez,4"
					 +"\nPaco,Mateos,8";
		
			escribirFichero("Alumno.txt", texto);
			
			mostrarFicheroMay("Alumno.txt");
			
			calcularNota(texto);
			
    }
/**
 * 	
 * @param nomFich
 */
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
/**
 * 	
 * @param texto
 */
	public static void calcularNota(String texto) {
		char[] nota = texto.toCharArray();
		String not="";
		
		for(int i=0; i<nota.length; i++) {
			if(Character.isDigit(nota[i])) {
				not+=nota[i];
			}
		}
		
		int n = Integer.parseInt(not);
		double suma=0;
		while(n>0) {
			suma += n % 10;
			n = n /10;
			}

		System.out.println("Media de notas: " +  suma/4);  //imprime suma
    }
/**
 * 	
 * @param nomFich
 * @param texto
 */
	public static void escribirFichero(String nomFich, String texto){
        try(FileWriter fw=new FileWriter(nomFich);){
        	
        		fw.write(texto);	
 
        }catch(IOException e){
            System.out.println("Problemas en la escritura E/S "+e);
        }
	}
}
