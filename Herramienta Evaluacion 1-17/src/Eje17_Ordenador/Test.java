package Eje17_Ordenador;

import java.util.Scanner;
/**
 * <h2>La clase Test contendrá los métodos estáticos necesarios para controlar
 * que el usuario introduzca los datos correctos.</h2>
 * @author Miriam
 *
 */
public class Test {

	public static void main(String[] args) {
		
		Ordenador o = new Ordenador(); 
		Servidor s = new Servidor();
		Portatil p = new Portatil();
		
		Scanner dat = new Scanner(System.in);
		
			System.out.println("Marca de grafica:");
			String grafi=dat.nextLine();
			o.setGrafica(grafi);
			
			System.out.println("Tamaño de RAM:");
			double ra=dat.nextDouble();
			o.setRam(ra);
			
			System.out.println("Elige tipo de procesador");
			System.out.println("1.-Core i3");
			System.out.println("2.-Core i5");
			System.out.println("3.-Core i7");
			int opcion=dat.nextInt();
			
			switch(opcion) {
			case 1:
				o.setProcesador("Core i3");
			case 2:
				o.setProcesador("Core i5");
			case 3:
				o.setProcesador("Core i7");
			}
			
			do {
			System.out.println("Ingresa presio:");
			double pre=dat.nextDouble();
			o.setPrecio(pre);
			}while(o.getPrecio()<0);
			
			do {
			System.out.println("Tamaño del disco duro");
			double disc=dat.nextDouble();
			o.setDiscoDuro(disc);
			}while((o.getDiscoDuro()%5)!=0);
			
			System.out.println(o.getOrdenador());
			
			do {
			System.out.println("Tamaño del monitor:");
			double moni=dat.nextDouble();
			s.setMonitor(moni);
			}while(s.getMonitor()<14);
			
			System.out.println("Marca del teclado:");
			String tecla=dat.nextLine();
			s.setTeclado(tecla);
			
			dat.nextLine();
			
			System.out.println("Marca del raton");
			String rat=dat.nextLine();
			s.setRaton(rat);
			
			System.out.println(s.getServidor());
				
			System.out.println("Marca del portatil:");
			String marc=dat.nextLine();
			p.setMarca(marc);
			
			System.out.println("Tamaño de la pantalla:");
			double pant=dat.nextDouble();
			p.setPantalla(pant);
			
			System.out.println("PEso del portatil:");
			double peso=dat.nextDouble();
			p.setPeso(peso);
			
			System.out.println(p.getPortatil());
	}

}
