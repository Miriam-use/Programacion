package Ejercicio4;

public class Alumno {

	private String nombre;
	private int numMatricula;
	private double nota1=0, nota2=0;
	
	Alumno(String nom, int num){
		this.nombre=nom;
		this.numMatricula=num;
	}
	
	public void setNota(double n1, double n2) {
		this.nota1=n1;
		this.nota2=n2;
	}
	
	public double getMedia() {
		double media=((nota1+nota2)/2);
		return media;
	}
	
	public String getmuestraAlumno() {
		return "Alumno "+nombre+", con numero de matricula "+numMatricula+"\nSu nota media es de "+getMedia();
	}
}
