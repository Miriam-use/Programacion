package Satelite;

public class Main {

	public static void main(String[] args) {
		
		Satelite s1=new Satelite(), s2=new Satelite(4, 2, 9);
		s1.setPosicion(5, 7, 3);
		s1.printPosicion();
		s2.printPosicion();

	}

}
