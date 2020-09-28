package EJE2;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.swing.JOptionPane;

import EJE2.Departamento;
/**
 * 
 * @author Miriam
 *
 */
public class Funcionalidad {
	
	private String ruta ="Departamentos.dat";
	
/**
 * Guardo los objetos de la clase Departamento en el fichero Departamentos.dat
 * @param departamento
 */
	public void guardar(ArrayList<Departamento> departamento) {
		try {
             File f = new File(ruta);
             if(f.exists()) {
            	 FileWriter fw = new FileWriter(f);
                 PrintWriter escritura = new PrintWriter(fw);
                 for(int i=0;i<departamento.size();i++){
                      escritura.println(departamento.get(i).FicheroEscritura());
                 }
                 escritura.close();
             }else {
            	 FileWriter fw = new FileWriter(f);
                 PrintWriter escritura = new PrintWriter(fw);
                 for(int i=0;i<departamento.size();i++){
                      escritura.println(departamento.get(i).FicheroEscritura());
                 }
                 escritura.close();
             }            
            System.out.println("Los datos se han guardado correctamente en el fichero Departamentos.dat");
            
        } catch (Exception e) {
            System.out.println(e.getMessage());
        } 
    }

	
	private int cod;
/**
 * Restaura los datos del archivo ala clase Departamento y meterlo en el arraylist
 * @param departamento
 */
	public void imprimir(ArrayList<Departamento> departamento) {
		Departamento d;
		try {
			File f = new File(ruta);
			if(f.exists()) {
				FileReader fr=new FileReader(f);
				BufferedReader br=new BufferedReader(fr);
				
				String linea;
				while((linea = br.readLine()) != null) {
					
					String [] departa = linea.split("%");
					cod = Integer.parseInt(departa[0]);
					departamento.add(d = new Departamento(cod, departa[1], departa[2]));
					
				}
				
			}else {
				System.out.println("El fichero "+ruta+" no exite");
			}
		}catch (Exception e) {
			System.err.println(e);
		}
	}
/**
 * 	
 * @return cod
 */
	public int CodigoID() {
		return cod;
	}
	
	
/**
 * 
 * @param dos
 * @param numero
 * @param nombre
 * @param localidad
 * @throws IOException
 */
	public void introduceDatos(DataOutputStream dos, int numero, String nombre, String localidad) throws IOException{

		dos.writeInt(numero);
		dos.writeUTF(nombre);
		dos.writeUTF(localidad);

	}
/**
 * 	
 * @param dis
 * @throws IOException
 */
	public void muestraDatos(DataInputStream dis) throws IOException {
		 
        //Cuando se acabe el fichero saltara la excepcion
        while(true){
            JOptionPane.showMessageDialog(null, "Numero de departamento "+dis.readInt()+
            ", nombre: "+dis.readUTF()+", localidad: "+dis.readUTF());
        }
    }
/**
 * 	
 * @param departamentoAModificar
 * @param datoAModificar
 * @param texto
 * @throws IOException
 */
	public void modificarDatos(int departamentoAModificar, int datoAModificar, String texto) throws IOException {
		
		InputStreamReader leer = new InputStreamReader(System.in);
		BufferedReader buff = new BufferedReader(leer);
		
		
	}
/**
 * 	
 * @throws IOException
 */
	public void eliminaDatos() throws IOException {
		
	}
}
