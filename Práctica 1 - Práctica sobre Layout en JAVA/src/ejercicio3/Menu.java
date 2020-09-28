package ejercicio3;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.GridBagLayout;
import net.miginfocom.swing.MigLayout;
import javax.swing.JLabel;
import java.awt.GridBagConstraints;
import java.awt.Font;
import java.awt.Insets;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Menu extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Menu frame = new Menu();
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
	public Menu() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 640, 233);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		GridBagLayout gbl_contentPane = new GridBagLayout();
		gbl_contentPane.columnWidths = new int[]{13, 14, 0, 0, 18, 30, 19, 28, 30, 36, 0, 0, 23, 0, 0, 0};
		gbl_contentPane.rowHeights = new int[]{18, 18, 0, 0, 0, 0, 0, 0, 0};
		gbl_contentPane.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		gbl_contentPane.rowWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		contentPane.setLayout(gbl_contentPane);
		
		JLabel menu = new JLabel("MENU");
		menu.setFont(new Font("Tahoma", Font.BOLD, 17));
		GridBagConstraints gbc_menu = new GridBagConstraints();
		gbc_menu.insets = new Insets(0, 0, 5, 5);
		gbc_menu.gridx = 7;
		gbc_menu.gridy = 0;
		contentPane.add(menu, gbc_menu);
		
		JLabel lblLunes = new JLabel("LUNES");
		lblLunes.setFont(new Font("Tahoma", Font.BOLD, 13));
		GridBagConstraints gbc_lblLunes = new GridBagConstraints();
		gbc_lblLunes.insets = new Insets(0, 0, 5, 5);
		gbc_lblLunes.gridx = 1;
		gbc_lblLunes.gridy = 2;
		contentPane.add(lblLunes, gbc_lblLunes);
		
		JLabel lblMartes = new JLabel("MARTES");
		lblMartes.setFont(new Font("Tahoma", Font.BOLD, 13));
		GridBagConstraints gbc_lblMartes = new GridBagConstraints();
		gbc_lblMartes.insets = new Insets(0, 0, 5, 5);
		gbc_lblMartes.gridx = 3;
		gbc_lblMartes.gridy = 2;
		contentPane.add(lblMartes, gbc_lblMartes);
		
		JLabel lblMiercoles = new JLabel("MIERCOLES");
		lblMiercoles.setFont(new Font("Tahoma", Font.BOLD, 13));
		GridBagConstraints gbc_lblMiercoles = new GridBagConstraints();
		gbc_lblMiercoles.insets = new Insets(0, 0, 5, 5);
		gbc_lblMiercoles.gridx = 5;
		gbc_lblMiercoles.gridy = 2;
		contentPane.add(lblMiercoles, gbc_lblMiercoles);
		
		JLabel lblJueves = new JLabel("JUEVES");
		lblJueves.setFont(new Font("Tahoma", Font.BOLD, 13));
		GridBagConstraints gbc_lblJueves = new GridBagConstraints();
		gbc_lblJueves.insets = new Insets(0, 0, 5, 5);
		gbc_lblJueves.gridx = 7;
		gbc_lblJueves.gridy = 2;
		contentPane.add(lblJueves, gbc_lblJueves);
		
		JLabel lblViernes = new JLabel("VIERNES");
		lblViernes.setFont(new Font("Tahoma", Font.BOLD, 13));
		GridBagConstraints gbc_lblViernes = new GridBagConstraints();
		gbc_lblViernes.anchor = GridBagConstraints.NORTHWEST;
		gbc_lblViernes.insets = new Insets(0, 0, 5, 5);
		gbc_lblViernes.gridx = 9;
		gbc_lblViernes.gridy = 2;
		contentPane.add(lblViernes, gbc_lblViernes);
		
		JLabel lblSabado = new JLabel("SABADO");
		lblSabado.setFont(new Font("Tahoma", Font.BOLD, 13));
		GridBagConstraints gbc_lblSabado = new GridBagConstraints();
		gbc_lblSabado.anchor = GridBagConstraints.NORTHWEST;
		gbc_lblSabado.insets = new Insets(0, 0, 5, 5);
		gbc_lblSabado.gridx = 11;
		gbc_lblSabado.gridy = 2;
		contentPane.add(lblSabado, gbc_lblSabado);
		
		JLabel lblDomingo = new JLabel("DOMINGO");
		lblDomingo.setFont(new Font("Tahoma", Font.BOLD, 13));
		GridBagConstraints gbc_lblDomingo = new GridBagConstraints();
		gbc_lblDomingo.insets = new Insets(0, 0, 5, 5);
		gbc_lblDomingo.anchor = GridBagConstraints.NORTHWEST;
		gbc_lblDomingo.gridx = 13;
		gbc_lblDomingo.gridy = 2;
		contentPane.add(lblDomingo, gbc_lblDomingo);
		
		JLabel lblSopa = new JLabel("Sopa");
		GridBagConstraints gbc_lblSopa = new GridBagConstraints();
		gbc_lblSopa.insets = new Insets(0, 0, 5, 5);
		gbc_lblSopa.gridx = 1;
		gbc_lblSopa.gridy = 3;
		contentPane.add(lblSopa, gbc_lblSopa);
		
		JLabel lblPescado = new JLabel("Pescado");
		GridBagConstraints gbc_lblPescado = new GridBagConstraints();
		gbc_lblPescado.insets = new Insets(0, 0, 5, 5);
		gbc_lblPescado.gridx = 3;
		gbc_lblPescado.gridy = 3;
		contentPane.add(lblPescado, gbc_lblPescado);
		
		JLabel lblCarne = new JLabel("Carne");
		GridBagConstraints gbc_lblCarne = new GridBagConstraints();
		gbc_lblCarne.insets = new Insets(0, 0, 5, 5);
		gbc_lblCarne.gridx = 5;
		gbc_lblCarne.gridy = 3;
		contentPane.add(lblCarne, gbc_lblCarne);
		
		JLabel lblPasta = new JLabel("verdura");
		GridBagConstraints gbc_lblPasta = new GridBagConstraints();
		gbc_lblPasta.insets = new Insets(0, 0, 5, 5);
		gbc_lblPasta.gridx = 7;
		gbc_lblPasta.gridy = 3;
		contentPane.add(lblPasta, gbc_lblPasta);
		
		JLabel lblPescado_1 = new JLabel("Pescado");
		GridBagConstraints gbc_lblPescado_1 = new GridBagConstraints();
		gbc_lblPescado_1.insets = new Insets(0, 0, 5, 5);
		gbc_lblPescado_1.gridx = 9;
		gbc_lblPescado_1.gridy = 3;
		contentPane.add(lblPescado_1, gbc_lblPescado_1);
		
		JLabel lblCarne_1 = new JLabel("Carne");
		GridBagConstraints gbc_lblCarne_1 = new GridBagConstraints();
		gbc_lblCarne_1.insets = new Insets(0, 0, 5, 5);
		gbc_lblCarne_1.gridx = 11;
		gbc_lblCarne_1.gridy = 3;
		contentPane.add(lblCarne_1, gbc_lblCarne_1);
		
		JLabel lblSola = new JLabel("Sola");
		GridBagConstraints gbc_lblSola = new GridBagConstraints();
		gbc_lblSola.insets = new Insets(0, 0, 5, 5);
		gbc_lblSola.gridx = 13;
		gbc_lblSola.gridy = 3;
		contentPane.add(lblSola, gbc_lblSola);
		
		JLabel lblCarne_2 = new JLabel("Carne");
		GridBagConstraints gbc_lblCarne_2 = new GridBagConstraints();
		gbc_lblCarne_2.insets = new Insets(0, 0, 5, 5);
		gbc_lblCarne_2.gridx = 1;
		gbc_lblCarne_2.gridy = 4;
		contentPane.add(lblCarne_2, gbc_lblCarne_2);
		
		JLabel lblSopa_1 = new JLabel("Sopa");
		GridBagConstraints gbc_lblSopa_1 = new GridBagConstraints();
		gbc_lblSopa_1.insets = new Insets(0, 0, 5, 5);
		gbc_lblSopa_1.gridx = 3;
		gbc_lblSopa_1.gridy = 4;
		contentPane.add(lblSopa_1, gbc_lblSopa_1);
		
		JLabel lblPescado_2 = new JLabel("Pescado");
		GridBagConstraints gbc_lblPescado_2 = new GridBagConstraints();
		gbc_lblPescado_2.insets = new Insets(0, 0, 5, 5);
		gbc_lblPescado_2.gridx = 5;
		gbc_lblPescado_2.gridy = 4;
		contentPane.add(lblPescado_2, gbc_lblPescado_2);
		
		JLabel lblCarne_3 = new JLabel("Carne");
		GridBagConstraints gbc_lblCarne_3 = new GridBagConstraints();
		gbc_lblCarne_3.insets = new Insets(0, 0, 5, 5);
		gbc_lblCarne_3.gridx = 7;
		gbc_lblCarne_3.gridy = 4;
		contentPane.add(lblCarne_3, gbc_lblCarne_3);
		
		JLabel lblPasta_1 = new JLabel("Verdura");
		GridBagConstraints gbc_lblPasta_1 = new GridBagConstraints();
		gbc_lblPasta_1.insets = new Insets(0, 0, 5, 5);
		gbc_lblPasta_1.gridx = 9;
		gbc_lblPasta_1.gridy = 4;
		contentPane.add(lblPasta_1, gbc_lblPasta_1);
		
		JLabel lblPescado_3 = new JLabel("Pescado");
		GridBagConstraints gbc_lblPescado_3 = new GridBagConstraints();
		gbc_lblPescado_3.insets = new Insets(0, 0, 5, 5);
		gbc_lblPescado_3.gridx = 11;
		gbc_lblPescado_3.gridy = 4;
		contentPane.add(lblPescado_3, gbc_lblPescado_3);
		
		JLabel lblPasta_2 = new JLabel("Verdura");
		GridBagConstraints gbc_lblPasta_2 = new GridBagConstraints();
		gbc_lblPasta_2.insets = new Insets(0, 0, 5, 5);
		gbc_lblPasta_2.gridx = 13;
		gbc_lblPasta_2.gridy = 4;
		contentPane.add(lblPasta_2, gbc_lblPasta_2);
		
		JLabel lblPasta_3 = new JLabel("Verdura");
		GridBagConstraints gbc_lblPasta_3 = new GridBagConstraints();
		gbc_lblPasta_3.insets = new Insets(0, 0, 5, 5);
		gbc_lblPasta_3.gridx = 1;
		gbc_lblPasta_3.gridy = 5;
		contentPane.add(lblPasta_3, gbc_lblPasta_3);
		
		JLabel lblCarne_4 = new JLabel("Carne");
		GridBagConstraints gbc_lblCarne_4 = new GridBagConstraints();
		gbc_lblCarne_4.insets = new Insets(0, 0, 5, 5);
		gbc_lblCarne_4.gridx = 3;
		gbc_lblCarne_4.gridy = 5;
		contentPane.add(lblCarne_4, gbc_lblCarne_4);
		
		JLabel lblSopa_2 = new JLabel("Sopa");
		GridBagConstraints gbc_lblSopa_2 = new GridBagConstraints();
		gbc_lblSopa_2.insets = new Insets(0, 0, 5, 5);
		gbc_lblSopa_2.gridx = 5;
		gbc_lblSopa_2.gridy = 5;
		contentPane.add(lblSopa_2, gbc_lblSopa_2);
		
		JLabel lblSopa_3 = new JLabel("Sopa");
		GridBagConstraints gbc_lblSopa_3 = new GridBagConstraints();
		gbc_lblSopa_3.insets = new Insets(0, 0, 5, 5);
		gbc_lblSopa_3.gridx = 7;
		gbc_lblSopa_3.gridy = 5;
		contentPane.add(lblSopa_3, gbc_lblSopa_3);
		
		JLabel lblCarne_5 = new JLabel("Carne");
		GridBagConstraints gbc_lblCarne_5 = new GridBagConstraints();
		gbc_lblCarne_5.insets = new Insets(0, 0, 5, 5);
		gbc_lblCarne_5.gridx = 9;
		gbc_lblCarne_5.gridy = 5;
		contentPane.add(lblCarne_5, gbc_lblCarne_5);
		
		JLabel lblPasta_4 = new JLabel("Verdura");
		GridBagConstraints gbc_lblPasta_4 = new GridBagConstraints();
		gbc_lblPasta_4.insets = new Insets(0, 0, 5, 5);
		gbc_lblPasta_4.gridx = 11;
		gbc_lblPasta_4.gridy = 5;
		contentPane.add(lblPasta_4, gbc_lblPasta_4);
		
		JLabel lblCarne_6 = new JLabel("Carne");
		GridBagConstraints gbc_lblCarne_6 = new GridBagConstraints();
		gbc_lblCarne_6.insets = new Insets(0, 0, 5, 5);
		gbc_lblCarne_6.gridx = 13;
		gbc_lblCarne_6.gridy = 5;
		contentPane.add(lblCarne_6, gbc_lblCarne_6);
		
		JButton btnCerrar = new JButton("Cerrar");
		btnCerrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
				new inicio().setVisible(true);
			}
		});
		GridBagConstraints gbc_btnCerrar = new GridBagConstraints();
		gbc_btnCerrar.insets = new Insets(0, 0, 0, 5);
		gbc_btnCerrar.gridx = 7;
		gbc_btnCerrar.gridy = 7;
		contentPane.add(btnCerrar, gbc_btnCerrar);
	}

}
