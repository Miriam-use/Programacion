package diseño;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Color;

public class ValidarFormulario extends JFrame {

	private JPanel contentPane;
	private JTextField nombre;
	private JTextField edad;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ValidarFormulario frame = new ValidarFormulario();
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
	public ValidarFormulario() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 370, 194);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNombre = new JLabel("Nombre");
		lblNombre.setBounds(54, 36, 46, 14);
		contentPane.add(lblNombre);
		
		JLabel lblNumero = new JLabel("Edad");
		lblNumero.setBounds(64, 64, 46, 14);
		contentPane.add(lblNumero);
		
		nombre = new JTextField();
		nombre.setBounds(119, 33, 167, 20);
		contentPane.add(nombre);
		nombre.setColumns(10);
		
		edad = new JTextField();
		edad.setColumns(10);
		edad.setBounds(119, 61, 167, 20);
		contentPane.add(edad);
		
		JButton btnBoton = new JButton("boton");
		btnBoton.setBounds(206, 102, 80, 34);
		contentPane.add(btnBoton);
		
		JLabel validar = new JLabel("");
		validar.setForeground(Color.RED);
		validar.setBounds(73, 11, 199, 14);
		contentPane.add(validar);
		
		setLocationRelativeTo(null);
		btnBoton.setEnabled(false);
		
		validar(nombre, edad, validar, btnBoton);
	}
	
	public static void validar(JTextField nombre, JTextField edad, JLabel validar, JButton btnBoton) {
		if(nombre.getText().isEmpty() && edad.getText().isEmpty()) {
			validar.setText("* Campo Requerido");
			btnBoton.setEnabled(false);
		}else {
			validar.setText("");
			btnBoton.setEnabled(true);
		}			
	}
}
