package vistas;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.Color;

public class MCuenta extends JFrame {

	private JPanel contentPane;
	private JTextField numCuent;
	private JTextField nifUsu;

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
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnAador = new JButton("A\u00F1adir");
		btnAador.setBounds(76, 212, 98, 38);
		contentPane.add(btnAador);
		
		JButton btnEliminar = new JButton("Eliminar");
		btnEliminar.setBounds(258, 212, 98, 38);
		contentPane.add(btnEliminar);
		
		JLabel lblNCuenta = new JLabel("*n\u00BA Cuenta:");
		lblNCuenta.setBounds(10, 146, 72, 14);
		contentPane.add(lblNCuenta);
		
		numCuent = new JTextField();
		numCuent.setBounds(20, 171, 135, 20);
		contentPane.add(numCuent);
		numCuent.setColumns(10);
		
		JLabel lblNifUsuario = new JLabel("NIF Usuario:");
		lblNifUsuario.setBounds(235, 146, 80, 14);
		contentPane.add(lblNifUsuario);
		
		nifUsu = new JTextField();
		nifUsu.setBounds(245, 171, 150, 20);
		contentPane.add(nifUsu);
		nifUsu.setColumns(10);
		
		JLabel lblsoloNecesariaA = new JLabel("*Solo necesaria a la hora de borra");
		lblsoloNecesariaA.setForeground(Color.RED);
		lblsoloNecesariaA.setBounds(10, 193, 195, 14);
		contentPane.add(lblsoloNecesariaA);
	}
}
