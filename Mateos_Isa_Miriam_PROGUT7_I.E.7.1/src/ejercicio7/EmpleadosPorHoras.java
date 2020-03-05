package ejercicio7;

public class EmpleadosPorHoras extends Empleado {
	
		double salario;
		int hora;
/**
 * 	
 * @param n
 * @param id
 * @param sa
 * @param h
 */
	    public EmpleadosPorHoras(String n, int id, double sa,int h) {
	        super(n, id);
	        salario=sa;
	        hora=h;
	    }
/**
 * 	    
 * @return hora
 */
	    public int getHora() {
	        return hora;
	    }
/**
 * 
 * @param hora
 */
	    public void setHora(int hora) {
	        this.hora = hora;
	    }
/**
 * calcula el salaria por las horas
 */
	    public void pagar() {
	       
	        if (hora<=39){
	            salario=getHora()*2500;
	            System.out.println("su salario es:"+salario);   
	        }
	        if (hora>=40){
	            salario=getHora()*3750;
	            System.out.println("su salario es:"+salario);
	        }
	           
	   }
}
