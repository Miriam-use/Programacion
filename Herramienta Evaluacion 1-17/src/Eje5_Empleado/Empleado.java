package Eje5_Empleado;
/**
 * <h2>Crea una clase Empleado que modele la información que una empresa mantiene sobre cada empleado</h2>
 * 
 * Buscar informacion de javadoc en <a href="http://google.com">GOOGLE</a>
 * @version 1-2019
 * @author Miriam
 */
public class Empleado {

	private int nif = 123456789;
	private double sueldoBase, pagoExtra, irpf;
	private boolean casado;
	private int horaExtra, hijo;
	
	/**
	 * Cálculo y devolución del complemento correspondiente a las horas extra
	 * realizadas.
	 * @param horaExtra
	 */
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
	
	/**
	 * Cálculo y devolución de las retenciones (IRPF) a partir del tipo, teniendo
	 * en cuenta que el porcentaje de retención que hay que aplicar es el tipo
	 * menos 2 puntos si el empleado está casado y menos 1 punto por cada
	 * hijo que tenga; el porcentaje se aplica sobre todo el sueldo bruto.
	 * @return
	 */
	public String getRetencion() {
		if(casado==true) {
			return "Al estar casado y tener "+hijo+"hijos. Su Rentencion es de "+(sueldoBase-(irpf-1-hijo));
		}return "Al no estar casado y tener "+hijo+"hijos. Su Rentencion es de \"+(sueldoBase-(irpf-1-hijo))";
	}
	
	public String getprintln() {
		return "Empleado con DNI "+nif+"\n"+getCasado();
	}
	
	public String getprintAll() {
		return "Su sueldo base es de "+sueldoBase+"\n"+getPagoHoraExtra()+"\n"+getRetencion();
	}
}
