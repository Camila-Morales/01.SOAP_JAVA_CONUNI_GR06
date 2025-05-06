package ec.edu.monster.prueba;

import ec.edu.monster.servcio.ConversionUnidadesServicio;

public class Prueba01 {
    double c1 = 10;
    double pulgada = 12.3;
    
    ConversionUnidadesServicio servicio = new ConversionUnidadesServicio();
    double conversionCM = servicio.centimetrosAPulgadas(c1);
    double conversionIN = servicio.pulgadasACentimetros(pulgada);
}
