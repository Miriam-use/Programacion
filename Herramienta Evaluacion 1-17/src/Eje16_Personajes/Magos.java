package Eje16_Personajes;

public class Magos extends Personajes{

	private String poder;
	private int energiaMago;
	
	public Magos(String nombre, int energia, String pode){
		super(nombre, energia);
		this.poder = pode;
		this.energiaMago = 100;
	}
	
	public String getAtaqueMago() {
		if(energia>energiaMago) {
			return "Energia insuficiente para el ataque";
		}else {
			return "Nivel de energia del mago "+(energiaMago-energia-2);
		}
	}
	
	public String getDatosMago() {
		return "El mago "+nombre+" con energia inicial de "+energiaMago+", a hecho un ataque con el arma "+poder+" con "+energia+" de energia. "+getAtaqueMago();
	}
}
