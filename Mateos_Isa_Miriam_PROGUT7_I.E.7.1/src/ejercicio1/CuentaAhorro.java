package ejercicio1;

public class CuentaAhorro extends Cuenta {
	
	private double interes, saldomin;

	public CuentaAhorro(Persona c, long num, double interes, double saldomin) {
		super(c, num);
		this.interes=interes;
		this.saldomin=saldomin;
	}
	
	public double getInteres() {
		return interes;
	}
	
	public void setInteres(double interes) {
		this.interes=interes;
	}
	
	public void setRetirarDinero(double retira) {
		if(retira<=saldomin) {
			super.setRetirar(retira);
		}else {
			System.out.println("Supera el saldo minimo");
		}
	}
	
	public double getInteresActual() {
		super.setactualizarSaldo(interes);
		return super.getactualizarSaldo();
	}
	
	@Override
	public String toString() {
		return "Cuenta Ahorro: "+super.toString()+", interes: "+interes+"]";
	}

}
