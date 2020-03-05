package ejercicio1;

public class CuentaCorriente extends Cuenta{
	
	private double interes;

	public CuentaCorriente(Persona c, long num) {
		super(c, num);
		this.interes=0.015;
	}
	
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
