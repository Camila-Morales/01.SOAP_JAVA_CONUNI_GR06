package ec.edu.monster.ws;

import ec.edu.monster.controlador.ConversionUnidadesControlador;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

@WebService(serviceName = "ConversionUnidades")
public class ConversionUnidades {
    private ConversionUnidadesControlador convControlador;
    
    public ConversionUnidades(){
        this.convControlador = new ConversionUnidadesControlador();
    }
    /**
     * Web service operation
     */
    @WebMethod(operationName = "pulgadasACentimetros")
    public double pulgadasACentimetros(@WebParam(name = "pulgadas") double pulgadas) {
       return convControlador.convertirPulgadasACentimetros(pulgadas);
    }
    /**
     * Web service operation
     */
    @WebMethod(operationName = "centimetrosAPulgadas")
    public double centimetrosAPulgadas(@WebParam(name = "centimetros") double centimetros) {
        return convControlador.convertirCentimetrosAPulgadas(centimetros);
    }
    /**
     * Web service operation for login
     */
    @WebMethod(operationName = "login")
    public boolean login(@WebParam(name = "usuario") String usuario, @WebParam(name = "contrasena") String contrasena) {
        return convControlador.login(usuario, contrasena);
    }
}
