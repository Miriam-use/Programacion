package vistas;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
/**
 * 
 * @author Miriam
 *
 */
public class menu extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					menu frame = new menu();
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
	public menu() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnMantenimientoUsuario = new JButton("Mantenimiento Usuario");
		btnMantenimientoUsuario.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				new MUsuario().setVisible(true);
			}
		});
		
		btnMantenimientoUsuario.setBounds(28, 11, 366, 48);
		contentPane.add(btnMantenimientoUsuario);
		
		JButton btnMantenimientoUsuario_1 = new JButton("Realizar Movimientos en Cuenta Bancaria");
		btnMantenimientoUsuario_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new operacion().setVisible(true);
			}
		});
		btnMantenimientoUsuario_1.setBounds(28, 70, 366, 48);
		contentPane.add(btnMantenimientoUsuario_1);
		
		JButton btnMantenimientoUsuario_1_1 = new JButton("Consultar Estado de Cuenta y Operaciones");
		btnMantenimientoUsuario_1_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				new CCuenta().setVisible(true);
			}
		});
		btnMantenimientoUsuario_1_1.setBounds(28, 129, 366, 48);
		contentPane.add(btnMantenimientoUsuario_1_1);
		
		JButton btnMantenimientoUsuario_1_2 = new JButton("Mantenimiento Cuentas");
		btnMantenimientoUsuario_1_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				new MCuenta().setVisible(true);
			}
		});
		btnMantenimientoUsuario_1_2.setBounds(28, 188, 366, 48);
		contentPane.add(btnMantenimientoUsuario_1_2);
	}
}
