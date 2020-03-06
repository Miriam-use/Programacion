package ejercicio6;
/**
 * 
 * @author Miriam
 *
 */
public class Obras {

	private String titulo;
	private int numero;
	private int a�ocreacion;
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
		this.a�ocreacion=anio;
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
 * @return a�o de creacion
 */
	public int getA�o() {
		return a�ocreacion;
	}
	
	public String mostra() {
		return autor.toString()+", Titulo: "+titulo+", Numero: "+numero+", A�o de creacion: "+a�ocreacion;
	}
	
	@Override
	public String toString() {
		return autor.toString()+", Titulo: "+titulo+", Numero: "+numero+", A�o de creacion: "+a�ocreacion;
	}
	
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		return super.equals(obj);
	}
	
}
