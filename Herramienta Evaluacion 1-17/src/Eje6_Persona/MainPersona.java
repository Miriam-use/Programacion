package Eje6_Persona;

public class MainPersona {


	public static void main(String[] args) {
		
		Empleado p1 = new Empleado("Mario", 29, 1000);
		System.out.println(p1.getResponsabilidades()+p1.getSueldo());
	}

}
