package ejercicio2;

public class Moderador extends Usuarios{

	private int papelera;
	
	public Moderador() {
		super();
		this.papelera=0;
	}
	
	public void setIncrementar() {
		super.setIncrementar();
	}
	
	public void setDecrementa() {
		super.setDecrementa();
	}
	
	public  void setModificaCorreo(String cor) {
		super.setModificaCorreo(cor);
	}
	
	public  void setModificaNick(String ni) {
		super.setModificaNick(ni);
	}
	
	public void setPapelerainc() {
		papelera+=1;
	}
	
	public String MostrarM() {
		return super.Mostrar()+", Papelera: "+papelera+"]";
	}
}
