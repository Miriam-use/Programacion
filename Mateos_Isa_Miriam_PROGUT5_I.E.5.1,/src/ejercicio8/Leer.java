package ejercicio8;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
/**
 * 
 * @author Miriam
 *
 */
public class Leer {

	public static void main(String[] args){
		FileInputStream f=null;
		String s="";
		char c;
		try{
			f=new FileInputStream("Libro.txt");
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
