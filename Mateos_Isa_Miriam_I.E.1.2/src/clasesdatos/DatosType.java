//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.11 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2020.10.02 a las 02:00:56 PM CEST 
//


package clasesdatos;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para DatosType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="DatosType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="centro" type="{http://www.example.org/NewXMLSchema}DatoCentro"/&gt;
 *         &lt;element name="profesores" type="{http://www.example.org/NewXMLSchema}profesor" maxOccurs="unbounded"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DatosType", propOrder = {
    "centro",
    "profesores"
})
public class DatosType {

    @XmlElement(required = true)
    protected DatoCentro centro;
    @XmlElement(required = true)
    protected List<Profesor> profesores;

    /**
     * Obtiene el valor de la propiedad centro.
     * 
     * @return
     *     possible object is
     *     {@link DatoCentro }
     *     
     */
    public DatoCentro getCentro() {
        return centro;
    }

    /**
     * Define el valor de la propiedad centro.
     * 
     * @param value
     *     allowed object is
     *     {@link DatoCentro }
     *     
     */
    public void setCentro(DatoCentro value) {
        this.centro = value;
    }

    /**
     * Gets the value of the profesores property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the profesores property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProfesores().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Profesor }
     * 
     * 
     */
    public List<Profesor> getProfesores() {
        if (profesores == null) {
            profesores = new ArrayList<Profesor>();
        }
        return this.profesores;
    }

}
