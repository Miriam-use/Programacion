package controlador;

import static org.junit.Assert.*;
import static org.junit.Assume.assumeTrue;

import org.junit.Test;

public class puebaUnitaria {

	private controlador con=new controlador();
	
	@Test
	public void Crear() {
		assertTrue(con.crearCuenta("12345678P"));
	}
	
	@Test
	public void Eliminar() {
		assertTrue(con.eliminarCuenta(3, "12345678P"));
	}
	
	@Test
	public void Modificar() {
		assumeTrue(con.modificarUsuario("pepe", "D", "12345678P", "calle", 1885, 123045698, "pepegmail"));
	}

}
