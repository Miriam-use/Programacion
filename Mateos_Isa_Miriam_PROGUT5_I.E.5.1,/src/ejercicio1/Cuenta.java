package ejercicio1;

import java.io.*;
import java.util.StringTokenizer;
/**
 * 
 * @author Miriam
 *
 */
public class Cuenta {

	public int cuentaPalabras(String fichero) {
		int cont = 0;
		try {
			File fe = new File(fichero);
			FileReader fr = new FileReader(fe);
			BufferedReader br = new BufferedReader(fr);
			String s;
			
			while((s=br.readLine())!=null) {
				StringTokenizer str;
				str = new StringTokenizer(s);
				cont+=str.countTokens();
			}
			
			if(fr!=null) {
				fr.close();
			}
		}catch (FileNotFoundException fnf){
			System.err.println("Fichero no encontrado "+fichero);
		}catch (IOException e) {
			System.err.println("Se ha producido una IOException");
			e.printStackTrace();
		}catch (Throwable e) {
			System.err.println("Error de programa: "+e);
			e.printStackTrace();
		}
		return cont;
	}
	
	public static void main(String[] args) {
		
		Cuenta c = new Cuenta();
		
		int d=c.cuentaPalabras("datos.txt");
		System.out.println(d);
		
	}
}

