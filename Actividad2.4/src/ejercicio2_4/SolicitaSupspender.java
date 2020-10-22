package ejercicio2_4;

public class SolicitaSupspender {

	private boolean suspender;
	
	public synchronized void set(boolean b) {
		suspender = b;
		notifyAll();
	}
	
	public synchronized void esperandoParaReanudar() throws InterruptedException{
		while(suspender) {
			wait();
		}
	}
}
