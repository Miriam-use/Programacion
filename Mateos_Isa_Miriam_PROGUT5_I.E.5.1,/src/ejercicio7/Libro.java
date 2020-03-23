package ejercicio7;

import java.io.FileWriter;
import java.io.IOException;

import javax.swing.JOptionPane;

/**
 * 
 * @author Miriam
 *
 */
public class Libro {

	public static void main(String[] args) {
        String cod=JOptionPane.showInputDialog("Introduce codigo del libro");
        String isbn=JOptionPane.showInputDialog("Introduce el ISBN del libro");
        String tit=JOptionPane.showInputDialog("Introduce el titulo del libro");
        String aut=JOptionPane.showInputDialog("Introduce el autor del libro");
        String edi=JOptionPane.showInputDialog("Introduce la editorial del libro");
        String anio=JOptionPane.showInputDialog("Introduce el año del libro");
        String carat=JOptionPane.showInputDialog("Introduce las caracteristica del libro");

        String texto=cod+";"+isbn+";"+tit+";"+aut+";"+edi+";"+anio+";"+carat;
        
        
        if(escribirFichero("Libro.txt", texto)==true) {
        	
        	char[] codigo = texto.toCharArray();
    		String n="";
    		
    			if(Character.isDigit(codigo[0])) {
    				n+=codigo[0];
    			}
    		
    		if(n.equals(cod)) {
    			escribirFichero("Libro.txt", texto);
    		}else {
    			System.out.println("El codigo ya existe");
    		}
        }else {
        	escribirFichero("Libro.txt", texto);
        }
 
    }
	
	public static boolean escribirFichero(String nomFich, String texto){
        try(FileWriter fw=new FileWriter(nomFich);){
 
        		fw.write(texto);
 
        }catch(IOException e){
            System.out.println("Problemas en la escritura E/S "+e);
        }
		return true;
    }
}
