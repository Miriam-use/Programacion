package ejercicio4;
/**
 * 
 * @author Miriam
 *
 */
public class Revista extends Publicacion implements Prestable{

	private int num; 
	
	public Revista(){ 
		super();    
	} 
/**
 * 	
 * @param c
 * @param t
 * @param f
 * @param n
 */
	public Revista(String c,String t,String f,int n){ 
		super(c,t,f); num=n;    
	} 
	
	public void prestar(){
		
	} 
	
	public void devolver(){
		
	} 
	
	public String prestado(){       
		Libro l=new Libro(); 
		if (l.getPrestado()) {
			return super.toString()+"Libro no disponible";
		}else {
			return super.toString()+"Libro disponible";    
		}		
	}
	
	public String toString() { 
		return super.toString()+"\nNº Revista: "+num;    
	} 
/**
 * 	
 * @return num
 */
	public int getNum() { 
		return num;    
	}
}
