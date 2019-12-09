package prueba1;

public class Test {

	public static void main(String[] args) {
		
		Coche c1 = new Coche("Fiat", "Cinquecento");
		Coche c2 = new Coche("Renault", "Clio");
		
		Garaje g = new Garaje();
		
		System.out.println("Numero de coches atendidos: "+g.getNumeroCocheAtendido());
		
		if(!g.aceptarCoche(c1, "Pinchazo de Rueda")){
			System.out.println("Atendiendo coche...");
		}
		
		if(!g.aceptarCoche(c1, "Sin gasolina")){
			System.out.println("Ya esta atendiendo otro coche, no se puede coger mas coches");
		}
		
		g.devolverCoche();
		
		if(!g.aceptarCoche(c2, "Gripazo del motor")){
			System.out.println("Atendiendo coche...");
		}else {//pasara un tiempo
			g.devolverCoche();
		}
		
		if(!g.aceptarCoche(c2, "aceite")){
			System.out.println("Atendiendo coche...");
		}else {//pasara un tiempo
			g.devolverCoche();
		}
		
		if(!g.aceptarCoche(c2, "aceite")) {
			System.out.println("Atendiendo coche...");
		}else {
			g.devolverCoche();
		}
		
		System.out.println("Coche 1 Averia "+c1.acumularAveria()+" Aceite "+c1.getMotor().getAceites());
		System.out.println("Coche 2 Averia "+c2.acumularAveria()+" Aceite "+c2.getMotor().getAceites());
	}
}
