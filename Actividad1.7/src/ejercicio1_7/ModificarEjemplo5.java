package ejercicio1_7;

import java.io.File;
import java.io.IOException;
import java.io.OutputStream;
import java.io.InputStream;


public class ModificarEjemplo5 {

	public static void main(String[] args) throws IOException {

		Process p = new ProcessBuilder("CMD", "/C", "DATE").start();
		
		ProcessBuilder pb = new ProcessBuilder("CMD", "/C", "DATE");
		
		File fout = new File("salida.txt");
		File ferr = new File("error.txt");
		
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
			
			pb.redirectOutput(fout);
			pb.redirectError(ferr);
			pb.start();
			
		}catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
}
