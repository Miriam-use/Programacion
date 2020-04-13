package ejercicio8;

import java.io.File;
import java.io.FilenameFilter;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 * 
 * @author Miriam
 *
 */
public class Leer extends Thread{

	private final String EXTENSION_A_BUSCAR = ".txt";
    private final int DELAY = 1500;

    private String directorioCarpetaAExaminar = "";
    private boolean encendido = true;

    public Leer(String dir) {
        directorioCarpetaAExaminar = dir;
    }



    @Override
    public void run() {

        File dir = new File(directorioCarpetaAExaminar);

            File[] files = dir.listFiles(new FilenameFilter() {
                public boolean accept(File dir, String name) {
                    return name.toLowerCase().endsWith(".txt");
                }
            });

            for (int i = 0; i < files.length; i++) {
                File file = files[i];
                System.out.println(file);
            }
            if (files.length == 0) {
                System.out.println("El directorio no contiene extensiones de tipo '"+EXTENSION_A_BUSCAR+"'");
            }


            System.out.println("--");

            try {
                sleep(DELAY);
            } catch (InterruptedException ex) {
                Logger.getLogger(Leer.class.getName()).log(Level.SEVERE, null, ex);
            }
        
    }
/**
 * 
 * @param dir
 */
    public void setDirectorioABuscar(String dir) {

        this.directorioCarpetaAExaminar = dir;
    }

    public void apagar_encender_thread() {
        this.encendido = !encendido;
    }


    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    	Leer la = new Leer("ejercicio7");
        la.run();
    }

}
