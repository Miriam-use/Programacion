package Eje_4Conversion;

public class MainConversion {

	public static void main(String[] args) {

		Conversion conversion = new Conversion ();
		
		System.out.println(conversion.getValor()+" millas, en metros es: "+conversion.getmillasAMetros()+" metro");
		System.out.println("y en kilometros es: "+conversion.getmillasAKilometros()+" kilometro");
	
	
	conversion.setValor(10);
	
	System.out.println(conversion.getValor()+" millas, en metros es: "+conversion.getmillasAMetros()+" metro");
	System.out.println("y en kilometros es: "+conversion.getmillasAKilometros()+" kilometro");
	
	}
}
