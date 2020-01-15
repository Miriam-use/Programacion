package Ejercicios1_40;

/**
 * 
 * @author Miriam
 *
 */
public class Ejercicio34 {
/**
 * 	
 * @param args
 */
	public static void main(String[] args) {
		
		int matriz[][]= new int[4][4], i, x;

		for (i=0; i<3; i++) {
			for (x=0; x<3; x++){
				int numero = (int)(Math.random()*10+1);
				matriz[i][x]=numero;
			}
		}
/**
* inicia la examinación de la matriz
*/
		for (x=0;x<3;x++){
/**
*  aqui encuentra el menor de la hilera
*/
			matriz[x][3]=matriz[x][0];
		for (i=0; i<3;i++)
		if (matriz[x][i]>matriz[3][x])
		matriz[3][x]=matriz[i][x];//guarda el mayor en el cuarta columna de la fila correspodiente
		}

		for (i=0; i<3;i++)
		for (x=0; x<3; x++)
		if (matriz[x][3]==matriz[3][i])//aqui compara los numeros mayores y menores de cada fila y columna y los que sean iguales son los puntos de silla
		System.out.println("El punto de silla es:"+matriz[x][3]);

		}
}


