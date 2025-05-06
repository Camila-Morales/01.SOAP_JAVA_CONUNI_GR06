package ec.edu.monster.modelo;

public class ConversionUnidadesModelo {

    public double centimetrosAPulgadas(double centimetros) {
        ec.edu.monster.ws.ConversionUnidades_Service service = new ec.edu.monster.ws.ConversionUnidades_Service();
        ec.edu.monster.ws.ConversionUnidades port = service.getConversionUnidadesPort();
        return port.centimetrosAPulgadas(centimetros);
    }

    public double pulgadasACentimetros(double pulgadas) {
        ec.edu.monster.ws.ConversionUnidades_Service service = new ec.edu.monster.ws.ConversionUnidades_Service();
        ec.edu.monster.ws.ConversionUnidades port = service.getConversionUnidadesPort();
        return port.pulgadasACentimetros(pulgadas);
    }

    public boolean login(java.lang.String usuario, java.lang.String contrasena) {
        ec.edu.monster.ws.ConversionUnidades_Service service = new ec.edu.monster.ws.ConversionUnidades_Service();
        ec.edu.monster.ws.ConversionUnidades port = service.getConversionUnidadesPort();
        return port.login(usuario, contrasena);
    }    
}
