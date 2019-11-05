package Eje_1Persona;

public class MainPersona {

	public static void main(String[] args) {
		
		Persona p1 = new Persona();
		
		System.out.println("Su nombre es: "+p1.getNombre());
		System.out.println("Su apellido es: "+p1.getApellidos());
		System.out.println("Su NIF es: "+p1.setNif());
	
		Persona p2 =new Persona("Manolo", "Barragan", "15923040B");
			
		System.out.println("Su nombre es: "+p2.getNombre());
		System.out.println("Su apellido es: "+p2.getApellidos());
		System.out.println("Su NIF es: "+p2.setNif());
	}

}
