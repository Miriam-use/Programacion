package actividad;

import java.util.Scanner;

public class EJ03 {

	public static void main(String[] args) {
		
		Scanner numero = new Scanner(System.in);
		
		int n, nu, cont=0;
		
		System.out.println("Ingrese la cantidad (hasta 100):");
		n=numero.nextInt();
		
		if(n<100)
		{
		for (int i=1;i<=n;i++){
            //Hacemos un casting para que nos devuelva un numero entero
            int raiz=(int)Math.sqrt(i);
            int contador=0;
  
            //Hacemos otro bucle para contar los divisibles
            for (int j=raiz;j>1;j--){
                if (i%j==0){
                    contador++;
                }
            }
  
            /*Segun el numero de divisibles, sabemos si es primo o no
             * Si es primo el contador sera 0
             */
  
            if (contador<1){
                System.out.println(i);
            	}

			}
		}else
		{
			System.out.println("ERROR");
		}

	}
}
