package Eje_3Numero;

public class MainNumero {

	public static void main(String[] args) {
	
		Numero numero = new Numero ();
		
		System.out.println("El valor es: "+numero.getValor()+" su doble es: "+numero.getDoble()+" su triple es: "+numero.getTriple());
		System.out.println("Si le suma 1 es: "+numero.getAniade()+" y se le resta 1 es: "+numero.getResta());
		
		numero.setNumero(2);
		
		System.out.println("El valor es: "+numero.getValor()+" su doble es: "+numero.getDoble()+" su triple es: "+numero.getTriple());
		System.out.println("Si le suma 1 es: "+numero.getAniade()+" y se le resta 1 es: "+numero.getResta());
		
	}

}
