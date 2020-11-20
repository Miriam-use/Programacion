package Basico;

public class Ventas {

	private int codventa;
	private Clientes numcli ;
	private int univen; 
	private String fecha; 
	
	public Ventas(int codventa, Clientes numcli, int univen, String fecha) {
		super();
		this.codventa = codventa;
		this.numcli = numcli;
		this.univen = univen;
		this.fecha = fecha;
	}



	public Ventas(){}
	
	

	public int getCodventa() {
		return codventa;
	}

	public void setCodventa(int codventa) {
		this.codventa = codventa;
	}


	public Clientes getNumcli() {
		return numcli;
	}

	public void setNumcli(Clientes numcli) {
		this.numcli = numcli;
	}

	public int getUniven() {
		return univen;
	}

	public void setUniven(int univen) {
		this.univen = univen;
	}

	public String getFecha() {
		return fecha;
	}

	public void setFecha(String fecha) {
		this.fecha = fecha;
	}
}
