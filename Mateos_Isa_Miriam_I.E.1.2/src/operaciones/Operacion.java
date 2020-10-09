package operaciones;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;

import clasesdatos.DatosType;
import clasesdatos.ObjectFactory;
import clasesdatos.Profesor;
/**
 * 
 * @author Miriam
 *
 */
public class Operacion {
	
	/**
	 * crea un metodo para poder veer el xml
	 */
	public static void visualizarxml() {

		System.out.println("------------------------------ ");
		System.out.println("-------VISUALIZAR XML--------- ");
		System.out.println("------------------------------ ");
		try {
			// JAXBContext jaxbContext = JAXBContext.newInstance("datosclases");
			JAXBContext jaxbContext = JAXBContext.newInstance(ObjectFactory.class);

			// Crear un objeto de tipo Unmarshaller para convertir datos XML en
			// un árbol de objetos Java
			Unmarshaller u = jaxbContext.createUnmarshaller();

			// La clase JAXBElement representa a un elemento de un documento XML
			// en este caso a un elemento del documento ventasarticulos.xml
			JAXBElement jaxbElement = (JAXBElement) u.unmarshal(new FileInputStream("micentro.xml"));

			// Visualizo el documento
			Marshaller m = jaxbContext.createMarshaller();
			m.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);

			m.marshal(jaxbElement, System.out);

		} catch (JAXBException je) {
			System.out.println(je.getCause());
		} catch (IOException ioe) {
			System.out.println(ioe.getMessage());
		}

	}
	
	/**
	 * 
	 * @param cod
	 * @param nom
	 */
	public static void crearProfesor(String cod, String nom) {
		System.out.println("---------------------------- ");
		System.out.println("------AÑADIR PROFESOR------- ");
		System.out.println("---------------------------- ");
		try {

			JAXBContext jaxbContext = JAXBContext.newInstance(ObjectFactory.class);
			Unmarshaller u = jaxbContext.createUnmarshaller();
			JAXBElement jaxbElement = (JAXBElement) u.unmarshal(new FileInputStream("micentro.xml"));

			DatosType mipro = (DatosType) jaxbElement.getValue();

			// Obtenemos una instancia para obtener todas las ventas
			List<Profesor> pro = mipro.getProfesores();

			// Guardamos las ventas en la lista
			List list = new ArrayList();
			list = pro;

			// comprobar si existe el número de venta, reccorriendo el arraylist
			int existe = 0; // si no existe, 1 si existe
			for (int i = 0; i < list.size(); i++) {
				Profesor ve = (Profesor) list.get(i);
				if (ve.getCodigoprofesor().equals(cod)) {
					existe = 1;
					break;
				}
			}

			if (existe == 0) {
				// Crear el objeto Ventas.Venta, y si no existe se añade a la
				// lista

				Profesor ve = new Profesor();
				ve.setCodigoprofesor(cod);
				ve.setNombreprofesor(nom);

				// añadimos la venta a la lista

				list.add(ve);

				// crear el Marshaller, volcar la lista al fichero XML
				Marshaller m = jaxbContext.createMarshaller();
				m.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, Boolean.TRUE);
				m.marshal(jaxbElement, new FileOutputStream("micentro.xml"));

				System.out.println("Profesor añadida: " + cod);

			} else

				System.out.println("En codigo de profesor ya existe: " + cod);

		} catch (JAXBException je) {
			System.out.println(je.getCause());
		} catch (IOException ioe) {
			System.out.println(ioe.getMessage());
		}
	}
	
	public static void crearcentro() {
		
	}
}
