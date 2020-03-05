package ejercicio5;

public class Directivo extends Empleado{

	private double sueldo;
	private int comicion;
	
	public Directivo(String nom, String d, double suel, int com) {
		super(nom, d);
		this.sueldo=suel;
		this.comicion=com;
	}
	
	public double getSueldos() {
		return sueldo;
	}
	
	public int getComiciones() {
		return comicion;
	}

	@Override
	public String calcularSaldo() {
		return "Sueldo mas comision: "+(sueldo+comicion);
	}

}
