package Eje_7Linea;

public class Punto {

	protected int xA;
	protected int yA;
	protected int xB;
	protected int yB;
	
	Punto(){
		this.xA=0;
		this.yA=0;
		this.xB=0;
		this.yB=0;
	}
	
	public void Punto(int xA,int yA,int xB,int yB){
		this.xA=xA;
		this.yA=yA;
		this.xB=xB;
		this.yB=yB;
	}
}
