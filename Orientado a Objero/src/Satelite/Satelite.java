package Satelite;

public class Satelite {

	private double meridiano;
	private double paralelo;
	private double distancia_tierra;
	
	//atributo
	Satelite(double m, double p, double d){
		meridiano=m;
		paralelo=p;
		distancia_tierra=d;
	}
	//constructor
	Satelite(){
		meridiano=paralelo=distancia_tierra=0;
	}
	//metodo
	public void setPosicion(double m, double p, double d) {
		meridiano=m;
		paralelo=p;
		distancia_tierra=d;
	}
	
	public void printPosicion() {
		System.out.println("El satélite se encuentra en el parametro "+paralelo+" Meridiano "+meridiano+" a una distancia de la tierra de "+distancia_tierra+"kilometros");
	}
	
}
