package Ejercicios32;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

/**
 * 
 * @author Miriam
 *
 */
public class VentanaNumeros extends JFrame {

    JPanel panel_principal;
    static JLabel numero = new JLabel("");

    public VentanaNumeros() {
        //TITULO DE LA VENTANA
        setTitle("");
        //TAMAÑO DE LA VENTANA
        //setSize(80, 100);
        setBounds(450, 0, 80, 100);
        //SI NOS DEJA CAMBIAR SUS DIMENSIONES O NO 
        setResizable(false);
        //POSICION EN LA QUE APARECE
        //setLocationRelativeTo(null);
        //SALIR AL DARLE A LA X
        setDefaultCloseOperation(DO_NOTHING_ON_CLOSE);
        //METODO PARA CREAR INTERFAZ Y AGREGAR EVENTOS A BOTONES
        visible();
        //HACEMOS VISIBLE LA VENTANA
        setVisible(true);
    }

    void visible() {    
        panel_principal = new JPanel();
        numero.setBounds(0, 0, 80, 100);
        numero.setText("");
        numero.setFont(new Font(Font.SERIF, Font.BOLD, 50));
        numero.setHorizontalAlignment(JLabel.CENTER);
        numero.setForeground(Color.BLUE);
        numero.setBackground(Color.getHSBColor(48, 62, 115));
        panel_principal.setBackground(Color.getHSBColor(48, 62, 115));
        numero.setOpaque(true);
        panel_principal.add(numero);
        getContentPane().add(panel_principal);
    }

    public static void main(String[] args) {
        VentanaNumeros v = new VentanaNumeros();

    }
}
