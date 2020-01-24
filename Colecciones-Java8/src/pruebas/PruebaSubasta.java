package pruebas;

import java.time.LocalDate;
import java.util.LinkedList;

import subastas.Subasta;
import subastas.Usuario;

public class PruebaSubasta {
	public static void main(String[] args) {
		Usuario juan = new Usuario("Juan", "juanico@gmail.com", LocalDate.of(1981,12, 16), 100);
		Usuario pedro = new Usuario ("Pedro", "perico@hotmail.com", LocalDate.of(1979, 6, 9), 150);
		Usuario enrique = new Usuario("Enrique", "kike@gmail.com", LocalDate.of(1982, 3, 19), 300);
		
		//-	Crea una subasta del producto "Teléfono Móvil" cuyo propietario sea el usuario Juan.
		
		Subasta subasta = new Subasta("Teléfono Móvil", juan);
		
		//-	El usuario Pedro puja por esa subasta 100 euros.
		
		subasta.pujar(pedro, 100);
		
		//-	Muestra en la consola la puja mayor de la subasta (nombre del usuario y cantidad).
		
		System.out.println(subasta.getPujaMayor());
		
		//-	El usuario Enrique puja por esa subasta 50 euros.
		
		subasta.pujar(enrique, 50);

		//-	Muestra en la consola la puja mayor. Comprueba que esta segunda puja no ha sido acepta, ya que es menor que la primera.
		
		System.out.println(subasta.getPujaMayor());
		
		//-	Ejecuta la subasta.
		
		subasta.ejecutar();
		
		//-	El usuario Enrique puja de nuevo por esa subasta con 200 euros. Comprueba que no es aceptada, ya que la subasta ha sido cerrada.
		
		System.out.println(subasta.pujar(enrique, 200));
		
		//-	Crea una subasta para el producto “Impresora láser” cuyo propietario es el usuario Pedro.
		
		Subasta subasta2 = new Subasta("Impresora láser", pedro);
		
		//-	Enrique puja en esta nueva subasta por el mínimo (1 euro más).
		
		subasta2.pujar(enrique);
		
		//-	Ejecuta la subasta.

		subasta2.ejecutar();
		
		//-	Crea una colección con los usuarios.
		
		LinkedList<Usuario> usuarios = new LinkedList<Usuario>();
		usuarios.add(juan);
		usuarios.add(pedro);
		usuarios.add(enrique);
		
		//-	Muestra por la consola los créditos de los tres usuarios. Observa que los créditos de Juan y Pedro han cambiado.
		
		for (Usuario usuario : usuarios)
		   System.out.println("Credito de " + usuario.getNombre() + " = "+ usuario.getCredito());
		
		
		//-	Muestra las subastas de las que son propietarios los tres usuarios.
		
		for (Usuario usuario : usuarios)
		    System.out.println("Subastas de " + usuario.getNombre() + " = " + usuario.getSubastasCreadas());
	}
}
