package RuleteRusa;

public class Main {

	public static void main(String[] args) {
		
		Juego juego = new Juego(4);
        
        while( !juego.finJuego() ){
            juego.ronda();            
            //juego.rondaV2();
        }
         
        System.out.println("El juego ha terminado");

	}

}
