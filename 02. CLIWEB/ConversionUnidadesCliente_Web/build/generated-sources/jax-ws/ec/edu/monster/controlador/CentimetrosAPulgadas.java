
package ec.edu.monster.controlador;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for centimetrosAPulgadas complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="centimetrosAPulgadas"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="centimetros" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
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
     * Gets the value of the centimetros property.
     * 
     */
    public double getCentimetros() {
        return centimetros;
    }

    /**
     * Sets the value of the centimetros property.
     * 
     */
    public void setCentimetros(double value) {
        this.centimetros = value;
    }

}
