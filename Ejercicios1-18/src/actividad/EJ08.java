package actividad;

public class EJ08 {

	public static void main(String[] args) {
		
		int in=1, fn=100;
		int spar=0, simpar=0;
		
		while(in<=fn)
		{
			if(in%2==0)
			{
				spar+=in;
			}else
			{
				simpar+=in;
			}
			in++;
		}
		System.out.println("La suma de los pares del 1 al 100 es: "+spar);
		System.out.println("La suma de los impares del 1 al 100 es: "+simpar);

	}

}
