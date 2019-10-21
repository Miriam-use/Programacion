package actividad;

import java.util.Scanner;

public class EJ13 {

	public static void main(String[] args) {
		Scanner numero = new Scanner(System.in);
		
		int re = 1;
		
		System.out.println("Diga el dia de salida del tren:");
		int dia=numero.nextInt();
		System.out.println("Diga la hora de la salida del tren:");
		int hora=numero.nextInt();
		System.out.println("Diga el minuto de salida del tren:");
		int min=numero.nextInt();
		System.out.println("");
		System.out.println("Diga el dia de llegada del tren:");
		int dia_fin=numero.nextInt();
		System.out.println("Diga la hora de la llegada del tren:");
		int hora_fin=numero.nextInt();
		System.out.println("Diga el minuto de llegada del tren:");
		int min_fin=numero.nextInt();
		
		do
		{
			if(dia>dia_fin)
			{
				System.out.println("ERROR 404. ¿Quiere intentarlo de nuevo? (1=si; 0=no)"); 
				re=numero.nextInt();
				System.out.println("Diga el dia de salida del tren:");
				dia=numero.nextInt();
				System.out.println("Diga la hora de la salida del tren:");
				hora=numero.nextInt();
				System.out.println("Diga el minuto de salida del tren:");
				min=numero.nextInt();
				System.out.println("");
				System.out.println("Diga el dia de llegada del tren:");
				dia_fin=numero.nextInt();
				System.out.println("Diga la hora de la llegada del tren:");
				hora_fin=numero.nextInt();
				System.out.println("Diga el minuto de llegada del tren:");
				min_fin=numero.nextInt();
				
				int dia_tarda=dia_fin-dia;
				int hora_tarda=hora+hora_fin;
				int min_tarda=(min_fin+min)*60;
				System.out.println("Ha tardado: "+dia_tarda+" dias, "+hora_tarda+" horas "+min_tarda+" minutos.");
			}else
			{
				int dia_tarda=dia_fin-dia;
				int hora_tarda=hora+hora_fin;
				int min_tarda=(min_fin+min)*60;
				System.out.println("Ha tardado: "+dia_tarda+" dias, "+hora_tarda+" horas "+min_tarda+" minutos.");
			}
			System.out.println("¿Quiere intentarlo de nuevo? (1=si; 0=no)"); 
			re=numero.nextInt();
		}while(re==0);

	}

}
