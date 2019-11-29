package Eje4_Cafetera;
/**
 * <h2>Clase que simule una cafetera</h2>
 * 
 * Buscar informacion de javadoc en <a href="http://google.com">GOOGLE</a>
 * @version 1-2019
 * @author Miriam
 */
public class Cafetera {

	private int _capacidadMaxima = 1000, _cantidadActual = 0, taza, agregar;
	
	/**
	 * establece la capacidad m�xima en 1000 (c.c.) y la actual en cero (cafetera vac�a).
	 */
	Cafetera(){
		_capacidadMaxima = 1000;
		_cantidadActual = 0;
	}
	
	/**
	 * Constructor con la capacidad m�xima de la cafetera; inicializa la cantidad actual de caf� igual a la capacidad m�xima.
	 * @param maxima
	 * @param actual
	 * Si la cantidad actual es mayor que la capacidad m�xima de la cafetera, la ajustar� al m�ximo.
	 */
	Cafetera(int maxima, int actual){
		_capacidadMaxima = maxima;
		_cantidadActual = actual;
		if(_cantidadActual > _capacidadMaxima) {
			_cantidadActual = _capacidadMaxima;
		}else {
			_cantidadActual = actual;
		}
	}
	
	public int _capacidadMaxima() {
		return _capacidadMaxima;
	}
	public int _cantidadActual() {
		return _cantidadActual;
	}
	
	public int get_capacidadMaxima() {
		return _capacidadMaxima;
	}
	
	public int get_cantidadActual() {
		return _cantidadActual;
	}
	public void setCafe(int maxima, int actual) {
		this._capacidadMaxima = maxima;
		this._cantidadActual = actual;
	}
	public String getCafe() {
		if(_cantidadActual > _capacidadMaxima) {
			return "Demasiado cafe, ajustando... "+(_cantidadActual=_capacidadMaxima)+"c.c"; //Si la cantidad actual es mallor la pone al maximo
		}else {
			return _cantidadActual+"c.c";
		}
	}
	
	/**
	 * hace que la cantidad actual sea igual a la capacidad.
	 * @return
	 */
	public String getllenarCafetera() {		//Rellena la cafetera asta el maximo
		if(_cantidadActual > _capacidadMaxima) {
			return "La cafetera esta demasiado llena, ajustando... "+(_cantidadActual=_capacidadMaxima)+"c.c";
		}else {
			return "Rellenando cafetera... "+(_cantidadActual=_capacidadMaxima)+"c.c";	
		}
	}
	
	public void setservirTaza(int taza) {
		this.taza = taza;
	}
	
	/**
	 * simula la acci�n de servir una taza con la capacidad
	 * indicada. Si la cantidad actual de caf� "no alcanza" para llenar la taza, se
	 * sirve lo que quede.
	 * @return
	 */
	public String getservirTaza() {		//Solo se llenan asta la cantidad de cafe que tenga
		if(_cantidadActual < taza) {
			return "Solo se sirve "+_cantidadActual+" tazas. No hay mas cafe";
		}else {
			return taza+" tazas. "+(_cantidadActual-taza)+"c.c sobrante";
		}
	}
	
	/**
	 * pone la cantidad de caf� actual en cero.
	 * @return
	 */
	public String getvaciarCafetera() {
		return "Vaciando cafetera... "+(_cantidadActual=0)+"c.c";	//pone la cafetera a 0
	}
	
	/**
	 * a�ade a la cafetera la cantidad de caf� indicada.
	 * @param agregar
	 */
	public void setagregarCafe(int agregar) {
		this.agregar = agregar;
	}
	public String getagregarCafe() {
		if(agregar>_capacidadMaxima) {
		return "Demasiado. Rellenando cafetera... "+(_cantidadActual=_capacidadMaxima)+"c.c";	//Volver a llenar cafetera asta el maximo
		}else {
			return "Rellenando cafetera... "+(_cantidadActual=agregar)+"c.c";
		}
	}
}
