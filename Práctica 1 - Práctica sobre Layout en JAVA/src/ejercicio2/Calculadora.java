package ejercicio2;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;
import java.awt.Font;

public class Calculadora extends JFrame {

	private JPanel contentPane;
	public float primernumero;
	public float segundonumero;
	public String operacion;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calculadora frame = new Calculadora();
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
	public Calculadora() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 315, 355);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel resultado = new JLabel("");
		resultado.setFont(new Font("Tahoma", Font.PLAIN, 18));
		resultado.setHorizontalAlignment(SwingConstants.RIGHT);
		resultado.setBackground(Color.WHITE);
		resultado.setBounds(10, 11, 279, 50);
		contentPane.add(resultado);
		
		JButton siete = new JButton("7");
		siete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				resultado.setText(resultado.getText()+"7");
			}
		});
		siete.setBounds(10, 72, 63, 60);
		contentPane.add(siete);
		
		JButton ocho = new JButton("8");
		ocho.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				resultado.setText(resultado.getText()+"8");
			}
		});
		ocho.setBounds(72, 72, 63, 60);
		contentPane.add(ocho);
		
		JButton nueve = new JButton("9");
		nueve.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				resultado.setText(resultado.getText()+"9");
			}
		});
		nueve.setBounds(134, 72, 63, 60);
		contentPane.add(nueve);
		
		JButton cuatro = new JButton("4");
		cuatro.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				resultado.setText(resultado.getText()+"4");
			}
		});
		cuatro.setBounds(10, 130, 63, 60);
		contentPane.add(cuatro);
		
		JButton cinco = new JButton("5");
		cinco.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				resultado.setText(resultado.getText()+"5");
			}
		});
		cinco.setBounds(72, 130, 63, 60);
		contentPane.add(cinco);
		
		JButton seis = new JButton("6");
		seis.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				resultado.setText(resultado.getText()+"6");
			}
		});
		seis.setBounds(134, 130, 63, 60);
		contentPane.add(seis);
		
		JButton limpia = new JButton("CE");
		limpia.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				resultado.setText("");
			}
		});
		limpia.setBounds(134, 245, 63, 60);
		contentPane.add(limpia);
		
		JButton uno = new JButton("1");
		uno.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				resultado.setText(resultado.getText()+"1");
			}
		});
		uno.setBounds(10, 189, 63, 60);
		contentPane.add(uno);
		
		JButton dos = new JButton("2");
		dos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				resultado.setText(resultado.getText()+"2");
			}
		});
		dos.setBounds(72, 189, 63, 60);
		contentPane.add(dos);
		
		JButton tres = new JButton("3");
		tres.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				resultado.setText(resultado.getText()+"3");
			}
		});
		tres.setBounds(134, 189, 63, 60);
		contentPane.add(tres);
		
		JButton cero = new JButton("0");
		cero.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				resultado.setText(resultado.getText()+"0");
			}
		});
		cero.setBounds(10, 245, 63, 60);
		contentPane.add(cero);
		
		JButton punto = new JButton(".");
		punto.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(!resultado.getText().contains(".")) {
					resultado.setText(resultado.getText()+".");
				}
			}
		});
		punto.setBounds(72, 245, 63, 60);
		contentPane.add(punto);
		
		JButton igual = new JButton("=");
		igual.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				segundonumero=Float.parseFloat(resultado.getText());
				switch (operacion) {
				case "+":
					resultado.setText(Float.toString(primernumero+segundonumero));
					break;
				case "-":
					resultado.setText(Float.toString(primernumero-segundonumero));
					break;
				case "*":
					resultado.setText(Float.toString(primernumero*segundonumero));
					break;
				case "/":
					resultado.setText(Float.toString(primernumero/segundonumero));
					break;
				}
			}
		});
		igual.setBounds(224, 257, 65, 48);
		contentPane.add(igual);
		
		JButton dividir = new JButton("/");
		dividir.setBounds(224, 213, 65, 48);
		contentPane.add(dividir);
		
		JButton multiplicar = new JButton("*");
		multiplicar.setBounds(224, 166, 65, 48);
		contentPane.add(multiplicar);
		
		JButton resta = new JButton("-");
		resta.setBounds(224, 118, 65, 48);
		contentPane.add(resta);
		
		JButton suma = new JButton("+");
		suma.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				primernumero=Float.parseFloat(resultado.getText());
				operacion="+";
				resultado.setText("");
			}
		});
		suma.setBounds(224, 72, 65, 48);
		contentPane.add(suma);
	}
}
