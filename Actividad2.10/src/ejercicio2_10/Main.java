package ejercicio2_10;

public class Main {

	public static void main(String[] args) {

		Consumidor cliente1 = new Consumidor("Cliente 1", new int[] { 2, 2, 1, 5, 2, 3 });
		Consumidor cliente2 = new Consumidor("Cliente 2", new int[] { 1, 3, 5, 1, 1 });

		Productor cajera1 = new Productor("Cajera 1");
		Productor cajera2 = new Productor("Cajera 2");

		// Tiempo inicial de referencia
		long initialTime = System.currentTimeMillis();

		cajera1.procesarCompra(cliente1, initialTime);
		cajera2.procesarCompra(cliente2, initialTime);
	}

}
