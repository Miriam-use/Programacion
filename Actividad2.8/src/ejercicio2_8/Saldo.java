package ejercicio2_8;

public class Saldo {

	private int saldo;
	
	Saldo(int s){
		this.saldo=s;
	}

	public int getSaldo() {
		return saldo;
	}
	public void restar(int cantidad) {
		saldo=saldo-cantidad;
	}

	public void Retirar(int s, String nom) {
		if(getSaldo() >= s) {
			System.out.println(nom+": SE VA A RETIRAR SALDO (ACTUAL ES: "+getSaldo()+")");
			try {
				Thread.sleep(500);
				
				restar(s);
				System.out.println("\t"+nom+" retirar => "+s+" ACTUAL("+getSaldo()+")");
				
			}catch (InterruptedException e) {
				
			}
		}else {
			System.out.println(nom+" No puede retirar dinero, NO HAY SALDO ("+getSaldo()+")");
		}
		if(getSaldo() < 0) {
			System.out.println("SALDO NEGATIVO => "+getSaldo());
		}
	}
}
