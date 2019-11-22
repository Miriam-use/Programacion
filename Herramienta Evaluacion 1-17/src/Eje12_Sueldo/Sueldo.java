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
	/**La empresa paga la tarifa
	normal en las primeras 40 horas de trabajo de cada empleado, 
	y paga tarifa y
	media en todas las horas trabajadas que excedan de 40. */
	public double getSueldo() {
		if(hora > 40) {
			return sueldo = ((hora*cobra)+cobra);
		}else {
			return sueldo = (hora*cobra);
		}
	}
	
	public String getDatos() {
		return nombre+" trabaja "+hora+" horas, cobra "+cobra+" euros por lo que le corresponde un "+"\n"+"sueldo de "+getSueldo()+" euros";
	}
}
