package Eje9_Persona;

public class Estudiante {

	private int cod;
	private double pagopension, rango;
	private String cate, colegio;
	
	Estudiante(String colegio, String cate, int cod){
		this.colegio = colegio;
		this.cate = cate;
		this.cod = cod;
	}
	
	public void setDescuento(double pagopension) {
		this.rango = pagopension;
	}
	
	public String getDescuento() {
		if(rango<=13) {
			return "Se le aplica un descuento de 0% : "+rango;
		}if(rango>13 && rango <16) {
			return "Se le aplica un descuento de 8% : "+(rango-0.08);
		}if(rango>=16) {
			return "Se le aplica un descuento de 15% : "+(rango-0.15);
		}else {
			return "ERROR";
		}
	}
	
	public String getEstudio() {
		return colegio+" "+cate+" "+cod+"\n"+getDescuento();
	}
	
	public static void main(String[] args) {
		
		Estudiante estu = new Estudiante("ies San Jose", "Tecnico", 1025);
		estu.setDescuento(14.5);
		System.out.println(estu.getEstudio());
	}
}
