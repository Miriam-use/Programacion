package Eje14_Marciano;
/**
 * <h2>Clase que nos permite crear y matar marcianos</h2>
 * @author Miriam
 * 
 */
public class Marciano {

	protected boolean vivo = false, opcion;   
    private String soy;
	private String vivomuerto;
	private String muerto;
    private static int total = 0;
    
    /**
     * Un m�todo constructor que pasar� como par�metro el nombre del marciano y cambiar el estado del atributo vivo y ponerlo a true.
     * @param soy
     */
    public Marciano(String soy) {
    	vivo=true;  
        this.soy = soy; 
    }
    
    public void setNacer(String soy) {
    	vivo=true;  
        this.soy = soy;
    }
    
    /**
     * Un m�todo llamado nace que nos permitir� visualizar el mensaje
     * @return
     */
    public String getNacer() {
    	return "Hola, he nacido y soy el marciano "+soy;
    }
	
	public boolean isVivo(){   
        return vivo;   
    }   
	
	/**
	 * Un metodo que cambia el atrivuto de vivo a false
	 * @param op
	 */
	public void setMuerto(boolean op) {
		this.opcion=op;
		if(opcion==true) {
			System.out.println("El marciano ha muerto.");
		}else {
			System.out.println("El marciano no ha muerto.");
		}
	}
	
	public void setMuer(String muerto) {
		vivo=false;
		this.muerto=muerto;
	}
	
	/**
	 * Un m�todo llamado estaVivo que nos permitir� saber si un marciano est� vivo o no.
	 * @param vivomuerto
	 */
	public void setestaVivo(String vivomuerto){
		this.vivomuerto = vivomuerto;
		if(vivomuerto==muerto) {
			System.out.println("El marciano ya esta muerto.");
		}else {
			System.out.println("El marciano esta vivo.");
		}
	}
	
}
