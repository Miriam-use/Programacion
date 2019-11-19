package Eje7_Asignatura;

public class Asignatura {

	private String asig;
	private int not;
	
	public Asignatura(String asig, int not){
		this.asig = asig;
		this.not = not;
	}

	public void setNota(int nota) {
		this.not = nota;
	}
	
	public int getNota() {
		return not;
	}
	
	public String getCalificasion() {
		if(not<=10 && not >=5) {
			return "Aprobado";
		}else {
			return "Suspenso";
		}
	}
	
	public String getAsignature() {
		return asig;
	}
	
	public String getNotasAsignatura() {
		return asig+"\n"+not+"\n"+getCalificasion()+"\n";
	}
}
