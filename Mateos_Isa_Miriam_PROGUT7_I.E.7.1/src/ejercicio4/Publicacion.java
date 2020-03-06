package ejercicio4;
/**
 * 
 * @author Miriam
 *
 */
public class Publicacion {

	private String cod;
	private String tit; 
	private String fecha; 
	
	public Publicacion (){
		} 
/**
 * 	
 * @param codigo
 * @param titulo
 * @param fecha
 */
	public Publicacion (String codigo,String titulo,String fecha){ 
		this.cod=codigo; 
		this.tit=titulo; 
		this.fecha=fecha;    
	} 
	
	public String toString() { 
		return"Titulo: "+tit+"\nCod: "+cod+"\nFecha publicacion: "+fecha;    
		} 
/**
 * 	
 * @return tit
 */
	public String getTit() { 
		return tit;    
		} 
/**
 * 	
 * @return cod
 */
	public String getCod() { 
		return cod; 
	} 
/**
 * 	
 * @return fecha
 */
	public String getFecha() { 
		return fecha;    
	} 
/**
 * 	
 * @param cod 
 */
	public void setCod(String cod) { 
		this.cod = cod;    
	} 
/**
 * 	
 * @param tit
 */
	public void setTit(String tit) { 
		this.tit = tit;
	} 
/**
 * 	
 * @param fecha
 */
	public void setFecha(String fecha) { 
		this.fecha = fecha;    
	}
	
}
