
package ec.edu.monster.ws;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para pulgadasACentimetros complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
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
     * Obtiene el valor de la propiedad pulgadas.
     * 
     */
    public double getPulgadas() {
        return pulgadas;
    }

    /**
     * Define el valor de la propiedad pulgadas.
     * 
     */
    public void setPulgadas(double value) {
        this.pulgadas = value;
    }

}
