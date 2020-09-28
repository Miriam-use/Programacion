package EJE1;

import java.io.File;
import java.io.IOException;
import java.io.ObjectInputStream.GetField;
import java.io.RandomAccessFile;
/**
 * 
 * @author Miriam
 *
 */
public class Controlador {

	private static RandomAccessFile flujo;
    private static int numeroRegistros;
    private static int tama�oRegistro = 80;
 /**
  *    
  * @param archivo
  * @throws IOException
  */
    public static void crearFile(File archivo) throws IOException {
        if (archivo.exists() && !archivo.isFile()) {
            throw new IOException(archivo.getName() + " no es un archivo");
        }
        flujo = new RandomAccessFile(archivo, "rw");
        numeroRegistros = (int) Math.ceil(
                (double) flujo.length() / (double) tama�oRegistro);
    }
 /**
  *    
  * @throws IOException
  */
    public static void cerrar() throws IOException {
        flujo.close();
    }
/**
 *     
 * @param i
 * @param empleado
 * @return true y si da error o no se cumple false
 * @throws IOException
 */
    public static boolean setEmpleado(int i, Empleado empleado) throws IOException {
        if(i >= 0 && i <= getNumeroRegistros()) {
            if(empleado.getTama�o() > tama�oRegistro) {
                System.out.println("\nTama�o de registro excedido.");
            } else {
                flujo.seek(i*tama�oRegistro);
                flujo.writeInt(empleado.getIdentificador());
                flujo.writeUTF(empleado.getApellido());
                flujo.writeUTF(empleado.getDepartamento());
                flujo.writeInt(empleado.getSalario());
                flujo.writeBoolean(empleado.isActivo());
                return true;
            }
        } else {
            System.out.println("\nNumero de registro fuera de limites.");
        }
        return false;
    }
/**
 *     
 * @return i y si no -1
 * @throws IOException
 */
    private static int buscarRegistroInactivo() throws IOException {
        String nombre;
        for(int i=0; i<getNumeroRegistros(); i++) 
        {
            flujo.seek(i * tama�oRegistro);
            if(!getEmpleado(i).isActivo()) 
                return i;
        }
        return -1;        
    }
/**
 * 
 * @param eliminar
 * @return true
 * @throws IOException
 */
    public static boolean eliminarPersona(int eliminar) throws IOException {
        int pos = buscarRegistro(eliminar);
        if(pos == -1) return false;
        Empleado personaEliminada = getEmpleado(pos);
        personaEliminada.setActivo(false);
        setEmpleado(pos, personaEliminada);
        return true;
    }
/**
 *     
 * @param archivo
 * @throws IOException
 */
    public static void compactarArchivo(File archivo) throws IOException {
        crearFile(archivo); // Abrimos el flujo.
        Empleado[] listado = new Empleado[numeroRegistros];
        for(int i=0; i<numeroRegistros; ++i)
            listado[i] = getEmpleado(i);
        cerrar(); // Cerramos el flujo.
        archivo.delete(); // Borramos el archivo.

        File tempo = new File("temporal.dat");
        crearFile(tempo); // Como no existe se crea.
        for(Empleado p : listado)
            if(p.isActivo())
                a�adirPersona(p);
        cerrar();
        
        tempo.renameTo(archivo); // Renombramos.
    }
/**
 *     
 * @param persona
 * @throws IOException
 */
    public static void a�adirPersona(Empleado persona) throws IOException {
        int inactivo = buscarRegistroInactivo();
        if(setEmpleado(inactivo==-1?numeroRegistros:inactivo, persona)) 
            numeroRegistros++;        
    }
/**
 * 
 * @return numeroRegistros
 */
    public static int getNumeroRegistros() {
        return numeroRegistros;
    }
/**
 *     
 * @param i
 * @return informacion del empleado
 * @throws IOException
 */
    public static Empleado getEmpleado(int i) throws IOException {
        if(i >= 0 && i <= getNumeroRegistros()) {
            flujo.seek(i * tama�oRegistro);
            return new Empleado(flujo.readInt(), flujo.readUTF(), flujo.readUTF(), flujo.readInt(), flujo.readBoolean());
        } else {
            
            return null;
        }
    }
/**
 *     
 * @param buscado
 * @return i
 * @throws IOException
 */
    public static int buscarRegistro(int buscado) throws IOException {
        Empleado p;
        if (buscado == 0) {
            return -1;
        }
        for(int i=0; i<getNumeroRegistros(); i++) {
            flujo.seek(i * tama�oRegistro);
            p = getEmpleado(i);
            if(p.getIdentificador()==buscado && p.isActivo()) {
                return i;
            }
        }
        return -1;
    }
}
