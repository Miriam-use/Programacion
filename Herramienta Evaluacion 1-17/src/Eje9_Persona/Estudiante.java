package Eje9_Persona;

import java.util.Scanner;

public class Estudiante {

	private int cod;
	private double pagopension, rango;
	private String cate, colegio;
	
	Estudiante(String colegio, String cate, int cod){
		this.colegio = colegio;
		this.cate = cate;
		this.cod = cod;
	}
	
	public void setRando(double ran) {
		this.rango = ran;
	}
	
	public void setPago(double pago) {
		this.pagopension = pago;
	}
	
	public String getDescuento() {	
		if(pagopension<=13) {
			return "Se le aplica un descuento de 0% : "+pagopension;
		}if(pagopension>13 && pagopension <16) {
			return "Se le aplica un descuento de 8% : "+(pagopension-0.08);
		}if(pagopension>=16) {
			return "Se le aplica un descuento de 15% : "+(pagopension-0.15);
		}else {
			return "ERROR";
		}
	}
}
