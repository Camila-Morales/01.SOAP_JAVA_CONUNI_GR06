
package ec.edu.monster.controlador;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for pulgadasACentimetros complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="pulgadasACentimetros"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="pulgadas" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "pulgadasACentimetros", propOrder = {
    "pulgadas"
})
public class PulgadasACentimetros {

    protected double pulgadas;

    /**
     * Gets the value of the pulgadas property.
     * 
     */
    public double getPulgadas() {
        return pulgadas;
    }

    /**
     * Sets the value of the pulgadas property.
     * 
     */
    public void setPulgadas(double value) {
        this.pulgadas = value;
    }

}
