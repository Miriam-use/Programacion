package ejercicio2_9;

public class Productor extends Thread {

	private Mostrador mostrador;
    private int num;

    public Productor(Mostrador m, int num) {
        mostrador = m;
        this.num = num;
    }

    public void run() {
        for (int i = 0; i < 10; i++) {
            mostrador.put(i);
            System.out.println("Productor #" + this.num
                               + " put: " + i);
        }
    }
}
