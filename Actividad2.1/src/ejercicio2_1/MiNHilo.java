package ejercicio2_1;

public class MiNHilo implements Runnable {

	Thread hilo;
    TicTac ttob;

    MiNHilo(String nombre, TicTac tt){
        hilo=new Thread(this,nombre);
        ttob=tt;
    }

    public static MiNHilo crearEIniciar(String nombre, TicTac tt){
        MiNHilo miNHilo=new MiNHilo(nombre,tt);
        miNHilo.hilo.start(); //Inicia el hilo
        return miNHilo;
    }
    public void run(){
        if (hilo.getName().compareTo("TIC")==0){
            for (int i=0; i<5; i++) ttob.tic(true);
            ttob.tic(false);
        }else {
        for (int i=0; i<5;i++) ttob.tac(true);
        ttob.tac(false);
        }
    }
}