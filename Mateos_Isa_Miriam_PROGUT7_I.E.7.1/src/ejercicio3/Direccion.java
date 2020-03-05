package ejercicio3;

public class Direccion {

	private String calle;
	private String ciudad;
	private int codPostal;
	private String pais;
	
	public Direccion() {
		this.calle=null;
		this.ciudad=null;
		this.codPostal=00000;
		this.pais=null;
	}
	
	public Direccion(String call, String ciud, int cod, String pa) {
		this.calle=call;
		this.ciudad=ciud;
		this.codPostal=cod;
		this.pais=pa;
	}
}
