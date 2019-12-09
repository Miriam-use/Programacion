package prueba1;

public class Coche {

	private Motor motor=null;
	private String marca=null, modelo=null;
	private double precio=0;
	
	public Coche(String ma, String mo) {
		motor=new Motor(50);
		marca=ma;
		modelo=mo;
	}
	
	public Motor getMotor()	{
	return motor;
	}
	
	public String getMarca() {
		return marca;
	}
	
	public String getModelo() {
		return modelo;
	}
	
	public void acumularAveria(double p) {
		precio+=p;
	}
	
	public double acumularAveria() {
		return precio;
	}
	
}
