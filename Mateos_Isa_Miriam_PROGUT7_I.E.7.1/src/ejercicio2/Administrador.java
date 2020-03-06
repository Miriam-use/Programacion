package ejercicio2;
/**
 * 
 * @author Miriam
 *
 */
public class Administrador extends Usuarios{

	private int papelera;
	private int baneos; 
	
	public Administrador () {
		super();
		this.papelera=0;
		this.baneos=0;
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
	
	public void setBaneosinc() {
		baneos+=1;
	}
	
	public String MostrarA() {
		return super.Mostrar()+", Papelera: "+papelera+", Baneos:"+baneos+"]";
	}
}
