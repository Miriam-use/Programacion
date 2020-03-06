package ejercicio1;
/**
 * 
 * @author Miriam
 *
 */
public abstract class Cuenta{

	private long numerocuenta;
	private double saldo;
	Persona cliente;
/**
 * 	
 * @param c
 * @param num
 * @param sal
 */
	public Cuenta(Persona c, long num) {
		this.cliente=c;
		this.numerocuenta=num;
		this.saldo=0;
	}
/**
 * 
 * @return numerocuenta
 */
	public long getNumCuenta() {
		return numerocuenta;
	}
/**
 * 	
 * @return saldo
 */
	public double getSaldo() {
		return saldo;
	}
/**
 * Permitirá ingresar una cantidad en la cuenta.
 * @param cantidad
 */
	public void setIngresar(double cantidad) {
		this.saldo+=cantidad;
	}
/**
 * Permitirá sacar una cantidad de la cuenta (si hay saldo). No se implementa, depende del tipo de cuenta	
 * @param cantidad
 */
	public void setRetirar(double cantidad) {
		if(saldo>=cantidad) {
			this.saldo-=cantidad;
		}else {
			System.out.println("Saldo insuficiente");
		}
	}
/**
 * 	
 * @param in
 */
	public void setactualizarSaldo(double in) {
		this.saldo-=in;
	}
/**
 * 	
 * @return
 */
	public double getactualizarSaldo() {
		return saldo;
	}
	
	@Override
	public String toString() {
		return 	cliente.toString()
				+ ", Numero de cuenta: "+numerocuenta
				+", Saldo: "+saldo;
	}
}
