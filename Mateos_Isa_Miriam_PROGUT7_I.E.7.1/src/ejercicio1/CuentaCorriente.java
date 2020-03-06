package ejercicio1;
/**
 * 
 * @author Miriam
 *
 */
public class CuentaCorriente extends Cuenta{
	
	private double interes;
/**
 * 
 * @param c
 * @param num
 */
	public CuentaCorriente(Persona c, long num) {
		super(c, num);
		this.interes=0.015;
	}
/**
 * 	
 * @return super.getactualizarSaldo();
 */
	public double getInteres() {
		super.setactualizarSaldo(interes);
		return super.getactualizarSaldo();
	}
	
	@Override
	public String toString() {
		return "Cuenta Corriente: "+super.toString()
				+", interes: "+interes+"]";
	}
}
