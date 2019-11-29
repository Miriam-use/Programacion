package Eje14_Marciano;

public class Marciano {

	protected boolean vivo = false, opcion;   
    private String soy;
	private String vivomuerto;
	private String muerto;
    private static int total = 0;
    
    public Marciano(String soy) {
    	vivo=true;  
        this.soy = soy; 
    }
    
    public void setNacer(String soy) {
    	vivo=true;  
        this.soy = soy;
    }
    
    public String getNacer() {
    	return "Hola, he nacido y soy el marciano "+soy;
    }
	
	public boolean isVivo(){   
        return vivo;   
    }   
	
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
	
	public void setestaVivo(String vivomuerto){
		this.vivomuerto = vivomuerto;
		if(vivomuerto==muerto) {
			System.out.println("El marciano ya esta muerto.");
		}else {
			System.out.println("El marciano no esta muerto.");
		}
	}
	
}
