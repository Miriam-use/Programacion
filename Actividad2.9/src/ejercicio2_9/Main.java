package ejercicio2_9;

public class Main {

	public static void main(String[] args) {

		Mostrador m = new Mostrador();
        Productor p1 = new Productor(m, 1);
        Consumidor c1 = new Consumidor(m, 1);

        p1.start();
        c1.start();
	}

}
