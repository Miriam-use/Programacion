package ejercicio6;
/**
 * 
 * @author Miriam
 *
 */
public class Pintura extends Obras{

	private double alto, ancho;
	private String soporte;
/**
 * 	
 * @param tit
 * @param num
 * @param a
 * @param anio
 * @param alt
 * @param an
 * @param sop
 */
	public Pintura(String tit, int num, Artista a, int anio, double alt, double an, String sop) {
		super(tit, num, a, anio);
		this.alto=alt;
		this.ancho=an;
		this.soporte=sop;
	}
/**
 * 	
 * @return alto
 */
	public double getAlto() {
		return alto;
	}
/**
 * 	
 * @return ancho
 */
	public double getAncho() {
		return ancho;
	}
/**
 * 	
 * @return soporte
 */
	public String getSoporte() {
		return soporte;
	}

	@Override
	public String toString() {
		return super.toString()+", Alto: "+alto+", Ancho: "+ancho+", Soporte: "+soporte+"]";
	}
	
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		return super.equals(obj);
	}
}
