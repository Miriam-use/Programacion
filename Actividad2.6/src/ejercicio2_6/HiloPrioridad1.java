package ejercicio2_6;

public class HiloPrioridad1 extends Thread{

	private int c = 0;
	private boolean stopHilo = false;
	
	public HiloPrioridad1(String nombre) {
		super(nombre);
	}
	
	public int getContador() {
		return c;
	}
	
	public void pararHilo() {
		stopHilo = true;
	}
	
	public void run() {
		while(!stopHilo) {
			try {
				Thread.sleep(2);
			}catch (Exception e) {
				// TODO: handle exception
			}
			c++;
		}
		System.out.println("Fin hilo "+this.getName());
	}//
}//HiloPrioridad1
