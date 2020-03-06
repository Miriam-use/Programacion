package ejercicio5;

public class Comercial extends Empleado{

	private double sueldobruto;
	private int importeventa;
	
	public Comercial(String nom, String d, double sueldo, int venta) {
		super(nom, d);
		this.sueldobruto=sueldo;
		this.importeventa=venta;
	}
	
	public void setComision() {
		importeventa=importeventa%10;
	}
	
	public double getComision() {
		return importeventa;
	}
	
	public double getSueldo() {
		return sueldobruto;
	}

	@Override
	public String calcularSaldo() {
		return "Sueldo bruto: "+sueldobruto
				+"\nSueldo mas comision: "+(sueldobruto+importeventa);
	}

	@Override
	public String toString() {
		return "Comercial [sueldobruto=" + sueldobruto + ", importeventa=" + importeventa + "]";
	}

}
