package Eje16_Personajes;
/**
 * <h2>Clase Personajes, se utiliza para crear dos tipos de personajes de videojuego</h2>
 * 
 * Buscar informacion de javadoc en <a href="http://google.com">GOOGLE</a>
 * @version 1-2019
 * @author Miriam
 * @since 26-11-2019
 */
public class Personajes {

	private String nombre, arma, poder;
	private int energia;
	
	public void setAlimenta(int comida) {
		this.energia = comida;
	}
	
	private int getCombatirGerrero() {
		return energia = energia-50;
	}
}
