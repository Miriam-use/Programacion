package ejercicio3;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridLayout;
import net.miginfocom.swing.MigLayout;
import javax.swing.BoxLayout;
import java.awt.GridBagLayout;
import javax.swing.JLabel;
import java.awt.GridBagConstraints;
import java.awt.Font;
import java.awt.Insets;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JPasswordField;

public class Formulario extends JFrame {

	private JPanel contentPane;
	private JTextField usu;
	private JPasswordField contra;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Formulario frame = new Formulario();
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
	public Formulario() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 384, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		GridBagLayout gbl_contentPane = new GridBagLayout();
		gbl_contentPane.columnWidths = new int[]{0, 0, 0, 0, 0, 0, 0};
		gbl_contentPane.rowHeights = new int[]{0, 0, 0, 0, 0, 0, 0, 0, 0};
		gbl_contentPane.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, 1.0, 1.0, Double.MIN_VALUE};
		gbl_contentPane.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		contentPane.setLayout(gbl_contentPane);
		
		JLabel lblFormulariaDeEntrada = new JLabel("Formularia de Entrada");
		lblFormulariaDeEntrada.setFont(new Font("Times New Roman", Font.BOLD, 18));
		GridBagConstraints gbc_lblFormulariaDeEntrada = new GridBagConstraints();
		gbc_lblFormulariaDeEntrada.insets = new Insets(0, 0, 5, 5);
		gbc_lblFormulariaDeEntrada.gridwidth = 3;
		gbc_lblFormulariaDeEntrada.gridx = 2;
		gbc_lblFormulariaDeEntrada.gridy = 0;
		contentPane.add(lblFormulariaDeEntrada, gbc_lblFormulariaDeEntrada);
		
		JLabel usuario = new JLabel("Usuario:");
		usuario.setFont(new Font("Tahoma", Font.BOLD, 15));
		GridBagConstraints gbc_usuario = new GridBagConstraints();
		gbc_usuario.insets = new Insets(0, 0, 5, 5);
		gbc_usuario.gridx = 2;
		gbc_usuario.gridy = 3;
		contentPane.add(usuario, gbc_usuario);
		
		usu = new JTextField();
		usu.setText("PACO");
		GridBagConstraints gbc_usu = new GridBagConstraints();
		gbc_usu.fill = GridBagConstraints.HORIZONTAL;
		gbc_usu.insets = new Insets(0, 0, 5, 5);
		gbc_usu.gridx = 4;
		gbc_usu.gridy = 3;
		contentPane.add(usu, gbc_usu);
		usu.setColumns(10);
		
		JLabel contraseña = new JLabel("Contrase\u00F1a");
		contraseña.setFont(new Font("Tahoma", Font.BOLD, 15));
		GridBagConstraints gbc_contraseña = new GridBagConstraints();
		gbc_contraseña.insets = new Insets(0, 0, 5, 5);
		gbc_contraseña.gridx = 2;
		gbc_contraseña.gridy = 5;
		contentPane.add(contraseña, gbc_contraseña);
		
		JButton inicio = new JButton("Cerrar");
		inicio.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				new inicio().setVisible(true);
			}
		});
		
		contra = new JPasswordField();
		contra.setText("1234");
		GridBagConstraints gbc_contra = new GridBagConstraints();
		gbc_contra.insets = new Insets(0, 0, 5, 5);
		gbc_contra.fill = GridBagConstraints.HORIZONTAL;
		gbc_contra.gridx = 4;
		gbc_contra.gridy = 5;
		contentPane.add(contra, gbc_contra);
		GridBagConstraints gbc_inicio = new GridBagConstraints();
		gbc_inicio.insets = new Insets(0, 0, 0, 5);
		gbc_inicio.gridx = 2;
		gbc_inicio.gridy = 7;
		contentPane.add(inicio, gbc_inicio);
		
		JButton btnEnviar = new JButton("Enviar");
		btnEnviar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				usu.setText("");
				contra.setText("");
			}
		});
		GridBagConstraints gbc_btnEnviar = new GridBagConstraints();
		gbc_btnEnviar.insets = new Insets(0, 0, 0, 5);
		gbc_btnEnviar.gridx = 4;
		gbc_btnEnviar.gridy = 7;
		contentPane.add(btnEnviar, gbc_btnEnviar);
	}

}
