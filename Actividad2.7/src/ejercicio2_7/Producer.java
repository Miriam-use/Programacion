package ejercicio2_7;

import java.util.Random;

public class Producer implements Runnable {
	
	private Drop drop;
	 
    public Producer(Drop drop) {
        this.drop = drop;
    }
 
    public void run() {
        String importantInfo[] = {
            "hilo1",
            "hilo2",
            "hilo3",
            "hilo4",
            "hilo5"
        };
        Random random = new Random();
 
        for (int i = 0;
             i < importantInfo.length;
             i++) {
            drop.put(importantInfo[i]);
            try {
                Thread.sleep(random.nextInt(5000));
            } catch (InterruptedException e) {}
        }
        drop.put("hecho");
    }
}
