package ejercicio7;
/**
 * 
 * @author Miriam
 *
 */
public class AsalariadosPorComision extends Empleado{
	
	double salario=680000;
    double porcentaje;
/**
 *     
 * @param n
 * @param id
 * @param sal
 * @param por
 */
    public AsalariadosPorComision(String n, int id, double sal, double por) {
        super(n, id);
        salario=sal;
        porcentaje = por;
    }

/**
 *    
 * @return porcentaje
 */
    public double getPorcentaje() {
        return porcentaje;
    }

/**
 * 
 * @param porcentaje
 */
    public void setPorcentaje(double porcentaje) {
        this.porcentaje = porcentaje;
    }

/**
 * salario total
 */
    public void pagar() {
        double sal=salario*0.1;
        double salt=salario+sal;
        double salu=getPorcentaje()*0.3;
        double salariototal=salario+salu+salt;
        System.out.println("su salario es:"+salariototal);
    }

}
