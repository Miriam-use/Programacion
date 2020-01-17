package Ejercicios1_40;
/**
 * 
 * @author Miriam
 *
 */
public class Ejercicio22 {

	public static void main(String[] args) {

		int vocal[]=new int[5];
		
		String palabra="Murcielago banana";
		char caracte;
		
		for(int i=0; i<palabra.length();i++) {
			caracte=Character.toLowerCase(palabra.charAt(i));
/**
 * crea un contador para las vocales			
 */
			switch(caracte) {
			case 'a':
				vocal[0]++;
				break;
			case 'e':
				vocal[1]++;
				break;
			case 'i':
				vocal[2]++;
				break;
			case 'o':
				vocal[3]++;
				break;
			case 'u':
				vocal[4]++;
				break;
			default:
				break;
			}
		}
		
		System.out.println("Vocal\tVeces\n");
		System.out.println("*********************\n");
		System.out.println("a\t"+vocal[0]+"\n");
		System.out.println("e\t"+vocal[1]+"\n");
		System.out.println("i\t"+vocal[2]+"\n");
		System.out.println("o\t"+vocal[3]+"\n");
		System.out.println("u\t"+vocal[4]+"\n");
	}

}
