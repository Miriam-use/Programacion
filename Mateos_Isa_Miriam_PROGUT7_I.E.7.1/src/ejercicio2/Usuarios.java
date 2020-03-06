package ejercicio2;
/**
 * 
 * @author Miriam
 *
 */
public class Usuarios {

	private int mensajes;
	private String correo;
	private String nick;
	
	public Usuarios() {
		this.mensajes=0;
		this.correo=null;
		this.nick=null;
	}

	public void setIncrementar() {
		mensajes+=1;
	}
	
	public void setDecrementa() {
		mensajes-=1;
	}
/**
 * 	
 * @param cor
 */
	public  void setModificaCorreo(String cor) {
		correo=cor;
	}
/**
 * 	
 * @param ni
 */
	public  void setModificaNick(String ni) {
		nick=ni;
	}
	
	public String Mostrar() {
		return "[Correo: "+correo+", Nick: "+nick+", Numero mensajes: "+mensajes;
	}
}