package Eje5_Empleado;

public class MainEmpleado {

	public static void main(String[] args) {

		Empleado pers = new Empleado();
		
		pers.setPagoHoraExtra(5);
		pers.setPagaExtra(10);
	
		pers.setCasado(true);
		pers.setTenerHijo(2);
		
		pers.setSueldo(1000);
		pers.setIrmf(20);
		
		System.out.println(pers.getprintln());
		System.out.println(pers.getprintAll());
	}

}
