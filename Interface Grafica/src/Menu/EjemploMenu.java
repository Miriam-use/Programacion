package Menu;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
/**
 * ejemplo de un menu
 * 
 * @author Miriam
 *
 */
public class EjemploMenu extends JFrame{

	private JPanel contentPane;
	 
    /**
     * Launch the application.
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(new Runnable() {
            public void run() {
                try {
                    EjemploMenu frame = new EjemploMenu();
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
    public EjemploMenu() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setBounds(100, 100, 450, 300);
        contentPane = new JPanel();
        contentPane.setLayout(null);
        setContentPane(contentPane);
        setFocusable(true);
 
        //Creamos la barra de Menu
        JMenuBar barraMenu=new JMenuBar();
 
        //Creamos los menus y modificamos los accesos rapidos
        JMenu archivo=new JMenu("Archivo");
        archivo.setMnemonic('A');
        JMenu editar=new JMenu("Editar");
        editar.setMnemonic('E');
 
        //Añadimos los menus a la barra de menu
 
        barraMenu.add(archivo);
        barraMenu.add(editar);
 
        //Creamos los submenus y modificamos los accesos rapidos
 
        JMenuItem abrir=new JMenuItem("Abrir", 'A');
        JMenuItem guardar=new JMenuItem("Guardar", 'G');
        JMenuItem cargar=new JMenuItem("Cargar", 'C');
        JMenuItem salir=new JMenuItem("Salir", 'S');
 
        JMenuItem modificar=new JMenuItem("Modificar", 'M');
        JMenuItem copiar=new JMenuItem("Copiar", 'C');
        JMenuItem pegar=new JMenuItem("Pegar", 'P');
 
        //Añadimos los submenus a los menus
 
        archivo.add(abrir);
        archivo.add(new JSeparator());
        archivo.add(guardar);
        archivo.add(cargar);
        archivo.add(new JSeparator());
        archivo.add(salir);
 
        editar.add(modificar);
        editar.add(copiar);
        editar.add(pegar);
 
        //Indicamos que es el menu por defecto
        setJMenuBar(barraMenu);
 
        salir.addActionListener(new ActionListener(){
            public void actionPerformed(ActionEvent e){
                System.exit(0);
            }
        });
    }
}
