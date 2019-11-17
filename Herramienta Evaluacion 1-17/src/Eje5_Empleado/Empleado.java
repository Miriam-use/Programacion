package Eje5_Empleado;

public class Empleado {

	private int nif = 123456789;
	private double sueldoBase, pagoExtra, irpf;
	private boolean casado;
	private int horaExtra, hijo;
	
	public void setPagoHoraExtra(int horaExtra) {
		this.horaExtra = horaExtra;
	}
	public void setPagaExtra(double pagoExtra) {
		this.pagoExtra = pagoExtra;
	}
	public String getPagoHoraExtra() {
		return horaExtra+" horas extras se pagan a "+pagoExtra+". Su paga seria de "+(horaExtra *pagoExtra);
	}
	
	public void setCasado(boolean casado) {
		this.casado = casado;
	}
	public void setTenerHijo(int hijo) {
		this.hijo = hijo;
	}
	public String getCasado() {
		if(casado == true) {
			return "Esta casado y tiene "+hijo+" hijos";
		}else {
			return "No esta casado y tiene "+hijo+" hijos";
		}
	}
	
	public void setSueldo(double sueldoBase) {
		this.sueldoBase = sueldoBase;
	}
	public void setIrmf(double irpf) {
		this.irpf = irpf;
	}
	
	public double getSueldo() {
		return (sueldoBase+(horaExtra *pagoExtra))*(sueldoBase/irpf);
	}
	
	public String getRetencion() {
		return "";
	}
	
	public String getprintln() {
		return "Empleado con DNI "+nif+"\n"+getCasado();
	}
	
	public String getprintAll() {
		return "Su sueldo base es de "+sueldoBase+"\n"+getPagoHoraExtra()+"\n"+"Al "+getCasado();
	}
}
