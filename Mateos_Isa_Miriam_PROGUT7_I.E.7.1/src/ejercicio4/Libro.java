package ejercicio4;
/**
 * 
 * @author Miriam
 *
 */
public class Libro extends Publicacion implements Prestable{

	private boolean prestado; 
	
	public Libro(){ 
		super();    
	} 
/**
 * 	
 * @param c
 * @param t
 * @param f
 * @param p
 */
	public Libro(String c,String t,String f,boolean p){ 
		super(c,t,f); this.prestado=p;    
	} 
	
	public String toString() { 
		return super.toString()+"\nPrestado: "+prestado;    
	} 

	public void prestar(){
		
	} 
	
	public void devolver(){
		
	} 
	
	public String prestado(){ 
		if (getPrestado()) {
			return super.toString()+"Libro no disponible"; 
		}else {
			return super.toString()+"Libro disponible";    
		}
		
	} 
/**
 * 	
 * @return prestado
 */
	public boolean getPrestado() { 
		return prestado;    
	}
}
