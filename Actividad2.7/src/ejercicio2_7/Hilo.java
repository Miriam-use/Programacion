package ejercicio2_7;

import java.util.Random;

public class Hilo implements Runnable{

	private Drop drop;
	 
    public Hilo(Drop drop) {
        this.drop = drop;
    }
 
    public void run() {
        Random random = new Random();
        for (String message = drop.take();
             ! message.equals("hecho");
             message = drop.take()) {
            System.out.format("mensaje recibido: %s%n", message);
            try {
                Thread.sleep(random.nextInt(5000));
            } catch (InterruptedException e) {}
        }
    }
}
