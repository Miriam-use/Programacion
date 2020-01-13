package Ejercicios31;

import java.util.Arrays;
import java.util.Random;

import Ejercicios31.Coordenada;
import Ejercicios31.interfazBarco;
/**
 * 
 * @author Miriam
 *
 */
public class BarcoBatalla {

	private final Integer TAMANIO = 5;
	private boolean direccion;
	private Coordenada[] coordenadas; 
	private Integer vida = TAMANIO;
	
	/**
	 * Metodo constructor el cual recibe un booleano,
	 * el cual nos ayudara con la direccion del barco,
	 * true = horizontal,
	 * false = vertical
	 * 
	 * @param direccion
	 */
	
	public BarcoBatalla(boolean direccion){
		this.direccion = direccion;
		this.coordenadas = new Coordenada[this.TAMANIO];
		this.generarBarco();
	}
	
	/**
	 * Este metodo nos genera una posicion aleatoria
	 * de un barco.
	 */
	public void generarBarco(){
		Random r= new Random();
		
		Integer pos = r.nextInt(10);
		//Integer auxY = r.nextInt(10);
		
		
		while(!(pos + TAMANIO < 10)){
			pos = r.nextInt(10);
		}
		
		
		
		//Horizontal
		if(this.direccion){
			
			for(int i = pos, j = 0; i < pos+TAMANIO; i++,j++ ){
				coordenadas[j] = new Coordenada(i,pos);
			}
			
			
				
		}else{
			
			
			for(int i = pos,j = 0; i < pos+TAMANIO; i++,j++ ){
				coordenadas[j] = new Coordenada(pos,i);
			}
			
		}
		
	}
	
	public boolean verificarDisparo(Coordenada disparo) {
		// TODO Auto-generated method stub
		boolean atino = false;
		for(int i = 0; i < this.getCoordenadas().length; i++){
			if(this.getCoordenadas()[i].equals(disparo)){
				System.out.println("Le diste al Barco Batalla");
				this.vida--;
				atino =  true;
				break;
			}else{
				System.out.println("Fallaste");
				atino= false;
			}
		}
		return atino;
		
		
	}

	public boolean verficarHundimiento() {
		// TODO Auto-generated method stub
		if(this.vida == 0){
			return true;
		}else{
			return false;
		}
		
		
	}
	
	

	public Integer getVida() {
		return vida;
	}

	public void setVida(Integer vida) {
		this.vida = vida;
	}

	public boolean isDireccion() {
		return direccion;
	}

	public void setDireccion(boolean direccion) {
		this.direccion = direccion;
	}

	public Coordenada[] getCoordenadas() {
		return coordenadas;
	}

	public void setCoordenadas(Coordenada[] coordenadas) {
		this.coordenadas = coordenadas;
	}

	public Integer getTAMANIO() {
		return TAMANIO;
	}

	@Override
	public String toString() {
		return "BarcoBatalla [TAMANIO=" + TAMANIO + ", direccion=" + direccion
				+ ", coordenadas=" + Arrays.toString(coordenadas) + "]";
	}
}
