package ejercicio1_8;

import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class Ejemplo5 {

	public static void main(String[] args) throws IOException {

		Process p = new ProcessBuilder("CMD", "/C", "DATE").start();
		
		//escritura -- envia entrada a DATE
		OutputStream os = p.getOutputStream();
		os.write("15-06-18".getBytes());
		os.flush(); //vacia el buffer de salida
		
		//lectura -- obtiene la salida de DATE
		InputStream is = p.getInputStream();
		int c;
		while ((c=is.read()) != -1) {
			System.out.println((char) c);
		}
		is.close();
		
		//COMPROBACION DE ERROR - 0 bien - 1 mal
		int exitVal;
		try {
			exitVal = p.waitFor();
			System.out.println("valor de salida: "+exitVal);
		}catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
