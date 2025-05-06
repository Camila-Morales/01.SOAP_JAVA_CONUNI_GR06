
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
 * &lt;complexType name="pulgadasACentimetros">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="pulgadas" type="{http://www.w3.org/2001/XMLSchema}double"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
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
