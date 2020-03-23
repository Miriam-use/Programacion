package ejercicio2;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.StringTokenizer;
/**
 * 
 * @author Miriam
 *
 */
public class Contador {
	
	/*CONTENIDO ARCHIVO a.txt
	 * hola como estas?
	 * este es un mensaje de
	 * ejemplo, solo para ver
	 * si se encuentran los caracteres
	 * especificados.
	 */
	
	static int palabrasTotales;
	static int lineaTotales;
	
	public static void main(String[] args) {
		//variable para llevar el contador de palabra
		palabrasTotales=0;
		
		//variable para llevar el contador de lineas
		lineaTotales=0;
		
		//objeto archivo con la ruta del archivo a leer
		File a = new File("a.txt");
		
		//llamar al metodo para contar las palabras y las lineas
		contarPalabrasLineas(a);
	}

	//metodo que lee el archivo y cuenta las palabras y las lineas
	public static void contarPalabrasLineas(File archivo) {
		try {
			//si existe el archivo
			if(archivo.exists()) {
				BufferedReader archivoLeer = new BufferedReader(new FileReader(archivo));
				
				String lisneaLeida;
				
				//mientras la linea leida no sea null
				while((lisneaLeida=archivoLeer.readLine())!=null) {
					System.out.println(lisneaLeida);
					
					//contamos las palabras de la linea
					StringTokenizer st = new StringTokenizer(lisneaLeida);
					
					//aumentar el contador de lineas y de palabras
					lineaTotales ++;
					palabrasTotales = palabrasTotales + st.countTokens();
				}
				System.out.println("");
				System.out.println("Numero de palabras: "+palabrasTotales);
				System.out.println("Numero de lineas: "+lineaTotales);
				
				//cierra la lectura
				archivoLeer.close();
			}else {
				System.out.println("NO EXISTE EL ARCHIVO");
			}
		}catch(Exception e) {
			System.err.println(e.getMessage());
		}
	}
}
