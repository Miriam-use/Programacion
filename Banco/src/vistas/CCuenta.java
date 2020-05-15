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
import javax.swing.JTable;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;
import javax.swing.table.DefaultTableModel;

import controlador.controlador;
import javax.swing.JScrollPane;

public class CCuenta extends JFrame {

	private JPanel contentPane;
	private JTextField numcuenta;
	private JTable cuenta;
	private JTable operacion;

	controlador con = new controlador();
	
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
		setTitle("US-CAJA/consultar-cuenta-operaciones");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 428);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNCuenta = new JLabel("n\u00BA Cuenta");
		lblNCuenta.setBounds(251, 11, 75, 14);
		contentPane.add(lblNCuenta);
		
		numcuenta = new JTextField();
		numcuenta.setBounds(277, 33, 129, 20);
		contentPane.add(numcuenta);
		numcuenta.setColumns(10);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"cuenta", "operaciones"}));
		comboBox.setBounds(33, 33, 152, 20);
		contentPane.add(comboBox);
		
		JButton btnListar = new JButton("Buscar");
		btnListar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String opcion=comboBox.getSelectedItem().toString();
				if(opcion.equals("cuenta")) {
					con.buscarCuenta(numcuenta.getText(), cuenta);
				}else {
					con.buscarOperacion(numcuenta.getText(), operacion);
				}
			}
		});
		btnListar.setBounds(312, 75, 86, 36);
		contentPane.add(btnListar);
		
		JButton btnMenu = new JButton("menu");
		btnMenu.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				setVisible(false);
				new menu().setVisible(true);
			}
		});
		btnMenu.setBounds(345, 366, 89, 23);
		contentPane.add(btnMenu);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(10, 150, 414, 77);
		contentPane.add(scrollPane);
		
		cuenta = new JTable();
		cuenta.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"numero cuenta", "fecha creacion", "saldo"
			}
		));
		scrollPane.setViewportView(cuenta);
		
		JLabel lblBuscarPor = new JLabel("buscar por:");
		lblBuscarPor.setBounds(23, 11, 98, 14);
		contentPane.add(lblBuscarPor);
		
		JScrollPane scrollPane_1 = new JScrollPane();
		scrollPane_1.setBounds(10, 262, 414, 78);
		contentPane.add(scrollPane_1);
		
		operacion = new JTable();
		operacion.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"num operacion", "tipo", "fecha de operacion", "cantidad", "num cuenta", "titular"
			}
		));
		scrollPane_1.setViewportView(operacion);
		
		JLabel lblCuenta = new JLabel("Cuenta:");
		lblCuenta.setBounds(10, 125, 75, 14);
		contentPane.add(lblCuenta);
		
		JLabel lblOperacciones = new JLabel("Operacciones:");
		lblOperacciones.setBounds(10, 238, 98, 14);
		contentPane.add(lblOperacciones);		
		
	}
}
