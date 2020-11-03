package OracleBD;

import java.sql.*;
import javax.swing.*;
/**
 * 
 * @author Miriam
 *
 */
public class Conectar {
	
	static String use="hr";
	static String pass="hr";
	static String url="jdbc:oracle:thin:@localhost:1521:xe";
	static Connection conex=null;
	Statement stm=null;
	
	public static Connection conectar() {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			conex=DriverManager.getConnection(url, use, pass);
			JOptionPane.showMessageDialog(null, "Conexion exitosa");
		} catch (SQLException | ClassNotFoundException ex) {
			JOptionPane.showMessageDialog(null, "No se a podido realizar la conexion");
		}
		return conex;
	}
}
