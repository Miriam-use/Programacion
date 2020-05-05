package controlador;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

import javax.swing.JOptionPane;

public class conexion {

	private static String CONTROLADOR = "com.mysql.jdbc.Driver";
    private static String URL = "jdbc:mysql://localhost:3307/uscaja";
    private static String USUARIO = "root";
    private static String CLAVE = "usbw";

    public static Connection conectar() {
        Connection conexion = null;
        
        try {
            Class.forName(CONTROLADOR);
            conexion = (Connection)DriverManager.getConnection(URL, USUARIO, CLAVE);
            JOptionPane.showMessageDialog(null,"Conexión OK");

        } catch (ClassNotFoundException e) {
        	JOptionPane.showMessageDialog(null,"Error al cargar el controlador");
            e.printStackTrace();

        } catch (SQLException e) {
        	JOptionPane.showMessageDialog(null,"Error en la conexión");
            e.printStackTrace();
        }
        
        return conexion;
    }
    
    public static void close(Connection conn) {
        try {
            if (conn != null) {
                conn.close();
            }
        } catch (SQLException sqle) {
            sqle.printStackTrace();
        }
    }
}
