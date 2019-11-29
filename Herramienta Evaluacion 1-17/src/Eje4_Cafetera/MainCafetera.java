package Eje4_Cafetera;
/**
 * <h2>Clase que simule una cafetera</h2>
 * 
 * Buscar informacion de javadoc en <a href="http://google.com">GOOGLE</a>
 * @version 1-2019
 * @author Miriam
 */
public class MainCafetera {

	public static void main(String[] args) {

		Cafetera cafe1 = new Cafetera();
		
		System.out.println(cafe1.get_capacidadMaxima()+"c.c");
		System.out.println(cafe1.get_cantidadActual()+"c.c");
		
		Cafetera cafe2 = new Cafetera(100, 500);
		System.out.println(cafe2.get_capacidadMaxima()+"c.c");
		System.out.println(cafe2.get_cantidadActual()+"c.c");
		System.out.println(cafe2.getllenarCafetera());
		
		cafe2.setservirTaza(110);
		System.out.println(cafe2.getservirTaza());
		System.out.println(cafe2.getvaciarCafetera());
		
		cafe2.setagregarCafe(20);
		System.out.println(cafe2.getagregarCafe());
		System.out.println("Capacidad actual: "+cafe2.get_cantidadActual()+"c.c");
	}

}
