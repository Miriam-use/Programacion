package Eje15_CajeroAutom�tico;

public class Cuenta {
	
	private float saldo=0;

	public void setSaldo(float s) {
		this.saldo = s;
	}
	
	public void setIngresar(float c) {		/*Agrega al saldo de  lacuenta la cantidad recibida*/
		this.saldo = saldo+c;
	}
	
	public void setExtraer(float e) {	/*Descuenta del saldo la cantidad recibida. Tras la llamada a este m�todo, el saldo podr� quedar en negativo*/
		this.saldo = saldo-e;
	}
	
	public float getSaldo() {
		return saldo;
	}
	
	
}
