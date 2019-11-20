package Eje12_Sueldo;

public class Sueldo {

	private String nombre;
	private int hora;
	private double cobra, sueldo;
	
	Sueldo(String nom, int hora, double cobra){
		this.nombre = nom;
		this.hora = hora;
		this.cobra = cobra;
	}
	
	public double getSueldo() {
		return sueldo;
	}
	
	public String getDatos() {
		return nombre+" trabaja "+hora+" horas, cobra "+cobra+" euros por lo que le corresponde un "+"\n"+"sueldo de "+sueldo+" euros";
	}
}
