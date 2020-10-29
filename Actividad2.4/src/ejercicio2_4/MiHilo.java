package ejercicio2_4;

public class MiHilo extends Thread{

	SolicitaSupspender suspender = new SolicitaSupspender();
	private long CONTADOR = 0;
	
	public void suspende() {
		suspender.set(true);
	}
	
	public void Reanuda() {
		suspender.set(false);
	}
	
	public void run() {
		try {
			while(CONTADOR < 10) {
				CONTADOR++;
				System.out.println(CONTADOR);
				suspender.esperandoParaReanudar();
				sleep(1000);
			}
			System.out.println("finalizado hilo");
		}catch (InterruptedException e) {
			Thread.currentThread().interrupt();
			throw new AssertionError(e);
		}
	}
	
	public long valorContador() {
		return CONTADOR;
	}
}
