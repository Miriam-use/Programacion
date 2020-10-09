package ejercicio1_4;

/**
 * Crear un programa java llamado LeerNombre.java que reciba desde los argumentos de main()
 * un nombre y lo visualice en pantalla. Utiliza System.exit(1) para una finalizacion correcta del
 * programa y System.exit(-1) para el caso que no se haya introducido los argumentos correctos en 
 * main().
 * 
 * @author Miriam
 *
 */

public class LeerNombre {

	public static void main(String[] args) {
		
		 // Imprime la cadena "Hola" en la pantalla
        System.out.println("Estoy saludando a la gente de abajo...");

        // Verifica si existe un argumento de línea de comando
        if(args.length == 0) {
            System.exit(1);
        }else {
        	System.exit(-1);
        }
        // Muestra los argumentos de la línea de comando
        for(int counter = 0; counter < args.length; counter++){
            System.out.println("índice de argumento " + counter + ": " + args[counter]);  
        }

	}
}
