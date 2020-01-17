package Ejercicios1_40;

import java.util.Scanner;
/**
 * 
 * @author Miriam
 *
 */
public class Ejercicio19 {

	Scanner Leer = new Scanner(System.in);
/**
 * 	   
 * @param M
 * @param f
 * @param c
 */
	  public static void llenar (int M [] [], int f, int c)
	  {
	      Scanner Leer = new Scanner(System.in);
	    for (int i = 1 ; i <= f ; i++)
	    {
	        for (int j = 1 ; j <= c ; j++)
	        {
	        System.out.print ("Insecte pos[" + i + "][" + j + "]: ");
	        M [i] [j] = Leer.nextInt();
	        }
	    }
	    }
/**
 * 
 * @param M
 * @param f
 * @param c
 */
	    public static void mostrar (int M [] [], int f, int c)
	    {
	    for (int i = 1 ; i <= f ; i++)
	    {
	        System.out.println ();
	        for (int j = 1 ; j <= c ; j++)
	        {
	        System.out.print ("[" + M [i] [j] + "]");
	        }
	    }
	    }
/**
 * 
 * @param M
 * @param f
 * @param c
 * @return
 */
	    public static int menor (int M [] [], int f, int c)
	    {
	    int men = M [1] [1];
	    for (int i = 1 ; i <= f ; i++)
	    {
	        for (int j = 1 ; j <= c ; j++)
	        {
	        if (M [i] [j] < men)
	            men = M [i] [j];
	        }
	    }
	    return (men);
	    }
/**
 * 	    
 * @param M
 * @param f
 * @param c
 * @return
 */
	    public static int maximo (int M [] [], int f, int c)
	    {
	    int max = M [1] [1];
	    for (int i = 1 ; i <= f ; i++)
	    {
	        for (int j = 1 ; j <= c ; j++)
	        {
	        if (M [i] [j] < max)
	            max = M [i] [j];
	        }
	    }
	    return (max);
	    }
/**
 * 
 * @param A
 * @param fa
 * @param ca
 * @param B
 * @param fb
 * @param cb
 */
	    public static void intercambiar (int A [] [], int fa, int ca, int B [] [], int fb, int cb)
	    {
	    int min_a = menor (A, fa, ca);
	    int max_b = maximo (B, fb, cb);
/**
* para cambiar los minimos de A con los maximos de B
*/
	    for (int i = 1 ; i <= fa ; i++)
	    {
	        for (int j = 1 ; j <= ca ; j++)
	        {
	        if (A [i] [j] == min_a)
	            A [i] [j] = max_b;
	        }
	    }
/**
 * para intercambiar los maximos de con los minimos de A
 */
	    for (int i = 1 ; i <= fb ; i++)
	    {
	        for (int j = 1 ; j <= cb ; j++)
	        {
	        if (B [i] [j] == max_b)
	            B [i] [j] = min_a;
	        }
	    }
	    }
	    public static void main (String args [])
	    {
	        Scanner Leer = new Scanner(System.in);
	    int A [] [] = new int [20] [20];
	    int B [] [] = new int [20] [20];
	    System.out.print ("Insecte filas de A: ");
	    int fa = Leer.nextInt();
	    System.out.print ("Insecte columnas de A: ");
	    int ca = Leer.nextInt();
	    System.out.print ("Insecte filas de B: ");
	    int fb = Leer.nextInt();
	    System.out.print ("Insecte columnas de B: ");
	    int cb = Leer.nextInt();
	    /**
	     * lectura de matrices
	     */
	    System.out.println ("\nINSERTANDO DATOS EN MATRIZ A: n");
	    llenar (A, fa, ca);
	    System.out.println ("\nINSERTANDO DATOS EN MATRIZ B: n");
	    llenar (B, fb, cb);
	    System.out.println ("\nMATRICES ORIGINALMENTE INSERTADAS: ");
	    mostrar (A, fa, ca);
	    System.out.println ();
	    mostrar (B, fb, cb);
	    System.out.println ();
	    /**
	     * intercambiando elementos
	     */
	    intercambiar (A, fa, ca, B, fb, cb);
	    System.out.println ("\nMATRICES DESPUES DEL INTERCAMBIO:");
	    mostrar (A, fa, ca);
	    System.out.println ();
	    mostrar (B, fb, cb);
	}
}
