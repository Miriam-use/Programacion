package controlador;

import javax.swing.JFrame;

import vistas.menu;

public class main {

	public static void main(String[] args) {
		
		menu men = new menu();
		men.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		men.setVisible(true);
		
		/*conexion c =new conexion();
		c.conectar();*/
		
	}

}
