package ejercicio7;

public class EmpleadosPorComision extends Empleado{
	
	double salario=2500000;
    double porcentaje;
/**
 *     
 * @param n
 * @param id
 * @param sal
 * @param por
 */
    public EmpleadosPorComision(String n, int id, double sal,double por) {
        super(n, id);
   
        salario=sal;
        porcentaje=por;
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



    public void pagar() {
        salario=getPorcentaje()*0.3;
        double sal= getPorcentaje()-salario;
        System.out.println("salario:"+sal);
       
    }

}
