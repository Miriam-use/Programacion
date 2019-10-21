package actividad;

import java.util.Scanner;

public class EJ02 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
 
        System.out.print("Introduzca valor de N (tiene que ser de 4 cifras): ");
        int N = sc.nextInt();
      
        int contador=0; 
        for (int i=N;i>0;i/=10)
        {
            
            contador++;
        }
        
        if(contador==4)
        {
        if (contador==1){
            System.out.println("El numero "+N+ " tiene "+contador+" cifra");
        }else{
            System.out.println("El numero "+N+ " tiene "+contador+" cifras");
        }
        
        System.out.println(N/1000);
        System.out.println((N%1000)/100);
        System.out.println(((N%100)%100)/10);
        System.out.println((((N%100)%100)%10)/1);
        }else
        {
        	System.out.println("Error. No tiene 4 cifras");
        }
				}
			}
		
		

	


