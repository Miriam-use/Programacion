//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.11 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2020.10.02 a las 02:00:56 PM CEST 
//


package clasesdatos;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the clasesdatos package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _Datoscentro_QNAME = new QName("http://www.example.org/NewXMLSchema", "datoscentro");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: clasesdatos
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link DatoCentro }
     * 
     */
    public DatoCentro createDatoCentro() {
        return new DatoCentro();
    }

    /**
     * Create an instance of {@link DatosType }
     * 
     */
    public DatosType createDatosType() {
        return new DatosType();
    }

    /**
     * Create an instance of {@link Profesor }
     * 
     */
    public Profesor createProfesor() {
        return new Profesor();
    }

    /**
     * Create an instance of {@link DatoCentro.Centro }
     * 
     */
    public DatoCentro.Centro createDatoCentroCentro() {
        return new DatoCentro.Centro();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link DatosType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.example.org/NewXMLSchema", name = "datoscentro")
    public JAXBElement<DatosType> createDatoscentro(DatosType value) {
        return new JAXBElement<DatosType>(_Datoscentro_QNAME, DatosType.class, null, value);
    }

}
