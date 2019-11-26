package Eje15_CajeroAutomático;
/**
 * <h2>Clase Cuenta, se utiliza para crear y leer cuenta bancaria</h2>
 * 
 * Buscar informacion de javadoc en <a href="http://google.com">GOOGLE</a>
 * @version 1-2019
 * @author Miriam
 * @since 25-11-2019
 */
public class Cuenta {
	
	private float saldo=0;

	public void setSaldo(float s) {
		this.saldo = s;
	}
	
	public void setIngresar(float c) {		/*Agrega al saldo de  lacuenta la cantidad recibida*/
		this.saldo = saldo+c;
	}
	
	public void setExtraer(float e) {	/*Descuenta del saldo la cantidad recibida. Tras la llamada a este método, el saldo podrá quedar en negativo*/
		this.saldo = saldo-e;
	}
	
	public float getSaldo() {
		return saldo;
	}
	
	
}
