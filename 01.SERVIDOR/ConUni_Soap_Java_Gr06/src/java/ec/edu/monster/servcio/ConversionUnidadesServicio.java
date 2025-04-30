package ec.edu.monster.servcio;

public class ConversionUnidadesServicio {
    public double pulgadasACentimetros(double pulgadas) {
        return pulgadas * 2.54;
    }

    public double centimetrosAPulgadas(double centimetros) {
        return centimetros / 2.54;
    }

    public boolean login(String usuario, String contrasena) {
        return "monster".equals(usuario) && "monster".equals(contrasena);
    }
}
