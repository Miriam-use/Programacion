package Ejercicios32;

import java.util.Random;
/**
 * En la clase "Carton", creamos un new array de ints con 15 posiciones.
 * @author Miriam
 *
 */
public class Carton {
/**
 * creamos un new array de ints con 15 posiciones
 */
	int bingo[]=new int[15];
/**
 * se llama al constructor y utilizamos el objeto Random para sortear los números	
 */
	public Carton() {
		Random random = new Random();
		for(int i=0; i<bingo.length; i++) {
			bingo[i]=random.nextInt(100);
			if(isRepeated(i)) {
				i--;
			}
		}
	}
/**
 * tiene un filtro para evitar los números repetidos en las tarjetas de bingo	
 * @param i
 * @return
 */
	private boolean isRepeated(int i) {
		for(int j=0; j<i; j++) {
			if(bingo[i]==bingo[j]) {
				return true;
			}
		}
		return false;
	}
	
	public int[] getBingo() {
		return bingo;
	}
	
	public void setBingo(int[] bingo) {
		this.bingo=bingo;
	}
/**
 * cada vez que se llame al método "syso", llamamos al método "toString()"	
 */
	public String toString() {
		String s="[";
		for(int i=0; i<bingo.length; i++) {
			s=s+bingo[i]+",";
		}
		return s+"]";
	}
/**
 * El método "toString", itera sobre el array de ints "bingo", concatenando cada uno de ellos con el anterior e imprimiéndolos	
 */
	public void syso() {
		System.out.println(this.toString());
	}
	
}
