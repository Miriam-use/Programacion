package Ejercicios1_40;

public class Ejercicio10 {

	public static void main(String[] args) {

		int vector[] = new int[100];
		
		for(int i=0; i<vector.length; i++) {
			int n = (int)(Math.random()*(80-10)+10);
			vector[i]=n;
			System.out.println(vector[i]);
			}
		
		int mayor=vector[0];
		for(int i=0; i<vector.length; i++) {
			if(vector[i]>mayor) {
				mayor = vector[i];
			}
		}
		System.out.println("El mayor es: "+mayor);	//el mayor
		
		int menor=vector[0];
		for(int i=0; i>vector.length; i++) {
			if(vector[i]>menor) {
				menor = vector[i];
			}
		}
		System.out.println("El menor es: "+menor);	//el menor
		
		//el que mas se repite
		int maxRep=0;
		int f=0;
		int moda=0;
		for(int i=0; i<vector.length; i++) {
			for(int j=0; j<vector.length; j++) {
				if(vector[i]==vector[j]) {
					f++;
				}
				if(f>maxRep) {
					moda=vector[i];
					maxRep=f;
				}
			}
		}
		System.out.println("El numero "+moda+" se repite "+maxRep+" veces");
		
		//calcular la media
		double media=0.0;
		for(int i=0; i<vector.length; i++) {
			media = media +vector[i];
		}
		media = media/vector.length;
		
		System.out.println("Su media es de: "+media);
	}
}
