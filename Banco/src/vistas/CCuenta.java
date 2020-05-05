package vistas;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JList;

public class CCuenta extends JFrame {

	private JPanel contentPane;
	private JTextField numcuenta;
	private JTextField nif;
	private JTextField fechacrea;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CCuenta frame = new CCuenta();
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
	public CCuenta() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNCuenta = new JLabel("n\u00BA Cuenta");
		lblNCuenta.setBounds(10, 11, 75, 14);
		contentPane.add(lblNCuenta);
		
		numcuenta = new JTextField();
		numcuenta.setBounds(20, 30, 86, 20);
		contentPane.add(numcuenta);
		numcuenta.setColumns(10);
		
		JLabel lblNifDeUsuario = new JLabel("NIF de Usuario");
		lblNifDeUsuario.setBounds(10, 61, 106, 14);
		contentPane.add(lblNifDeUsuario);
		
		nif = new JTextField();
		nif.setBounds(20, 76, 136, 20);
		contentPane.add(nif);
		nif.setColumns(10);
		
		JLabel lblFechaDeCreacion = new JLabel("Fecha de creacion");
		lblFechaDeCreacion.setBounds(178, 11, 115, 14);
		contentPane.add(lblFechaDeCreacion);
		
		fechacrea = new JTextField();
		fechacrea.setBounds(188, 30, 142, 20);
		contentPane.add(fechacrea);
		fechacrea.setColumns(10);
		
		JButton btnListar = new JButton("Listar");
		btnListar.setBounds(312, 75, 86, 36);
		contentPane.add(btnListar);
	}
}
