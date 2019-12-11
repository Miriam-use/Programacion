package Ejercicio5;

public class PruebaVehiculo {

	public static void main(String[] args) {

		Coche c1 = new Coche("0000BBB", "gris plata", 4, 3);
		if(c1.getNumRuedas()==4) {
			System.out.println(c1.getCrear()+c1.getNumRuedas());
		}else {
			System.out.println("Tiene que tener 4 ruedas");
		}
		
		Moto m1 = new Moto("2222BBB", "negro", 2, 2);
		if(m1.getnumPlazas()==2) {
			System.out.println(m1.getCrear()+m1.getnumPlazas());
		}else {
			System.out.println("Tiene que tener 2 ruedas");
		}
	}
}
