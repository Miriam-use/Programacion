package Eje_6Cuenta;

public class MainCuenta {

	public static void main(String[] args) {
		
		Cuenta cuenta = new Cuenta ();
		
		cuenta.setSaldo(500);
		cuenta.setIngresar(10);
		cuenta.setRetirar(100);
		
		System.out.println("Numero de cuenta: "+cuenta.getNumero()+"  DNI: "+cuenta.getDni());
		System.out.println("Su saldo actual es: "+cuenta.getActualizarSaldo());
		System.out.println("Al ingresa: "+cuenta.getIngresar()+"  Al retirar: "+cuenta.getRetirar());
	}

}
