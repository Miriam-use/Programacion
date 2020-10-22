package ejercicio2_4;

public class MiHilo extends Thread{

	private SolicitaSupspender suspender = new SolicitaSupspender();
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
			System.out.println("Hilo finalizado");
		}catch (InterruptedException e) {
			e.printStackTrace();
		}
	}
	
	public long valorContador() {
		return CONTADOR;
	}
}
