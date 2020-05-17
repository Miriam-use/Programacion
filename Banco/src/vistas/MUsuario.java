package vistas;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import controlador.controlador;
import modelo.Usuario;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JScrollPane;
import javax.swing.JComboBox;
import javax.swing.ComboBoxEditor;
import javax.swing.DefaultComboBoxModel;

public class MUsuario extends JFrame {

	private JPanel contentPane;
	private JTextField email;
	private JTextField tlf;
	private JTextField anio;
	private JTextField direc;
	private JTextField nom;
	private JTextField apell;
	private JTextField nif;
	
	//JScrollPane scrollPane;

	controlador con=new controlador();
	Usuario us = new Usuario();
	private JTextField valor;
	private JTable table;
	//JTable table;
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
		setTitle("US-CAJA/mantenimiento-usuario");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 471, 445);
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
		
		JButton btnAadir = new JButton("A\u00F1adir");
		btnAadir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int ani=Integer.parseInt(anio.getText());
				int t=Integer.parseInt(tlf.getText());
				if(con.validarNIF(nif.getText())==true) {
					if(con.verificarUsuario(nif.getText())==false) {
						con.crearUsuario(nom.getText(), apell.getText(), nif.getText(), direc.getText(), ani, t, email.getText());
					}
				}
				
			}
		});
		btnAadir.setBounds(10, 264, 98, 38);
		contentPane.add(btnAadir);
		
		JButton btnEliminar = new JButton("Eliminar");
		btnEliminar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				con.eliminarUsuario(nif.getText());
				con.eliminarTitularUsu(nif.getText());
			}
		});
		btnEliminar.setBounds(176, 264, 98, 38);
		contentPane.add(btnEliminar);
		
		JButton btnModificar = new JButton("Modificar");
		btnModificar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int ani=Integer.parseInt(anio.getText());
				int t=Integer.parseInt(tlf.getText());
				con.modificarUsuario(nom.getText(), apell.getText(), nif.getText(), direc.getText(), ani, t, email.getText());
				
			}
		});
		btnModificar.setBounds(347, 264, 98, 38);
		contentPane.add(btnModificar);
		
		JButton btnMenu = new JButton("menu");
		btnMenu.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				new menu().setVisible(true);
			}
		});
		btnMenu.setBounds(366, 383, 89, 23);
		contentPane.add(btnMenu);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"nif", "nombre", "apellido", "direccion"}));
		comboBox.setBounds(140, 342, 113, 20);
		contentPane.add(comboBox);
		
		JButton btnNewButton = new JButton("Buscar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				con.Ubuscar(valor.getText(), comboBox.getSelectedItem().toString(), table);
			}
		});
		
		JLabel lblBuscarPor = new JLabel("buscar por:");
		lblBuscarPor.setBounds(138, 317, 100, 14);
		contentPane.add(lblBuscarPor);
					
		valor = new JTextField();
		valor.setBounds(276, 342, 169, 20);
		contentPane.add(valor);
		valor.setColumns(10);
		btnNewButton.setBounds(10, 324, 98, 38);
		contentPane.add(btnNewButton);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 11, 435, 134);
		contentPane.add(scrollPane);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
					"nif", "nombre", "apellido", "a\u00F1o", "direccion", "email", "telefono"
			}
		));
		scrollPane.setViewportView(table);
		
	}
}
