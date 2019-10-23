package Coche;

public class Coche {
	
	//atributo
	String marca;
	String modelo;
	
	//constructor
	Coche(){
		marca="ford";
		modelo="focus";
	}
	
	Coche(String mar, String mod){
		marca=mar;
		modelo=mod;
	}
	
	//metodo
	public void setMarca(String mar) {
		marca=mar;
	}
	
	public void setModelo(String mod) {
		modelo=mod;
	}
	
	public String getMarca() {
		return marca;
	}
	
	public String getModelo() {
		return modelo;
	}

}
