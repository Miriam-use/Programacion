package principal;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;

import org.neodatis.odb.ODB;
import org.neodatis.odb.ODBFactory;
import org.neodatis.odb.ObjectValues;
import org.neodatis.odb.Objects;
import org.neodatis.odb.Values;
import org.neodatis.odb.core.query.IQuery;
import org.neodatis.odb.core.query.criteria.Where;
import org.neodatis.odb.impl.core.query.criteria.CriteriaQuery;
import org.neodatis.odb.impl.core.query.values.ValuesCriteriaQuery;

import Basico.Articulos;
import Basico.Ventas;

public class Consultas {

	
	public static void main(String[] args) {
		
		visualizacionVentas();
			System.out.println("");
		visualizacionSumaArticulosVentas();
			System.out.println("");
		visualizacionCliente();
			System.out.println("");
		articuloMasVendido();
			System.out.println("");
		media();
			System.out.println("");
		clienteMaxGasta();
			System.out.println("");
		clienteMasVentas();

	}
	/**
	 * 
	 * Método que visualice los datos de cada venta.
	 * 
	 */
	public static void visualizacionVentas() {
		ODB odb = ODBFactory.open("ARTICVENTAS.DAT");
		Objects<Articulos> articulo = odb.getObjects(Articulos.class);
		Values valores = odb.getValues(new ValuesCriteriaQuery(Ventas.class).
				field("codventa")
				.field("numcli.numcli")
				.field("numcli.nombre")
				.field("fecha")
				.field("univen")
				.field("univen"));
		
		System.out.println("CODVENTA | CODARTI | DENOMINACION | NUMCLI | NOMBRE | FECHA | UNIVEN | IMPORTE");
		System.out.println("-------------------------------------------------------------------------------");
		
		while(articulo.hasNext() && valores.hasNext()) {
			
			Articulos ar =articulo.next();
			ObjectValues objectValues = valores.next();
				
			System.out.println(objectValues.getByIndex(0)+" - "+ar.getCodarti()+" - "+ar.getDenom()+" -  "
						+ "  "+objectValues.getByIndex(1)+" - "+objectValues.getByIndex(2)+" - "+objectValues.getByIndex(3)+" -  "
						+objectValues.getByIndex(4)+" - "+ar.getPvp());
				
		}		
		odb.close();
	}
	/**
	 * 
	 * Método que visualice por cada articulo la suma de unidades vendidas, el
	 * importe, y el número de ventas en las que se ha vendido.
	 * 
	 */
	public static void visualizacionSumaArticulosVentas() {
		ODB odb = ODBFactory.open("ARTICVENTAS.DAT");
		
		Objects<Articulos> articulo = odb.getObjects(Articulos.class);
		
		System.out.println("CODARTI | DENOMINACION | STOCK | PVP | SUMA_UNIVEN | SUMA_IMPORTE | NUM_VENTAS");
		System.out.println("-------------------------------------------------------------------------------");
		
		
		while(articulo.hasNext()) {
			
			Articulos ar =articulo.next();
			
			int numventa = 0;
			if(ar.getCompras() != null) {
				numventa = ar.getCompras().size();
			}
			
			float sumUniven = ar.getStock()+ar.getPvp();
			
			float sumImporte = ar.getPvp()+numventa;
			
			
			System.out.println(ar.getCodarti()+"  -  "+ar.getDenom()+"  -  "+ar.getStock()+"  -  "+ar.getPvp()+"  -  "+sumUniven+"  -  "+sumImporte
					+"  -  "+numventa);
				
		}		
		
		odb.close();
	}
	/**
	 * 
	 * Método que visualice por cada cliente este informe.
	 * 
	 */
	public static void visualizacionCliente() {
		ODB odb = ODBFactory.open("ARTICVENTAS.DAT");
		
		System.out.println("NUMCLI | NOMBRE | POBLACIÓN | TOTAL_IMPORTE | NUM_VENTAS");
		System.out.println("----------------------------------------------------------");
		
		Values valores = odb.getValues(new ValuesCriteriaQuery(Ventas.class).
				field("numcli.numcli")
				.field("numcli.nombre")
				.field("numcli.pobla"));
		Objects<Articulos> articulo = odb.getObjects(Articulos.class);
		
		
		while(valores.hasNext() && articulo.hasNext()) {
			ObjectValues ob = (ObjectValues) valores.next();
				
			Articulos ar =articulo.next();
			
			int cont=0;
			if(ar.getCompras() != null) {
				cont = ar.getCompras().size();
			}
			
			float total = ar.getPvp()*cont;
			
			System.out.println(ob.getByIndex(0)+" - "+ob.getByIndex(1)+"  -  "+ob.getByIndex(2)+"  -  "+total+"  -  "+cont);
			
		}
		odb.close();
	}
	/**
	 * 
	 * Nombre de artículo más vendido (más número de ventas).
	 * 
	 */
	public static void articuloMasVendido() {
		ODB odb = ODBFactory.open("ARTICVENTAS.DAT");
		
		Values valores = odb.getValues(((ValuesCriteriaQuery) 
				new ValuesCriteriaQuery (Ventas.class)).min("univen"));
		ObjectValues val= valores.nextValues();
		BigDecimal minima = (BigDecimal)val.getByAlias("univen");
		
		IQuery query = new CriteriaQuery(Ventas.class, Where.equal("univen", minima));
		query.orderByAsc("codventa");
		Objects<Ventas> objects = odb.getObjects(query);

		while (objects.hasNext()) {
			Ventas ven = objects.next();
			System.out.println("Articulo más vendido:  "+ven.getCodventa());
		}
		
		odb.close();
	}
	/**
	 * 
	 * Media de importe de ventas por artículo.
	 * 
	 */
	public static void media() {
		ODB odb = ODBFactory.open("ARTICVENTAS.DAT");
		
		Objects<Articulos> articulo = odb.getObjects(Articulos.class);
		
		while(articulo.hasNext()) {
			Articulos ar =articulo.next();
			
			int cont = 0;
			if(ar.getCompras() != null) {
				cont = ar.getCompras().size();
			}
			
			if(cont != 0) {
				float media = ar.getPvp()/cont;
				System.out.println("Media de importe de ventas de artículo "+ar.getCodarti()+" : "+media);
			}
		}
		
		odb.close();
	}
	/**
	 * 
	 * Nombre de cliente que más ha gastado (total importe de cliente
	 * máximo).
	 * 
	 */
	public static void clienteMaxGasta() {
		ODB odb = ODBFactory.open("ARTICVENTAS.DAT");
		
		Objects<Articulos> articulo = odb.getObjects(Articulos.class);
		Values valores = odb.getValues(new ValuesCriteriaQuery(Ventas.class).
				field("codventa")
				.field("numcli.nombre"));
		
		int max = 0;
		Object nombre = null;
		while(articulo.hasNext() && valores.hasNext()) {
			
			Articulos ar =articulo.next();
			ObjectValues objectValues = valores.next();
			
			ArrayList<Integer> list = new ArrayList<Integer>();
			float sumImporte = ar.getStock()+ar.getPvp();
			list.add((int) sumImporte);
			
			max = Integer.MIN_VALUE; 
			 for(int i=0; i<list.size(); i++){ 
				 
				 if(list.get(i) > max){ 
					 max = list.get(i); 
				 } 
				 
			 } 
			 
			 nombre = objectValues.getByIndex(1);
		}
		
		System.out.println("El cliente "+nombre+" es el que mas a gastado con: "+max);
		
		odb.close();
	}
	/**
	 * 
	 * Nombre de cliente con más ventas (más número de ventas).
	 * 
	 */
	public static void clienteMasVentas() {
		ODB odb = ODBFactory.open("ARTICVENTAS.DAT");
		
		Values valores = odb.getValues(new ValuesCriteriaQuery(Ventas.class).
				field("univen"));
		
		int moda = 0, mayor = 0;
		
		while(valores.hasNext()) {
			ObjectValues objectValues = valores.next();
			
			int id[]=new int[(int) objectValues.getByIndex(0)];
			
			HashMap<Integer, Integer> mapa = new HashMap<>();
			
			for (int x = 0; x < id.length; x++) {
				int numero = id[x];
				if (mapa.containsKey(numero)) {
					mapa.put(numero, mapa.get(numero) + 1);
				} else {
					mapa.put(numero, 1);
				}
			}
			
			for (HashMap.Entry<Integer, Integer> entry : mapa.entrySet()) {
				if (entry.getValue() > mayor) {
					mayor = entry.getValue();
					moda = entry.getKey()+1;
				}
			}
			
		}
		System.out.println("El cliente con mas ventas es: "+moda+". Con "+mayor+" ventas");
		
		odb.close();
	}
}
