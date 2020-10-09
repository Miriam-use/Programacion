//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.11 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2020.10.02 a las 02:00:56 PM CEST 
//


package clasesdatos;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para DatoCentro complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="DatoCentro"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="centro"&gt;
 *           &lt;complexType&gt;
 *             &lt;complexContent&gt;
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *                 &lt;sequence&gt;
 *                   &lt;element name="codigocentro" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                   &lt;element name="nombrecentro" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                   &lt;element name="direccion" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *                   &lt;element name="director" type="{http://www.example.org/NewXMLSchema}profesor"/&gt;
 *                 &lt;/sequence&gt;
 *               &lt;/restriction&gt;
 *             &lt;/complexContent&gt;
 *           &lt;/complexType&gt;
 *         &lt;/element&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DatoCentro", propOrder = {
    "centro"
})
public class DatoCentro {

    @XmlElement(required = true)
    protected DatoCentro.Centro centro;

    /**
     * Obtiene el valor de la propiedad centro.
     * 
     * @return
     *     possible object is
     *     {@link DatoCentro.Centro }
     *     
     */
    public DatoCentro.Centro getCentro() {
        return centro;
    }

    /**
     * Define el valor de la propiedad centro.
     * 
     * @param value
     *     allowed object is
     *     {@link DatoCentro.Centro }
     *     
     */
    public void setCentro(DatoCentro.Centro value) {
        this.centro = value;
    }


    /**
     * <p>Clase Java para anonymous complex type.
     * 
     * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
     * 
     * <pre>
     * &lt;complexType&gt;
     *   &lt;complexContent&gt;
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
     *       &lt;sequence&gt;
     *         &lt;element name="codigocentro" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;element name="nombrecentro" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;element name="direccion" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
     *         &lt;element name="director" type="{http://www.example.org/NewXMLSchema}profesor"/&gt;
     *       &lt;/sequence&gt;
     *     &lt;/restriction&gt;
     *   &lt;/complexContent&gt;
     * &lt;/complexType&gt;
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "codigocentro",
        "nombrecentro",
        "direccion",
        "director"
    })
    public static class Centro {

        @XmlElement(required = true)
        protected String codigocentro;
        @XmlElement(required = true)
        protected String nombrecentro;
        @XmlElement(required = true)
        protected String direccion;
        @XmlElement(required = true)
        protected Profesor director;

        /**
         * Obtiene el valor de la propiedad codigocentro.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCodigocentro() {
            return codigocentro;
        }

        /**
         * Define el valor de la propiedad codigocentro.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCodigocentro(String value) {
            this.codigocentro = value;
        }

        /**
         * Obtiene el valor de la propiedad nombrecentro.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getNombrecentro() {
            return nombrecentro;
        }

        /**
         * Define el valor de la propiedad nombrecentro.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setNombrecentro(String value) {
            this.nombrecentro = value;
        }

        /**
         * Obtiene el valor de la propiedad direccion.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDireccion() {
            return direccion;
        }

        /**
         * Define el valor de la propiedad direccion.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDireccion(String value) {
            this.direccion = value;
        }

        /**
         * Obtiene el valor de la propiedad director.
         * 
         * @return
         *     possible object is
         *     {@link Profesor }
         *     
         */
        public Profesor getDirector() {
            return director;
        }

        /**
         * Define el valor de la propiedad director.
         * 
         * @param value
         *     allowed object is
         *     {@link Profesor }
         *     
         */
        public void setDirector(Profesor value) {
            this.director = value;
        }

    }

}
