package Ejercicios1_40;
/**
 * 
 * @author Miriam
 */
public class Ejercicio29 {

	public static void main(String[] args) {

			String notas="Juan Carlos \n 8.5 \n Andrés \n 4.9 \n Pedro \n 3.8 \n Juan \n 6.3";
			char cadena[]=notas.toCharArray();
			double nota[]=new double[4];
			
			for(int i=0; i<cadena.length; i++) {
				if(Character.isDigit(cadena[i])) {
					nota[i]=Double.parseDouble(notas);
				}
			}
			System.out.println(nota);
			
	}

}
