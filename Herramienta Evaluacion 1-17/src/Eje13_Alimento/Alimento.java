package Eje13_Alimento;

public class Alimento {		//java joptionpane

	private String nombre;
	private double lipidos, hidratos, proteinas;
	private boolean origenAnimal;
	private char vitaminas, minerales;
	char alto='A', medio='M', bajo='B';
	
	Alimento(String nom, double lipi, double hidra, double prote){
		this.nombre = nom;
		this.lipidos = lipi;
		this.hidratos = hidra;
		this.proteinas = prote;
	}
	
	public void setVitaminas(char vita) {
		this.vitaminas = vita;
	}
	
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
	
	public String setOrigenAnimal() {
		if(origenAnimal == true) {
			return "Si es de origen animal";
		}else {
			return "No es de origen animal";
		}
	}
	
	public String getesDietetico() {
		if(lipidos<20 && vitaminas != bajo) {
			return "El alimento es Dietetico";
		}else {
			return "El alimento no es Dietetico";
		}
	}
	
	public String getmuestraAlimento() {
		return nombre+" tiene:"+"\n"+lipidos+"% de lipidos"+"\n"+hidratos+"% de hidratos"
				+"\n"+proteinas+"% de proteinas"+"\n"+setOrigenAnimal()+"\n"+getVitamina()+"  "+getMineral()+"\n"
				+getesDietetico();
	}
}
