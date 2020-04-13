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
    	
			comprobarCodigo(cod, texto);
		
    }
/**
 * 	
 * @param nomFich
 * @param texto
 */
	public static boolean escribirFichero(String nomFich, String texto){
        try(FileWriter fw=new FileWriter(nomFich);){
 
        		fw.write(texto);
 
        }catch(IOException e){
            System.out.println("Problemas en la escritura E/S "+e);
        }
		return true;
    }
	/**
	 * para comrovar que no te deja escribir en un nuevo fichero con el mismo codigo e guardado en el array los codigos de los 3 ficheros
	 * que ya se an creado anteriolmente.
	 * Si se crea un nuevo fichero, su codigo se guardara en el array, que supuestamente estaria conectado con una base de datos.
	 * @param cod
	 * @param texto
	 */
	public static void comprobarCodigo(String cod, String texto) {
		
		escribirFichero("ejercicio7/Libro"+cod+".txt", texto);
					
	}
	
}
