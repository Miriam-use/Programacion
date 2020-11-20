package Letra;

import java.applet.Applet;
import java.awt.Button;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;

public class Ejercicio_5 extends Applet implements Runnable{

	private static final long serrialVersionUID = 4660165748093895974L;
	private Thread hilo = null;
	boolean continuar = true;
	private int posx;
	private int posy;
	private Font fuente;
	private String letra="O";
	private Button b1;
	
	public void init() {
		posx = 10;
		posy = 10;
		hilo = new Thread(this);
		hilo.start();
	}
	
	public void destroy() {
		continuar = false;
		hilo = null;
	}
	
	public void paint(Graphics g) {
		g.setColor(Color.BLUE);
		g.fillRect(posx, posy, 10, 10);
	}
	
	public void run() {
		while (continuar) {
			repaint();
			posx += 10;
			
			if(posx > 200) {
				posx = 10;
				posy += 10;
			}
			
			if(posy > 200) {
				posy = 10;
			}
			try {
				hilo.sleep(100);	//Espera 100 milisegundo antes de continuar
			}catch (Exception e) {
				System.out.println(e);
			}
		}
	}
}
