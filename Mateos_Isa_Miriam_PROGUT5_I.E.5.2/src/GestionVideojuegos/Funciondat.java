package GestionVideojuegos;

import java.io.BufferedReader;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.PrintWriter;
import java.io.Serializable;
import java.util.ArrayList;

import GestionVideojuegos.Videojuegos;

/**
 * 
 * @author Miriam
 *
 */
public class Funciondat implements Serializable{

	private String ruta ="videojue.dat";
/**
 * Guardo los objetos de la clase Videojuegos en el archivo .dat	
 * @param videojuego
 */
	public void guardar(ArrayList<Videojuegos> videojuego) {
		try {
             File f = new File(ruta);
             if(f.exists()) {
            	 FileWriter fw = new FileWriter(f);
                 PrintWriter escritura = new PrintWriter(fw);
                 for(int i=0;i<videojuego.size();i++){
                      escritura.println(videojuego.get(i).FicheroEscritura());
                 }
                 escritura.close();
             }else {
            	 FileWriter fw = new FileWriter(f);
                 PrintWriter escritura = new PrintWriter(fw);
                 for(int i=0;i<videojuego.size();i++){
                      escritura.println(videojuego.get(i).FicheroEscritura());
                 }
                 escritura.close();
             }            
            System.out.println("Los datos se han guardado correctamente en el fichero videojue.dat");
            
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } 
		
			/*try {

            	FileOutputStream fs = new FileOutputStream(ruta);
            	ObjectOutputStream oos = new ObjectOutputStream(fs);

            	oos.writeObject(videojuego);

            	if (oos != null) {
                	oos.close();
                	fs.close();
            	}
			} catch (IOException e) {
            	e.printStackTrace();
        	}
        	System.out.println("Los datos se han guardado correctamente en el fichero videojue.dat");*/

    }
/**
 * Restaura los datos del archivo ala clase Videojuegos y meterlo en el arraylist	
 * @param videojuego
 */
	private int cod;
	public void imprimir(ArrayList<Videojuegos> videojuego) {
		Videojuegos v;
		try {
			File f = new File(ruta);
			if(f.exists()) {
				FileReader fr=new FileReader(f);
				BufferedReader br=new BufferedReader(fr);
				
				String linea;
				while((linea = br.readLine()) != null) {
					
					String [] juego = linea.split("%");
					cod = Integer.parseInt(juego[0]);
					videojuego.add(v = new Videojuegos(cod, juego[1], juego[2], juego[3]));
					
				}
				
			}else {
				System.out.println("El fichero "+ruta+" no exite");
			}
		}catch (Exception e) {
			System.err.println(e);
		}
		
		 /* try {
	            File f = null;
	            ObjectInputStream Obj = null;
	            FileInputStream fe = null;
	            try {
	                f = new File("videojue.dat");
	                if (f.exists()) {
	                    fe = new FileInputStream(f);
	                    Obj = new ObjectInputStream(fe);
	                    while (true) {
	                    	videojuego = (ArrayList<Videojuegos>) Obj.readObject();
	                    }
	                }
	            } catch (EOFException eof) {
	                System.out.println("");
	            } catch (FileNotFoundException fnf) {
	                System.err.println("Fichero no encontrado " + fnf);
	            } catch (IOException e) {
	                System.err.println("Se ha producido una IOException");
	                e.printStackTrace();
	            } catch (Throwable e) {
	                System.err.println("Error de programa: " + e);
	                e.printStackTrace();
	            } finally {
	                if (Obj != null) {
	                    Obj.close();
	                    fe.close();
	                }
	            }
	        } catch (IOException e) {
	            e.printStackTrace();

	        }*/
	}
	
	public int CodigoID() {
		return cod;
	}
}
