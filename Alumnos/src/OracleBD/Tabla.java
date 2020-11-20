package OracleBD;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JScrollPane;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Tabla extends JFrame {

	private JPanel contentPane;
	private JTable table;
	private JTextField textDNI;

	Controladores con = new Controladores();
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Tabla frame = new Tabla();
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
	public Tabla() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		table = new JTable();
		table.setModel(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"DNI", "NOMBRE", "DIRECCION", "POBLACION"
			}
		));
		table.setBounds(28, 115, 374, 135);
		contentPane.add(table);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(28, 115, 374, 135);
		contentPane.add(scrollPane);
		
		JLabel lblDniDeAlumno = new JLabel("DNI de Alumno:");
		lblDniDeAlumno.setFont(new Font("Tahoma", Font.PLAIN, 13));
		lblDniDeAlumno.setBounds(28, 73, 101, 14);
		contentPane.add(lblDniDeAlumno);
		
		textDNI = new JTextField();
		textDNI.setBounds(139, 71, 162, 20);
		contentPane.add(textDNI);
		textDNI.setColumns(10);
		
		JLabel lblTablaDeAlumnos = new JLabel("TABLA DE ALUMNOS DEL CENTRO");
		lblTablaDeAlumnos.setFont(new Font("Tahoma", Font.PLAIN, 18));
		lblTablaDeAlumnos.setBounds(75, 11, 302, 14);
		contentPane.add(lblTablaDeAlumnos);
		
		JButton btnBuscar = new JButton("BUSCAR");
		btnBuscar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				con.buscar(textDNI.getText(), table);
			}
		});
		btnBuscar.setBounds(324, 70, 84, 23);
		contentPane.add(btnBuscar);
	}
}
