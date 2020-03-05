package ejercicio4;

public interface Prestable {

	void prestar(); 
	public abstract void devolver();
	/*public abstract*/ String prestado(); //por def. todos los métodos //son públicos y abstractos, por lo que se pueden omitir al escribirlos
}
