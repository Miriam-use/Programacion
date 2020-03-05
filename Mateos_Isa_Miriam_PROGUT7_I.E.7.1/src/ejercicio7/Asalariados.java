package ejercicio7;

public class Asalariados extends Empleado{

	double salario=2520000;
/**
 * 	
 * @param n
 * @param id
 * @param sal
 */
    public Asalariados(String n, int id, double sal) {
        super(n, id);
        salario=sal;
    }
/**
 * muestra salario   
 */
    public void pagar(){
        System.out.println("su salario es "+salario);     
    }
}
