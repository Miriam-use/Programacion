package vistas;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.Font;
import java.awt.Color;
/**
 * 
 * @author Miriam
 *
 */
public class operacion extends JFrame {

	private JPanel contentPane;
	private JTextField nif;
	private JTextField nc1;
	private JTextField sal;
	private JTextField nc2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					operacion frame = new operacion();
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
	public operacion() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnIngresar = new JButton("Ingresar");
		btnIngresar.setBounds(335, 11, 89, 72);
		contentPane.add(btnIngresar);
		
		JButton btnRetirar = new JButton("Retirar");
		btnRetirar.setBounds(335, 94, 89, 72);
		contentPane.add(btnRetirar);
		
		JButton btnTransferir = new JButton("Transferir");
		btnTransferir.setBounds(335, 178, 89, 72);
		contentPane.add(btnTransferir);
		
		nif = new JTextField();
		nif.setBounds(98, 62, 134, 20);
		contentPane.add(nif);
		nif.setColumns(9);
		
		JLabel lblDniCliente = new JLabel("DNI Cliente");
		lblDniCliente.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblDniCliente.setBounds(10, 65, 89, 14);
		contentPane.add(lblDniCliente);
		
		nc1 = new JTextField();
		nc1.setColumns(10);
		nc1.setBounds(126, 111, 134, 20);
		contentPane.add(nc1);
		
		JLabel lblNumeroCuenta = new JLabel("Numero Cuenta");
		lblNumeroCuenta.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNumeroCuenta.setBounds(10, 113, 106, 14);
		contentPane.add(lblNumeroCuenta);
		
		sal = new JTextField();
		sal.setColumns(10000);
		sal.setBounds(60, 154, 134, 20);
		contentPane.add(sal);
		
		JLabel lblSaldo = new JLabel("Saldo");
		lblSaldo.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblSaldo.setBounds(10, 156, 89, 14);
		contentPane.add(lblSaldo);
		
		nc2 = new JTextField();
		nc2.setColumns(10);
		nc2.setBounds(191, 196, 134, 20);
		contentPane.add(nc2);
		
		JLabel lblNumeroCuentaTransferir = new JLabel("*Numero Cuenta Transferir");
		lblNumeroCuentaTransferir.setForeground(Color.BLACK);
		lblNumeroCuentaTransferir.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNumeroCuentaTransferir.setBounds(10, 198, 184, 14);
		contentPane.add(lblNumeroCuentaTransferir);
		
		JLabel lblcampoObligatorioSolo = new JLabel("     *Campo obligatorio solo para trasferir");
		lblcampoObligatorioSolo.setFont(new Font("Tahoma", Font.ITALIC, 11));
		lblcampoObligatorioSolo.setForeground(Color.RED);
		lblcampoObligatorioSolo.setBounds(0, 11, 260, 14);
		contentPane.add(lblcampoObligatorioSolo);
	}
}
