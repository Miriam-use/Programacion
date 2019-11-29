package Eje3_Cuenta;

/**
 * <h2>Clase muestre los datos de una cuenta bancaria</h2>
 * 
 * Buscar informacion de javadoc en <a href="http://google.com">GOOGLE</a>
 * @version 1-2019
 * @author Miriam
 */

public class Cuenta {

	private static long numero;
	private long dni;
	private double saldo;
	private double interes;
	private double ingresa;
	
	/**
	 * Constructor por defecto y constructor con DNI, saldo e interés
	 * Accedentes y mutadores. Para el número de cuenta no habrá mutador.
	 */
	public Cuenta() {
		numero = 100001;
		dni=12345678;
		interes=0.5;
	}
	
	public String Datos() {
		return "Su numero de cuenta es: "+numero+"  DNI: "+dni+"  El intres es: "+interes;
	}
	
	public void setSaldo(double i) {
		this.saldo=i;
	}
	
	/**
	 * actualizará el saldo de la cuenta aplicándole el interés diario (interés anual dividido entre 365 aplicado al saldo actual).
	 * @param actual
	 * @return
	 */
	public double getActualizarSaldo(double actual) {
		return actual=saldo*(interes/360);
	}
	
	/**
	 * permitirá ingresar una cantidad en la cuenta.
	 * @param ingresa
	 */
	public void setIngresar(double ingresa) {
		this.ingresa=saldo+ingresa;
	}
	
	/**
	 * permitirá sacar una cantidad de la cuenta (si hay saldo).
	 * @return
	 */
	public double getIngresar() {
		return ingresa;
	}
	
	//Mira si tiene saldo suficiente para retirar
	public String Retirar(double retira) {
		if((ingresa-retira)>0) {
			return "Su saldo actual es: "+(ingresa-retira); 	//Si tiene saldo se hace la retirada
		}else {
			return "No tiene saldo";	//Si no tiene salta el mensage
		}
	}

}
