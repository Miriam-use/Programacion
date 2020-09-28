package boton;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class nombre extends JFrame {

	private JPanel contentPane;
	private JTextField nom;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					nombre frame = new nombre();
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
	public nombre() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblIntroduceNombre = new JLabel("Introduce nombre:");
		lblIntroduceNombre.setBounds(24, 122, 158, 14);
		contentPane.add(lblIntroduceNombre);
		
		nom = new JTextField();
		nom.setBounds(150, 119, 235, 20);
		contentPane.add(nom);
		nom.setColumns(10);
		
		JButton nombre = new JButton("mostrar");
		nombre.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				saludo(nom.getText());
			}
		});
		nombre.setBounds(137, 176, 89, 23);
		contentPane.add(nombre);
	}
	
	public void saludo(String nomb) {
		JOptionPane.showMessageDialog(null,"Hola "+nomb);
	}
}
