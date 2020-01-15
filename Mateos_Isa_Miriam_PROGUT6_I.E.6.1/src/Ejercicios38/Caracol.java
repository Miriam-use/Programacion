package Ejercicios38;
/**
 * 
 * @author Miriam
 *
 */
public class Caracol {
/**
 * Generamos Matriz Caracol
 * @param n		dimension de la matriz caracol
 * @param x		numero con cual se iniciara la matriz
 * @return		matriz de enteros con la matriz caracol ya generada
 */
	public static int[][] MatrizCaracol(int n, int x){
		int[][] MC = new int[n+1][n+1];
		
		for(int i=1; i<=n/2; i++) {
			for(int j=i; j<=n-i; j++) {
				MC[i][j]=x;
				x++;
			}
			for(int j=i; j<=n-i; j++) {
				MC[j][n-i+1]=x;
				x++;
			}
			for(int j=n-i+1; j>=i+1; j--) {
				MC[n-i+1][j]=x;
				x++;
			}
			for(int j=n-i+1; j>=i+1; j--) {
				MC[j][i]=x;
				x++;
			}
		}
		if(n%2==1) {
			MC[n/2+1][n/2+1]=x;
		}
		return MC;
	}
/**
 * Una Matriz Cualquiera Por Consola A Partir De La Fila 1 y Columna 1	
 * @param MC	matriz a mostrar
 * @param f		numero de filas de la matriz
 * @param c		numero de columnas de la matriz
 */
	public static void mostrarCaracol(int[][] MC, int f, int c) {
		for (int i = 1; i <= f; i++) {
            for (int j = 1; j <= c; j++) {
                System.out.print("\t" + MC[i][j]);
            }
            System.out.println();
        }
	}
}
