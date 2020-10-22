package ejercicio2_2;

public class Main {

	public static void main(String[] args) {
		
		System.out.println("Hilo principal iniciando.");

		HiloEjemplo1 miHilo1 = HiloEjemplo1.crearYComenzar("Hilo1");
		HiloEjemplo1 miHilo2 = HiloEjemplo1.crearYComenzar("Hilo2");
		HiloEjemplo1 miHilo3 = HiloEjemplo1.crearYComenzar("Hilo3");

        for (int i = 0; i < 50; i++) {
            //System.out.print(".");
            try {
                Thread.sleep(100);
            } catch (InterruptedException exc) {
                System.out.println("Hilo principal interrumpido.");
            }
        }
        System.out.println("Hilo principal finalizado");
	}

}
