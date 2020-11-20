package ejercicio;

import java.applet.Applet;
import java.awt.Button;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Letra extends Applet implements Runnable,ActionListener{

	private Thread h;
	private boolean parar;
	private Font fuente;
	private Button b1;
	private String letra="O";
	private int pos_x=1;
	private int pos_y=100;
	private boolean volver=true;
	public void start(){
	}
	public void init(){
		setBackground(Color.LIGHT_GRAY);
		add(b1=new Button("Iniciar hilo"));
		b1.addActionListener(this);
		fuente=new Font("Verdana",Font.BOLD,26);
	}
	public void run(){
		parar=false;
		Thread hiloActual=Thread.currentThread();
		while(h==hiloActual&&!parar){
			repaint();
			if(pos_x == getSize().width) {
				volver=true;
			}else if (volver && pos_x==1) {
				volver=false;
			}
			if (volver==false) {
				pos_x=pos_x+1;
			}else {
				pos_x=pos_x-1;
			}
			try{
				Thread.sleep(100);
			}catch(InterruptedException e){
				e.printStackTrace();
			}

		}
	}
	public void paint(Graphics g){
		g.clearRect(0,0,400,400);
		g.setFont(fuente);
		g.drawString(letra,pos_x,pos_y);
	}
	public void actionPerformed(ActionEvent e){
		b1.setLabel("Finalizar Hilo");
		if(e.getSource()==b1){
			if(h!=null&&h.isAlive()){
				b1.setLabel("Reanudar Hilo");
				h.stop();
			}
			else{
				b1.setLabel("Finalizar Hilo");
				h=new Thread(this);
				h.start();
			}
		}else{
			parar=true;
			b1.setLabel("Reanudar Hilo");
		}
	}
	public void stop(){
		h=null;
	}
	
}
