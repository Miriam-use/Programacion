package ArrayList;
/**
 * 
 * @author Miriam
 *
 */
public class Ventas {

	private String mes;
	private double ventasCoche;
	
	Ventas(){
		
	}
	/**
	 * 
	 * @param mes
	 * @param ventasCoche
	 */
	Ventas(String mes, double ventasCoche){
		this.mes=mes;
		this.ventasCoche=ventasCoche;
	}
	/**
	 * 
	 * @return
	 */
	public String getMes() {
		return mes;
	}
	/**
	 * 
	 * @param mes
	 */
	public void setMes(String mes) {
		this.mes=mes;
	}
	/**
	 * 
	 * @return
	 */
	public double getVentasCoche() {
		return ventasCoche;
	}
	/**
	 * 
	 * @param ventasCoche
	 */
	public void setVentasCoche(double ventasCoche) {
		this.ventasCoche=ventasCoche;
	}
	
	@Override
	public String toString() {
		return "Ventas [mes= "+mes+", ventas de coches= "+ventasCoche+"]";
	}
}
