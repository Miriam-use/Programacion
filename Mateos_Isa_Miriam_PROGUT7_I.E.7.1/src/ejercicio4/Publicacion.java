package ejercicio4;

public class Publicacion {

	private String cod,tit; 
	private short fecha; 
	
	public Publicacion (){
		} 
	
	public Publicacion (String codigo,String titulo,short fecha){ 
		cod=codigo; tit=titulo; this.fecha=fecha;    
	} 
	
	public String toString() { 
		return"Titulo: "+tit+"\nCod: "+cod+"\nFecha publicacion: "+fecha;    
		} 
	
	public String getTit() { 
		return tit;    
		} 
	
	public String getCod() { 
		return cod; 
	} 
	
	public int getFecha() { 
		return fecha;    
	} 
	
	public void setCod(String cod) { 
		this.cod = cod;    
	} 
	
	public void setTit(String tit) { 
		this.tit = tit;
	} 
	
	public void setFecha(short fecha) { 
		this.fecha = fecha;    
	}
	
}
