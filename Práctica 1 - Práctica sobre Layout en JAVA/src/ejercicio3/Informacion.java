package ejercicio3;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextPane;
import java.awt.Color;
import java.awt.SystemColor;

public class Informacion extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Informacion frame = new Informacion();
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
	public Informacion() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel datos = new JLabel("INFORMACION DE EMPRESA");
		datos.setBounds(5, 5, 419, 21);
		datos.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 17));
		datos.setHorizontalAlignment(SwingConstants.CENTER);
		contentPane.add(datos);
		
		JButton btnCerrar = new JButton("Cerrar");
		btnCerrar.setBounds(135, 221, 171, 23);
		btnCerrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				new inicio().setVisible(true);
			}
		});
		contentPane.add(btnCerrar);
		
		JLabel lblNewLabel_1 = new JLabel("Datos de contactos:");
		lblNewLabel_1.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblNewLabel_1.setBounds(305, 56, 124, 55);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Tlf:951******");
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setBounds(305, 104, 119, 14);
		contentPane.add(lblNewLabel_2);
		
		JLabel lblEmailPuertorealreal = new JLabel("email: puertoreal@real");
		lblEmailPuertorealreal.setHorizontalAlignment(SwingConstants.CENTER);
		lblEmailPuertorealreal.setBounds(305, 122, 119, 14);
		contentPane.add(lblEmailPuertorealreal);
		
		JLabel lblFundador = new JLabel("Fundador:");
		lblFundador.setHorizontalAlignment(SwingConstants.CENTER);
		lblFundador.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblFundador.setBounds(315, 157, 100, 14);
		contentPane.add(lblFundador);
		
		JLabel lblJoserAntonio = new JLabel("JOSER ANTONIO");
		lblJoserAntonio.setHorizontalAlignment(SwingConstants.CENTER);
		lblJoserAntonio.setBounds(318, 182, 97, 14);
		contentPane.add(lblJoserAntonio);
		
		JTextPane txtpnEstaEnLa = new JTextPane();
		txtpnEstaEnLa.setBackground(Color.WHITE);
		txtpnEstaEnLa.setText("Esta en la Informacion de la empresa del ejercicio 3 de los Layout");
		txtpnEstaEnLa.setBounds(15, 66, 260, 129);
		contentPane.add(txtpnEstaEnLa);
		
		
		
	}
}
