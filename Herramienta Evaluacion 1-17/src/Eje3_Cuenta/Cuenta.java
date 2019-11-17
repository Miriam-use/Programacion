package Eje3_Cuenta;

public class Cuenta {

	private static long numero;
	private long dni;
	private double saldo;
	private double interes;
	private double ingresa;
	
	
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
	
	public double getActualizarSaldo(double actual) {
		return actual=saldo*(interes/360);
	}
	
	public void setIngresar(double ingresa) {
		this.ingresa=saldo+ingresa;
	}
	
	public double getIngresar() {
		return ingresa;
	}
	
	public String Retirar(double retira) {
		if((ingresa-retira)>0) {
			return "Su saldo actual es: "+(ingresa-retira);
		}else {
			return "No tiene saldo";
		}
	}

}
