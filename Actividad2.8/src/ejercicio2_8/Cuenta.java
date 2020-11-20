package ejercicio2_8;

public class Cuenta extends Thread{

	private Saldo s;
	private String nom;
	
	public Cuenta(String n, Saldo s) {
		super(n);
		this.s=s;
	}
	
	public void run() {
		for(int i=1; i<=4; i++) {
			s.Retirar(10, getName());
		}
	}
}
