package Eje16_Personajes;

public class MainPersonajes {

	public static void main(String[] args) {
		
		Guerreros g = new Guerreros ("Alfa", 50, 200, "Espada");
		System.out.println(g.getDatosGuerrero());
		
		Magos m = new Magos("Beta", 20, "Bomba de agua");
		System.out.println(m.getAtaqueMago());

	}

}
