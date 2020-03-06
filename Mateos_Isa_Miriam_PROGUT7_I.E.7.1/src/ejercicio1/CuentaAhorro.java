package ejercicio1;
/**
 * 
 * @author Miriam
 *
 */
public class CuentaAhorro extends Cuenta {
	
	private double interes, saldomin;
/**
 * 
 * @param c
 * @param num
 * @param interes
 * @param saldomin
 */
	public CuentaAhorro(Persona c, long num, double interes, double saldomin) {
		super(c, num);
		this.interes=interes;
		this.saldomin=saldomin;
	}
/**
 * 	
 * @return interes
 */
	public double getInteres() {
		return interes;
	}
/**
 * 	
 * @param interes
 */
	public void setInteres(double interes) {
		this.interes=interes;
	}
/**
 * 	
 * @param retira
 */
	public void setRetirarDinero(double retira) {
		if(retira<=saldomin) {
			super.setRetirar(retira);
		}else {
			System.out.println("Supera el saldo minimo");
		}
	}
/**
 * 	
 * @return super.getactualizarSaldo();
 */
	public double getInteresActual() {
		super.setactualizarSaldo(interes);
		return super.getactualizarSaldo();
	}
	
	@Override
	public String toString() {
		return "Cuenta Ahorro: "+super.toString()+", interes: "+interes+"]";
	}

}
