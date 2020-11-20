package ejercicio2_8;

public class Main {

	public static void main(String[] args) {

		Saldo s = new Saldo(40);
		Cuenta c1 = new Cuenta("Ana", s);
		Cuenta c2 = new Cuenta("Pepe", s);
		
		c1.start();
		c2.start();
	}

}
