// ConversorControlador.java
package ec.edu.monster.controlador;

import ec.edu.monster.modelo.ConversionModelo;

public class ConversionControlador {

    private ConversionModelo modelo;

    public ConversionControlador() {
        modelo = new ConversionModelo();
    }

    public String convertirCentimetrosAPulgadas(double centimetros) {
        return modelo.convertirCentimetrosAPulgadas(centimetros);
    }

    public String convertirPulgadasACentimetros(double pulgadas) {
        return modelo.convertirPulgadasACentimetros(pulgadas);
    }
}
