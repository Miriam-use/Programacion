package EJE1;

import java.io.Serializable;
/**
 * 
 * @author Miriam
 *
 */
public class Empleado implements Serializable {

	private int identificador;
	private String apellido;
	private String departamento;
	private int salario;
	private boolean activo;
/**
 * 	identificador=0;
 *	apellido="NN";
 *	departamento="NN";
 *	salario=0;
 *	activo=true;
 */
	public Empleado() {
		identificador=0;
		apellido="NN";
		departamento="NN";
		salario=0;
		activo=true;
		
	}
/**
 * 	
 * @param id
 * @param apll
 * @param dpt
 * @param sal
 * @param act
 */
	public Empleado(int id, String apll, String dpt, int sal, boolean act) {
		this.identificador=id;
		this.apellido=apll;
		this.departamento=dpt;
		this.salario=sal;
		this.activo=act;
	}
/**
 * 
 * @return identificador
 */
	public int getIdentificador() {
		return identificador;
	}
/**
 * 
 * @param identificador
 */
	public void setIdentificador(int identificador) {
		this.identificador = identificador;
	}
/**
 * 
 * @return apellido
 */
	public String getApellido() {
		return apellido;
	}
/**
 * 
 * @param apellido
 */
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
/**
 * 
 * @return departamento
 */
	public String getDepartamento() {
		return departamento;
	}
/**
 * 
 * @param departamento
 */
	public void setDepartamento(String departamento) {
		this.departamento = departamento;
	}
/**
 * 
 * @return salario
 */
	public int getSalario() {
		return salario;
	}
/**
 * 
 * @param salario
 */
	public void setSalario(int salario) {
		this.salario = salario;
	}
/**
 * 
 * @return activo
 */
	public boolean isActivo() {
		return activo;
	}
/**
 * 
 * @param activo
 */
	public void setActivo(boolean activo) {
		this.activo = activo;
	}
/**
 * 	
 * @return getApellido().length()*2 + 2 + 4 + 1;
 */
	public int getTamaño() {
        return getApellido().length()*2 + 2 + 4 + 1;
    }

	@Override
	public String toString() {
		return "Empleado [identificador=" + identificador + ", apellido=" + apellido + ", departamento=" + departamento
				+ ", salario=" + salario + "]";
	}
	
	
}
