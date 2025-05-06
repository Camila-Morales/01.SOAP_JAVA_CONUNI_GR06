package ec.edu.monster.controlador;

import ec.edu.monster.modelo.ConversionUnidadesModelo;

public class ConversionUnidadesControlador {
    public double centimetrosAPulgadas(double cm) {
        ConversionUnidadesModelo servicio = new ConversionUnidadesModelo();
        double conversion = servicio.centimetrosAPulgadas(cm);
        return conversion;
    }
    
    public double pulgadasACentimetros(double in) {
        ConversionUnidadesModelo servicio2 = new ConversionUnidadesModelo();
        double conversion2 = servicio2.pulgadasACentimetros(in);
        return conversion2;
    }
    
    public boolean login(String usuario, String contrasena) {
        ConversionUnidadesModelo servicio3 = new ConversionUnidadesModelo();
        boolean conversion3 = servicio3.login(usuario, contrasena);
        return conversion3;
    }
}
