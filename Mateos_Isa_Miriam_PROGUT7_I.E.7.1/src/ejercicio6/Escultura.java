package ejercicio6;
/**
 * 
 * @author Miriam
 *
 */
public class Escultura extends Obras{

	private String material;
	private double altura;
/**
 * 	
 * @param tit
 * @param num
 * @param a
 * @param anio
 * @param mat
 * @param alt
 */
	public Escultura(String tit, int num, Artista a, int anio, String mat, double alt) {
		super(tit, num, a, anio);
		this.material=mat;
		this.altura=alt;
	}
/**
 * 	
 * @return material
 */
	public String getMaterial() {
		return material;
	}

/**
 * 	
 * @return altura
 */
	public double getAltura() {
		return altura;
	}

	@Override
	public String toString() {
		return super.toString()+", Material: "+material+", Altura: "+altura+"]";
	}
	
	@Override
	public boolean equals(Object obj) {
		// TODO Auto-generated method stub
		return super.equals(obj);
	}
}
