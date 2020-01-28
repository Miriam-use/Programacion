package subasta;

import java.util.LinkedList;
import java.util.List;

/**
 * 
 * @author Ruso
 * @author Juan
 * @author Miriam
 *
 * La subasta representa un producto por el que se puede pujar.
 *
 */
public class Subasta {

	private String producto;
	private Usuario propietario;
	private boolean abierta;
	private LinkedList<Puja> pujas;
	
	public Subasta(String producto, Usuario propietario) {
		if(producto == null || producto.equals("")) {
			throw new IllegalArgumentException("El nombre del producto tiene que ser significativo");
		}
		if(propietario == null) {
			throw new IllegalArgumentException("El propietario no puede ser nulo");
		}
		this.producto = producto;
		this.propietario = propietario;
		this.abierta = true;
		this.pujas = new LinkedList<Puja>();
		this.propietario.addSubasta(this);
	}
	
	public String getProducto() {
		return producto;
	}

	public Usuario getPropietario() {
		return propietario;
	}

	public boolean isAbierta() {
		return abierta;
	}
	
	public List<Puja> getPujas() {
		return new LinkedList<Puja>(pujas);
		
		//alternativa return Collections.unmodifiableList(pujas); 
	}

	//Propiedad calculada
	public Puja getPujaMayor(){
		if (!pujas.isEmpty())
			return pujas.getLast();
		else 
			return null;
	}
/**
 * 	
 * @param pujador
 * @param cantidad
 * @return true
 */
	public boolean pujar (Usuario pujador, double cantidad){
		if (pujador == null)
			throw new IllegalArgumentException("El usuario que hace la puja no puede ser nulo");
		
		if (cantidad < 1)
			throw new IllegalArgumentException("La cantidad tiene que ser positiva");
		
		if (isAbierta() &&
				pujador.getCredito() >= cantidad &&
				pujador != propietario &&
				(getPujaMayor() == null || (getPujaMayor() != null && getPujaMayor().getCantidad() < cantidad))){
			
			Puja puja = new Puja(pujador, cantidad);
			
			pujas.add(puja);
			
			return true;
		}
		else
			return false;
	}
/**
 * 	
 * @return true
 */
	public boolean ejecutar(){
		if (isAbierta() && getPujaMayor() != null){
			
			Usuario ganador = getPujaMayor().getPujador();
			
			double cantidad = getPujaMayor().getCantidad();
			
			propietario.incrementarCredito(cantidad);
			
			ganador.decrementarCredito(cantidad);
			
			abierta = false;
			
			return true;
		
		} else
			return false;
	}

	@Override
	public String toString() {
		return getClass().getName() + " [producto=" + producto
									+ ", propietario=" + propietario.getNombre() 
									+ ", abierta=" + abierta
									+ ", pujas=" + pujas.size() 
									+ "]";
	}
}
