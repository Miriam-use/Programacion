package ejercicio2_2;

public class HiloEjemplo1  implements Runnable{
	
	Thread hilo;

    //Construye un nuevo hilo.
	HiloEjemplo1(String nombre){
         hilo= new Thread(this,nombre);
     }

     //Un método de fábrica que crea e inicia un hilo.

     public static HiloEjemplo1 crearYComenzar (String nombre){
    	 HiloEjemplo1 miHilo=new HiloEjemplo1(nombre);
         miHilo.hilo.start(); //Inicia el hilo
         return miHilo;
     }

     //Punto de entrada de hilo.
     public void run(){
         System.out.println(hilo.getName()+" iniciando.");
         try {
             for (int count=0; count<11;count++){
                 Thread.sleep(400);
                 System.out.println("En "+hilo.getName()+ ", el recuento es "+count);
             }
         }catch (InterruptedException exc){
             System.out.println(hilo.getName()+ " interrumpudo.");
         }
         System.out.println(hilo.getName()+" terminado.");
     }

}
