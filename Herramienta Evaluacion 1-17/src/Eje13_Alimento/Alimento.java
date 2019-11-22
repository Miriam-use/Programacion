package Eje13_Alimento;

public class Alimento {

	private String nombre, alto="A", medio="M", bajo="B";
	private int lipidos, hidratos, proteinas;
	private boolean origenAnimal;
	private String vitaminas, minerales;
	
	Alimento(String nom, int lipi, int hidra, int prote){
		this.nombre = nom;
		this.lipidos = lipi;
		this.hidratos = hidra;
		this.proteinas = prote;
	}
	
	public void setVitaminas(String vita) {
		this.vitaminas = vita;
	}
	
	public String getVitamina() {
		if(vitaminas == alto) {
			return "Contenido de vitaminas Alto";
		}else {
			if(vitaminas == medio) {
				return "Contenido de vitaminas Medio";
			}else {
				return "Contenido de vitaminas Bajo";
			}
		}
	}
	
	public void setMineral(String mine) {
		this.minerales = mine;
	}
	
	public String getMineral() {
		if(minerales == alto) {
			return "Contenido de vitaminas Alto";
		}else {
			if(minerales == medio) {
				return "Contenido de vitaminas Medio";
			}else {
				return "Contenido de vitaminas Bajo";
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
	
	public String getInformacion() {
		return nombre+" tiene:"+"\n"+lipidos+"% de lipidos"+"\n"+hidratos+"% de hidratos"
				+"\n"+proteinas+"% de proteinas"+"\n"+setOrigenAnimal()+"\n"+getVitamina()+"  "+getMineral();
	}
}
