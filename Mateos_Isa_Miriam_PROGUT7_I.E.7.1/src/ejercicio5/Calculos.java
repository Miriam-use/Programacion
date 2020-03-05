package ejercicio5;

public interface Calculos {

	public static String Retencion(double sueldo){
		if(sueldo<1000) {
			return "Su retencion es de 12%";
		}else {
			if(sueldo>=1000 && sueldo<1500) {
				return "Su retencion es de 15%";
			}else {
				if(sueldo>=1500 && sueldo<2500) {
					return "Su retencion es de 18%";
				}else {
					return "Su retencion es de 20%";
				}
			}
		}
	}
	
	public static void Gratificacion(int hijo) {
		if(hijo==0) {
			System.out.println("No tiene gratificacion");
		}else {
			if(hijo>=1 && hijo<=3) {
				System.out.println("Tiene gratificacion de 200 euros");
			}else {
				System.out.println("Tiene gratificacion de 300 euros");
			}
		}
	}
	
	public static String Calcular() {
		
	}
}
