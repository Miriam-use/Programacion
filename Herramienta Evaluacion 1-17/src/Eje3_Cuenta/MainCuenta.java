package Eje3_Cuenta;

public class MainCuenta {

	public static void main(String[] args) {

		Cuenta cuenta = new Cuenta ();
		
		cuenta.setSaldo(1000);
		cuenta.setIngresar(50);
		
		System.out.println(cuenta.Datos());
		System.out.println("Su saldo actual es: "+cuenta.getIngresar()+" "+cuenta.Retirar(100));
		
		Cuenta cuenta2 = new Cuenta();
		
		cuenta2.setSaldo(40000);
		cuenta2.setIngresar(50);
		
		System.out.println(cuenta2.Datos());
		System.out.println("Su saldo actual es: "+cuenta2.getIngresar()+" "+cuenta2.Retirar(650));
	}

}
