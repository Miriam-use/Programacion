package ejercicio2_9;

public class Consumidor extends Thread {

	private Mostrador mostrador;
    private int num;

    public Consumidor(Mostrador m, int num) {
        mostrador = m;
        this.num = num;
    }

    public void run() {
        int val = 0;
        for (int i = 0; i < 10; i++) {
            val = mostrador.get();
            System.out.println("Consumidor #" + this.num
                               + " got: " + val);
        }
    }
}
