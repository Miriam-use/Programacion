package Ejercicios1_40;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
/**
 * 
 * @author Miriam
 *
 */
public class Ejercicio27 {

	public static void main(String[] args) {

		String nif="77871950E";
		
	    Pattern pattern = Pattern.compile("(\\d{1,8})([TRWAGMYFPDXBNJZSQVHLCKEtrwagmyfpdxbnjzsqvhlcke])");
	    Matcher matcher = pattern.matcher(nif);

	    if (matcher.matches()) {
	        String letra = matcher.group(2);
	        String letras = "TRWAGMYFPDXBNJZSQVHLCKE";
	        int index = Integer.parseInt(matcher.group(1));
	        index = index % 23;
	        String reference = letras.substring(index, index + 1);

	        if (reference.equalsIgnoreCase(letra)) {
	            System.out.println("DNI correcto");
	        } else {
	            System.out.println("DNI incorrecto");
	        }
	    } else {
            System.out.println("DNI incorrecto");
	    }
	}

}
