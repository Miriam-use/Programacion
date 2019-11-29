package Eje7_Asignatura;
/**
 * <h2>Implementar la clase Asignatura que represente el nombre de una asignatura y la nota correspondiente obtenida.</h2>
 * @author Miriam
 *
 */
public class Asignatura {
	
	private String asig;
	private int not;

	/**
	 * Constructor que acepte como par�metros el nombre de la asignatura y la
	 * nota obtenida.
	 * @param asig
	 * @param not
	 */
	public Asignatura(String asig, int not){
		this.asig = asig;
		this.not = not;
	}

	/**
	 * M�todos para modificar la nota (setNota) y para consultar la nota (getNota).
	 * @param nota
	 */
	public void setNota(int nota) {
		this.not = nota;
	}
	
	public int getNota() {
		return not;
	}
	
	/**
	 * M�todo que nos devuelva "Aprobado" si la nota es mayor o igual a 5 o "Suspenso" si la nota es menor que 5.
	 * @return
	 */
	public String getCalificasion() {
		if(not<=10 && not >=5) {
			return "Aprobado";
		}else {
			return "Suspenso";
		}
	}
	
	/**
	 * M�todo para consultar el nombre de la asignatura.
	 * @return
	 */
	public String getAsignature() {
		return asig;
	}
	
	public String getNotasAsignatura() {
		return asig+"\n"+not+"\n"+getCalificasion()+"\n";
	}
}
