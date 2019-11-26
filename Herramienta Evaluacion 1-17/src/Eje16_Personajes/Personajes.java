package Eje16_Personajes;

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
