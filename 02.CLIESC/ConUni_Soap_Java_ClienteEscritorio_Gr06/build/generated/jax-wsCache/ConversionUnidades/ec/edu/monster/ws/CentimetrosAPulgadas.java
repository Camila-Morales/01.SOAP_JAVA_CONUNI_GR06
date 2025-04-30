
package ec.edu.monster.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para centimetrosAPulgadas complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="centimetrosAPulgadas">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="centimetros" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "centimetrosAPulgadas", propOrder = {
    "centimetros"
})
public class CentimetrosAPulgadas {

    protected double centimetros;

    /**
     * Obtiene el valor de la propiedad centimetros.
     * 
     */
    public double getCentimetros() {
        return centimetros;
    }

    /**
     * Define el valor de la propiedad centimetros.
     * 
     */
    public void setCentimetros(double value) {
        this.centimetros = value;
    }

}
