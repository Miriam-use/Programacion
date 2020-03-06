package ejercicio6;
/**
 * 
 * @author Miriam
 *
 */
public class Obras {

	private String titulo;
	private int numero;
	private int añocreacion;
	private Artista autor;
/**
 * 	
 * @param tit
 * @param num
 * @param a
 * @param anio
 */
	public Obras(String tit, int num, Artista a, int anio) {
		this.titulo=tit;
		this.numero=num;
		this.autor=a;
		this.añocreacion=anio;
	}
/**
 * 	
 * @return titulo
 */
	public String getTitulo() {
		return titulo;
	}
/**
 * 	
 * @return numero inventario
 */
	public int getNumero() {
		return numero;
	}
/**
 * 	
 * @return año de creacion
 */
	public int getAño() {
		return añocreacion;
	}
	
	public String mostra() {
		return autor.toString()+", Titulo: "+titulo+", Numero: "+numero+", Año de creacion: "+añocreacion;
	}
	
	@Override
	public String toString() {
		return autor.toString()+", Titulo: "+titulo+", Numero: "+numero+", Año de creacion: "+añocreacion;
	}
	
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		return super.equals(obj);
	}
	
}
