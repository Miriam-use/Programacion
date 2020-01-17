package Ejercicio5;

import javax.swing.JOptionPane;

public class NIF {

	public static void main(String[] args) {
		 
        //Declaramos como constante por lo que dividir
        final int DIVISOR=23;
 
        //Insertamos el DNI
        String texto=JOptionPane.showInputDialog("Escribe los numero de tu DNI");
        int dni=Integer.parseInt(texto);
 
        //Sacamos el resto
        int res=dni%DIVISOR;
 
        //Invocamos el metodo
        char letra=letraNIF(res);
 
        //Mostramos el DNI completo
        System.out.println("Tu DNI es " +dni+"-"+letra);
 
    }
    public static char letraNIF(int res){
 
        //Definimos el array de char
        char letrasNIF[]={'T', 'R', 'W', 'A', 'G', 'M', 'Y',
                          'F', 'P', 'D', 'X', 'B', 'N', 'J', 'Z',
                          'S', 'Q', 'V', 'H', 'L', 'C', 'K', 'E'};
 
        //Devolvemos el valor en la posicion del array
        return letrasNIF[res];
    }
}
