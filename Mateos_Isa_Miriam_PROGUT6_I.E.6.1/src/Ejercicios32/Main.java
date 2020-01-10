package Ejercicios32;

import java.util.ArrayList;
/**
 * Creamos un Binfo con 1 carton.
 * @author Miriam
 *
 */
public class Main {

public static void main(String[] args) {
 /**
  * La clase ArrayList en Java, es una clase que permite almacenar datos en memoria de forma similar a los Arrays   
  */
		ArrayList<Carton>bingoList = new ArrayList<Carton>();
	
        for(int i=0; i<1; i++) {
        	Carton bingo=new Carton();
        	bingoList.add(bingo);
        	bingo.syso();
        }
    }
}
