package diseño;

import java.awt.EventQueue;
import java.awt.Image;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.DefaultComboBoxModel;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Diseño extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Diseño frame = new Diseño();
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
	public Diseño() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblDiseos = new JLabel("Elegir Dise\u00F1o:");
		lblDiseos.setBounds(96, 121, 83, 14);
		contentPane.add(lblDiseos);
		
		JLabel diseño = new JLabel("");
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Diseño1", "Diseño2", "Diseño3"}));
		comboBox.setBounds(189, 118, 122, 20);
		contentPane.add(comboBox);
		
		JButton cambiar = new JButton("Cambiar");
		cambiar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String opcion=comboBox.getSelectedItem().toString();
				if(opcion.equals("Diseño1")) {
					ImageIcon dis = new ImageIcon(getClass().getResource("d1.jpg"));
					ImageIcon ico = new ImageIcon(dis.getImage().getScaledInstance(diseño.getWidth(), diseño.getHeight(), Image.SCALE_DEFAULT));
					diseño.setIcon(ico);
				}else {
					if(opcion.equals("Diseño2")) {
						ImageIcon dis = new ImageIcon(getClass().getResource("d2.jpg"));
						ImageIcon ico = new ImageIcon(dis.getImage().getScaledInstance(diseño.getWidth(), diseño.getHeight(), Image.SCALE_DEFAULT));
						diseño.setIcon(ico);
					}else {
						ImageIcon dis = new ImageIcon(getClass().getResource("d3.jpg"));
						ImageIcon ico = new ImageIcon(dis.getImage().getScaledInstance(diseño.getWidth(), diseño.getHeight(), Image.SCALE_DEFAULT));
						diseño.setIcon(ico);
					}
				}
			}
		});
		cambiar.setBounds(169, 169, 89, 23);
		contentPane.add(cambiar);
		
		
		diseño.setBounds(0, 0, 434, 261);
		contentPane.add(diseño);
	}
}
