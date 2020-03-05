package ejercicio4;

public class Revista extends Publicacion implements Prestable{

	private int num; 
	
	public Revista(){ 
		super();    
	} 
	
	public Revista(String c,String t,short f,int n){ 
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
	
	public int getNum() { 
		return num;    
	}
}
