package vistas;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import controlador.controlador;
import modelo.Operaciones;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.Font;
import java.awt.Color;
/**
 * 
 * @author Miriam
 *
 */
public class operacion extends JFrame {

	private JPanel contentPane;
	private JTextField nif;
	private JTextField nc1;
	private JTextField sal;
	private JTextField nc2;
	
	Operaciones op;
	controlador con=new controlador();
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					operacion frame = new operacion();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public operacion() {
		setTitle("US-CAJA/operacion");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 321);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblDniCliente = new JLabel("DNI Cliente");
		lblDniCliente.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblDniCliente.setBounds(10, 65, 89, 14);
		contentPane.add(lblDniCliente);
		
		nif = new JTextField();
		nif.setColumns(10);
		nif.setBounds(98, 62, 134, 20);
		contentPane.add(nif);
		
		JLabel lblNumeroCuenta = new JLabel("Numero Cuenta");
		lblNumeroCuenta.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNumeroCuenta.setBounds(10, 113, 106, 14);
		contentPane.add(lblNumeroCuenta);
		
		nc1 = new JTextField();
		nc1.setColumns(11);
		nc1.setBounds(126, 111, 97, 20);
		contentPane.add(nc1);
		
		JLabel lblSaldo = new JLabel("Saldo");
		lblSaldo.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblSaldo.setBounds(10, 156, 89, 14);
		contentPane.add(lblSaldo);
		
		sal = new JTextField();
		sal.setColumns(225);
		sal.setBounds(60, 154, 134, 20);
		contentPane.add(sal);
		
		JLabel lblNumeroCuentaTransferir = new JLabel("*Numero Cuenta a Transferir");
		lblNumeroCuentaTransferir.setForeground(Color.BLACK);
		lblNumeroCuentaTransferir.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNumeroCuentaTransferir.setBounds(10, 198, 206, 14);
		contentPane.add(lblNumeroCuentaTransferir);
		
		nc2 = new JTextField();
		nc2.setColumns(11);
		nc2.setBounds(210, 196, 97, 20);
		contentPane.add(nc2);
		
		JLabel lblcampoObligatorioSolo = new JLabel("*Campo obligatorio solo para trasferir");
		lblcampoObligatorioSolo.setFont(new Font("Tahoma", Font.ITALIC, 11));
		lblcampoObligatorioSolo.setForeground(Color.RED);
		lblcampoObligatorioSolo.setBounds(10, 11, 260, 14);
		contentPane.add(lblcampoObligatorioSolo);
		
		JButton btnTransferir = new JButton("Transferir");
		btnTransferir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int id=Integer.parseInt(nc1.getText());
				int saldo=Integer.parseInt(sal.getText());
				if(con.verificarTitularOperacion(id, nif.getText())==true) {
					if(con.comprovarsaldo(saldo, id)==false) {
						con.Retirada(id, saldo);
						int id2=Integer.parseInt(nc2.getText());
						con.Transferir(id2, saldo);
						con.Operar("Transferencia", saldo, id, nif.getText());
					}
				}
			}
		});
		
		JButton btnRetirar = new JButton("Retirar");
		btnRetirar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int id=Integer.parseInt(nc1.getText());
				int saldo=Integer.parseInt(sal.getText());
				if(con.verificarTitularOperacion(id, nif.getText())==true) {
					if(con.comprovarsaldo(saldo, id)==false) {
						con.Retirada(id, saldo);
					    con.Operar("Retirar", saldo, id, nif.getText());
					}
				}
			}
		});
		
		JButton btnIngresar = new JButton("Ingresar");
		btnIngresar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int id=Integer.parseInt(nc1.getText());
				int saldo=Integer.parseInt(sal.getText());
				if(con.verificarTitularOperacion(id, nif.getText())==true) {
					con.Ingresa(id, saldo);
					con.Operar("Ingreso", saldo, id, nif.getText());
				}
			}
		});
		
		btnIngresar.setBounds(335, 11, 89, 72);
		contentPane.add(btnIngresar);
		btnRetirar.setBounds(335, 94, 89, 72);
		contentPane.add(btnRetirar);
		btnTransferir.setBounds(335, 178, 89, 72);
		contentPane.add(btnTransferir);
		
		JButton btnMenu = new JButton("menu");
		btnMenu.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				setVisible(false);
				new menu().setVisible(true);
			}
		});
		btnMenu.setBounds(0, 259, 89, 23);
		contentPane.add(btnMenu);
		
	}
}
