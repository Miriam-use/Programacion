package Eje5_Empleado;
/**
 * <h2>Crea una clase Empleado que modele la información que una empresa mantiene sobre cada empleado</h2>
 * 
 * Buscar informacion de javadoc en <a href="http://google.com">GOOGLE</a>
 * @version 1-2019
 * @author Miriam
 */
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
