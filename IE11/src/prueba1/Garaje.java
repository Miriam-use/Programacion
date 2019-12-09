package prueba1;

public class Garaje {

	private Coche coche=null;
	private String averia=null;
	private int numCoche=0;
	
	public int getNumeroCocheAtendido() {
			return numCoche;		
	}
	public boolean aceptarCoche(Coche c, String a) {
		if(coche != null) {
			return false;
		}
		coche = c;
		averia = a;
		if(averia.equals("aceite")) {
			coche.getMotor().setAceites(coche.getMotor().getAceites()+10);
		}
		coche.acumularAveria(Math.random());
		numCoche++;
		return true;
	}
	
	public void devolverCoche() {
		coche = null;
		averia = null;
	}
}
