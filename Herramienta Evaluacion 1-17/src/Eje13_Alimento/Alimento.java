package Eje13_Alimento;
/**
 * <h2>Crear una clase de nombre Alimento cuyos objetos representen alimentos.</h2>
 * @author Miriam
 * 
 */
public class Alimento {		//java joptionpane

	private String nombre;
	private double lipidos, hidratos, proteinas;
	private boolean origenAnimal;
	private char vitaminas, minerales;
	char alto='A', medio='M', bajo='B';
	
	/**
	 * Contenido en lípidos, hidratos y proteinas expresado en tanto por ciento.
	 * @param nom
	 * @param lipi
	 * @param hidra
	 * @param prote
	 */
	Alimento(String nom, double lipi, double hidra, double prote){
		this.nombre = nom;
		this.lipidos = lipi;
		this.hidratos = hidra;
		this.proteinas = prote;
	}
	
	public void setVitaminas(char vita) {
		this.vitaminas = vita;
	}
	
	/**
	 * Contenido en vitaminas expresado en los códigos A alto, M medio y B bajo.
	 * @return
	 */
	public String getVitamina() {
		if(vitaminas == alto) {
			return "Contenido de vitaminas es Alto";
		}else {
			if(vitaminas == medio) {
				return "Contenido de vitaminas es Medio";
			}else {
				if(vitaminas == bajo) {
					return "Contenido de vitaminas es Bajo";
				}else {
					return "Error";
				}
			}
		}
	}

	public void setMineral(char mine) {
		this.minerales = mine;
	}
	
	/**
	 * Contenido en minerales expresado en los códigos A alto, M medio y B bajo.
	 * @return
	 */
	public String getMineral() {
		if(minerales == alto) {
			return "Contenido de mineral es Alto";
		}else {
			if(minerales == medio) {
				return "Contenido de mineral es Medio";
			}else {
				if(minerales == bajo) {
					return "Contenido de mineral es Bajo";
				}else {
					return "Error";
				}
			}
		}
	}
	
	
	public void setOrigenAnimal(boolean animal) {
		this.origenAnimal = animal;
	}
	
	/**
	 * Si es o no de origen animal.
	 * @return
	 */
	public String setOrigenAnimal() {
		if(origenAnimal == true) {
			return "Si es de origen animal";
		}else {
			return "No es de origen animal";
		}
	}
	
	/**
	 * retorna cierto si el alimento contiene menos del 20% de lípidos y el contenido en vitaminas no es bajo.
	 * @return
	 */
	public String getesDietetico() {
		if(lipidos<20 && vitaminas != bajo) {
			return "El alimento es Dietetico";
		}else {
			return "El alimento no es Dietetico";
		}
	}
	
	/**
	 * retorna una descripción del alimento.
	 * @return
	 */
	public String getmuestraAlimento() {
		return nombre+" tiene:"+"\n"+lipidos+"% de lipidos"+"\n"+hidratos+"% de hidratos"
				+"\n"+proteinas+"% de proteinas"+"\n"+setOrigenAnimal()+"\n"+getVitamina()+".  "+getMineral()+"\n"
				+getesDietetico();
	}
}
