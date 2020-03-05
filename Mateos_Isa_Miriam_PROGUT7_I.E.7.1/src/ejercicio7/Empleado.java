package ejercicio7;

public abstract class Empleado {

	private String nombre;
    private int Identificacion;
/**
 *   
 * @param n
 * @param id
 */
    public Empleado(String n, int id) {
        super();
        nombre = n;
        Identificacion = id;
      
    }
/**
 *     
 * @return nombre
 */
    public String getNombre() {
        return nombre;
    }
/**
 *     
 * @param nombre
 */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
/**
 *     
 * @return Identificacion
 */
    public int getIdentificacion() {
        return Identificacion;
    }
 /**
  *    
  * @param identificacion
  */
    public void setIdentificacion(int identificacion) {
        Identificacion = identificacion;
    }
  
  
    public abstract void pagar();
}
