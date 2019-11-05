package Eje_6Cuenta;

public class Cuenta {

	private int numero;
	private int dni;
	private double saldo;
	private double interes;
	private double ingresa;
	private double retira;
	
	public Cuenta() {
		numero=101;
		dni=12345678;
		interes=0.05;
	}
	
	public int getNumero() {
		return numero=numero;
	}
	
	public int getDni() {
		return dni=dni;
	}
	
	public void setSaldo(double i) {
		this.saldo=i;
	}
	
	public double getActualizarSaldo() {
		double actual;
		return actual=saldo*(interes/360);
	}
	
	public void setIngresar(double ingresa) {
		this.ingresa=saldo+ingresa;
	}
	
	public double getIngresar() {
		return ingresa;
	}
	
	public void setRetirar(double retira) {
		this.retira=saldo-retira;
	}
	
	public double getRetirar() {
		return retira;
	}
	
}
