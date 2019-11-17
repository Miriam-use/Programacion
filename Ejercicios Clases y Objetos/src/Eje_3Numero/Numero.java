package Eje_3Numero;
/**Realiza una clase número que almacene un número entero y tenga las
siguientes características:
a. Constructor por defecto que inicializa a 0 el número interno.
b. Constructor que inicializa el número interno.
c. Método aniade que permite sumarle un número al valor interno.
d. Método resta que resta un número al valor interno.
e. Método getValor. Devuelve el valor interno.
f. Método getDoble. Devuelve el doble del valor interno.
g. Método getTriple. Devuelve el triple del valor interno.
h. Método setNumero. Inicializa de nuevo el valor interno.
 */

public class Numero {

	private int numero;
	
	public Numero() {
		numero = 0;
	}
	
	public int getValor() {
		return numero;
	}
	
	public int getAniade() {
		return numero=numero+1;
	}
	
	public int getResta() {
		return numero=numero-1;
	}
	
	public int getDoble() {
		return numero*2;
	}
	
	public int getTriple() {
		return numero*3;
	}
	
	public void setNumero(int i) {
		numero=i;
	}

}
