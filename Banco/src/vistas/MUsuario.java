package vistas;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;

public class MUsuario extends JFrame {

	private JPanel contentPane;
	private JTextField email;
	private JTextField tlf;
	private JTextField anio;
	private JTextField direc;
	private JTextField nom;
	private JTextField apell;
	private JTextField nif;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					MUsuario frame = new MUsuario();
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
	public MUsuario() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 471, 352);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblEmail = new JLabel("email:");
		lblEmail.setBounds(10, 236, 46, 14);
		contentPane.add(lblEmail);
		
		email = new JTextField();
		email.setBounds(47, 233, 150, 20);
		contentPane.add(email);
		email.setColumns(10);
		
		JLabel lblTelefono = new JLabel("Telefono:");
		lblTelefono.setBounds(228, 236, 57, 14);
		contentPane.add(lblTelefono);
		
		tlf = new JTextField();
		tlf.setBounds(295, 233, 150, 20);
		contentPane.add(tlf);
		tlf.setColumns(10);
		
		JLabel lblAoNacimiento = new JLabel("A\u00F1o nacimiento:");
		lblAoNacimiento.setBounds(10, 202, 98, 14);
		contentPane.add(lblAoNacimiento);
		
		anio = new JTextField();
		anio.setBounds(108, 199, 76, 20);
		contentPane.add(anio);
		anio.setColumns(10);
		
		JLabel lblDireccion = new JLabel("Direccion:");
		lblDireccion.setBounds(194, 202, 76, 14);
		contentPane.add(lblDireccion);
		
		direc = new JTextField();
		direc.setBounds(249, 199, 196, 20);
		contentPane.add(direc);
		direc.setColumns(10);
		
		JLabel lblNombre = new JLabel("Nombre:");
		lblNombre.setBounds(10, 166, 56, 14);
		contentPane.add(lblNombre);
		
		nom = new JTextField();
		nom.setBounds(61, 163, 86, 20);
		contentPane.add(nom);
		nom.setColumns(10);
		
		JLabel lblApellido = new JLabel("Apellido:");
		lblApellido.setBounds(153, 166, 53, 14);
		contentPane.add(lblApellido);
		
		apell = new JTextField();
		apell.setBounds(201, 163, 119, 20);
		contentPane.add(apell);
		apell.setColumns(10);
		
		JLabel lblNif = new JLabel("NIF:");
		lblNif.setBounds(325, 166, 46, 14);
		contentPane.add(lblNif);
		
		nif = new JTextField();
		nif.setBounds(347, 163, 98, 20);
		contentPane.add(nif);
		nif.setColumns(10);
		
		JButton btnListar = new JButton("Listar");
		btnListar.setBounds(32, 264, 98, 38);
		contentPane.add(btnListar);
		
		JButton btnAadir = new JButton("A\u00F1adir");
		btnAadir.setBounds(172, 264, 98, 38);
		contentPane.add(btnAadir);
		
		JButton btnEliminar = new JButton("Eliminar");
		btnEliminar.setBounds(326, 264, 98, 38);
		contentPane.add(btnEliminar);
	}
}
