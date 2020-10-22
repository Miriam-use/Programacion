package ejercicio2_1;

public class ComHilos {

	public static void main(String[] args) {
        TicTac tt=new TicTac();
        MiNHilo mh1=MiNHilo.crearEIniciar("TIC",tt);
        MiNHilo mh2=MiNHilo.crearEIniciar("TAC",tt);

        try {
            mh1.hilo.join();
            mh2.hilo.join();
        }catch (InterruptedException exc){
            System.out.println("Hilo principal interrumpido.");
        }
    }
}
