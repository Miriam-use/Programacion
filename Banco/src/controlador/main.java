package controlador;

import javax.swing.JFrame;
import javax.swing.JOptionPane;

import modelo.Operaciones;
import vistas.menu;

public class main {

	public static void main(String[] args) {
		
		/*menu men = new menu();
		men.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		men.setVisible(true);
		
		/*conexion c =new conexion();
		c.conectar();
		
		Operaciones op=new Operaciones();
		if(op.Saldo(1, "12345678L")==true) {
			if(op.IngresaRetira(1, 10, "12345678L")==true) {
				System.out.println("operacion echa");
			}else {
				System.out.println("fallo 2");
			}
		}else {
			System.out.println("fallo 1");
		}*/
		
		
		controlador con=new controlador();
		//con.listaUsuario("Maria", "Fran", "15975364O", "Calle Sur", 1880, 159753640, null);
		
		//con.Ingresa(1, 10, "12345678L");
		//con.Retirada(1, 10, "12345678L");
		//con.Transferir(2,10);
		
		
	}

}
