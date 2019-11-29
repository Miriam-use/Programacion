package Eje16_Personajes;
/**
 * <h2>tienen además un arma</h2>
 * @author Miriam
 * @see
 */
public class Guerreros extends Personajes{

	private String arma;
	private int energiaGuerrero;
	
	public Guerreros(String nombre, int energia, int nivel, String arma) {
		super(nombre, energia);
		this.energiaGuerrero = nivel;
		this.arma = arma;
	}
	
	public String getAtaqueGuerrero() {
		if(energia>energiaGuerrero) {
			return "Energia insuficiente para el ataque";
		}else {
			return "Nivel de energia del guerrero "+(energiaGuerrero-energia);
		}
	}

	public String getDatosGuerrero() {
		return "El guerrero "+nombre+" con energia inicial de "+energiaGuerrero+", a hecho un ataque con el arma "+arma+" con "+energia+" de energia. "+getAtaqueGuerrero();
	}
}
