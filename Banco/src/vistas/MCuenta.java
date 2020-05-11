package vistas;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import controlador.controlador;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class MCuenta extends JFrame {

	private JPanel contentPane;
	private JTextField numCuent;
	private JTextField nifUsu;
	
	controlador con=new controlador();
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MCuenta frame = new MCuenta();
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
	public MCuenta() {
		setTitle("US-CAJA/mantenimiento-cuenta");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 205);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnAador = new JButton("A\u00F1adir");
		btnAador.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(con.verificarCuenta(nifUsu.getText())==true) {
					int num=Integer.parseInt(numCuent.getText());
					if(con.verificarTitular(num)==true) {
						con.nuevoTitular(num, nifUsu.getText());
					}else {
						con.nuevoTitular(num, nifUsu.getText());
						con.crearCuenta(num);
					}
				}
			}
		});
		btnAador.setBounds(82, 91, 98, 38);
		contentPane.add(btnAador);
		
		JButton btnEliminar = new JButton("Eliminar");
		btnEliminar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int num=Integer.parseInt(numCuent.getText());
				con.eliminarTitular(num, nifUsu.getText());
				if(con.verificarTitular(num)==false) {
					con.eliminarCuenta(num, nifUsu.getText());
				}
			}
		});
		btnEliminar.setBounds(235, 91, 98, 38);
		contentPane.add(btnEliminar);
		
		JLabel lblNCuenta = new JLabel("n\u00BA Cuenta:");
		lblNCuenta.setBounds(10, 25, 72, 14);
		contentPane.add(lblNCuenta);
		
		numCuent = new JTextField();
		numCuent.setBounds(20, 50, 135, 20);
		contentPane.add(numCuent);
		numCuent.setColumns(10);
		
		JLabel lblNifUsuario = new JLabel("NIF Usuario:");
		lblNifUsuario.setBounds(235, 25, 80, 14);
		contentPane.add(lblNifUsuario);
		
		nifUsu = new JTextField();
		nifUsu.setBounds(245, 50, 150, 20);
		contentPane.add(nifUsu);
		nifUsu.setColumns(10);
		
		JButton btnMenu = new JButton("menu");
		btnMenu.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				setVisible(false);
				new menu().setVisible(true);
			}
		});
		btnMenu.setBounds(345, 143, 89, 23);
		contentPane.add(btnMenu);
	}
}
