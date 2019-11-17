package Eje4_Cafetera;

public class Cafetera {

	private int _capacidadMaxima = 1000, _cantidadActual = 0, taza, agregar;
	
	Cafetera(){
		_capacidadMaxima = 1000;
		_cantidadActual = 0;
	}
	
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
			return "Demasiado cafe, ajustando... "+(_cantidadActual=_capacidadMaxima)+"c.c";
		}else {
			return _cantidadActual+"c.c";
		}
	}
	
	public String getllenarCafetera() {
		if(_cantidadActual > _capacidadMaxima) {
			return "La cafetera esta demasiado llena, ajustando... "+(_cantidadActual=_capacidadMaxima)+"c.c";
		}else {
			return "Rellenando cafetera... "+(_cantidadActual=_capacidadMaxima)+"c.c";
		}
	}
	
	public void setservirTaza(int taza) {
		this.taza = taza;
	}
	public String getservirTaza() {
		if(_cantidadActual < taza) {
			return "Solo se sirve "+_cantidadActual+" tazas. No hay mas cafe";
		}else {
			return taza+" tazas. "+(_cantidadActual-taza)+"c.c sobrante";
		}
	}
	
	public String getvaciarCafetera() {
		return "Vaciando cafetera... "+(_cantidadActual=0)+"c.c";
	}
	
	public void setagregarCafe(int agregar) {
		this.agregar = agregar;
	}
	public String getagregarCafe() {
		if(agregar>_capacidadMaxima) {
		return "Demasiado. Rellenando cafetera... "+(_cantidadActual=_capacidadMaxima)+"c.c";
		}else {
			return "Rellenando cafetera... "+(_cantidadActual=agregar)+"c.c";
		}
	}
}
