package ec.edu.monster.controlador;

import ec.edu.monster.servcio.ConversionUnidadesServicio;

public class ConversionUnidadesControlador {
    private ConversionUnidadesServicio conversionService;

    public ConversionUnidadesControlador() {
        this.conversionService = new ConversionUnidadesServicio();
    }

    public double convertirPulgadasACentimetros(double pulgadas) {
        return conversionService.pulgadasACentimetros(pulgadas);
    }

    public double convertirCentimetrosAPulgadas(double centimetros) {
        return conversionService.centimetrosAPulgadas(centimetros);
    }
    
    public boolean login(String usuario, String contrasena){
        return conversionService.login(usuario, contrasena);
    }
}
